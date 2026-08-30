# coding: utf-8

from typing import Dict, List  # noqa: F401
import importlib
import pkgutil

from openapi_server.apis.boards_api_base import BaseBoardsApi
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
from typing import Any, List, Optional
from typing_extensions import Annotated
from openapi_server.models.board import Board
from openapi_server.models.board_create import BoardCreate
from openapi_server.models.board_privacy_filter import BoardPrivacyFilter
from openapi_server.models.board_section import BoardSection
from openapi_server.models.board_section_create import BoardSectionCreate
from openapi_server.models.board_section_update_with_required_body import BoardSectionUpdateWithRequiredBody
from openapi_server.models.board_sections_list200_response import BoardSectionsList200Response
from openapi_server.models.board_with_update_privacy import BoardWithUpdatePrivacy
from openapi_server.models.board_with_update_privacy_update import BoardWithUpdatePrivacyUpdate
from openapi_server.models.boards_list200_response import BoardsList200Response
from openapi_server.models.boards_list_pins200_response import BoardsListPins200Response
from openapi_server.models.creative_type import CreativeType
from openapi_server.models.pinterest_lib_error import PinterestLibError
from openapi_server.security_api import get_token_pinterest_oauth2, get_token_client_credentials

router = APIRouter()

ns_pkg = openapi_server.impl
for _, name, _ in pkgutil.iter_modules(ns_pkg.__path__, ns_pkg.__name__ + "."):
    importlib.import_module(name)


@router.get(
    "/boards",
    responses={
        200: {"model": BoardsList200Response, "description": "The request has succeeded."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["boards"],
    summary="List boards",
    response_model_by_alias=True,
)
async def boards_list(
    ad_account_id: Annotated[Optional[Annotated[str, Field(strict=True, max_length=18)]], Field(description="Unique identifier of an ad account.")] = Query(None, description="Unique identifier of an ad account.", alias="ad_account_id", regex=r"^\d+$", max_length=18),
    privacy: Annotated[Optional[BoardPrivacyFilter], Field(description="The privacy level of the board")] = Query(None, description="The privacy level of the board", alias="privacy"),
    bookmark: Annotated[Optional[StrictStr], Field(description="Cursor used to fetch the next page of items")] = Query(None, description="Cursor used to fetch the next page of items", alias="bookmark"),
    page_size: Annotated[Optional[Annotated[int, Field(le=250, strict=True, ge=1)]], Field(description="Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.")] = Query(25, description="Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", alias="page_size", ge=1, le=250),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["boards:read"]
    ),
    token_client_credentials: TokenModel = Security(
        get_token_client_credentials, scopes=["boards:read"]
    ),
) -> BoardsList200Response:
    """Get a list of the boards owned by the \&quot;operation user_account\&quot; + group boards where this account is a collaborator Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. Optional: Specify a privacy type (public, protected, or secret) to indicate which boards to return. * If no privacy is specified, all boards that can be returned (based on the scopes of the token and ad_account role if applicable) will be returned."""
    if not BaseBoardsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseBoardsApi.subclasses[0]().boards_list(ad_account_id, privacy, bookmark, page_size)


@router.post(
    "/boards",
    responses={
        200: {"model": Board, "description": "The request has succeeded."},
        201: {"model": Board, "description": "Resource create operation completed successfully."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["boards"],
    summary="Create board",
    response_model_by_alias=True,
)
async def boards_create(
    board_create: BoardCreate = Body(None, description=""),
    ad_account_id: Annotated[Optional[Annotated[str, Field(strict=True, max_length=18)]], Field(description="Unique identifier of an ad account.")] = Query(None, description="Unique identifier of an ad account.", alias="ad_account_id", regex=r"^\d+$", max_length=18),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["boards:read", "boards:write"]
    ),
    token_client_credentials: TokenModel = Security(
        get_token_client_credentials, scopes=["boards:read", "boards:write"]
    ),
) -> Board:
    """Create a board owned by the \&quot;operation user_account\&quot;. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. * By default, the \&quot;operation user_account\&quot; is the token user_account."""
    if not BaseBoardsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseBoardsApi.subclasses[0]().boards_create(board_create, ad_account_id)


@router.get(
    "/boards/{board_id}",
    responses={
        200: {"model": Board, "description": "The request has succeeded."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["boards"],
    summary="Get board",
    response_model_by_alias=True,
)
async def boards_get(
    board_id: Annotated[str, Field(strict=True)] = Path(..., description="", regex=r"^\d+$"),
    ad_account_id: Annotated[Optional[Annotated[str, Field(strict=True, max_length=18)]], Field(description="Unique identifier of an ad account.")] = Query(None, description="Unique identifier of an ad account.", alias="ad_account_id", regex=r"^\d+$", max_length=18),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["boards:read"]
    ),
    token_client_credentials: TokenModel = Security(
        get_token_client_credentials, scopes=["boards:read"]
    ),
) -> Board:
    """Get a board owned by the operation user_account - or a group board that has been shared with this account. * Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. * By default, the \&quot;operation user_account\&quot; is the token user_account."""
    if not BaseBoardsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseBoardsApi.subclasses[0]().boards_get(board_id, ad_account_id)


@router.delete(
    "/boards/{board_id}",
    responses={
        200: {"model": Board, "description": "The request has succeeded."},
        204: {"description": "Resource deleted successfully."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["boards"],
    summary="Delete board",
    response_model_by_alias=True,
)
async def boards_delete(
    board_id: Annotated[str, Field(strict=True)] = Path(..., description="", regex=r"^\d+$"),
    ad_account_id: Annotated[Optional[Annotated[str, Field(strict=True, max_length=18)]], Field(description="Unique identifier of an ad account.")] = Query(None, description="Unique identifier of an ad account.", alias="ad_account_id", regex=r"^\d+$", max_length=18),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["boards:read", "boards:write"]
    ),
) -> Board:
    """Delete a board owned by the \&quot;operation user_account\&quot;. * Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. * By default, the \&quot;operation user_account\&quot; is the token user_account."""
    if not BaseBoardsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseBoardsApi.subclasses[0]().boards_delete(board_id, ad_account_id)


@router.patch(
    "/boards/{board_id}",
    responses={
        200: {"model": BoardWithUpdatePrivacy, "description": "The request has succeeded."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["boards"],
    summary="Update board",
    response_model_by_alias=True,
)
async def boards_update(
    board_id: Annotated[str, Field(strict=True)] = Path(..., description="", regex=r"^\d+$"),
    board_with_update_privacy_update: BoardWithUpdatePrivacyUpdate = Body(None, description=""),
    ad_account_id: Annotated[Optional[Annotated[str, Field(strict=True, max_length=18)]], Field(description="Unique identifier of an ad account.")] = Query(None, description="Unique identifier of an ad account.", alias="ad_account_id", regex=r"^\d+$", max_length=18),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["boards:read", "boards:write"]
    ),
    token_client_credentials: TokenModel = Security(
        get_token_client_credentials, scopes=["boards:read", "boards:write"]
    ),
) -> BoardWithUpdatePrivacy:
    """Update a board owned by the \&quot;operating user_account\&quot;. * Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. * By default, the \&quot;operation user_account\&quot; is the token user_account."""
    if not BaseBoardsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseBoardsApi.subclasses[0]().boards_update(board_id, board_with_update_privacy_update, ad_account_id)


@router.get(
    "/boards/{board_id}/pins",
    responses={
        200: {"model": BoardsListPins200Response, "description": "The request has succeeded."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["boards"],
    summary="List Pins on board",
    response_model_by_alias=True,
)
async def boards_list_pins(
    board_id: Annotated[str, Field(strict=True, description="Unique identifier of a board.")] = Path(..., description="Unique identifier of a board.", regex=r"^\d+$"),
    creative_types: Annotated[Optional[List[CreativeType]], Field(description="Pin creative types filter. **Note:** SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.")] = Query(None, description="Pin creative types filter. **Note:** SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.", alias="creative_types"),
    ad_account_id: Annotated[Optional[Annotated[str, Field(strict=True, max_length=18)]], Field(description="Unique identifier of an ad account.")] = Query(None, description="Unique identifier of an ad account.", alias="ad_account_id", regex=r"^\d+$", max_length=18),
    pin_metrics: Annotated[Optional[StrictBool], Field(description="Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before `2023-03-20` lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.")] = Query(False, description="Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &#x60;2023-03-20&#x60; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.", alias="pin_metrics"),
    bookmark: Annotated[Optional[StrictStr], Field(description="Cursor used to fetch the next page of items")] = Query(None, description="Cursor used to fetch the next page of items", alias="bookmark"),
    page_size: Annotated[Optional[Annotated[int, Field(le=250, strict=True, ge=1)]], Field(description="Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.")] = Query(25, description="Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", alias="page_size", ge=1, le=250),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["boards:read", "pins:read"]
    ),
    token_client_credentials: TokenModel = Security(
        get_token_client_credentials, scopes=["boards:read", "pins:read"]
    ),
) -> BoardsListPins200Response:
    """Get a list of the Pins on a board owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. - Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account."""
    if not BaseBoardsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseBoardsApi.subclasses[0]().boards_list_pins(board_id, creative_types, ad_account_id, pin_metrics, bookmark, page_size)


@router.get(
    "/boards/{board_id}/sections",
    responses={
        200: {"model": BoardSectionsList200Response, "description": "The request has succeeded."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["boards"],
    summary="List board sections",
    response_model_by_alias=True,
)
async def board_sections_list(
    board_id: Annotated[str, Field(strict=True, description="Unique identifier of a board.")] = Path(..., description="Unique identifier of a board.", regex=r"^\d+$"),
    ad_account_id: Annotated[Optional[Annotated[str, Field(strict=True, max_length=18)]], Field(description="Unique identifier of an ad account.")] = Query(None, description="Unique identifier of an ad account.", alias="ad_account_id", regex=r"^\d+$", max_length=18),
    bookmark: Annotated[Optional[StrictStr], Field(description="Cursor used to fetch the next page of items")] = Query(None, description="Cursor used to fetch the next page of items", alias="bookmark"),
    page_size: Annotated[Optional[Annotated[int, Field(le=250, strict=True, ge=1)]], Field(description="Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.")] = Query(25, description="Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", alias="page_size", ge=1, le=250),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["boards:read"]
    ),
    token_client_credentials: TokenModel = Security(
        get_token_client_credentials, scopes=["boards:read"]
    ),
) -> BoardSectionsList200Response:
    """Get a list of all board sections from a board owned by the \&quot;operation user_account\&quot; - or a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account."""
    if not BaseBoardsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseBoardsApi.subclasses[0]().board_sections_list(board_id, ad_account_id, bookmark, page_size)


@router.post(
    "/boards/{board_id}/sections",
    responses={
        200: {"model": BoardSection, "description": "The request has succeeded."},
        201: {"model": BoardSection, "description": "Resource create operation completed successfully."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["boards"],
    summary="Create board section",
    response_model_by_alias=True,
)
async def board_sections_create(
    board_id: Annotated[str, Field(strict=True, description="Unique identifier of a board.")] = Path(..., description="Unique identifier of a board.", regex=r"^\d+$"),
    board_section_create: BoardSectionCreate = Body(None, description=""),
    ad_account_id: Annotated[Optional[Annotated[str, Field(strict=True, max_length=18)]], Field(description="Unique identifier of an ad account.")] = Query(None, description="Unique identifier of an ad account.", alias="ad_account_id", regex=r"^\d+$", max_length=18),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["boards:read", "boards:write"]
    ),
) -> BoardSection:
    """Create a board section on a board owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account."""
    if not BaseBoardsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseBoardsApi.subclasses[0]().board_sections_create(board_id, board_section_create, ad_account_id)


@router.delete(
    "/boards/{board_id}/sections/{section_id}",
    responses={
        200: {"model": BoardSection, "description": "The request has succeeded."},
        204: {"description": "Resource deleted successfully."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["boards"],
    summary="Delete board section",
    response_model_by_alias=True,
)
async def board_sections_delete(
    board_id: Annotated[str, Field(strict=True, description="Unique identifier of a board.")] = Path(..., description="Unique identifier of a board.", regex=r"^\d+$"),
    section_id: Annotated[str, Field(strict=True, description="Unique identifier of a board section.")] = Path(..., description="Unique identifier of a board section.", regex=r"^\d+$"),
    ad_account_id: Annotated[Optional[Annotated[str, Field(strict=True, max_length=18)]], Field(description="Unique identifier of an ad account.")] = Query(None, description="Unique identifier of an ad account.", alias="ad_account_id", regex=r"^\d+$", max_length=18),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["boards:read", "boards:write"]
    ),
) -> BoardSection:
    """Delete a board section on a board owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account."""
    if not BaseBoardsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseBoardsApi.subclasses[0]().board_sections_delete(board_id, section_id, ad_account_id)


@router.patch(
    "/boards/{board_id}/sections/{section_id}",
    responses={
        200: {"model": BoardSection, "description": "The request has succeeded."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["boards"],
    summary="Update board section",
    response_model_by_alias=True,
)
async def board_sections_update(
    board_id: Annotated[str, Field(strict=True, description="Unique identifier of a board.")] = Path(..., description="Unique identifier of a board.", regex=r"^\d+$"),
    section_id: Annotated[str, Field(strict=True, description="Unique identifier of a board section.")] = Path(..., description="Unique identifier of a board section.", regex=r"^\d+$"),
    board_section_update_with_required_body: BoardSectionUpdateWithRequiredBody = Body(None, description=""),
    ad_account_id: Annotated[Optional[Annotated[str, Field(strict=True, max_length=18)]], Field(description="Unique identifier of an ad account.")] = Query(None, description="Unique identifier of an ad account.", alias="ad_account_id", regex=r"^\d+$", max_length=18),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["boards:read", "boards:write"]
    ),
) -> BoardSection:
    """Update a board section on a board owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account."""
    if not BaseBoardsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseBoardsApi.subclasses[0]().board_sections_update(board_id, section_id, board_section_update_with_required_body, ad_account_id)


@router.get(
    "/boards/{board_id}/sections/{section_id}/pins",
    responses={
        200: {"model": BoardsListPins200Response, "description": "The request has succeeded."},
        400: {"model": PinterestLibError, "description": "The request could not be understood by the server due to unexpected data."},
        401: {"model": PinterestLibError, "description": "Authentication is required and has either failed or not been provided."},
        403: {"model": PinterestLibError, "description": "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource."},
        404: {"model": PinterestLibError, "description": "The requested resource could not be found on this server."},
        429: {"model": PinterestLibError, "description": "The user has sent too many requests in a given amount of time and is being rate limited."},
        "default": {"model": PinterestLibError, "description": "An unexpected error response."},
    },
    tags=["boards"],
    summary="List Pins on board section",
    response_model_by_alias=True,
)
async def board_sections_list_pins(
    board_id: Annotated[str, Field(strict=True, description="Unique identifier of a board.")] = Path(..., description="Unique identifier of a board.", regex=r"^\d+$"),
    section_id: Annotated[str, Field(strict=True, description="Unique identifier of a board section.")] = Path(..., description="Unique identifier of a board section.", regex=r"^\d+$"),
    ad_account_id: Annotated[Optional[Annotated[str, Field(strict=True, max_length=18)]], Field(description="Unique identifier of an ad account.")] = Query(None, description="Unique identifier of an ad account.", alias="ad_account_id", regex=r"^\d+$", max_length=18),
    bookmark: Annotated[Optional[StrictStr], Field(description="Cursor used to fetch the next page of items")] = Query(None, description="Cursor used to fetch the next page of items", alias="bookmark"),
    page_size: Annotated[Optional[Annotated[int, Field(le=250, strict=True, ge=1)]], Field(description="Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.")] = Query(25, description="Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", alias="page_size", ge=1, le=250),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["boards:read", "pins:read"]
    ),
    token_client_credentials: TokenModel = Security(
        get_token_client_credentials, scopes=["boards:read", "pins:read"]
    ),
) -> BoardsListPins200Response:
    """Get a list of the Pins on a board section of a board owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account."""
    if not BaseBoardsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseBoardsApi.subclasses[0]().board_sections_list_pins(board_id, section_id, ad_account_id, bookmark, page_size)
