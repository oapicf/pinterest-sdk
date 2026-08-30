# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401

from pydantic import Field, StrictStr, field_validator
from typing import Any, Optional
from typing_extensions import Annotated
from openapi_server.models.ad_accounts_subscriptions_get_list200_response import AdAccountsSubscriptionsGetList200Response
from openapi_server.models.lead_subscription import LeadSubscription
from openapi_server.models.lead_subscription_post_params_create import LeadSubscriptionPostParamsCreate
from openapi_server.models.pinterest_lib_error import PinterestLibError
from openapi_server.security_api import get_token_pinterest_oauth2, get_token_client_credentials

class BaseLeadAdsApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BaseLeadAdsApi.subclasses = BaseLeadAdsApi.subclasses + (cls,)
    async def ad_accounts_subscriptions_get_list(
        self,
        ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")],
        bookmark: Annotated[Optional[StrictStr], Field(description="Cursor used to fetch the next page of items")],
        page_size: Annotated[Optional[Annotated[int, Field(le=250, strict=True, ge=1)]], Field(description="Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.")],
    ) -> AdAccountsSubscriptionsGetList200Response:
        """Get the advertiser&#39;s list of lead ads subscriptions. Only requests for the OWNER or ADMIN of the ad_account will be allowed."""
        ...


    async def ad_accounts_subscriptions_post(
        self,
        ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")],
        lead_subscription_post_params_create: LeadSubscriptionPostParamsCreate,
    ) -> LeadSubscription:
        """Create a lead ads webhook subscription. Subscriptions allow Pinterest to deliver lead data from Ads Manager directly to the subscriber. Subscriptions can exist for a specific lead form or at ad account level.   - Only requests for the OWNER or ADMIN of the ad_account will be allowed.   - Advertisers can set up multiple integrations using ad_account_id + lead_form_id but only one integration per unique records.   - For data security, egress lead data is encrypted with AES-256-GCM."""
        ...


    async def ad_accounts_subscriptions_get_by_id(
        self,
        ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")],
        subscription_id: Annotated[str, Field(strict=True, description="Unique identifier of a subscription.")],
    ) -> LeadSubscription:
        """Get an existing lead ads webhook subscription by ID.   - Only requests for the OWNER or ADMIN of the ad_account will be allowed.&#39;"""
        ...


    async def ad_accounts_subscriptions_del_by_id(
        self,
        ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")],
        subscription_id: Annotated[str, Field(strict=True, description="Unique identifier of a subscription.")],
    ) -> LeadSubscription:
        """Delete an existing lead ads webhook subscription by ID.   - Only requests for the OWNER or ADMIN of the ad_account will be allowed.&#39;"""
        ...
