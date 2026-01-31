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
from openapi_server.models.error import Error
from openapi_server.models.targeting_template_create import TargetingTemplateCreate
from openapi_server.models.targeting_template_get_response_data import TargetingTemplateGetResponseData
from openapi_server.models.targeting_template_list200_response import TargetingTemplateList200Response
from openapi_server.models.targeting_template_update_request import TargetingTemplateUpdateRequest
from openapi_server.security_api import get_token_pinterest_oauth2, get_token_client_credentials

router = APIRouter()

ns_pkg = openapi_server.impl
for _, name, _ in pkgutil.iter_modules(ns_pkg.__path__, ns_pkg.__name__ + "."):
    importlib.import_module(name)


@router.get(
    "/ad_accounts/{ad_account_id}/targeting_templates",
    responses={
        200: {"model": TargetingTemplateList200Response, "description": "Success"},
        400: {"model": Error, "description": "Invalid ad account id."},
        "default": {"model": Error, "description": "Unexpected error"},
    },
    tags=["targeting_template"],
    summary="List targeting templates",
    response_model_by_alias=True,
)
async def targeting_template_list(
    ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")] = Path(..., description="Unique identifier of an ad account.", regex=r"^\d+$", max_length=18),
    order: Annotated[Optional[StrictStr], Field(description="The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.")] = Query(None, description="The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.", alias="order"),
    include_sizing: Annotated[Optional[StrictBool], Field(description="Include audience sizing in result or not")] = Query(False, description="Include audience sizing in result or not", alias="include_sizing"),
    search_query: Annotated[Optional[StrictStr], Field(description="Search keyword for targeting templates")] = Query(None, description="Search keyword for targeting templates", alias="search_query"),
    page_size: Annotated[Optional[Annotated[int, Field(le=250, strict=True, ge=1)]], Field(description="Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.")] = Query(25, description="Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.", alias="page_size", ge=1, le=250),
    bookmark: Annotated[Optional[StrictStr], Field(description="Cursor used to fetch the next page of items")] = Query(None, description="Cursor used to fetch the next page of items", alias="bookmark"),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:read"]
    ),
    token_client_credentials: TokenModel = Security(
        get_token_client_credentials, scopes=["ads:read"]
    ),
) -> TargetingTemplateList200Response:
    """Get a list of the targeting templates in the specified &lt;code&gt;ad_account_id&lt;/code&gt;"""
    if not BaseTargetingTemplateApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseTargetingTemplateApi.subclasses[0]().targeting_template_list(ad_account_id, order, include_sizing, search_query, page_size, bookmark)


@router.post(
    "/ad_accounts/{ad_account_id}/targeting_templates",
    responses={
        200: {"model": TargetingTemplateGetResponseData, "description": "Success"},
        400: {"model": Error, "description": "Invalid ad account id."},
        "default": {"model": Error, "description": "Unexpected error"},
    },
    tags=["targeting_template"],
    summary="Create targeting templates",
    response_model_by_alias=True,
)
async def targeting_template_create(
    ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")] = Path(..., description="Unique identifier of an ad account.", regex=r"^\d+$", max_length=18),
    targeting_template_create: Annotated[TargetingTemplateCreate, Field(description="targeting template creation entity")] = Body(None, description="targeting template creation entity"),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:write"]
    ),
) -> TargetingTemplateGetResponseData:
    """&lt;p&gt;Targeting templates allow advertisers to save a set of targeting details including audience lists,  keywords &amp; interest, demographics, and placements to use more than once during the campaign creation process.&lt;/p&gt;  &lt;p&gt;Templates can be used to build out basic targeting criteria that you plan to use across campaigns and to reuse   performance targeting from prior campaigns for new campaigns.&lt;/p&gt;"""
    if not BaseTargetingTemplateApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseTargetingTemplateApi.subclasses[0]().targeting_template_create(ad_account_id, targeting_template_create)


@router.patch(
    "/ad_accounts/{ad_account_id}/targeting_templates",
    responses={
        200: {"description": "Success"},
        400: {"model": Error, "description": "Invalid ad account id."},
        "default": {"model": Error, "description": "Unexpected error"},
    },
    tags=["targeting_template"],
    summary="Update targeting templates",
    response_model_by_alias=True,
)
async def targeting_template_update(
    ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")] = Path(..., description="Unique identifier of an ad account.", regex=r"^\d+$", max_length=18),
    targeting_template_update_request: Annotated[TargetingTemplateUpdateRequest, Field(description="Operation type and targeting template ID")] = Body(None, description="Operation type and targeting template ID"),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:write"]
    ),
) -> None:
    """&lt;p&gt;Update the targeting template given advertiser ID and targeting template ID&lt;/p&gt;"""
    if not BaseTargetingTemplateApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseTargetingTemplateApi.subclasses[0]().targeting_template_update(ad_account_id, targeting_template_update_request)
