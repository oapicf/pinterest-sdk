# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401

from datetime import date
from pydantic import Field, StrictBool, StrictFloat, StrictInt, StrictStr, field_validator
from typing import List, Optional, Union
from typing_extensions import Annotated
from openapi_server.models.ad_group import AdGroup
from openapi_server.models.ad_group_audience_sizing import AdGroupAudienceSizing
from openapi_server.models.ad_group_audience_sizing_create import AdGroupAudienceSizingCreate
from openapi_server.models.ad_group_create_create import AdGroupCreateCreate
from openapi_server.models.ad_group_update_batch_update import AdGroupUpdateBatchUpdate
from openapi_server.models.ad_groups_analytics_metrics import AdGroupsAnalyticsMetrics
from openapi_server.models.ad_groups_create200_response import AdGroupsCreate200Response
from openapi_server.models.ad_groups_list200_response import AdGroupsList200Response
from openapi_server.models.ads_analytics_ad_group_targeting_type import AdsAnalyticsAdGroupTargetingType
from openapi_server.models.bid_floor import BidFloor
from openapi_server.models.bid_floor_create import BidFloorCreate
from openapi_server.models.conversion_report_attribution_type import ConversionReportAttributionType
from openapi_server.models.dynamic_titles_download_csv import DynamicTitlesDownloadCSV
from openapi_server.models.dynamic_titles_get_status import DynamicTitlesGetStatus
from openapi_server.models.dynamic_titles_process_csv import DynamicTitlesProcessCSV
from openapi_server.models.dynamic_titles_process_csv_create import DynamicTitlesProcessCSVCreate
from openapi_server.models.dynamic_titles_upload_url import DynamicTitlesUploadURL
from openapi_server.models.entity_status import EntityStatus
from openapi_server.models.granularity import Granularity
from openapi_server.models.metrics_response import MetricsResponse
from openapi_server.models.pinterest_lib_error import PinterestLibError
from openapi_server.models.pinterest_lib_pagination_order import PinterestLibPaginationOrder
from openapi_server.models.reporting_column_sync import ReportingColumnSync
from openapi_server.models.reporting_time_zone import ReportingTimeZone
from openapi_server.security_api import get_token_pinterest_oauth2, get_token_client_credentials

class BaseAdGroupsApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BaseAdGroupsApi.subclasses = BaseAdGroupsApi.subclasses + (cls,)
    async def ad_groups_list(
        self,
        ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")],
        bookmark: Annotated[Optional[StrictStr], Field(description="Cursor used to fetch the next page of items")],
        page_size: Annotated[Optional[Annotated[int, Field(le=250, strict=True, ge=1)]], Field(description="Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.")],
        order: Annotated[Optional[PinterestLibPaginationOrder], Field(description="The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.")],
        campaign_ids: Annotated[Optional[Annotated[List[Annotated[str, Field(strict=True, max_length=18)]], Field(min_length=1, max_length=250)]], Field(description="List of Campaign Ids to use to filter the results.")],
        ad_group_ids: Annotated[Optional[Annotated[List[Annotated[str, Field(strict=True)]], Field(min_length=1, max_length=250)]], Field(description="List of Ad group Ids to retrieve keywords from. This feature is currently in BETA and is not available to all users.")],
        entity_statuses: Annotated[Optional[List[EntityStatus]], Field(description="Entity status")],
        translate_interests_to_names: Annotated[Optional[StrictBool], Field(description="Return interests as text names (if value is true) rather than topic IDs.")],
    ) -> AdGroupsList200Response:
        """List ad groups based on provided campaign IDs or ad group IDs.(campaign_ids or ad_group_ids). **Note:** Provide only campaign_id or ad_group_id. Do not provide both."""
        ...


    async def ad_groups_create(
        self,
        ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")],
        ad_group_create_create: Annotated[List[AdGroupCreateCreate], Field(min_length=1, max_length=30)],
    ) -> AdGroupsCreate200Response:
        """Create multiple new ad groups. All ads in a given ad group will have the same budget, bid, run dates, targeting, and placement (search, browse, other).  For more information, [click here](https://help.pinterest.com/en/business/article/campaign-structure).  **Notes:** - &#x60;bid_in_micro_currency&#x60; and &#x60;budget_in_micro_currency&#x60; should be expressed in microcurrency amounts based on the currency field set in the advertiser&#39;s profile.  Microcurrency is used to track very small transactions, based on the currency set in the advertiser&#39;s profile. A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser&#39;s profile.  **Equivalency equations**, using dollars as an example currency: - $1 &#x3D; 1,000,000 microdollars - 1 microdollar &#x3D; $0.000001  **To convert between currency and microcurrency**, using dollars as an example currency: - To convert dollars to microdollars, multiply dollars by 1,000,000 - To convert microdollars to dollars, divide microdollars by 1,000,000  - Ad groups belong to ad campaigns. Some types of campaigns (e.g. budget optimization) have limits on the number of ad groups they can hold. If you exceed those limits, you will get an error message. - Certain organizations with [closed beta](/docs/getting-started/using-beta-and-restricted-features/) access can set &#x60;start_time&#x60; and &#x60;end_time&#x60; at the ad group level for campaigns with Campaign Budget Optimization (CBO) objectives: &#x60;TRAFFIC&#x60;, &#x60;AWARENESS&#x60;, &#x60;WEB_CONVERSIONS&#x60;, and &#x60;CATALOG_SALES&#x60;. All other organizations can set these scheduling parameters for non-CBO campaigns only. - If the parent ad campaign has start and end times set, ad group start and end times must occur within the parent campaign schedule."""
        ...


    async def ad_groups_update(
        self,
        ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")],
        ad_group_update_batch_update: Annotated[List[AdGroupUpdateBatchUpdate], Field(min_length=1, max_length=30)],
    ) -> AdGroupsCreate200Response:
        """Update multiple existing ad groups."""
        ...


    async def ad_groups_analytics(
        self,
        start_date: Annotated[date, Field(description="Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.")],
        end_date: Annotated[date, Field(description="Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.")],
        ad_group_ids: Annotated[List[Annotated[str, Field(strict=True, max_length=18)]], Field(min_length=1, max_length=250, description="List of Ad group Ids to use to filter the results.")],
        columns: Annotated[List[ReportingColumnSync], Field(description="Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.")],
        granularity: Annotated[Granularity, Field(description="  TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly")],
        ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")],
        click_window_days: Annotated[Optional[Union[StrictFloat, StrictInt]], Field(description="Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.")],
        engagement_window_days: Annotated[Optional[Union[StrictFloat, StrictInt]], Field(description="Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**.")],
        view_window_days: Annotated[Optional[Union[StrictFloat, StrictInt]], Field(description="Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.")],
        conversion_report_time: Annotated[Optional[StrictStr], Field(description="The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.")],
        aggregate_report_rows: Annotated[Optional[StrictBool], Field(description="Determines if report rows should be aggregated across all requested entities. This feature is currently in BETA and is not available to all users.")],
        reporting_timezone: Annotated[Optional[ReportingTimeZone], Field(description="Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users.")],
    ) -> List[AdGroupsAnalyticsMetrics]:
        """Get analytics for the specified ad groups in the specified &#x60;ad_account_id&#x60;, filtered by the specified options.  - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days."""
        ...


    async def ad_groups_audience_sizing(
        self,
        ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")],
        ad_group_audience_sizing_create: AdGroupAudienceSizingCreate,
    ) -> AdGroupAudienceSizing:
        """Get potential audience size for an ad group with given targeting criteria. Potential audience size estimates the number of people you may be able to reach per month with your campaign. It is based on historical advertising data and the targeting criteria you select. It does not guarantee results or take into account factors such as bid, budget, schedule, seasonality or product experiments."""
        ...


    async def ad_groups_targeting_analytics_get(
        self,
        ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")],
        ad_group_ids: Annotated[List[Annotated[str, Field(strict=True, max_length=18)]], Field(min_length=1, max_length=250, description="List of Ad group Ids to use to filter the results.")],
        start_date: Annotated[date, Field(description="Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.")],
        end_date: Annotated[date, Field(description="Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.")],
        targeting_types: Annotated[List[AdsAnalyticsAdGroupTargetingType], Field(min_length=1, max_length=14, description="Targeting type breakdowns for the report. The reporting per targeting type is independent from each other. [\"AGE_BUCKET_AND_GENDER\", \"CREATIVE_ENHANCEMENTS\"] are in BETA and not yet available to all users.")],
        columns: Annotated[List[ReportingColumnSync], Field(description="Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.")],
        granularity: Annotated[Granularity, Field(description="  TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly")],
        click_window_days: Annotated[Optional[Union[StrictFloat, StrictInt]], Field(description="Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.")],
        engagement_window_days: Annotated[Optional[Union[StrictFloat, StrictInt]], Field(description="Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**.")],
        view_window_days: Annotated[Optional[Union[StrictFloat, StrictInt]], Field(description="Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.")],
        conversion_report_time: Annotated[Optional[StrictStr], Field(description="The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.")],
        attribution_types: Annotated[Optional[Annotated[List[ConversionReportAttributionType], Field(max_length=2)]], Field(description="List of types of attribution for the conversion report")],
        reporting_timezone: Annotated[Optional[ReportingTimeZone], Field(description="Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users.")],
        sort_columns: Annotated[Optional[Annotated[List[StrictStr], Field(min_length=1, max_length=2)]], Field(description="Sort Columns.")],
        sort_ascending: Annotated[Optional[StrictBool], Field(description="Sort ascending.")],
    ) -> MetricsResponse:
        """Get targeting analytics for one or more ad groups. For the requested ad group(s) and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \&quot;age_bucket\&quot;) for applicable values (e.g. \&quot;45-49\&quot;).  - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days."""
        ...


    async def ad_groups_get(
        self,
        ad_group_id: Annotated[str, Field(strict=True, max_length=18, description="Ad group ID.")],
        ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")],
    ) -> AdGroup:
        """Get a specific ad group given the ad group ID."""
        ...


    async def ad_groups_dynamic_titles_process_csv(
        self,
        ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")],
        ad_group_id: Annotated[str, Field(strict=True, max_length=18, description="Ad group ID.")],
        dynamic_titles_process_csv_create: DynamicTitlesProcessCSVCreate,
    ) -> DynamicTitlesProcessCSV:
        """Validate and process the uploaded dynamic titles review CSV. Returns validation errors if the CSV is invalid."""
        ...


    async def ad_groups_dynamic_titles_download_csv(
        self,
        ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")],
        ad_group_id: Annotated[str, Field(strict=True, max_length=18, description="Ad group ID.")],
    ) -> DynamicTitlesDownloadCSV:
        """Get a presigned S3 download URL for the dynamic titles review CSV. Returns 400 if titles have not been generated yet."""
        ...


    async def ad_groups_dynamic_titles_get_status(
        self,
        ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")],
        ad_group_id: Annotated[str, Field(strict=True, max_length=18, description="Ad group ID.")],
    ) -> DynamicTitlesGetStatus:
        """Get dynamic titles generation status for an ad group, including whether titles are ready for review and counts of generated and reviewed titles."""
        ...


    async def ad_groups_dynamic_titles_get_upload_url(
        self,
        ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")],
        ad_group_id: Annotated[str, Field(strict=True, max_length=18, description="Ad group ID.")],
    ) -> DynamicTitlesUploadURL:
        """Get a presigned S3 upload URL for the dynamic titles review CSV and a request_id for submission."""
        ...


    async def ad_groups_bid_floor_get(
        self,
        ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")],
        bid_floor_create: BidFloorCreate,
    ) -> BidFloor:
        """List bid floors for your campaign configuration. Bid floors are given in microcurrency values based on the currency in the bid floor specification.  Microcurrency is used to track very small transactions, based on the currency set in the advertiser&#39;s profile.  A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser&#39;s profile.  **Equivalency equations**, using dollars as an example currency:  * $1 &#x3D; 1,000,000 microdollars * 1 microdollar &#x3D; $0.000001  **To convert between currency and microcurrency**, using dollars as an example currency:  * To convert dollars to microdollars, mutiply dollars by 1,000,000 * To convert microdollars to dollars, divide microdollars by 1,000,000  For more on bid floors see [Set your bid](https://help.pinterest.com/en/business/article/set-your-bid)."""
        ...


    async def get_ad_groups_by_promotion_ids_list(
        self,
        ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")],
        promotion_ids: Annotated[List[StrictStr], Field(min_length=1, max_length=50, description="List of Promotion IDs to use to filter the results.")],
        bookmark: Annotated[Optional[StrictStr], Field(description="Cursor used to fetch the next page of items")],
        page_size: Annotated[Optional[Annotated[int, Field(le=250, strict=True, ge=1)]], Field(description="Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.")],
        order: Annotated[Optional[PinterestLibPaginationOrder], Field(description="The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.")],
    ) -> AdGroupsList200Response:
        """  Get a list of ad groups that are associated with those promotion ids"""
        ...
