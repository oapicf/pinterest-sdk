# coding: utf-8

from typing import Dict, List  # noqa: F401
import importlib
import pkgutil

from openapi_server.apis.customer_list_uploads_api_base import BaseCustomerListUploadsApi
import openapi_server.impl

from fastapi import (  # noqa: F401
    APIRouter,
    Body,
    Cookie,
    Depends,
    Form,
    Header,
    HTTPException,
    Path,
    Query,
    Response,
    Security,
    status,
)

from openapi_server.models.extra_models import TokenModel  # noqa: F401
from pydantic import Field, field_validator
from typing_extensions import Annotated
from openapi_server.models.customer_list_upload_create_request import CustomerListUploadCreateRequest
from openapi_server.models.customer_list_upload_create_response import CustomerListUploadCreateResponse
from openapi_server.models.customer_list_upload_response import CustomerListUploadResponse
from openapi_server.models.error import Error
from openapi_server.security_api import get_token_pinterest_oauth2

router = APIRouter()

ns_pkg = openapi_server.impl
for _, name, _ in pkgutil.iter_modules(ns_pkg.__path__, ns_pkg.__name__ + "."):
    importlib.import_module(name)


@router.post(
    "/ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads",
    responses={
        200: {"model": CustomerListUploadCreateResponse, "description": "Success"},
        "default": {"model": Error, "description": "Unexpected error"},
    },
    tags=["customer_list_uploads"],
    summary="Create customer list upload",
    response_model_by_alias=True,
)
async def customer_list_uploads_create(
    ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")] = Path(..., description="Unique identifier of an ad account.", regex=r"^\d+$", max_length=18),
    customer_list_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of a customer list")] = Path(..., description="Unique identifier of a customer list", regex=r"^\d+$", max_length=18),
    customer_list_upload_create_request: Annotated[CustomerListUploadCreateRequest, Field(description="Parameters to create a customer list upload request")] = Body(None, description="Parameters to create a customer list upload request"),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:write"]
    ),
) -> CustomerListUploadCreateResponse:
    """&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Closed beta&lt;/a&gt;  &lt;p&gt;Create a customer list upload request for multipart S3 upload.&lt;/p&gt; &lt;p&gt;Note: Each part must be at least 5mb; however the last part can be any size greater than 0. Clients with smaller files can request a single part count. This minimal part size restriction is defined by the AWS S3 API.&lt;/p&gt; &lt;p&gt;&lt;b&gt;Please review the &lt;u&gt;&lt;a href&#x3D;\&quot;/docs/api/v5/customer_lists-update/\&quot; target&#x3D;\&quot;_blank\&quot;&gt;update customer list endpoint&lt;/a&gt;&lt;/u&gt; documentation for additional information.&lt;/b&gt;&lt;/p&gt;"""
    if not BaseCustomerListUploadsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseCustomerListUploadsApi.subclasses[0]().customer_list_uploads_create(ad_account_id, customer_list_id, customer_list_upload_create_request)


@router.get(
    "/ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads/{customer_list_upload_id}",
    responses={
        200: {"model": CustomerListUploadResponse, "description": "Success"},
        "default": {"model": Error, "description": "Unexpected error"},
    },
    tags=["customer_list_uploads"],
    summary="Get customer list upload",
    response_model_by_alias=True,
)
async def customer_list_uploads_get(
    ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")] = Path(..., description="Unique identifier of an ad account.", regex=r"^\d+$", max_length=18),
    customer_list_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of a customer list")] = Path(..., description="Unique identifier of a customer list", regex=r"^\d+$", max_length=18),
    customer_list_upload_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of a customer list upload")] = Path(..., description="Unique identifier of a customer list upload", regex=r"^\d+$", max_length=18),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:read"]
    ),
) -> CustomerListUploadResponse:
    """&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Closed beta&lt;/a&gt; &lt;p&gt;Get the metadata for a given upload by its ID.&lt;/p&gt;"""
    if not BaseCustomerListUploadsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseCustomerListUploadsApi.subclasses[0]().customer_list_uploads_get(ad_account_id, customer_list_id, customer_list_upload_id)


@router.post(
    "/ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads/{customer_list_upload_id}/run",
    responses={
        200: {"model": CustomerListUploadResponse, "description": "Success"},
        "default": {"model": Error, "description": "Unexpected error"},
    },
    tags=["customer_list_uploads"],
    summary="Run customer list upload",
    response_model_by_alias=True,
)
async def customer_list_uploads_run(
    ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")] = Path(..., description="Unique identifier of an ad account.", regex=r"^\d+$", max_length=18),
    customer_list_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of a customer list")] = Path(..., description="Unique identifier of a customer list", regex=r"^\d+$", max_length=18),
    customer_list_upload_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of a customer list upload")] = Path(..., description="Unique identifier of a customer list upload", regex=r"^\d+$", max_length=18),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:write"]
    ),
) -> CustomerListUploadResponse:
    """&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Closed beta&lt;/a&gt; &lt;p&gt;Begin processing a customer list upload.&lt;/p&gt;"""
    if not BaseCustomerListUploadsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseCustomerListUploadsApi.subclasses[0]().customer_list_uploads_run(ad_account_id, customer_list_id, customer_list_upload_id)
