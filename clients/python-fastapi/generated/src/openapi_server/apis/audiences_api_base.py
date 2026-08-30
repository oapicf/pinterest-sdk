# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401

from pydantic import Field, StrictBool, StrictStr, field_validator
from typing import Optional
from typing_extensions import Annotated
from openapi_server.models.ad_accounts_audience import AdAccountsAudience
from openapi_server.models.ad_accounts_audience_create import AdAccountsAudienceCreate
from openapi_server.models.ad_accounts_audience_update import AdAccountsAudienceUpdate
from openapi_server.models.audience_ownership_type import AudienceOwnershipType
from openapi_server.models.audiences_list200_response import AudiencesList200Response
from openapi_server.models.pinterest_lib_error import PinterestLibError
from openapi_server.models.pinterest_lib_pagination_order import PinterestLibPaginationOrder
from openapi_server.security_api import get_token_pinterest_oauth2, get_token_client_credentials

class BaseAudiencesApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BaseAudiencesApi.subclasses = BaseAudiencesApi.subclasses + (cls,)
    async def audiences_list(
        self,
        ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")],
        bookmark: Annotated[Optional[StrictStr], Field(description="Cursor used to fetch the next page of items")],
        page_size: Annotated[Optional[Annotated[int, Field(le=250, strict=True, ge=1)]], Field(description="Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.")],
        order: Annotated[Optional[PinterestLibPaginationOrder], Field(description="The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.")],
        ownership_type: Optional[AudienceOwnershipType],
        exclude_nca: Annotated[Optional[StrictBool], Field(description="When true, excludes audiences derived from new customer acquisition (expanded matching) customer lists from the result. Defaults to false (include all).")],
    ) -> AudiencesList200Response:
        """Get list of audiences for the ad account."""
        ...


    async def audiences_create(
        self,
        ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")],
        ad_accounts_audience_create: AdAccountsAudienceCreate,
    ) -> AdAccountsAudience:
        """Create a new audience for the ad account."""
        ...


    async def audiences_get(
        self,
        audience_id: Annotated[str, Field(strict=True, description="Audience ID.")],
        ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")],
    ) -> AdAccountsAudience:
        """Get a specific audience given the audience ID."""
        ...


    async def audiences_update(
        self,
        audience_id: Annotated[str, Field(strict=True, description="Audience ID.")],
        ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")],
        ad_accounts_audience_update: AdAccountsAudienceUpdate,
    ) -> AdAccountsAudience:
        """Update an existing audience for the ad account."""
        ...
