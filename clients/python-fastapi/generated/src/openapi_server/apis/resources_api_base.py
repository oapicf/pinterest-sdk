# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401

from pydantic import Field, StrictStr, field_validator
from typing import Any, Dict, List, Optional
from typing_extensions import Annotated
from openapi_server.models.ad_accounts_country_response import AdAccountsCountryResponse
from openapi_server.models.book_closed_response import BookClosedResponse
from openapi_server.models.delivery_metrics_response import DeliveryMetricsResponse
from openapi_server.models.error import Error
from openapi_server.models.single_interest_targeting_option_response import SingleInterestTargetingOptionResponse
from openapi_server.security_api import get_token_pinterest_oauth2, get_token_client_credentials

class BaseResourcesApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BaseResourcesApi.subclasses = BaseResourcesApi.subclasses + (cls,)
    async def ad_account_countries_get(
        self,
    ) -> AdAccountsCountryResponse:
        """Get Ad Accounts countries"""
        ...


    async def delivery_metrics_get(
        self,
        report_type: Annotated[Optional[StrictStr], Field(description="Report type.")],
    ) -> DeliveryMetricsResponse:
        """Get the definitions for ads and organic metrics available across both synchronous and asynchronous report endpoints. The &#x60;display_name&#x60; attribute will match how the metric is named in our native tools like Ads Manager. See &lt;a href&#x3D;&#39;/docs/api-features/analytics-overview/&#39;&gt;Organic Analytics&lt;/a&gt; and &lt;a href&#x3D;&#39;/docs/api-features/ads-reporting/&#39;&gt;Ads Analytics&lt;/a&gt; for more information."""
        ...


    async def lead_form_questions_get(
        self,
    ) -> None:
        """Get a list of all lead form question type names. Some questions might not be used.  &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/getting-started/using-beta-and-restricted-features/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;"""
        ...


    async def metrics_ready_state_get(
        self,
        var_date: Annotated[str, Field(strict=True, description="Analytics reports request date (UTC). Format: YYYY-MM-DD")],
    ) -> BookClosedResponse:
        """Learn whether conversion or non-conversion metrics are finalized and ready to query."""
        ...


    async def interest_targeting_options_get(
        self,
        interest_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an interest.")],
    ) -> SingleInterestTargetingOptionResponse:
        """&lt;p&gt;Get details of a specific interest given interest ID.&lt;/p&gt; &lt;p&gt;Click &lt;a href&#x3D;\&quot;https://docs.google.com/spreadsheets/d/1HxL-0Z3p2fgxis9YBP2HWC3tvPrs1hAuHDRtH-NJTIM/edit#gid&#x3D;118370875\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt; for a spreadsheet listing interests and their IDs.&lt;/p&gt;"""
        ...


    async def targeting_options_get(
        self,
        targeting_type: Annotated[StrictStr, Field(description="Public targeting type.")],
        client_id: Annotated[Optional[Annotated[str, Field(strict=True, max_length=18)]], Field(description="Client ID.")],
        oauth_signature: Annotated[Optional[StrictStr], Field(description="Oauth signature")],
        timestamp: Annotated[Optional[Annotated[str, Field(strict=True)]], Field(description="Timestamp")],
        ad_account_id: Annotated[Optional[Annotated[str, Field(strict=True, max_length=18)]], Field(description="Unique identifier of an ad account.")],
    ) -> List[object]:
        """&lt;p&gt;You can use targeting values in ads placement to define your intended audience. &lt;/p&gt; &lt;p&gt;Targeting metrics are organized around targeting specifications.&lt;/p&gt; &lt;p&gt;For more information on ads targeting, see &lt;a class&#x3D;\&quot;reference external\&quot; href&#x3D;\&quot;https://help.pinterest.com/en/business/article/audience-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Audience targeting&lt;/a&gt;.&lt;/p&gt; &lt;p&gt;&lt;b&gt;Sample return:&lt;/b&gt;&lt;/p&gt; &lt;pre class&#x3D;\&quot;literal-block\&quot;&gt; [{&amp;quot;36313&amp;quot;: &amp;quot;Australia: Moreton Bay - North&amp;quot;, &amp;quot;124735&amp;quot;: &amp;quot;Canada: North Battleford&amp;quot;, &amp;quot;36109&amp;quot;: &amp;quot;Australia: Murray&amp;quot;, &amp;quot;36108&amp;quot;: &amp;quot;Australia: Mid North Coast&amp;quot;, &amp;quot;36101&amp;quot;: &amp;quot;Australia: Capital Region&amp;quot;, &amp;quot;811&amp;quot;: &amp;quot;U.S.: Reno&amp;quot;, &amp;quot;36103&amp;quot;: &amp;quot;Australia: Central West&amp;quot;, &amp;quot;36102&amp;quot;: &amp;quot;Australia: Central Coast&amp;quot;, &amp;quot;36105&amp;quot;: &amp;quot;Australia: Far West and Orana&amp;quot;, &amp;quot;36104&amp;quot;: &amp;quot;Australia: Coffs Harbour - Grafton&amp;quot;, &amp;quot;36107&amp;quot;: &amp;quot;Australia: Illawarra&amp;quot;, &amp;quot;36106&amp;quot;: &amp;quot;Australia: Hunter Valley Exc Newcastle&amp;quot;, &amp;quot;554017&amp;quot;: &amp;quot;New Zealand: Wanganui&amp;quot;, &amp;quot;554016&amp;quot;: &amp;quot;New Zealand: Marlborough&amp;quot;, &amp;quot;554015&amp;quot;: &amp;quot;New Zealand: Gisborne&amp;quot;, &amp;quot;554014&amp;quot;: &amp;quot;New Zealand: Tararua&amp;quot;, &amp;quot;554013&amp;quot;: &amp;quot;New Zealand: Invercargill&amp;quot;, &amp;quot;GR&amp;quot;: &amp;quot;Greece&amp;quot;, &amp;quot;554011&amp;quot;: &amp;quot;New Zealand: Whangarei&amp;quot;, &amp;quot;554010&amp;quot;: &amp;quot;New Zealand: Far North&amp;quot;, &amp;quot;717&amp;quot;: &amp;quot;U.S.: Quincy-Hannibal-Keokuk&amp;quot;, &amp;quot;716&amp;quot;: &amp;quot;U.S.: Baton Rouge&amp;quot;,...}] &lt;/pre&gt;"""
        ...
