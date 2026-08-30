import connexion

from app.openapi_server.models.ad_pin_analytics import AdPinAnalytics  # noqa: E501
from app.openapi_server.models.ads_analytics_campaign_targeting_type import AdsAnalyticsCampaignTargetingType  # noqa: E501
from app.openapi_server.models.campaign import Campaign  # noqa: E501
from app.openapi_server.models.campaign_batch_update_item import CampaignBatchUpdateItem  # noqa: E501
from app.openapi_server.models.campaign_batch_write_response_model import CampaignBatchWriteResponseModel  # noqa: E501
from app.openapi_server.models.campaign_create_item import CampaignCreateItem  # noqa: E501
from app.openapi_server.models.campaign_delivery_estimates_campaign import CampaignDeliveryEstimatesCampaign  # noqa: E501
from app.openapi_server.models.campaign_delivery_estimates_response import CampaignDeliveryEstimatesResponse  # noqa: E501
from app.openapi_server.models.campaigns_analytics_metrics import CampaignsAnalyticsMetrics  # noqa: E501
from app.openapi_server.models.campaigns_list200_response import CampaignsList200Response  # noqa: E501
from app.openapi_server.models.conversion_report_attribution_type import ConversionReportAttributionType  # noqa: E501
from app.openapi_server.models.entity_status import EntityStatus  # noqa: E501
from app.openapi_server.models.granularity import Granularity  # noqa: E501
from app.openapi_server.models.metrics_response import MetricsResponse  # noqa: E501
from app.openapi_server.models.pinterest_lib_error import PinterestLibError  # noqa: E501
from app.openapi_server.models.pinterest_lib_pagination_order import PinterestLibPaginationOrder  # noqa: E501
from app.openapi_server.models.reporting_column_sync import ReportingColumnSync  # noqa: E501
from app.openapi_server.models.reporting_time_zone import ReportingTimeZone  # noqa: E501
from openapi_server import util


def ad_pins_analytics(campaign_id, pin_ids, start_date, end_date, columns, granularity, ad_account_id, click_window_days=None, engagement_window_days=None, view_window_days=None, conversion_report_time=None):  # noqa: E501
    """Get pins analytics

    Get analytics for the pins given a campaign and pins in the specified &#x60;ad_account_id&#x60;, filtered by the specified options. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days. Data will not be provided for conversion metrics but will be available for non-conversion metrics. # noqa: E501

    :param campaign_id: Campaign Id to use to filter the results.
    :type campaign_id: str
    :param pin_ids: List of Pin IDs.
    :type pin_ids: List[str]
    :param start_date: Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
    :type start_date: str
    :param end_date: Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
    :type end_date: str
    :param columns: Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.  For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.
    :type columns: list | bytes
    :param granularity:   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly
    :type granularity: dict | bytes
    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str
    :param click_window_days: Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.
    :type click_window_days: 
    :param engagement_window_days: Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**.
    :type engagement_window_days: 
    :param view_window_days: Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day.
    :type view_window_days: 
    :param conversion_report_time: The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
    :type conversion_report_time: str

    :rtype: List[AdPinAnalytics]
    """
    start_date = util.deserialize_date(start_date)
    end_date = util.deserialize_date(end_date)
    if connexion.request.is_json:
        columns = [ReportingColumnSync.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    if connexion.request.is_json:
        granularity = .from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def campaign_targeting_analytics_get(ad_account_id, campaign_ids, start_date, end_date, targeting_types, columns, granularity, click_window_days=None, engagement_window_days=None, view_window_days=None, conversion_report_time=None, attribution_types=None, reporting_timezone=None):  # noqa: E501
    """Get targeting analytics for campaigns

    Get targeting analytics for one or more campaigns. For the requested account and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \&quot;age_bucket\&quot;) for applicable values (e.g. \&quot;45-49\&quot;).  * The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. * If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. * If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days. # noqa: E501

    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str
    :param campaign_ids: List of Campaign Ids to use to filter the results.
    :type campaign_ids: List[str]
    :param start_date: Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
    :type start_date: str
    :param end_date: Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
    :type end_date: str
    :param targeting_types: Targeting type breakdowns for the report. The reporting per targeting type is independent from each other. [\&quot;AGE_BUCKET_AND_GENDER\&quot;] is in BETA and not yet available to all users.
    :type targeting_types: list | bytes
    :param columns: Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.  For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.
    :type columns: list | bytes
    :param granularity:   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly
    :type granularity: dict | bytes
    :param click_window_days: Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.
    :type click_window_days: 
    :param engagement_window_days: Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**.
    :type engagement_window_days: 
    :param view_window_days: Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day.
    :type view_window_days: 
    :param conversion_report_time: The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
    :type conversion_report_time: str
    :param attribution_types: List of types of attribution for the conversion report
    :type attribution_types: list | bytes
    :param reporting_timezone: Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users.
    :type reporting_timezone: dict | bytes

    :rtype: MetricsResponse
    """
    start_date = util.deserialize_date(start_date)
    end_date = util.deserialize_date(end_date)
    if connexion.request.is_json:
        targeting_types = [AdsAnalyticsCampaignTargetingType.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    if connexion.request.is_json:
        columns = [ReportingColumnSync.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    if connexion.request.is_json:
        granularity = .from_dict(connexion.request.get_json())  # noqa: E501
    if connexion.request.is_json:
        attribution_types = [ConversionReportAttributionType.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    if connexion.request.is_json:
        reporting_timezone = .from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def campaigns_analytics(start_date, end_date, campaign_ids, columns, granularity, ad_account_id, click_window_days=None, engagement_window_days=None, view_window_days=None, conversion_report_time=None, aggregate_report_rows=None, reporting_timezone=None):  # noqa: E501
    """Get campaign analytics

    Get analytics for the specified campaigns in the specified &#x60;ad_account_id&#x60;, filtered by the specified options. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days. # noqa: E501

    :param start_date: Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
    :type start_date: str
    :param end_date: Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
    :type end_date: str
    :param campaign_ids: List of Campaign Ids to use to filter the results.
    :type campaign_ids: List[str]
    :param columns: Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.  For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.
    :type columns: list | bytes
    :param granularity:   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly
    :type granularity: dict | bytes
    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str
    :param click_window_days: Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.
    :type click_window_days: 
    :param engagement_window_days: Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**.
    :type engagement_window_days: 
    :param view_window_days: Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day.
    :type view_window_days: 
    :param conversion_report_time: The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
    :type conversion_report_time: str
    :param aggregate_report_rows: Determines if report rows should be aggregated across all requested entities. This feature is currently in BETA and is not available to all users.
    :type aggregate_report_rows: bool
    :param reporting_timezone: Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users.
    :type reporting_timezone: dict | bytes

    :rtype: List[CampaignsAnalyticsMetrics]
    """
    start_date = util.deserialize_date(start_date)
    end_date = util.deserialize_date(end_date)
    if connexion.request.is_json:
        columns = [ReportingColumnSync.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    if connexion.request.is_json:
        granularity = .from_dict(connexion.request.get_json())  # noqa: E501
    if connexion.request.is_json:
        reporting_timezone = .from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def campaigns_create(ad_account_id, body):  # noqa: E501
    """Create campaigns

    Create multiple new campaigns. Every campaign has its own campaign_id and houses one or more ad groups, which contain one or more ads.  For more, see [Set up your campaign](https://help.pinterest.com/en/business/article/set-up-your-campaign/).  **Note:** - The values for &#x60;lifetime_spend_cap&#x60; and &#x60;daily_spend_cap&#x60; are microcurrency amounts based on the currency field set in the advertiser&#39;s profile (e.g. USD).  Microcurrency is used to track very small transactions, based on the currency set in the advertiser&#39;s profile.  A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser&#39;s profile.  **Equivalency equations**, using dollars as an example currency:  - $1 &#x3D; 1,000,000 microdollars - 1 microdollar &#x3D; $0.000001  **To convert between currency and microcurrency**, using dollars as an example currency:  - To convert dollars to microdollars, multiply dollars by 1,000,000 - To convert microdollars to dollars, divide microdollars by 1,000,000 # noqa: E501

    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str
    :param body: 
    :type body: list | bytes

    :rtype: CampaignBatchWriteResponseModel
    """
    if connexion.request.is_json:
        body = [CampaignCreateItem.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    return 'do some magic!'


def campaigns_get(campaign_id, ad_account_id):  # noqa: E501
    """Get campaign

    Get a specific campaign given the campaign ID. # noqa: E501

    :param campaign_id: Campaign ID, must be associated with the ad account ID provided in the path.
    :type campaign_id: str
    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str

    :rtype: Campaign
    """
    return 'do some magic!'


def campaigns_list(ad_account_id, bookmark=None, page_size=None, order=None, campaign_ids=None, entity_statuses=None):  # noqa: E501
    """List campaigns

    Get a list of the campaigns in the specified &#x60;ad_account_id&#x60;, filtered by the specified options. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. # noqa: E501

    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str
    :param bookmark: Cursor used to fetch the next page of items
    :type bookmark: str
    :param page_size: Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
    :type page_size: int
    :param order: The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items.
    :type order: dict | bytes
    :param campaign_ids: List of Campaign Ids to use to filter the results.
    :type campaign_ids: List[str]
    :param entity_statuses: Entity status
    :type entity_statuses: list | bytes

    :rtype: CampaignsList200Response
    """
    if connexion.request.is_json:
        order = .from_dict(connexion.request.get_json())  # noqa: E501
    if connexion.request.is_json:
        entity_statuses = [EntityStatus.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    return 'do some magic!'


def campaigns_update(ad_account_id, body):  # noqa: E501
    """Update campaigns

    Update multiple ad campaigns based on campaign_ids.  **Note:** - The values for &#x60;lifetime_spend_cap&#x60; and &#x60;daily_spend_cap&#x60; are microcurrency amounts based on the currency field set in the advertiser&#39;s profile (e.g. USD).  Microcurrency is used to track very small transactions, based on the currency set in the advertiser&#39;s profile.  A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser&#39;s profile.  **Equivalency equations**, using dollars as an example currency:  - $1 &#x3D; 1,000,000 microdollars - 1 microdollar &#x3D; $0.000001  **To convert between currency and microcurrency**, using dollars as an example currency:  - To convert dollars to microdollars, multiply dollars by 1,000,000 - To convert microdollars to dollars, divide microdollars by 1,000,000 # noqa: E501

    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str
    :param body: 
    :type body: list | bytes

    :rtype: CampaignBatchWriteResponseModel
    """
    if connexion.request.is_json:
        body = [CampaignBatchUpdateItem.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    return 'do some magic!'


def get_campaign_delivery_estimates(ad_account_id, body):  # noqa: E501
    """Get campaign delivery estimates

    Get delivery estimates for an ads campaign  **This endpoint is currently in beta and is not available to all apps [Learn more](/docs/new/about-beta-access/).** # noqa: E501

    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str
    :param body: 
    :type body: list | bytes

    :rtype: CampaignDeliveryEstimatesResponse
    """
    if connexion.request.is_json:
        body = [CampaignDeliveryEstimatesCampaign.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    return 'do some magic!'
