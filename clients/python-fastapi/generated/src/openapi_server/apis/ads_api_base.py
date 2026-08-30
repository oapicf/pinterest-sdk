# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401

from datetime import date
from pydantic import Field, StrictBool, StrictFloat, StrictInt, StrictStr, field_validator
from typing import Any, List, Optional, Union
from typing_extensions import Annotated
from openapi_server.models.ad import Ad
from openapi_server.models.ad_batch_update import AdBatchUpdate
from openapi_server.models.ad_batch_write_response_model import AdBatchWriteResponseModel
from openapi_server.models.ad_create import AdCreate
from openapi_server.models.ad_preview_request import AdPreviewRequest
from openapi_server.models.ad_preview_url_response import AdPreviewURLResponse
from openapi_server.models.ads_analytics import AdsAnalytics
from openapi_server.models.ads_analytics_ad_targeting_type import AdsAnalyticsAdTargetingType
from openapi_server.models.ads_list200_response import AdsList200Response
from openapi_server.models.campaign_ad_preview import CampaignAdPreview
from openapi_server.models.campaign_ad_preview_create import CampaignAdPreviewCreate
from openapi_server.models.campaign_ad_preview_create200_response_inner import CampaignAdPreviewCreate200ResponseInner
from openapi_server.models.campaign_ad_preview_delete200_response_inner import CampaignAdPreviewDelete200ResponseInner
from openapi_server.models.conversion_attribution_window_days import ConversionAttributionWindowDays
from openapi_server.models.conversion_report_attribution_type import ConversionReportAttributionType
from openapi_server.models.conversion_report_time_type import ConversionReportTimeType
from openapi_server.models.entity_status import EntityStatus
from openapi_server.models.granularity import Granularity
from openapi_server.models.metrics_response import MetricsResponse
from openapi_server.models.pinterest_lib_error import PinterestLibError
from openapi_server.models.pinterest_lib_pagination_order import PinterestLibPaginationOrder
from openapi_server.models.reporting_column_sync import ReportingColumnSync
from openapi_server.models.reporting_time_zone import ReportingTimeZone
from openapi_server.security_api import get_token_pinterest_oauth2, get_token_client_credentials

class BaseAdsApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BaseAdsApi.subclasses = BaseAdsApi.subclasses + (cls,)
    async def ad_previews_create(
        self,
        ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")],
        ad_preview_request: AdPreviewRequest,
    ) -> AdPreviewURLResponse:
        """Create an ad preview given an ad account ID and either an existing organic pin ID or the URL for an image to be used to create the Pin and the ad.  If you are creating a preview from an existing Pin, that Pin must be promotable: that is, it must have a clickthrough link and meet other requirements. (See [Ads Overview](https://help.pinterest.com/en/business/article/promoted-pins-overview).)  You can view the returned preview URL on a webpage or iframe for 7 days, after which the URL expires. Collection ads are not currently supported ad preview."""
        ...


    async def ads_list(
        self,
        ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")],
        bookmark: Annotated[Optional[StrictStr], Field(description="Cursor used to fetch the next page of items")],
        page_size: Annotated[Optional[Annotated[int, Field(le=250, strict=True, ge=1)]], Field(description="Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.")],
        order: Annotated[Optional[PinterestLibPaginationOrder], Field(description="The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.")],
        campaign_ids: Annotated[Optional[Annotated[List[Annotated[str, Field(strict=True, max_length=18)]], Field(min_length=1, max_length=250)]], Field(description="List of Campaign Ids to use to filter the results.")],
        ad_group_ids: Annotated[Optional[Annotated[List[Annotated[str, Field(strict=True)]], Field(min_length=1, max_length=250)]], Field(description="List of Ad group Ids to retrieve keywords from. This feature is currently in BETA and is not available to all users.")],
        ad_ids: Annotated[Optional[Annotated[List[Annotated[str, Field(strict=True)]], Field(min_length=1, max_length=250)]], Field(description="List of Ad Ids to use to filter the results.")],
        entity_statuses: Annotated[Optional[List[EntityStatus]], Field(description="Entity status")],
    ) -> AdsList200Response:
        """List ads that meet the filters provided:     - Listed campaign ids or ad group ids or ad ids     - Listed entity statuses  If no filter is provided, all ads in the ad account are returned.  **Note:** Provide only &#x60;campaign_id&#x60; or &#x60;ad_group_id&#x60; or &#x60;ad_id&#x60;. Do not provide more than one type.  Review status is provided for each ad; if &#x60;review_status&#x60; is &#x60;REJECTED&#x60;, the &#x60;rejected_reasons&#x60; field will contain additional information.  For more, see [Pinterest advertising standards](https://policy.pinterest.com/en/advertising-guidelines)."""
        ...


    async def ads_create(
        self,
        ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")],
        ad_create: Annotated[List[AdCreate], Field(min_length=1, max_length=30)],
    ) -> AdBatchWriteResponseModel:
        """Create multiple new ads. Request must contain ad_group_id, creative_type, and the source Pin pin_id."""
        ...


    async def ads_update(
        self,
        ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")],
        ad_batch_update: Annotated[List[AdBatchUpdate], Field(min_length=1, max_length=30)],
    ) -> AdBatchWriteResponseModel:
        """Update multiple existing ads"""
        ...


    async def ads_analytics(
        self,
        start_date: Annotated[date, Field(description="Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.")],
        end_date: Annotated[date, Field(description="Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.")],
        columns: Annotated[List[ReportingColumnSync], Field(description="Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.")],
        granularity: Annotated[Granularity, Field(description="  TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly")],
        ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")],
        pin_ids: Annotated[Optional[Annotated[List[StrictStr], Field(min_length=1, max_length=100)]], Field(description="List of Pin IDs.")],
        ad_ids: Annotated[Optional[Annotated[List[Annotated[str, Field(strict=True)]], Field(min_length=1, max_length=250)]], Field(description="List of Ad Ids to use to filter the results.")],
        click_window_days: Annotated[Optional[Union[StrictFloat, StrictInt]], Field(description="Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.")],
        engagement_window_days: Annotated[Optional[Union[StrictFloat, StrictInt]], Field(description="Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**.")],
        view_window_days: Annotated[Optional[Union[StrictFloat, StrictInt]], Field(description="Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.")],
        conversion_report_time: Annotated[Optional[StrictStr], Field(description="The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.")],
        campaign_ids: Annotated[Optional[Annotated[List[Annotated[str, Field(strict=True, max_length=18)]], Field(min_length=1, max_length=250)]], Field(description="List of Campaign Ids to use to filter the results.")],
        reporting_timezone: Annotated[Optional[ReportingTimeZone], Field(description="Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users.")],
    ) -> List[AdsAnalytics]:
        """    Get analytics for the specified ads in the specified &#x60;ad_account_id&#x60;, filtered by the specified options.     - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.     - The request must contain either ad_ids or both campaign_ids and pin_ids.     - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days.     - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days."""
        ...


    async def ad_targeting_analytics_get(
        self,
        ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")],
        ad_ids: Annotated[List[Annotated[str, Field(strict=True)]], Field(min_length=1, max_length=250, description="List of Ad Ids to use to filter the results.")],
        start_date: Annotated[date, Field(description="Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.")],
        end_date: Annotated[date, Field(description="Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.")],
        targeting_types: Annotated[List[AdsAnalyticsAdTargetingType], Field(min_length=1, max_length=14, description="Targeting type breakdowns for the report. The reporting per targeting type is independent from each other. [\"AGE_BUCKET_AND_GENDER\"] is in BETA and not yet available to all users.")],
        columns: Annotated[List[ReportingColumnSync], Field(description="Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.")],
        granularity: Annotated[Granularity, Field(description="  TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly")],
        click_window_days: Annotated[Optional[ConversionAttributionWindowDays], Field(description="Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.")],
        engagement_window_days: Annotated[Optional[ConversionAttributionWindowDays], Field(description="Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.  **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**.")],
        view_window_days: Annotated[Optional[ConversionAttributionWindowDays], Field(description="Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.")],
        conversion_report_time: Annotated[Optional[ConversionReportTimeType], Field(description="The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.")],
        attribution_types: Annotated[Optional[Annotated[List[ConversionReportAttributionType], Field(max_length=2)]], Field(description="List of types of attribution for the conversion report")],
        reporting_timezone: Annotated[Optional[ReportingTimeZone], Field(description="Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users.")],
        sort_columns: Annotated[Optional[Annotated[List[StrictStr], Field(min_length=1, max_length=2)]], Field(description="Sort Columns.")],
        sort_ascending: Annotated[Optional[StrictBool], Field(description="Sort ascending.")],
    ) -> MetricsResponse:
        """Get targeting analytics for one or more ads. For the requested ad(s) and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \&quot;age_bucket\&quot;) for applicable values (e.g. \&quot;45-49\&quot;).  * The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. * If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. * If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days."""
        ...


    async def ads_get(
        self,
        ad_id: Annotated[str, Field(strict=True, max_length=18, description="The ID of this ad.")],
        ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")],
    ) -> Ad:
        """Get a specific ad given the ad ID. If your pin is rejected, rejected_reasons will contain additional information from the Ad Review process. For more information about our policies and rejection reasons see the [Pinterest advertising standards](https://www.pinterest.com/_/_/policy/advertising-guidelines/)."""
        ...


    async def campaign_ad_preview_read(
        self,
        ad_group_ids: Annotated[List[Annotated[str, Field(strict=True, max_length=18)]], Field(min_length=1, max_length=250, description="List of Ad group Ids to use to filter the results.")],
        ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")],
    ) -> List[CampaignAdPreview]:
        """Fetch ad preview records for one or more ad groups. Returns all active previews associated with the provided ad group IDs."""
        ...


    async def campaign_ad_preview_create(
        self,
        ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")],
        campaign_ad_preview_create: List[CampaignAdPreviewCreate],
    ) -> List[CampaignAdPreviewCreate200ResponseInner]:
        """Create ad preview records for one or more ad groups that can be shared. Each ad group is processed independently; individual failures do not block other previews."""
        ...


    async def campaign_ad_preview_delete(
        self,
        ad_group_ids: Annotated[List[Annotated[str, Field(strict=True, max_length=18)]], Field(min_length=1, max_length=250, description="List of Ad group Ids to use to filter the results.")],
        ad_account_id: Annotated[str, Field(strict=True, max_length=18, description="Unique identifier of an ad account.")],
    ) -> List[CampaignAdPreviewDelete200ResponseInner]:
        """Delete ad preview records for one or more ad groups. All ad groups are validated before deleting any records."""
        ...
