# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401

from pydantic import Field, StrictBool, StrictStr, field_validator
from typing import Any, Optional
from typing_extensions import Annotated
from openapi_server.models.pinterest_lib_error import PinterestLibError
from openapi_server.models.pinterest_lib_pagination_order import PinterestLibPaginationOrder
from openapi_server.models.targeting_template import TargetingTemplate
from openapi_server.models.targeting_template_create import TargetingTemplateCreate
from openapi_server.models.targeting_template_list200_response import TargetingTemplateList200Response
from openapi_server.models.targeting_template_update_request_read_or_update import TargetingTemplateUpdateRequestReadOrUpdate
from openapi_server.security_api import get_token_pinterest_oauth2, get_token_client_credentials

class BaseTargetingTemplateApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BaseTargetingTemplateApi.subclasses = BaseTargetingTemplateApi.subclasses + (cls,)
    async def targeting_template_list(
        self,
        ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")],
        bookmark: Annotated[Optional[StrictStr], Field(description="Cursor used to fetch the next page of items")],
        page_size: Annotated[Optional[Annotated[int, Field(le=250, strict=True, ge=1)]], Field(description="Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.")],
        order: Annotated[Optional[PinterestLibPaginationOrder], Field(description="The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.")],
        include_sizing: Annotated[Optional[StrictBool], Field(description="Include audience sizing in result or not")],
        search_query: Annotated[Optional[StrictStr], Field(description="Search query. Can contain pin description keywords or comma-separated pin IDs.")],
    ) -> TargetingTemplateList200Response:
        """Get a list of the targeting templates in the specified &#x60;ad_account_id&#x60;"""
        ...


    async def targeting_template_create(
        self,
        ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")],
        targeting_template_create: TargetingTemplateCreate,
    ) -> TargetingTemplate:
        """Targeting templates allow advertisers to save a set of targeting details including audience lists, keywords &amp; interest, demographics, and placements to use more than once during the campaign creation process.  Templates can be used to build out basic targeting criteria that you plan to use across campaigns and to reuse performance targeting from prior campaigns for new campaigns."""
        ...


    async def targeting_template_update(
        self,
        ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")],
        targeting_template_update_request_read_or_update: TargetingTemplateUpdateRequestReadOrUpdate,
    ) -> None:
        """Update the targeting template given advertiser ID and targeting template ID"""
        ...
