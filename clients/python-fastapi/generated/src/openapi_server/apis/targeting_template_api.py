# coding: utf-8

from typing import Dict, List  # noqa: F401
import importlib
import pkgutil

from openapi_server.apis.targeting_template_api_base import BaseTargetingTemplateApi
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
from typing import Any, Optional
from typing_extensions import Annotated
from openapi_server.models.pinterest_lib_error import PinterestLibError
from openapi_server.models.pinterest_lib_pagination_order import PinterestLibPaginationOrder
from openapi_server.models.targeting_template import TargetingTemplate
from openapi_server.models.targeting_template_create import TargetingTemplateCreate
from openapi_server.models.targeting_template_list200_response import TargetingTemplateList200Response
from openapi_server.models.targeting_template_update_request_read_or_update import TargetingTemplateUpdateRequestReadOrUpdate
from openapi_server.security_api import get_token_pinterest_oauth2, get_token_client_credentials

router = APIRouter()

ns_pkg = openapi_server.impl
for _, name, _ in pkgutil.iter_modules(ns_pkg.__path__, ns_pkg.__name__ + "."):
    importlib.import_module(name)


@router.get(
    "/ad_accounts/{ad_account_id}/targeting_templates",
    responses={
        200: {"model": TargetingTemplateList200Response, "description": "The request has succeeded."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["targeting_template"],
    summary="List targeting templates",
    response_model_by_alias=True,
)
async def targeting_template_list(
    ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")] = Path(..., description="Unique identifier of an ad account.", regex=r"^\d+$", max_length=18),
    bookmark: Annotated[Optional[StrictStr], Field(description="Cursor used to fetch the next page of items")] = Query(None, description="Cursor used to fetch the next page of items", alias="bookmark"),
    page_size: Annotated[Optional[Annotated[int, Field(le=250, strict=True, ge=1)]], Field(description="Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.")] = Query(25, description="Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", alias="page_size", ge=1, le=250),
    order: Annotated[Optional[PinterestLibPaginationOrder], Field(description="The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.")] = Query(None, description="The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items.", alias="order"),
    include_sizing: Annotated[Optional[StrictBool], Field(description="Include audience sizing in result or not")] = Query(False, description="Include audience sizing in result or not", alias="include_sizing"),
    search_query: Annotated[Optional[StrictStr], Field(description="Search query. Can contain pin description keywords or comma-separated pin IDs.")] = Query(None, description="Search query. Can contain pin description keywords or comma-separated pin IDs.", alias="search_query"),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:read"]
    ),
    token_client_credentials: TokenModel = Security(
        get_token_client_credentials, scopes=["ads:read"]
    ),
) -> TargetingTemplateList200Response:
    """Get a list of the targeting templates in the specified &#x60;ad_account_id&#x60;"""
    if not BaseTargetingTemplateApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseTargetingTemplateApi.subclasses[0]().targeting_template_list(ad_account_id, bookmark, page_size, order, include_sizing, search_query)


@router.post(
    "/ad_accounts/{ad_account_id}/targeting_templates",
    responses={
        200: {"model": TargetingTemplate, "description": "The request has succeeded."},
        201: {"model": TargetingTemplate, "description": "Resource create operation completed successfully."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["targeting_template"],
    summary="Create targeting templates",
    response_model_by_alias=True,
)
async def targeting_template_create(
    ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")] = Path(..., description="Unique identifier of an ad account.", regex=r"^\d+$", max_length=18),
    targeting_template_create: TargetingTemplateCreate = Body(None, description=""),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:write"]
    ),
) -> TargetingTemplate:
    """Targeting templates allow advertisers to save a set of targeting details including audience lists, keywords &amp; interest, demographics, and placements to use more than once during the campaign creation process.  Templates can be used to build out basic targeting criteria that you plan to use across campaigns and to reuse performance targeting from prior campaigns for new campaigns."""
    if not BaseTargetingTemplateApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseTargetingTemplateApi.subclasses[0]().targeting_template_create(ad_account_id, targeting_template_create)


@router.patch(
    "/ad_accounts/{ad_account_id}/targeting_templates",
    responses={
        200: {"description": "The request has succeeded."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["targeting_template"],
    summary="Update targeting templates",
    response_model_by_alias=True,
)
async def targeting_template_update(
    ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")] = Path(..., description="Unique identifier of an ad account.", regex=r"^\d+$", max_length=18),
    targeting_template_update_request_read_or_update: TargetingTemplateUpdateRequestReadOrUpdate = Body(None, description=""),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:write"]
    ),
) -> None:
    """Update the targeting template given advertiser ID and targeting template ID"""
    if not BaseTargetingTemplateApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseTargetingTemplateApi.subclasses[0]().targeting_template_update(ad_account_id, targeting_template_update_request_read_or_update)
