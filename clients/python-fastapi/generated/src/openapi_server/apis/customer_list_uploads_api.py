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
from openapi_server.models.customer_list_upload import CustomerListUpload
from openapi_server.models.customer_list_upload_create_request import CustomerListUploadCreateRequest
from openapi_server.models.customer_list_upload_create_response import CustomerListUploadCreateResponse
from openapi_server.models.pinterest_lib_error import PinterestLibError
from openapi_server.security_api import get_token_pinterest_oauth2

router = APIRouter()

ns_pkg = openapi_server.impl
for _, name, _ in pkgutil.iter_modules(ns_pkg.__path__, ns_pkg.__name__ + "."):
    importlib.import_module(name)


@router.post(
    "/ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads",
    responses={
        200: {"model": CustomerListUploadCreateResponse, "description": "The request has succeeded."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["customer_list_uploads"],
    summary="Create customer list upload",
    response_model_by_alias=True,
)
async def customer_list_uploads_create(
    ad_account_id: Annotated[str, Field(strict=True, max_length=18)] = Path(..., description="", regex=r"^\d+$", max_length=18),
    customer_list_id: Annotated[str, Field(strict=True, max_length=18, description="Customer list ID.")] = Path(..., description="Customer list ID.", regex=r"^\d+$", max_length=18),
    customer_list_upload_create_request: CustomerListUploadCreateRequest = Body(None, description=""),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:write"]
    ),
) -> CustomerListUploadCreateResponse:
    """Create a customer list upload request for multipart S3 upload.  Note: Each part must be at least 5mb; however the last part can be any size greater than 0. Clients with smaller files can request a single part count. This minimal part size restriction is defined by the AWS S3 API.  **Please review the [update customer list endpoint](/docs/api/v5/customer_lists-update/) documentation for additional information.**"""
    if not BaseCustomerListUploadsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseCustomerListUploadsApi.subclasses[0]().customer_list_uploads_create(ad_account_id, customer_list_id, customer_list_upload_create_request)


@router.get(
    "/ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads/{customer_list_upload_id}",
    responses={
        200: {"model": CustomerListUpload, "description": "The request has succeeded."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["customer_list_uploads"],
    summary="Get customer list upload",
    response_model_by_alias=True,
)
async def customer_list_uploads_get(
    ad_account_id: Annotated[str, Field(strict=True, max_length=18)] = Path(..., description="", regex=r"^\d+$", max_length=18),
    customer_list_id: Annotated[str, Field(strict=True, max_length=18, description="Customer list ID.")] = Path(..., description="Customer list ID.", regex=r"^\d+$", max_length=18),
    customer_list_upload_id: Annotated[str, Field(strict=True, description="Customer List Upload ID.")] = Path(..., description="Customer List Upload ID.", regex=r"^\d+$"),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:read"]
    ),
) -> CustomerListUpload:
    """Get the metadata for a given upload by its ID."""
    if not BaseCustomerListUploadsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseCustomerListUploadsApi.subclasses[0]().customer_list_uploads_get(ad_account_id, customer_list_id, customer_list_upload_id)


@router.post(
    "/ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads/{customer_list_upload_id}/run",
    responses={
        200: {"model": CustomerListUpload, "description": "The request has succeeded."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["customer_list_uploads"],
    summary="Run customer list upload",
    response_model_by_alias=True,
)
async def customer_list_uploads_run(
    ad_account_id: Annotated[str, Field(strict=True, max_length=18)] = Path(..., description="", regex=r"^\d+$", max_length=18),
    customer_list_id: Annotated[str, Field(strict=True, max_length=18, description="Customer list ID.")] = Path(..., description="Customer list ID.", regex=r"^\d+$", max_length=18),
    customer_list_upload_id: Annotated[str, Field(strict=True, description="Customer List Upload ID.")] = Path(..., description="Customer List Upload ID.", regex=r"^\d+$"),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:write"]
    ),
) -> CustomerListUpload:
    """Begin processing a customer list upload."""
    if not BaseCustomerListUploadsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseCustomerListUploadsApi.subclasses[0]().customer_list_uploads_run(ad_account_id, customer_list_id, customer_list_upload_id)
