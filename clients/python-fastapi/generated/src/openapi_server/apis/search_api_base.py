# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401

from pydantic import Field, StrictStr, field_validator
from typing import Optional
from typing_extensions import Annotated
from openapi_server.models.boards_list200_response import BoardsList200Response
from openapi_server.models.pins_list200_response import PinsList200Response
from openapi_server.models.pinterest_lib_error import PinterestLibError
from openapi_server.models.search_partner_pins200_response import SearchPartnerPins200Response
from openapi_server.security_api import get_token_pinterest_oauth2, get_token_client_credentials

class BaseSearchApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BaseSearchApi.subclasses = BaseSearchApi.subclasses + (cls,)
    async def search_user_boards_get(
        self,
        ad_account_id: Annotated[Optional[Annotated[str, Field(strict=True, max_length=18)]], Field(description="Unique identifier of an ad account.")],
        query: Annotated[Optional[StrictStr], Field(description="Search query. Can contain pin description keywords or comma-separated pin IDs.")],
        bookmark: Annotated[Optional[StrictStr], Field(description="Cursor used to fetch the next page of items")],
        page_size: Annotated[Optional[Annotated[int, Field(le=250, strict=True, ge=1)]], Field(description="Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.")],
    ) -> BoardsList200Response:
        """Search for boards for the \&quot;operation user_account\&quot;. This includes boards of all board types. - By default, the \&quot;operation user_account\&quot; is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. See [Understanding Business Access](/docs/getting-started/using-business-access/) for more information."""
        ...


    async def search_partner_pins(
        self,
        term: Annotated[StrictStr, Field(description="Search term to look up pins.")],
        country_code: Annotated[StrictStr, Field(description="Two letter country code (ISO 3166-1 alpha-2)")],
        bookmark: Annotated[Optional[StrictStr], Field(description="Cursor used to fetch the next page of items")],
        locale: Annotated[Optional[StrictStr], Field(description="Search locale.")],
        limit: Annotated[Optional[Annotated[int, Field(le=50, strict=True, ge=1)]], Field(description="Max search result size")],
    ) -> SearchPartnerPins200Response:
        """**This endpoint is currently in beta and not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**  Get the top 10 Pins by a given search term."""
        ...


    async def search_user_pins_list(
        self,
        query: Annotated[StrictStr, Field(description="Search query. Can contain pin description keywords or comma-separated pin IDs.")],
        ad_account_id: Annotated[Optional[Annotated[str, Field(strict=True, max_length=18)]], Field(description="Unique identifier of an ad account.")],
        bookmark: Annotated[Optional[StrictStr], Field(description="Cursor used to fetch the next page of items")],
    ) -> PinsList200Response:
        """Search for pins for the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. See [Understanding Business Access](/docs/getting-started/using-business-access/) for more information."""
        ...
