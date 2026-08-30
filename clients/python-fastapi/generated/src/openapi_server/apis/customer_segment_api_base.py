# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401

from pydantic import Field, StrictBool, StrictStr, field_validator
from typing import Any, Optional
from typing_extensions import Annotated
from openapi_server.models.customer_segment import CustomerSegment
from openapi_server.models.customer_segment_create import CustomerSegmentCreate
from openapi_server.models.customer_segment_list200_response import CustomerSegmentList200Response
from openapi_server.models.customer_segment_update_request_update_with_required_body import CustomerSegmentUpdateRequestUpdateWithRequiredBody
from openapi_server.models.pinterest_lib_error import PinterestLibError
from openapi_server.models.pinterest_lib_pagination_order import PinterestLibPaginationOrder
from openapi_server.security_api import get_token_pinterest_oauth2

class BaseCustomerSegmentApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BaseCustomerSegmentApi.subclasses = BaseCustomerSegmentApi.subclasses + (cls,)
    async def customer_segment_list(
        self,
        ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")],
        bookmark: Annotated[Optional[StrictStr], Field(description="Cursor used to fetch the next page of items")],
        page_size: Annotated[Optional[Annotated[int, Field(le=250, strict=True, ge=1)]], Field(description="Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.")],
        order: Annotated[Optional[PinterestLibPaginationOrder], Field(description="The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.")],
        include_sizing: Annotated[Optional[StrictBool], Field(description="Include audience sizing in result or not")],
        search_query: Annotated[Optional[StrictStr], Field(description="Search query. Can contain pin description keywords or comma-separated pin IDs.")],
    ) -> CustomerSegmentList200Response:
        """Get a list of the customer segments in the specified &#x60;ad_account_id&#x60;."""
        ...


    async def customer_segment_create(
        self,
        ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")],
        customer_segment_create: CustomerSegmentCreate,
    ) -> CustomerSegment:
        """Customer segments allow advertisers to define existing customers for Pinterest Performance+ campaigns. Customer segments are made up of audience lists."""
        ...


    async def customer_segment_update(
        self,
        ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")],
        customer_segment_update_request_update_with_required_body: CustomerSegmentUpdateRequestUpdateWithRequiredBody,
    ) -> None:
        """Update the customer segment given advertiser ID and customer segment ID"""
        ...
