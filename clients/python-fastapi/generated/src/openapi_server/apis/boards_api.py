# coding: utf-8

from typing import Dict, List  # noqa: F401

from fastapi import (  # noqa: F401
    APIRouter,
    Body,
    Cookie,
    Depends,
    Form,
    Header,
    Path,
    Query,
    Response,
    Security,
    status,
)

from openapi_server.models.extra_models import TokenModel  # noqa: F401
from openapi_server.models.board import Board
from openapi_server.models.board_section import BoardSection
from openapi_server.models.board_update import BoardUpdate
from openapi_server.models.error import Error
from openapi_server.models.paginated import Paginated
from openapi_server.security_api import get_token_pinterest_oauth2

router = APIRouter()


@router.post(
    "/boards/{board_id}/sections",
    responses={
        201: {"model": BoardSection, "description": "response"},
        400: {"model": Error, "description": "Invalid board section parameters."},
        403: {"model": Error, "description": "Not authorized to create board sections."},
        409: {"model": Error, "description": "Could not get exclusive access to the board to create a new section."},
        500: {"model": Error, "description": "Could not create a new board section."},
        200: {"model": Error, "description": "Unexpected error"},
    },
    tags=["boards"],
    summary="Create board section",
)
async def board_sections_create(
    board_id: str = Path(None, description="Unique identifier of a board.", regex=r"^\d+$"),
    board_section: BoardSection = Body(None, description="Create a board section."),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["boards:read", "boards:write"]
    ),
) -> BoardSection:
    """Create a board section on a board owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. - By default, the \&quot;operation user_account\&quot; is the token user_account."""
    ...


@router.delete(
    "/boards/{board_id}/sections/{section_id}",
    responses={
        204: {"description": "Board section deleted successfully"},
        403: {"model": Error, "description": "Not authorized to delete board section."},
        404: {"model": Error, "description": "Board section not found."},
        409: {"model": Error, "description": "Board section conflict."},
        200: {"model": Error, "description": "Unexpected error"},
    },
    tags=["boards"],
    summary="Delete board section",
)
async def board_sections_delete(
    board_id: str = Path(None, description="Unique identifier of a board.", regex=r"^\d+$"),
    section_id: str = Path(None, description="Unique identifier of a board section.", regex=r"^\d+$"),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["boards:read", "boards:write"]
    ),
) -> None:
    """Delete a board section on a board owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. - By default, the \&quot;operation user_account\&quot; is the token user_account."""
    ...


@router.get(
    "/boards/{board_id}/sections",
    responses={
        200: {"model": Paginated, "description": "response"},
        200: {"model": Error, "description": "Unexpected error"},
    },
    tags=["boards"],
    summary="List board sections",
)
async def board_sections_list(
    board_id: str = Path(None, description="Unique identifier of a board.", regex=r"^\d+$"),
    bookmark: str = Query(None, description="Cursor used to fetch the next page of items"),
    page_size: int = Query(25, description="Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information.", ge=1, le=100),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["boards:read"]
    ),
) -> Paginated:
    """Get a list of all board sections from a board owned by the \&quot;operation user_account\&quot; - or a group board that has been shared with this account. - By default, the \&quot;operation user_account\&quot; is the token user_account."""
    ...


@router.get(
    "/boards/{board_id}/sections/{section_id}/pins",
    responses={
        200: {"model": Paginated, "description": "response"},
        403: {"model": Error, "description": "Not authorized to access Pins on board section."},
        404: {"model": Error, "description": "Board or section not found."},
        409: {"model": Error, "description": "Board section conflict."},
        200: {"model": Error, "description": "Unexpected error"},
    },
    tags=["boards"],
    summary="List Pins on board section",
)
async def board_sections_list_pins(
    board_id: str = Path(None, description="Unique identifier of a board.", regex=r"^\d+$"),
    section_id: str = Path(None, description="Unique identifier of a board section.", regex=r"^\d+$"),
    bookmark: str = Query(None, description="Cursor used to fetch the next page of items"),
    page_size: int = Query(25, description="Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information.", ge=1, le=100),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["boards:read", "pins:read"]
    ),
) -> Paginated:
    """Get a list of the Pins on a board section of a board owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. - By default, the \&quot;operation user_account\&quot; is the token user_account."""
    ...


@router.patch(
    "/boards/{board_id}/sections/{section_id}",
    responses={
        200: {"model": BoardSection, "description": "response"},
        400: {"model": Error, "description": "Invalid board section parameters."},
        403: {"model": Error, "description": "Not authorized to update board section."},
        409: {"model": Error, "description": "Board section conflict."},
        200: {"model": Error, "description": "Unexpected error"},
    },
    tags=["boards"],
    summary="Update board section",
)
async def board_sections_update(
    board_id: str = Path(None, description="Unique identifier of a board.", regex=r"^\d+$"),
    section_id: str = Path(None, description="Unique identifier of a board section.", regex=r"^\d+$"),
    board_section: BoardSection = Body(None, description="Update a board section."),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["boards:read", "boards:write"]
    ),
) -> BoardSection:
    """Update a board section on a board owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. - By default, the \&quot;operation user_account\&quot; is the token user_account."""
    ...


@router.post(
    "/boards",
    responses={
        201: {"model": Board, "description": "response"},
        400: {"model": Error, "description": "The board name is invalid or duplicated."},
        200: {"model": Error, "description": "Unexpected error"},
    },
    tags=["boards"],
    summary="Create board",
)
async def boards_create(
    board: Board = Body(None, description="Create a board using a single board json object."),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["boards:read", "boards:write"]
    ),
) -> Board:
    """Create a board owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account."""
    ...


@router.delete(
    "/boards/{board_id}",
    responses={
        204: {"description": "Board deleted successfully"},
        403: {"model": Error, "description": "Not authorized to delete the board."},
        404: {"model": Error, "description": "Board not found."},
        409: {"model": Error, "description": "Could not get exclusive access to delete the board."},
        429: {"model": Error, "description": "This request exceeded a rate limit. This can happen if the client exceeds one of the published rate limits or if multiple write operations are applied to an object within a short time window."},
        200: {"model": Error, "description": "Unexpected error"},
    },
    tags=["boards"],
    summary="Delete board",
)
async def boards_delete(
    board_id: str = Path(None, description="Unique identifier of a board.", regex=r"^\d+$"),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["boards:read", "boards:write"]
    ),
) -> None:
    """Delete a board owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account."""
    ...


@router.get(
    "/boards/{board_id}",
    responses={
        200: {"model": Board, "description": "response"},
        404: {"model": Error, "description": "Board not found."},
        200: {"model": Error, "description": "Unexpected error"},
    },
    tags=["boards"],
    summary="Get board",
)
async def boards_get(
    board_id: str = Path(None, description="Unique identifier of a board.", regex=r"^\d+$"),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["boards:read"]
    ),
) -> Board:
    """Get a board owned by the operation user_account - or a group board that has been shared with this account. - By default, the \&quot;operation user_account\&quot; is the token user_account."""
    ...


@router.get(
    "/boards",
    responses={
        200: {"model": Paginated, "description": "response"},
        200: {"model": Error, "description": "Unexpected error"},
    },
    tags=["boards"],
    summary="List boards",
)
async def boards_list(
    bookmark: str = Query(None, description="Cursor used to fetch the next page of items"),
    page_size: int = Query(25, description="Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information.", ge=1, le=100),
    privacy: str = Query(None, description="Privacy setting for a board."),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["boards:read"]
    ),
) -> Paginated:
    """Get a list of the boards owned by the \&quot;operation user_account\&quot; + group boards where this account is a collaborator  Optional: Specify a privacy type (public, protected, or secret) to indicate which boards to return. - If no privacy is specified, all boards that can be returned (based on the scopes of the token and ad_account role if applicable) will be returned."""
    ...


@router.get(
    "/boards/{board_id}/pins",
    responses={
        200: {"model": Paginated, "description": "response"},
        404: {"model": Error, "description": "Board not found."},
        200: {"model": Error, "description": "Unexpected error"},
    },
    tags=["boards"],
    summary="List Pins on board",
)
async def boards_list_pins(
    board_id: str = Path(None, description="Unique identifier of a board.", regex=r"^\d+$"),
    bookmark: str = Query(None, description="Cursor used to fetch the next page of items"),
    page_size: int = Query(25, description="Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information.", ge=1, le=100),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["boards:read", "pins:read"]
    ),
) -> Paginated:
    """Get a list of the Pins on a board owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. - By default, the \&quot;operation user_account\&quot; is the token user_account."""
    ...


@router.patch(
    "/boards/{board_id}",
    responses={
        200: {"model": Board, "description": "response"},
        400: {"model": Error, "description": "Invalid board parameters."},
        403: {"model": Error, "description": "Not authorized to update the board."},
        429: {"model": Error, "description": "This request exceeded a rate limit. This can happen if the client exceeds one of the published rate limits or if multiple write operations are applied to an object within a short time window."},
        200: {"model": Error, "description": "Unexpected error"},
    },
    tags=["boards"],
    summary="Update board",
)
async def boards_update(
    board_id: str = Path(None, description="Unique identifier of a board.", regex=r"^\d+$"),
    board_update: BoardUpdate = Body(None, description="Update a board."),
    token_pinterest_oauth2: TokenModel = Security(
        get_token_pinterest_oauth2, scopes=["boards:read", "boards:write"]
    ),
) -> Board:
    """Update a board owned by the \&quot;operating user_account\&quot;."""
    ...
