# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401

from pydantic import Field, StrictStr, field_validator
from typing import Optional
from typing_extensions import Annotated
from openapi_server.models.ad_account_to_ad_account_shared_audience import AdAccountToAdAccountSharedAudience
from openapi_server.models.ad_account_to_ad_account_shared_audience_update_with_required_body import AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody
from openapi_server.models.ad_account_to_business_shared_audience import AdAccountToBusinessSharedAudience
from openapi_server.models.ad_account_to_business_shared_audience_update_with_required_body import AdAccountToBusinessSharedAudienceUpdateWithRequiredBody
from openapi_server.models.ad_accounts_audiences_shared_accounts_list200_response import AdAccountsAudiencesSharedAccountsList200Response
from openapi_server.models.audience_account_type import AudienceAccountType
from openapi_server.models.business_to_ad_account_shared_audience import BusinessToAdAccountSharedAudience
from openapi_server.models.business_to_ad_account_shared_audience_update_with_required_body import BusinessToAdAccountSharedAudienceUpdateWithRequiredBody
from openapi_server.models.business_to_business_shared_audience import BusinessToBusinessSharedAudience
from openapi_server.models.business_to_business_shared_audience_update_with_required_body import BusinessToBusinessSharedAudienceUpdateWithRequiredBody
from openapi_server.models.order import Order
from openapi_server.models.pinterest_lib_error import PinterestLibError
from openapi_server.models.shared_audiences_for_business_list200_response import SharedAudiencesForBusinessList200Response
from openapi_server.security_api import get_token_pinterest_oauth2, get_token_client_credentials

class BaseAudienceSharingApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BaseAudienceSharingApi.subclasses = BaseAudienceSharingApi.subclasses + (cls,)
    async def update_ad_account_to_ad_account_shared_audience(
        self,
        ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")],
        ad_account_to_ad_account_shared_audience_update_with_required_body: AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody,
    ) -> AdAccountToAdAccountSharedAudience:
        """From an ad account, share a specific audience with another ad account, or revoke access to a previously shared audience. Only the audience owner account can share the audience. The recipient ad account(s) must be in the same [Pinterest Business Hierarchy](https://help.pinterest.com/en/business/article/create-and-manage-accounts) as the business owner of the ad account.  This endpoint is not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/)."""
        ...


    async def update_ad_account_to_business_shared_audience(
        self,
        ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")],
        ad_account_to_business_shared_audience_update_with_required_body: AdAccountToBusinessSharedAudienceUpdateWithRequiredBody,
    ) -> AdAccountToBusinessSharedAudience:
        """From an ad account, share a specific audience with a business account, or revoke access to a previously shared audience. Only the audience owner account can share the audience. The recipient business account must be in the same business hierarchy as the business owner of the ad account.  This endpoint is not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/)."""
        ...


    async def ad_accounts_audiences_shared_accounts_list(
        self,
        audience_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of the audience to use to filter the results.")],
        account_type: Annotated[AudienceAccountType, Field(description="Filter accounts by account type.")],
        ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")],
        bookmark: Annotated[Optional[StrictStr], Field(description="Cursor used to fetch the next page of items")],
        page_size: Annotated[Optional[Annotated[int, Field(le=250, strict=True, ge=1)]], Field(description="Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.")],
    ) -> AdAccountsAudiencesSharedAccountsList200Response:
        """List all ad accounts and/or businesses that have access to a specific audience. The audience must be owned by the requesting ad account."""
        ...


    async def shared_audiences_for_business_list(
        self,
        business_id: Annotated[str, Field(min_length=1, strict=True, max_length=20, description="Unique identifier of the requesting business.")],
        order: Annotated[Optional[Order], Field(description="The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.")],
        bookmark: Annotated[Optional[StrictStr], Field(description="Cursor used to fetch the next page of items")],
        page_size: Annotated[Optional[Annotated[int, Field(le=250, strict=True, ge=1)]], Field(description="Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.")],
    ) -> SharedAudiencesForBusinessList200Response:
        """Get a list of received audiences for the given business."""
        ...


    async def update_business_to_ad_account_shared_audience(
        self,
        business_id: Annotated[str, Field(min_length=1, strict=True, max_length=20, description="Unique identifier of the requesting business.")],
        business_to_ad_account_shared_audience_update_with_required_body: BusinessToAdAccountSharedAudienceUpdateWithRequiredBody,
    ) -> BusinessToAdAccountSharedAudience:
        """From a business, share a specific audience with other ad account(s), or revoke access to a previously shared audience.  - If the business is the owner of the audience, it can share with any ad account within the same business hierarchy. - If the business is the recipient of the audience, it can share with any of its owned ad accounts.  This endpoint is not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/)."""
        ...


    async def update_business_to_business_shared_audience(
        self,
        business_id: Annotated[str, Field(min_length=1, strict=True, max_length=20, description="Unique identifier of the requesting business.")],
        business_to_business_shared_audience_update_with_required_body: BusinessToBusinessSharedAudienceUpdateWithRequiredBody,
    ) -> BusinessToBusinessSharedAudience:
        """From a business, share a specific audience with another business account, or revoke access to a previously shared audience. Only the audience owner can share the audience with other businesses, and the recipient business must be within the same business hierarchy.  This endpoint is not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/)."""
        ...


    async def business_account_audiences_shared_accounts_list(
        self,
        business_id: Annotated[str, Field(min_length=1, strict=True, max_length=20, description="Unique identifier of the requesting business.")],
        audience_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of the audience to use to filter the results.")],
        account_type: Annotated[AudienceAccountType, Field(description="Filter accounts by account type.")],
        bookmark: Annotated[Optional[StrictStr], Field(description="Cursor used to fetch the next page of items")],
        page_size: Annotated[Optional[Annotated[int, Field(le=250, strict=True, ge=1)]], Field(description="Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.")],
    ) -> AdAccountsAudiencesSharedAccountsList200Response:
        """List all ad accounts and/or businesses that have access to a specific audience. The audience must either be owned by an ad account in the requesting business, or it must have been shared with the requesting business. If the requesting business is not the owner of the audience, only ad accounts owned by the requesting business will be returned."""
        ...
