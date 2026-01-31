# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401

from pydantic import Field, StrictBool, StrictStr, field_validator
from typing import Dict, List, Optional
from typing_extensions import Annotated
from openapi_server.models.conversion_event_response import ConversionEventResponse
from openapi_server.models.conversion_tag import ConversionTag
from openapi_server.models.conversion_tag_create import ConversionTagCreate
from openapi_server.models.conversion_tags_list200_response import ConversionTagsList200Response
from openapi_server.models.error import Error
from openapi_server.models.page_visit_conversion_tags_get200_response import PageVisitConversionTagsGet200Response
from openapi_server.models.pinterest_lib_error import PinterestLibError
from openapi_server.security_api import get_token_pinterest_oauth2, get_token_client_credentials

class BaseConversionTagsApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BaseConversionTagsApi.subclasses = BaseConversionTagsApi.subclasses + (cls,)
    async def conversion_tags_list(
        self,
        ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")],
        filter_deleted: Annotated[Optional[StrictBool], Field(description="Filter by deleted status")],
    ) -> ConversionTagsList200Response:
        """List conversion tags associated with an ad account."""
        ...


    async def conversion_tags_create(
        self,
        ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")],
        conversion_tag_create: ConversionTagCreate,
    ) -> ConversionTag:
        """Create a conversion tag, also known as [Pinterest tag](https://help.pinterest.com/en/business/article/set-up-the-pinterest-tag), with the option to enable enhanced match.  The Pinterest Tag tracks actions people take on the ad account&#39;s website after they view the ad account&#39;s ad on Pinterest. The advertiser needs to customize this tag to track conversions.  For more information, see:  [Set up the Pinterest tag](https://help.pinterest.com/en/business/article/set-up-the-pinterest-tag)  [Pinterest Tag](/docs/track-conversions/pinterest-tag/)  [Enhanced match](/docs/track-conversions/pinterest-tag/#enhanced-match)"""
        ...


    async def ocpm_eligible_conversion_tags_get(
        self,
        ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")],
    ) -> Dict[str, List[ConversionEventResponse]]:
        """Get Ocpm eligible conversion tag events for an ad account."""
        ...


    async def page_visit_conversion_tags_get(
        self,
        ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")],
        page_size: Annotated[Optional[Annotated[int, Field(le=250, strict=True, ge=1)]], Field(description="Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.")],
        order: Annotated[Optional[StrictStr], Field(description="The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.")],
        bookmark: Annotated[Optional[StrictStr], Field(description="Cursor used to fetch the next page of items")],
    ) -> PageVisitConversionTagsGet200Response:
        """Get all page visit conversion tag events for an ad account."""
        ...


    async def conversion_tags_get(
        self,
        ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")],
        conversion_tag_id: Annotated[str, Field(strict=True, max_length=18, description="Id of the conversion tag.")],
    ) -> ConversionTag:
        """Get information about an existing conversion tag."""
        ...
