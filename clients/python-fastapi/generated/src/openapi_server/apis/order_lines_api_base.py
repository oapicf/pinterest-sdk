# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401

from pydantic import Field, StrictStr, field_validator
from typing import Optional
from typing_extensions import Annotated
from openapi_server.models.error import Error
from openapi_server.models.order_line import OrderLine
from openapi_server.models.order_lines_list200_response import OrderLinesList200Response
from openapi_server.security_api import get_token_pinterest_oauth2

class BaseOrderLinesApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BaseOrderLinesApi.subclasses = BaseOrderLinesApi.subclasses + (cls,)
    async def order_lines_list(
        self,
        ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")],
        page_size: Annotated[Optional[Annotated[int, Field(le=250, strict=True, ge=1)]], Field(description="Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.")],
        order: Annotated[Optional[StrictStr], Field(description="The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.")],
        bookmark: Annotated[Optional[StrictStr], Field(description="Cursor used to fetch the next page of items")],
    ) -> OrderLinesList200Response:
        """List existing order lines associated with an ad account."""
        ...


    async def order_lines_get(
        self,
        ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")],
        order_line_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an order line.")],
    ) -> OrderLine:
        """Get a specific existing order line associated with an ad account."""
        ...
