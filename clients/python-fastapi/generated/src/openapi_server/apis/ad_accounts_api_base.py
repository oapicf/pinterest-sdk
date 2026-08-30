# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401

from datetime import date
from pydantic import Field, StrictBool, StrictFloat, StrictInt, StrictStr, field_validator
from typing import List, Optional, Union
from typing_extensions import Annotated
from openapi_server.models.ad_account import AdAccount
from openapi_server.models.ad_account_analytics_items import AdAccountAnalyticsItems
from openapi_server.models.ad_account_create import AdAccountCreate
from openapi_server.models.ad_accounts_list200_response import AdAccountsList200Response
from openapi_server.models.ads_analytics_account_targeting_type import AdsAnalyticsAccountTargetingType
from openapi_server.models.ads_analytics_create_async_request import AdsAnalyticsCreateAsyncRequest
from openapi_server.models.ads_analytics_create_async_response import AdsAnalyticsCreateAsyncResponse
from openapi_server.models.ads_analytics_get_async_response import AdsAnalyticsGetAsyncResponse
from openapi_server.models.conversion_product_report import ConversionProductReport
from openapi_server.models.conversion_product_report_create import ConversionProductReportCreate
from openapi_server.models.conversion_report_attribution_type import ConversionReportAttributionType
from openapi_server.models.granularity import Granularity
from openapi_server.models.mmm_report import MMMReport
from openapi_server.models.mmm_report_create import MMMReportCreate
from openapi_server.models.metrics_response import MetricsResponse
from openapi_server.models.pinterest_lib_error import PinterestLibError
from openapi_server.models.pinterest_lib_pagination_order import PinterestLibPaginationOrder
from openapi_server.models.reporting_column_sync import ReportingColumnSync
from openapi_server.models.reporting_time_zone import ReportingTimeZone
from openapi_server.models.template_based_report import TemplateBasedReport
from openapi_server.models.templates_list200_response import TemplatesList200Response
from openapi_server.security_api import get_token_pinterest_oauth2, get_token_client_credentials

class BaseAdAccountsApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BaseAdAccountsApi.subclasses = BaseAdAccountsApi.subclasses + (cls,)
    async def ad_accounts_list(
        self,
        include_shared_accounts: Annotated[Optional[StrictBool], Field(description="Include shared ad accounts")],
        bookmark: Annotated[Optional[StrictStr], Field(description="Cursor used to fetch the next page of items")],
        page_size: Annotated[Optional[Annotated[int, Field(le=250, strict=True, ge=1)]], Field(description="Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.")],
    ) -> AdAccountsList200Response:
        """Get a list of the ad_accounts that the \&quot;operation user_account\&quot; has access to.         - This includes ad_accounts they own and ad_accounts that are owned by others who have granted them [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts)."""
        ...


    async def ad_accounts_create(
        self,
        ad_account_create: AdAccountCreate,
    ) -> AdAccount:
        """Create a new ad account. Different ad accounts can support different currencies, payment methods, etc. An ad account is needed to create campaigns, ad groups, and ads; other accounts (your employees or partners) can be assigned business access and appropriate roles to access an ad account.  You can set up up to 50 ad accounts per user. (The user must have a business account to create an ad account.) For more, see [Create an advertiser account](https://help.pinterest.com/en/business/article/create-an-advertiser-account)."""
        ...


    async def ad_accounts_get(
        self,
        ad_account_id: Annotated[str, Field(strict=True, max_length=18)],
    ) -> AdAccount:
        """Get an ad account"""
        ...


    async def ad_account_analytics(
        self,
        start_date: Annotated[date, Field(description="Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.")],
        end_date: Annotated[date, Field(description="Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.")],
        columns: Annotated[List[ReportingColumnSync], Field(description="Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.")],
        granularity: Annotated[Granularity, Field(description="  TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly")],
        ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")],
        click_window_days: Annotated[Optional[Union[StrictFloat, StrictInt]], Field(description="Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.")],
        engagement_window_days: Annotated[Optional[Union[StrictFloat, StrictInt]], Field(description="Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**.")],
        view_window_days: Annotated[Optional[Union[StrictFloat, StrictInt]], Field(description="Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.")],
        conversion_report_time: Annotated[Optional[StrictStr], Field(description="The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.")],
        reporting_timezone: Annotated[Optional[ReportingTimeZone], Field(description="Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users.")],
    ) -> List[AdAccountAnalyticsItems]:
        """  Get analytics for the specified &#x60;ad_account_id&#x60;, filtered by the specified options.    - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.    - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days.    - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time."""
        ...


    async def analytics_get_mmm_report(
        self,
        ad_account_id: Annotated[str, Field(strict=True, max_length=18)],
        token: Annotated[StrictStr, Field(description="Token returned from the post request creation call")],
    ) -> MMMReport:
        """    Get an mmm report for an ad account. This returns a URL to an     mmm metrics report given a token returned from the create mmm report endpoint."""
        ...


    async def analytics_create_mmm_report(
        self,
        ad_account_id: Annotated[str, Field(strict=True, max_length=18)],
        mmm_report_create: MMMReportCreate,
    ) -> MMMReport:
        """    This creates an asynchronous mmm report based on the given request.     It returns a token that you can use to download the report when it is     ready. NOTE: An additional limit of 5 queries per minute per advertiser     applies to this endpoint while it&#39;s in beta release.     For the ADVERTISER_PAID_SPEND_IN_DOLLAR,     ADVERTISER_PAID_ECPC_IN_DOLLAR, and ADVERTISER_PAID_ECPM_IN_DOLLAR     columns: if you receive bonus media, this value still includes that spend, and it will     need to be removed manually with support from your Pinterest account team for a     fully netted value. Over time, we&#39;ll also subtract bonus media and other incentives as     data becomes available. Production and other non-media fees are excluded."""
        ...


    async def analytics_get_report(
        self,
        ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")],
        token: Annotated[StrictStr, Field(description="Token returned from the post request creation call")],
    ) -> AdsAnalyticsGetAsyncResponse:
        """  This returns a URL to an analytics report given a token returned from the post request report creation call.   You can use the URL to download the report. The link is valid for five minutes and the report is valid for one hour.   - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager."""
        ...


    async def analytics_create_report(
        self,
        ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")],
        ads_analytics_create_async_request: AdsAnalyticsCreateAsyncRequest,
    ) -> AdsAnalyticsCreateAsyncResponse:
        """  This returns a token that you can use to download the report when it is ready.   Note that this endpoint requires the parameters to be passed as JSON-formatted in the request body. This endpoint does not support URL query parameters.   - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.   - If granularity is not HOUR, you can pull data from up to 914 days before the current date in UTC time, with a maximum time range of 186 days.   - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.   - If level is PRODUCT_ITEM, you can pull data from up to 92 days before the current date in UTC time, with a maximum time range of 31 days.   - If level is PRODUCT_ITEM, ad_ids and ad_statuses parameters are not allowed. Any columns related to pin promotion and ad is not allowed either."""
        ...


    async def analytics_get_conversion_product_report(
        self,
        ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")],
        token: Annotated[StrictStr, Field(description="Token returned from the post request creation call")],
    ) -> ConversionProductReport:
        """  [Restricted](/docs/getting-started/using-beta-and-restricted-features/)   Get a brand, category, SKU report for an ad account. This call returns the URL for the report that matches the token returned in the request to the Create brand, category, SKU report endpoint."""
        ...


    async def analytics_create_conversion_product_report(
        self,
        ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")],
        conversion_product_report_create: ConversionProductReportCreate,
    ) -> ConversionProductReport:
        """  [Restricted](/docs/getting-started/using-beta-and-restricted-features/)   This creates an asynchronous brand, category, SKU report based on the given request. This request returns a token that you can use to download the report when it is ready."""
        ...


    async def sandbox_delete(
        self,
        ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")],
    ) -> str:
        """Delete an ad account and all the ads data associated with that account. A string message is returned indicating the status of the delete operation.  Note: This endpoint is only allowed in the Pinterest API Sandbox (https://api-sandbox.pinterest.com/v5). Go to /docs/developer-tools/sandbox/ for more information."""
        ...


    async def ad_account_targeting_analytics_get(
        self,
        ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")],
        start_date: Annotated[date, Field(description="Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.")],
        end_date: Annotated[date, Field(description="Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.")],
        targeting_types: Annotated[List[AdsAnalyticsAccountTargetingType], Field(min_length=1, max_length=15, description="Targeting type breakdowns for the report. The reporting per targeting type is independent from each other. [\"AGE_BUCKET_AND_GENDER\"] is in BETA and not yet available to all users.")],
        columns: Annotated[List[ReportingColumnSync], Field(description="Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.")],
        granularity: Annotated[Granularity, Field(description="  TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly")],
        click_window_days: Annotated[Optional[Union[StrictFloat, StrictInt]], Field(description="Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.")],
        engagement_window_days: Annotated[Optional[Union[StrictFloat, StrictInt]], Field(description="Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**.")],
        view_window_days: Annotated[Optional[Union[StrictFloat, StrictInt]], Field(description="Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.")],
        conversion_report_time: Annotated[Optional[StrictStr], Field(description="The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.")],
        attribution_types: Annotated[Optional[Annotated[List[ConversionReportAttributionType], Field(max_length=2)]], Field(description="List of types of attribution for the conversion report")],
        reporting_timezone: Annotated[Optional[ReportingTimeZone], Field(description="Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users.")],
    ) -> MetricsResponse:
        """Get targeting analytics for an ad account. For the requested account and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \&quot;age_bucket\&quot;) for applicable values (e.g. \&quot;45-49\&quot;). &lt;p/&gt;  * The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. * If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. * If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days."""
        ...


    async def templates_list(
        self,
        ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")],
        bookmark: Annotated[Optional[StrictStr], Field(description="Cursor used to fetch the next page of items")],
        page_size: Annotated[Optional[Annotated[int, Field(le=250, strict=True, ge=1)]], Field(description="Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.")],
        order: Annotated[Optional[PinterestLibPaginationOrder], Field(description="The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.")],
    ) -> TemplatesList200Response:
        """Gets all Templates associated with an ad account ID."""
        ...


    async def analytics_create_template_report(
        self,
        ad_account_id: Annotated[str, Field(strict=True, max_length=18)],
        template_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of a template.")],
        start_date: Annotated[Optional[date], Field(description="Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 2.5 years back from today.")],
        end_date: Annotated[Optional[date], Field(description="Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 2.5 years past start date.")],
        granularity: Annotated[Optional[Granularity], Field(description="  TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly")],
    ) -> TemplateBasedReport:
        """  This takes a template ID and an optional custom timeframe and   constructs an asynchronous report based on the template. It returns   a token that you can use to download the report when it is ready."""
        ...
