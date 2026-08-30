# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401

from pydantic import Field, StrictStr, field_validator
from typing import Any, Dict, List, Optional
from typing_extensions import Annotated
from openapi_server.models.ad_account_countries_get200_response import AdAccountCountriesGet200Response
from openapi_server.models.book_closed import BookClosed
from openapi_server.models.delivery_metrics_get200_response import DeliveryMetricsGet200Response
from openapi_server.models.pinterest_lib_error import PinterestLibError
from openapi_server.models.public_targeting_type import PublicTargetingType
from openapi_server.models.report_type import ReportType
from openapi_server.models.single_interest_targeting_option import SingleInterestTargetingOption
from openapi_server.security_api import get_token_pinterest_oauth2, get_token_client_credentials

class BaseResourcesApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BaseResourcesApi.subclasses = BaseResourcesApi.subclasses + (cls,)
    async def ad_account_countries_get(
        self,
    ) -> AdAccountCountriesGet200Response:
        """Get Ad Accounts countries"""
        ...


    async def delivery_metrics_get(
        self,
        report_type: Annotated[Optional[ReportType], Field(description="Report type.")],
    ) -> DeliveryMetricsGet200Response:
        """Get the definitions for ads and organic metrics available across both synchronous and asynchronous report endpoints. The &#x60;display_name&#x60; attribute will match how the metric is named in our native tools like Ads Manager. See [Organic Analytics](/docs/api-features/analytics-overview/) and [Ads Analytics](/docs/api-features/ads-reporting/) for more information."""
        ...


    async def lead_form_questions_get(
        self,
    ) -> None:
        """Get a list of all lead form question type names. Some questions might not be used.  **This endpoint is currently in beta and not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**"""
        ...


    async def metrics_ready_state_get(
        self,
        var_date: Annotated[str, Field(strict=True, description="Analytics reports request date (UTC). Format: YYYY-MM-DD")],
    ) -> BookClosed:
        """Learn whether conversion or non-conversion metrics are finalized and ready to query."""
        ...


    async def interest_targeting_options_get(
        self,
        interest_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an interest.")],
    ) -> SingleInterestTargetingOption:
        """Get details of a specific interest given interest ID.  Click [here](https://docs.google.com/spreadsheets/d/1HxL-0Z3p2fgxis9YBP2HWC3tvPrs1hAuHDRtH-NJTIM/edit#gid&#x3D;118370875) for a spreadsheet listing interests and their IDs."""
        ...


    async def targeting_options_get(
        self,
        targeting_type: Annotated[PublicTargetingType, Field(description="Public targeting type")],
        ad_account_id: Annotated[Optional[Annotated[str, Field(strict=True, max_length=18)]], Field(description="Unique identifier of an ad account.")],
        client_id: Annotated[Optional[Annotated[str, Field(strict=True, max_length=18)]], Field(description="Client ID")],
        oauth_signature: Annotated[Optional[StrictStr], Field(description="Oauth signature")],
        timestamp: Annotated[Optional[Annotated[str, Field(strict=True)]], Field(description="Timestamp.")],
    ) -> List[object]:
        """    You can use targeting values in ads placement to define your intended audience.      Targeting metrics are organized around targeting specifications.      For more information on ads targeting, see [Audience targeting](https://help.pinterest.com/en/business/article/audience-targeting).      **Sample return:**      &#x60;&#x60;&#x60;     [{\&quot;36313\&quot;: \&quot;Australia: Moreton Bay - North\&quot;, \&quot;124735\&quot;: \&quot;Canada: North Battleford\&quot;, \&quot;36109\&quot;: \&quot;Australia: Murray\&quot;, \&quot;36108\&quot;: \&quot;Australia: Mid North Coast\&quot;, \&quot;36101\&quot;: \&quot;Australia: Capital Region\&quot;, \&quot;811\&quot;: \&quot;U.S.: Reno\&quot;, \&quot;36103\&quot;: \&quot;Australia: Central West\&quot;, \&quot;36102\&quot;: \&quot;Australia: Central Coast\&quot;, \&quot;36105\&quot;: \&quot;Australia: Far West and Orana\&quot;, \&quot;36104\&quot;: \&quot;Australia: Coffs Harbour - Grafton\&quot;, \&quot;36107\&quot;: \&quot;Australia: Illawarra\&quot;, \&quot;36106\&quot;: \&quot;Australia: Hunter Valley Exc Newcastle\&quot;, \&quot;554017\&quot;: \&quot;New Zealand: Wanganui\&quot;, \&quot;554016\&quot;: \&quot;New Zealand: Marlborough\&quot;, \&quot;554015\&quot;: \&quot;New Zealand: Gisborne\&quot;, \&quot;554014\&quot;: \&quot;New Zealand: Tararua\&quot;, \&quot;554013\&quot;: \&quot;New Zealand: Invercargill\&quot;, \&quot;GR\&quot;: \&quot;Greece\&quot;, \&quot;554011\&quot;: \&quot;New Zealand: Whangarei\&quot;, \&quot;554010\&quot;: \&quot;New Zealand: Far North\&quot;, \&quot;717\&quot;: \&quot;U.S.: Quincy-Hannibal-Keokuk\&quot;, \&quot;716\&quot;: \&quot;U.S.: Baton Rouge\&quot;,...}]     &#x60;&#x60;&#x60;"""
        ...
