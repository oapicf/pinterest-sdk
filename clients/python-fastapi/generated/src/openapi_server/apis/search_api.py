# coding: utf-8

from typing import Dict, List  # noqa: F401
import importlib
import pkgutil

from openapi_server.apis.search_api_base import BaseSearchApi
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
from pydantic import Field, StrictStr, field_validator
from typing import Optional
from typing_extensions import Annotated
from openapi_server.models.boards_list200_response import BoardsList200Response
from openapi_server.models.pins_list200_response import PinsList200Response
from openapi_server.models.pinterest_lib_error import PinterestLibError
from openapi_server.models.search_partner_pins200_response import SearchPartnerPins200Response
from openapi_server.security_api import get_token_pinterest_oauth2, get_token_client_credentials

router = APIRouter()

ns_pkg = openapi_server.impl
for _, name, _ in pkgutil.iter_modules(ns_pkg.__path__, ns_pkg.__name__ + "."):
    importlib.import_module(name)


@router.get(
    "/search/boards",
    responses={
        200: {"model": BoardsList200Response, "description": "The request has succeeded."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["search"],
    summary="Search user&#39;s boards",
    response_model_by_alias=True,
)
async def search_user_boards_get(
    ad_account_id: Annotated[Optional[Annotated[str, Field(strict=True, max_length=18)]], Field(description="Unique identifier of an ad account.")] = Query(None, description="Unique identifier of an ad account.", alias="ad_account_id", regex=r"^\d+$", max_length=18),
    query: Annotated[Optional[StrictStr], Field(description="Search query. Can contain pin description keywords or comma-separated pin IDs.")] = Query(None, description="Search query. Can contain pin description keywords or comma-separated pin IDs.", alias="query"),
    bookmark: Annotated[Optional[StrictStr], Field(description="Cursor used to fetch the next page of items")] = Query(None, description="Cursor used to fetch the next page of items", alias="bookmark"),
    page_size: Annotated[Optional[Annotated[int, Field(le=250, strict=True, ge=1)]], Field(description="Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.")] = Query(25, description="Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", alias="page_size", ge=1, le=250),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["boards:read", "boards:read_secret"]
    ),
    token_client_credentials: TokenModel = Security(
        get_token_client_credentials, scopes=["boards:read", "boards:read_secret"]
    ),
) -> BoardsList200Response:
    """Search for boards for the \&quot;operation user_account\&quot;. This includes boards of all board types. - By default, the \&quot;operation user_account\&quot; is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. See [Understanding Business Access](/docs/getting-started/using-business-access/) for more information."""
    if not BaseSearchApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseSearchApi.subclasses[0]().search_user_boards_get(ad_account_id, query, bookmark, page_size)


@router.get(
    "/search/partner/pins",
    responses={
        200: {"model": SearchPartnerPins200Response, "description": "The request has succeeded."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["search"],
    summary="Search pins by a given search term",
    response_model_by_alias=True,
)
async def search_partner_pins(
    term: Annotated[StrictStr, Field(description="Search term to look up pins.")] = Query(None, description="Search term to look up pins.", alias="term"),
    country_code: Annotated[StrictStr, Field(description="Two letter country code (ISO 3166-1 alpha-2)")] = Query(None, description="Two letter country code (ISO 3166-1 alpha-2)", alias="country_code"),
    bookmark: Annotated[Optional[StrictStr], Field(description="Cursor used to fetch the next page of items")] = Query(None, description="Cursor used to fetch the next page of items", alias="bookmark"),
    locale: Annotated[Optional[StrictStr], Field(description="Search locale.")] = Query(None, description="Search locale.", alias="locale"),
    limit: Annotated[Optional[Annotated[int, Field(le=50, strict=True, ge=1)]], Field(description="Max search result size")] = Query(10, description="Max search result size", alias="limit", ge=1, le=50),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["boards:read", "pins:read"]
    ),
) -> SearchPartnerPins200Response:
    """**This endpoint is currently in beta and not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**  Get the top 10 Pins by a given search term."""
    if not BaseSearchApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseSearchApi.subclasses[0]().search_partner_pins(term, country_code, bookmark, locale, limit)


@router.get(
    "/search/pins",
    responses={
        200: {"model": PinsList200Response, "description": "The request has succeeded."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["search"],
    summary="Search user&#39;s Pins",
    response_model_by_alias=True,
)
async def search_user_pins_list(
    query: Annotated[StrictStr, Field(description="Search query. Can contain pin description keywords or comma-separated pin IDs.")] = Query(None, description="Search query. Can contain pin description keywords or comma-separated pin IDs.", alias="query"),
    ad_account_id: Annotated[Optional[Annotated[str, Field(strict=True, max_length=18)]], Field(description="Unique identifier of an ad account.")] = Query(None, description="Unique identifier of an ad account.", alias="ad_account_id", regex=r"^\d+$", max_length=18),
    bookmark: Annotated[Optional[StrictStr], Field(description="Cursor used to fetch the next page of items")] = Query(None, description="Cursor used to fetch the next page of items", alias="bookmark"),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["boards:read", "boards:read_secret", "pins:read", "pins:read_secret"]
    ),
) -> PinsList200Response:
    """Search for pins for the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. See [Understanding Business Access](/docs/getting-started/using-business-access/) for more information."""
    if not BaseSearchApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseSearchApi.subclasses[0]().search_user_pins_list(query, ad_account_id, bookmark)
