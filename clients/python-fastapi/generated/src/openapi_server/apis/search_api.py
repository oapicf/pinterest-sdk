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
from openapi_server.models.error import Error
from openapi_server.models.search_partner_pins200_response import SearchPartnerPins200Response
from openapi_server.models.search_user_boards_get200_response import SearchUserBoardsGet200Response
from openapi_server.models.search_user_pins_list200_response import SearchUserPinsList200Response
from openapi_server.security_api import get_token_pinterest_oauth2, get_token_client_credentials

router = APIRouter()

ns_pkg = openapi_server.impl
for _, name, _ in pkgutil.iter_modules(ns_pkg.__path__, ns_pkg.__name__ + "."):
    importlib.import_module(name)


@router.get(
    "/search/boards",
    responses={
        200: {"model": SearchUserBoardsGet200Response, "description": "response"},
        "default": {"model": Error, "description": "Unexpected error"},
    },
    tags=["search"],
    summary="Search user&#39;s boards",
    response_model_by_alias=True,
)
async def search_user_boards_get(
    ad_account_id: Annotated[Optional[Annotated[str, Field(strict=True, max_length=18)]], Field(description="Unique identifier of an ad account.")] = Query(None, description="Unique identifier of an ad account.", alias="ad_account_id", regex=r"^\d+$", max_length=18),
    bookmark: Annotated[Optional[StrictStr], Field(description="Cursor used to fetch the next page of items")] = Query(None, description="Cursor used to fetch the next page of items", alias="bookmark"),
    page_size: Annotated[Optional[Annotated[int, Field(le=250, strict=True, ge=1)]], Field(description="Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.")] = Query(25, description="Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.", alias="page_size", ge=1, le=250),
    query: Annotated[Optional[StrictStr], Field(description="Search query. Can contain pin description keywords or comma-separated pin IDs.")] = Query(None, description="Search query. Can contain pin description keywords or comma-separated pin IDs.", alias="query"),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["boards:read", "boards:read_secret"]
    ),
    token_client_credentials: TokenModel = Security(
        get_token_client_credentials, scopes=["boards:read", "boards:read_secret"]
    ),
) -> SearchUserBoardsGet200Response:
    """Search for boards for the \&quot;operation user_account\&quot;. This includes boards of all board types. - By default, the \&quot;operation user_account\&quot; is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. See &lt;a href&#x3D;&#39;/docs/getting-started/using-business-access/&#39;&gt;Understanding Business Access&lt;/a&gt; for more information."""
    if not BaseSearchApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseSearchApi.subclasses[0]().search_user_boards_get(ad_account_id, bookmark, page_size, query)


@router.get(
    "/search/pins",
    responses={
        200: {"model": SearchUserPinsList200Response, "description": "Success"},
        404: {"model": Error, "description": "User not found"},
        "default": {"model": Error, "description": "Unexpected error"},
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
) -> SearchUserPinsList200Response:
    """Search for pins for the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. See &lt;a href&#x3D;&#39;/docs/getting-started/using-business-access/&#39;&gt;Understanding Business Access&lt;/a&gt; for more information."""
    if not BaseSearchApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseSearchApi.subclasses[0]().search_user_pins_list(query, ad_account_id, bookmark)


@router.get(
    "/search/partner/pins",
    responses={
        200: {"model": SearchPartnerPins200Response, "description": "Success"},
        400: {"model": Error, "description": "Invalid pins"},
        "default": {"model": Error, "description": "Unexpected error"},
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
    """&lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/getting-started/using-beta-and-restricted-features/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Get the top 10 Pins by a given search term."""
    if not BaseSearchApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseSearchApi.subclasses[0]().search_partner_pins(term, country_code, bookmark, locale, limit)
