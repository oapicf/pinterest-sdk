# coding: utf-8

from typing import Dict, List  # noqa: F401
import importlib
import pkgutil

from openapi_server.apis.audiences_api_base import BaseAudiencesApi
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
from openapi_server.models.ad_accounts_audience import AdAccountsAudience
from openapi_server.models.ad_accounts_audience_create import AdAccountsAudienceCreate
from openapi_server.models.ad_accounts_audience_update import AdAccountsAudienceUpdate
from openapi_server.models.audience_ownership_type import AudienceOwnershipType
from openapi_server.models.audiences_list200_response import AudiencesList200Response
from openapi_server.models.pinterest_lib_error import PinterestLibError
from openapi_server.models.pinterest_lib_pagination_order import PinterestLibPaginationOrder
from openapi_server.security_api import get_token_pinterest_oauth2, get_token_client_credentials

router = APIRouter()

ns_pkg = openapi_server.impl
for _, name, _ in pkgutil.iter_modules(ns_pkg.__path__, ns_pkg.__name__ + "."):
    importlib.import_module(name)


@router.get(
    "/ad_accounts/{ad_account_id}/audiences",
    responses={
        200: {"model": AudiencesList200Response, "description": "The request has succeeded."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["audiences"],
    summary="List audiences",
    response_model_by_alias=True,
)
async def audiences_list(
    ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")] = Path(..., description="Unique identifier of an ad account.", regex=r"^\d+$", max_length=18),
    bookmark: Annotated[Optional[StrictStr], Field(description="Cursor used to fetch the next page of items")] = Query(None, description="Cursor used to fetch the next page of items", alias="bookmark"),
    page_size: Annotated[Optional[Annotated[int, Field(le=250, strict=True, ge=1)]], Field(description="Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.")] = Query(25, description="Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", alias="page_size", ge=1, le=250),
    order: Annotated[Optional[PinterestLibPaginationOrder], Field(description="The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.")] = Query(None, description="The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items.", alias="order"),
    ownership_type: Optional[AudienceOwnershipType] = Query(None, description="", alias="ownership_type"),
    exclude_nca: Annotated[Optional[StrictBool], Field(description="When true, excludes audiences derived from new customer acquisition (expanded matching) customer lists from the result. Defaults to false (include all).")] = Query(False, description="When true, excludes audiences derived from new customer acquisition (expanded matching) customer lists from the result. Defaults to false (include all).", alias="exclude_nca"),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:read"]
    ),
    token_client_credentials: TokenModel = Security(
        get_token_client_credentials, scopes=["ads:read"]
    ),
) -> AudiencesList200Response:
    """Get list of audiences for the ad account."""
    if not BaseAudiencesApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseAudiencesApi.subclasses[0]().audiences_list(ad_account_id, bookmark, page_size, order, ownership_type, exclude_nca)


@router.post(
    "/ad_accounts/{ad_account_id}/audiences",
    responses={
        200: {"model": AdAccountsAudience, "description": "The request has succeeded."},
        201: {"model": AdAccountsAudience, "description": "Resource create operation completed successfully."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["audiences"],
    summary="Create audience",
    response_model_by_alias=True,
)
async def audiences_create(
    ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")] = Path(..., description="Unique identifier of an ad account.", regex=r"^\d+$", max_length=18),
    ad_accounts_audience_create: AdAccountsAudienceCreate = Body(None, description=""),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:write"]
    ),
) -> AdAccountsAudience:
    """Create a new audience for the ad account."""
    if not BaseAudiencesApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseAudiencesApi.subclasses[0]().audiences_create(ad_account_id, ad_accounts_audience_create)


@router.get(
    "/ad_accounts/{ad_account_id}/audiences/{audience_id}",
    responses={
        200: {"model": AdAccountsAudience, "description": "The request has succeeded."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["audiences"],
    summary="Get audience",
    response_model_by_alias=True,
)
async def audiences_get(
    audience_id: Annotated[str, Field(strict=True, description="Audience ID.")] = Path(..., description="Audience ID.", regex=r"^\d+$"),
    ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")] = Path(..., description="Unique identifier of an ad account.", regex=r"^\d+$", max_length=18),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:read"]
    ),
    token_client_credentials: TokenModel = Security(
        get_token_client_credentials, scopes=["ads:read"]
    ),
) -> AdAccountsAudience:
    """Get a specific audience given the audience ID."""
    if not BaseAudiencesApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseAudiencesApi.subclasses[0]().audiences_get(audience_id, ad_account_id)


@router.patch(
    "/ad_accounts/{ad_account_id}/audiences/{audience_id}",
    responses={
        200: {"model": AdAccountsAudience, "description": "The request has succeeded."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["audiences"],
    summary="Update audience",
    response_model_by_alias=True,
)
async def audiences_update(
    audience_id: Annotated[str, Field(strict=True, description="Audience ID.")] = Path(..., description="Audience ID.", regex=r"^\d+$"),
    ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")] = Path(..., description="Unique identifier of an ad account.", regex=r"^\d+$", max_length=18),
    ad_accounts_audience_update: AdAccountsAudienceUpdate = Body(None, description=""),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:write"]
    ),
) -> AdAccountsAudience:
    """Update an existing audience for the ad account."""
    if not BaseAudiencesApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseAudiencesApi.subclasses[0]().audiences_update(audience_id, ad_account_id, ad_accounts_audience_update)
