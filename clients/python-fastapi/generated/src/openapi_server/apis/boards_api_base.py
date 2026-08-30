# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401

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

class BaseBoardsApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BaseBoardsApi.subclasses = BaseBoardsApi.subclasses + (cls,)
    async def boards_list(
        self,
        ad_account_id: Annotated[Optional[Annotated[str, Field(strict=True, max_length=18)]], Field(description="Unique identifier of an ad account.")],
        privacy: Annotated[Optional[BoardPrivacyFilter], Field(description="The privacy level of the board")],
        bookmark: Annotated[Optional[StrictStr], Field(description="Cursor used to fetch the next page of items")],
        page_size: Annotated[Optional[Annotated[int, Field(le=250, strict=True, ge=1)]], Field(description="Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.")],
    ) -> BoardsList200Response:
        """Get a list of the boards owned by the \&quot;operation user_account\&quot; + group boards where this account is a collaborator Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. Optional: Specify a privacy type (public, protected, or secret) to indicate which boards to return. * If no privacy is specified, all boards that can be returned (based on the scopes of the token and ad_account role if applicable) will be returned."""
        ...


    async def boards_create(
        self,
        board_create: BoardCreate,
        ad_account_id: Annotated[Optional[Annotated[str, Field(strict=True, max_length=18)]], Field(description="Unique identifier of an ad account.")],
    ) -> Board:
        """Create a board owned by the \&quot;operation user_account\&quot;. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. * By default, the \&quot;operation user_account\&quot; is the token user_account."""
        ...


    async def boards_get(
        self,
        board_id: Annotated[str, Field(strict=True)],
        ad_account_id: Annotated[Optional[Annotated[str, Field(strict=True, max_length=18)]], Field(description="Unique identifier of an ad account.")],
    ) -> Board:
        """Get a board owned by the operation user_account - or a group board that has been shared with this account. * Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. * By default, the \&quot;operation user_account\&quot; is the token user_account."""
        ...


    async def boards_delete(
        self,
        board_id: Annotated[str, Field(strict=True)],
        ad_account_id: Annotated[Optional[Annotated[str, Field(strict=True, max_length=18)]], Field(description="Unique identifier of an ad account.")],
    ) -> Board:
        """Delete a board owned by the \&quot;operation user_account\&quot;. * Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. * By default, the \&quot;operation user_account\&quot; is the token user_account."""
        ...


    async def boards_update(
        self,
        board_id: Annotated[str, Field(strict=True)],
        board_with_update_privacy_update: BoardWithUpdatePrivacyUpdate,
        ad_account_id: Annotated[Optional[Annotated[str, Field(strict=True, max_length=18)]], Field(description="Unique identifier of an ad account.")],
    ) -> BoardWithUpdatePrivacy:
        """Update a board owned by the \&quot;operating user_account\&quot;. * Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. * By default, the \&quot;operation user_account\&quot; is the token user_account."""
        ...


    async def boards_list_pins(
        self,
        board_id: Annotated[str, Field(strict=True, description="Unique identifier of a board.")],
        creative_types: Annotated[Optional[List[CreativeType]], Field(description="Pin creative types filter. **Note:** SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.")],
        ad_account_id: Annotated[Optional[Annotated[str, Field(strict=True, max_length=18)]], Field(description="Unique identifier of an ad account.")],
        pin_metrics: Annotated[Optional[StrictBool], Field(description="Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before `2023-03-20` lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.")],
        bookmark: Annotated[Optional[StrictStr], Field(description="Cursor used to fetch the next page of items")],
        page_size: Annotated[Optional[Annotated[int, Field(le=250, strict=True, ge=1)]], Field(description="Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.")],
    ) -> BoardsListPins200Response:
        """Get a list of the Pins on a board owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. - Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account."""
        ...


    async def board_sections_list(
        self,
        board_id: Annotated[str, Field(strict=True, description="Unique identifier of a board.")],
        ad_account_id: Annotated[Optional[Annotated[str, Field(strict=True, max_length=18)]], Field(description="Unique identifier of an ad account.")],
        bookmark: Annotated[Optional[StrictStr], Field(description="Cursor used to fetch the next page of items")],
        page_size: Annotated[Optional[Annotated[int, Field(le=250, strict=True, ge=1)]], Field(description="Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.")],
    ) -> BoardSectionsList200Response:
        """Get a list of all board sections from a board owned by the \&quot;operation user_account\&quot; - or a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account."""
        ...


    async def board_sections_create(
        self,
        board_id: Annotated[str, Field(strict=True, description="Unique identifier of a board.")],
        board_section_create: BoardSectionCreate,
        ad_account_id: Annotated[Optional[Annotated[str, Field(strict=True, max_length=18)]], Field(description="Unique identifier of an ad account.")],
    ) -> BoardSection:
        """Create a board section on a board owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account."""
        ...


    async def board_sections_delete(
        self,
        board_id: Annotated[str, Field(strict=True, description="Unique identifier of a board.")],
        section_id: Annotated[str, Field(strict=True, description="Unique identifier of a board section.")],
        ad_account_id: Annotated[Optional[Annotated[str, Field(strict=True, max_length=18)]], Field(description="Unique identifier of an ad account.")],
    ) -> BoardSection:
        """Delete a board section on a board owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account."""
        ...


    async def board_sections_update(
        self,
        board_id: Annotated[str, Field(strict=True, description="Unique identifier of a board.")],
        section_id: Annotated[str, Field(strict=True, description="Unique identifier of a board section.")],
        board_section_update_with_required_body: BoardSectionUpdateWithRequiredBody,
        ad_account_id: Annotated[Optional[Annotated[str, Field(strict=True, max_length=18)]], Field(description="Unique identifier of an ad account.")],
    ) -> BoardSection:
        """Update a board section on a board owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account."""
        ...


    async def board_sections_list_pins(
        self,
        board_id: Annotated[str, Field(strict=True, description="Unique identifier of a board.")],
        section_id: Annotated[str, Field(strict=True, description="Unique identifier of a board section.")],
        ad_account_id: Annotated[Optional[Annotated[str, Field(strict=True, max_length=18)]], Field(description="Unique identifier of an ad account.")],
        bookmark: Annotated[Optional[StrictStr], Field(description="Cursor used to fetch the next page of items")],
        page_size: Annotated[Optional[Annotated[int, Field(le=250, strict=True, ge=1)]], Field(description="Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.")],
    ) -> BoardsListPins200Response:
        """Get a list of the Pins on a board section of a board owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account."""
        ...
