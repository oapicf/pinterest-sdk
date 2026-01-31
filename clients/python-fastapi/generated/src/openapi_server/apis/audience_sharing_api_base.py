# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401

from pydantic import Field, StrictStr, field_validator
from typing import Optional
from typing_extensions import Annotated
from openapi_server.models.ad_accounts_audiences_shared_accounts_list200_response import AdAccountsAudiencesSharedAccountsList200Response
from openapi_server.models.audience_account_type import AudienceAccountType
from openapi_server.models.audiences_list200_response import AudiencesList200Response
from openapi_server.models.business_shared_audience import BusinessSharedAudience
from openapi_server.models.business_shared_audience_response import BusinessSharedAudienceResponse
from openapi_server.models.error import Error
from openapi_server.models.shared_audience import SharedAudience
from openapi_server.models.shared_audience_response import SharedAudienceResponse
from openapi_server.security_api import get_token_pinterest_oauth2, get_token_client_credentials

class BaseAudienceSharingApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BaseAudienceSharingApi.subclasses = BaseAudienceSharingApi.subclasses + (cls,)
    async def ad_accounts_audiences_shared_accounts_list(
        self,
        ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")],
        audience_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of the audience to use to filter the results.")],
        account_type: Annotated[AudienceAccountType, Field(description="Filter accounts by account type.")],
        page_size: Annotated[Optional[Annotated[int, Field(le=250, strict=True, ge=1)]], Field(description="Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.")],
        bookmark: Annotated[Optional[StrictStr], Field(description="Cursor used to fetch the next page of items")],
    ) -> AdAccountsAudiencesSharedAccountsList200Response:
        """List all ad accounts and/or businesses that have access to a specific audience. The audience must be owned by the requesting ad account."""
        ...


    async def update_ad_account_to_ad_account_shared_audience(
        self,
        ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")],
        shared_audience: SharedAudience,
    ) -> SharedAudienceResponse:
        """From an ad account, share a specific audience with another ad account, or revoke access to a previously shared audience. Only the audience owner account can share the audience. The recipient ad account(s) must be in the same &lt;a href&#x3D;&#39;https://help.pinterest.com/en/business/article/create-and-manage-accounts&#39;&gt;Pinterest Business Hierarchy&lt;/a&gt; as the business owner of the ad account.&lt;br&gt; This endpoint is not available to all apps.&lt;a href&#x3D;&#39;/docs/getting-started/using-beta-and-restricted-features/&#39;&gt;Learn more&lt;/a&gt;."""
        ...


    async def update_ad_account_to_business_shared_audience(
        self,
        ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")],
        business_shared_audience: BusinessSharedAudience,
    ) -> BusinessSharedAudienceResponse:
        """From an ad account, share a specific audience with a business account, or revoke access to a previously shared audience. Only the audience owner account can share the audience. The recipient business account must be in the same business hierarchy as the business owner of the ad account.&lt;br&gt; This endpoint is not available to all apps.&lt;a href&#x3D;&#39;/docs/getting-started/using-beta-and-restricted-features/&#39;&gt;Learn more&lt;/a&gt;."""
        ...


    async def shared_audiences_for_business_list(
        self,
        business_id: Annotated[str, Field(min_length=1, strict=True, max_length=20, description="Unique identifier of the requesting business.")],
        bookmark: Annotated[Optional[StrictStr], Field(description="Cursor used to fetch the next page of items")],
        order: Annotated[Optional[StrictStr], Field(description="The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.")],
        page_size: Annotated[Optional[Annotated[int, Field(le=250, strict=True, ge=1)]], Field(description="Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.")],
    ) -> AudiencesList200Response:
        """Get a list of received audiences for the given business."""
        ...


    async def business_account_audiences_shared_accounts_list(
        self,
        business_id: Annotated[str, Field(min_length=1, strict=True, max_length=20, description="Unique identifier of the requesting business.")],
        audience_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of the audience to use to filter the results.")],
        account_type: Annotated[AudienceAccountType, Field(description="Filter accounts by account type.")],
        page_size: Annotated[Optional[Annotated[int, Field(le=250, strict=True, ge=1)]], Field(description="Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.")],
        bookmark: Annotated[Optional[StrictStr], Field(description="Cursor used to fetch the next page of items")],
    ) -> AdAccountsAudiencesSharedAccountsList200Response:
        """List all ad accounts and/or businesses that have access to a specific audience. The audience must either be owned by an ad account in the requesting business, or it must have been shared with the requesting business. If the requesting business is not the owner of the audience, only ad accounts owned by the requesting business will be returned."""
        ...


    async def update_business_to_ad_account_shared_audience(
        self,
        business_id: Annotated[str, Field(min_length=1, strict=True, max_length=20, description="Unique identifier of the requesting business.")],
        shared_audience: SharedAudience,
    ) -> SharedAudienceResponse:
        """From a business, share a specific audience with other ad account(s), or revoke access to a previously shared audience. &lt;ul&gt; &lt;li&gt;If the business is the owner of the audience, it can share with any ad account within the same business hierarchy.&lt;/li&gt; &lt;li&gt;If the business is the recipient of the audience, it can share with any of its owned ad accounts.&lt;/li&gt; &lt;/ul&gt; This endpoint is not available to all apps.&lt;a href&#x3D;&#39;/docs/getting-started/using-beta-and-restricted-features/&#39;&gt;Learn more&lt;/a&gt;."""
        ...


    async def update_business_to_business_shared_audience(
        self,
        business_id: Annotated[str, Field(min_length=1, strict=True, max_length=20, description="Unique identifier of the requesting business.")],
        business_shared_audience: BusinessSharedAudience,
    ) -> BusinessSharedAudienceResponse:
        """From a business, share a specific audience with another business account, or revoke access to a previously shared audience. Only the audience owner can share the audience with other businesses, and the recipient business must be within the same business hierarchy.&lt;br&gt; This endpoint is not available to all apps.&lt;a href&#x3D;&#39;/docs/getting-started/using-beta-and-restricted-features/&#39;&gt;Learn more&lt;/a&gt;."""
        ...
