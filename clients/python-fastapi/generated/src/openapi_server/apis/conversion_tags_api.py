# coding: utf-8

from typing import Dict, List  # noqa: F401
import importlib
import pkgutil

from openapi_server.apis.conversion_tags_api_base import BaseConversionTagsApi
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
from typing import Dict, List, Optional
from typing_extensions import Annotated
from openapi_server.models.conversion_event_response import ConversionEventResponse
from openapi_server.models.conversion_tag import ConversionTag
from openapi_server.models.conversion_tag_create import ConversionTagCreate
from openapi_server.models.conversion_tags_list200_response import ConversionTagsList200Response
from openapi_server.models.error import Error
from openapi_server.models.page_visit_conversion_tags_get200_response import PageVisitConversionTagsGet200Response
from openapi_server.models.pinterest_lib_error import PinterestLibError
from openapi_server.security_api import get_token_pinterest_oauth2, get_token_client_credentials

router = APIRouter()

ns_pkg = openapi_server.impl
for _, name, _ in pkgutil.iter_modules(ns_pkg.__path__, ns_pkg.__name__ + "."):
    importlib.import_module(name)


@router.get(
    "/ad_accounts/{ad_account_id}/conversion_tags",
    responses={
        200: {"model": ConversionTagsList200Response, "description": "The request has succeeded."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["conversion_tags"],
    summary="List conversion tags",
    response_model_by_alias=True,
)
async def conversion_tags_list(
    ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")] = Path(..., description="Unique identifier of an ad account.", regex=r"^\d+$", max_length=18),
    filter_deleted: Annotated[Optional[StrictBool], Field(description="Filter by deleted status")] = Query(False, description="Filter by deleted status", alias="filter_deleted"),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:read"]
    ),
    token_client_credentials: TokenModel = Security(
        get_token_client_credentials, scopes=["ads:read"]
    ),
) -> ConversionTagsList200Response:
    """List conversion tags associated with an ad account."""
    if not BaseConversionTagsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseConversionTagsApi.subclasses[0]().conversion_tags_list(ad_account_id, filter_deleted)


@router.post(
    "/ad_accounts/{ad_account_id}/conversion_tags",
    responses={
        200: {"model": ConversionTag, "description": "The request has succeeded."},
        201: {"model": ConversionTag, "description": "Resource create operation completed successfully."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["conversion_tags"],
    summary="Create conversion tag",
    response_model_by_alias=True,
)
async def conversion_tags_create(
    ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")] = Path(..., description="Unique identifier of an ad account.", regex=r"^\d+$", max_length=18),
    conversion_tag_create: ConversionTagCreate = Body(None, description=""),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:write"]
    ),
) -> ConversionTag:
    """Create a conversion tag, also known as [Pinterest tag](https://help.pinterest.com/en/business/article/set-up-the-pinterest-tag), with the option to enable enhanced match.  The Pinterest Tag tracks actions people take on the ad account&#39;s website after they view the ad account&#39;s ad on Pinterest. The advertiser needs to customize this tag to track conversions.  For more information, see:  [Set up the Pinterest tag](https://help.pinterest.com/en/business/article/set-up-the-pinterest-tag)  [Pinterest Tag](/docs/track-conversions/pinterest-tag/)  [Enhanced match](/docs/track-conversions/pinterest-tag/#enhanced-match)"""
    if not BaseConversionTagsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseConversionTagsApi.subclasses[0]().conversion_tags_create(ad_account_id, conversion_tag_create)


@router.get(
    "/ad_accounts/{ad_account_id}/conversion_tags/ocpm_eligible",
    responses={
        200: {"model": Dict[str, List[ConversionEventResponse]], "description": "Success"},
        "default": {"model": Error, "description": "Unexpected errors"},
    },
    tags=["conversion_tags"],
    summary="Get Ocpm eligible conversion tags",
    response_model_by_alias=True,
)
async def ocpm_eligible_conversion_tags_get(
    ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")] = Path(..., description="Unique identifier of an ad account.", regex=r"^\d+$", max_length=18),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:read"]
    ),
    token_client_credentials: TokenModel = Security(
        get_token_client_credentials, scopes=["ads:read"]
    ),
) -> Dict[str, List[ConversionEventResponse]]:
    """Get Ocpm eligible conversion tag events for an ad account."""
    if not BaseConversionTagsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseConversionTagsApi.subclasses[0]().ocpm_eligible_conversion_tags_get(ad_account_id)


@router.get(
    "/ad_accounts/{ad_account_id}/conversion_tags/page_visit",
    responses={
        200: {"model": PageVisitConversionTagsGet200Response, "description": "Success"},
        "default": {"model": Error, "description": "Unexpected error"},
    },
    tags=["conversion_tags"],
    summary="Get page visit conversion tags",
    response_model_by_alias=True,
)
async def page_visit_conversion_tags_get(
    ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")] = Path(..., description="Unique identifier of an ad account.", regex=r"^\d+$", max_length=18),
    page_size: Annotated[Optional[Annotated[int, Field(le=250, strict=True, ge=1)]], Field(description="Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.")] = Query(25, description="Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.", alias="page_size", ge=1, le=250),
    order: Annotated[Optional[StrictStr], Field(description="The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.")] = Query(None, description="The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.", alias="order"),
    bookmark: Annotated[Optional[StrictStr], Field(description="Cursor used to fetch the next page of items")] = Query(None, description="Cursor used to fetch the next page of items", alias="bookmark"),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:read"]
    ),
    token_client_credentials: TokenModel = Security(
        get_token_client_credentials, scopes=["ads:read"]
    ),
) -> PageVisitConversionTagsGet200Response:
    """Get all page visit conversion tag events for an ad account."""
    if not BaseConversionTagsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseConversionTagsApi.subclasses[0]().page_visit_conversion_tags_get(ad_account_id, page_size, order, bookmark)


@router.get(
    "/ad_accounts/{ad_account_id}/conversion_tags/{conversion_tag_id}",
    responses={
        200: {"model": ConversionTag, "description": "Success"},
        "default": {"model": Error, "description": "Unexpected error"},
    },
    tags=["conversion_tags"],
    summary="Get conversion tag",
    response_model_by_alias=True,
)
async def conversion_tags_get(
    ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")] = Path(..., description="Unique identifier of an ad account.", regex=r"^\d+$", max_length=18),
    conversion_tag_id: Annotated[str, Field(strict=True, max_length=18, description="Id of the conversion tag.")] = Path(..., description="Id of the conversion tag.", regex=r"^\d+$", max_length=18),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["ads:read"]
    ),
    token_client_credentials: TokenModel = Security(
        get_token_client_credentials, scopes=["ads:read"]
    ),
) -> ConversionTag:
    """Get information about an existing conversion tag."""
    if not BaseConversionTagsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseConversionTagsApi.subclasses[0]().conversion_tags_get(ad_account_id, conversion_tag_id)
