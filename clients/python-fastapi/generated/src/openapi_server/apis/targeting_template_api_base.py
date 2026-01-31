# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401

from pydantic import Field, StrictBool, StrictStr, field_validator
from typing import Any, Optional
from typing_extensions import Annotated
from openapi_server.models.error import Error
from openapi_server.models.targeting_template_create import TargetingTemplateCreate
from openapi_server.models.targeting_template_get_response_data import TargetingTemplateGetResponseData
from openapi_server.models.targeting_template_list200_response import TargetingTemplateList200Response
from openapi_server.models.targeting_template_update_request import TargetingTemplateUpdateRequest
from openapi_server.security_api import get_token_pinterest_oauth2, get_token_client_credentials

class BaseTargetingTemplateApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BaseTargetingTemplateApi.subclasses = BaseTargetingTemplateApi.subclasses + (cls,)
    async def targeting_template_list(
        self,
        ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")],
        order: Annotated[Optional[StrictStr], Field(description="The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.")],
        include_sizing: Annotated[Optional[StrictBool], Field(description="Include audience sizing in result or not")],
        search_query: Annotated[Optional[StrictStr], Field(description="Search keyword for targeting templates")],
        page_size: Annotated[Optional[Annotated[int, Field(le=250, strict=True, ge=1)]], Field(description="Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.")],
        bookmark: Annotated[Optional[StrictStr], Field(description="Cursor used to fetch the next page of items")],
    ) -> TargetingTemplateList200Response:
        """Get a list of the targeting templates in the specified &lt;code&gt;ad_account_id&lt;/code&gt;"""
        ...


    async def targeting_template_create(
        self,
        ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")],
        targeting_template_create: Annotated[TargetingTemplateCreate, Field(description="targeting template creation entity")],
    ) -> TargetingTemplateGetResponseData:
        """&lt;p&gt;Targeting templates allow advertisers to save a set of targeting details including audience lists,  keywords &amp; interest, demographics, and placements to use more than once during the campaign creation process.&lt;/p&gt;  &lt;p&gt;Templates can be used to build out basic targeting criteria that you plan to use across campaigns and to reuse   performance targeting from prior campaigns for new campaigns.&lt;/p&gt;"""
        ...


    async def targeting_template_update(
        self,
        ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")],
        targeting_template_update_request: Annotated[TargetingTemplateUpdateRequest, Field(description="Operation type and targeting template ID")],
    ) -> None:
        """&lt;p&gt;Update the targeting template given advertiser ID and targeting template ID&lt;/p&gt;"""
        ...
