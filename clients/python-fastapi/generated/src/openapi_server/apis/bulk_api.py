# coding: utf-8

from typing import Dict, List  # noqa: F401
import importlib
import pkgutil

from openapi_server.apis.bulk_api_base import BaseBulkApi
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
from pydantic import Field, StrictBool, StrictStr, field_validator
from typing import Optional
from typing_extensions import Annotated
from openapi_server.models.bulk_download_request import BulkDownloadRequest
from openapi_server.models.bulk_download_response import BulkDownloadResponse
from openapi_server.models.bulk_upsert_request import BulkUpsertRequest
from openapi_server.models.bulk_upsert_response import BulkUpsertResponse
from openapi_server.models.bulk_upsert_status_response import BulkUpsertStatusResponse
from openapi_server.models.error import Error
from openapi_server.security_api import get_token_pinterest_oauth2, get_token_client_credentials

router = APIRouter()

ns_pkg = openapi_server.impl
for _, name, _ in pkgutil.iter_modules(ns_pkg.__path__, ns_pkg.__name__ + "."):
    importlib.import_module(name)


@router.post(
    "/ad_accounts/{ad_account_id}/bulk/download",
    responses={
        200: {"model": BulkDownloadResponse, "description": "Success"},
        "default": {"model": Error, "description": "Unexpected error"},
    },
    tags=["bulk"],
    summary="Get advertiser entities in bulk",
    response_model_by_alias=True,
)
async def bulk_download_create(
    ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")] = Path(..., description="Unique identifier of an ad account.", regex=r"^\d+$", max_length=18),
    bulk_download_request: Annotated[BulkDownloadRequest, Field(description="Parameters to get ad entities in bulk")] = Body(None, description="Parameters to get ad entities in bulk"),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:read"]
    ),
) -> BulkDownloadResponse:
    """Create an asynchronous report that may include information on campaigns, ad groups, product groups, ads, keywords, and/or labels; can filter by campaigns. Though the entities may be active, archived, or paused, only active entities will return data."""
    if not BaseBulkApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseBulkApi.subclasses[0]().bulk_download_create(ad_account_id, bulk_download_request)


@router.post(
    "/ad_accounts/{ad_account_id}/bulk/upsert",
    responses={
        200: {"model": BulkUpsertResponse, "description": "Success"},
        "default": {"model": Error, "description": "Unexpected error"},
    },
    tags=["bulk"],
    summary="Create/update ad entities in bulk",
    response_model_by_alias=True,
)
async def bulk_upsert_create(
    ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")] = Path(..., description="Unique identifier of an ad account.", regex=r"^\d+$", max_length=18),
    bulk_upsert_request: Annotated[BulkUpsertRequest, Field(description="Parameters to get create/update ad entities in bulk")] = Body(None, description="Parameters to get create/update ad entities in bulk"),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:write"]
    ),
) -> BulkUpsertResponse:
    """Either create or update any combination of campaigns, ad groups, product groups, ads, keywords, or labels. Note that this request will be processed asynchronously; the response will include a &lt;code&gt;request_id&lt;/code&gt; that can be used to obtain the status of the request."""
    if not BaseBulkApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseBulkApi.subclasses[0]().bulk_upsert_create(ad_account_id, bulk_upsert_request)


@router.get(
    "/ad_accounts/{ad_account_id}/bulk/{bulk_request_id}",
    responses={
        200: {"model": BulkUpsertStatusResponse, "description": "Success"},
        "default": {"model": Error, "description": "Unexpected error"},
    },
    tags=["bulk"],
    summary="Download advertiser entities in bulk",
    response_model_by_alias=True,
)
async def bulk_request_get(
    ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")] = Path(..., description="Unique identifier of an ad account.", regex=r"^\d+$", max_length=18),
    bulk_request_id: Annotated[StrictStr, Field(description="Unique identifier of a bulk upsert request.")] = Path(..., description="Unique identifier of a bulk upsert request."),
    include_details: Annotated[Optional[StrictBool], Field(description="if set to True then attach the errors/details to all the requests")] = Query(False, description="if set to True then attach the errors/details to all the requests", alias="include_details"),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:read"]
    ),
    token_client_credentials: TokenModel = Security(
        get_token_client_credentials, scopes=["ads:read"]
    ),
) -> BulkUpsertStatusResponse:
    """Get the status of a bulk request by &lt;code&gt;request_id&lt;/code&gt;, along with a download URL that will allow you to download the new or updated entity data (campaigns, ad groups, product groups, ads, or keywords)."""
    if not BaseBulkApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseBulkApi.subclasses[0]().bulk_request_get(ad_account_id, bulk_request_id, include_details)
