import connexion

from app.openapi_server.models.ad_group import AdGroup  # noqa: E501
from app.openapi_server.models.ad_group_audience_sizing import AdGroupAudienceSizing  # noqa: E501
from app.openapi_server.models.ad_group_audience_sizing_create import AdGroupAudienceSizingCreate  # noqa: E501
from app.openapi_server.models.ad_group_create_create import AdGroupCreateCreate  # noqa: E501
from app.openapi_server.models.ad_group_update_batch_update import AdGroupUpdateBatchUpdate  # noqa: E501
from app.openapi_server.models.ad_groups_analytics_metrics import AdGroupsAnalyticsMetrics  # noqa: E501
from app.openapi_server.models.ad_groups_create200_response import AdGroupsCreate200Response  # noqa: E501
from app.openapi_server.models.ad_groups_list200_response import AdGroupsList200Response  # noqa: E501
from app.openapi_server.models.ads_analytics_ad_group_targeting_type import AdsAnalyticsAdGroupTargetingType  # noqa: E501
from app.openapi_server.models.bid_floor import BidFloor  # noqa: E501
from app.openapi_server.models.bid_floor_create import BidFloorCreate  # noqa: E501
from app.openapi_server.models.conversion_report_attribution_type import ConversionReportAttributionType  # noqa: E501
from app.openapi_server.models.dynamic_titles_download_csv import DynamicTitlesDownloadCSV  # noqa: E501
from app.openapi_server.models.dynamic_titles_get_status import DynamicTitlesGetStatus  # noqa: E501
from app.openapi_server.models.dynamic_titles_process_csv import DynamicTitlesProcessCSV  # noqa: E501
from app.openapi_server.models.dynamic_titles_process_csv_create import DynamicTitlesProcessCSVCreate  # noqa: E501
from app.openapi_server.models.dynamic_titles_upload_url import DynamicTitlesUploadURL  # noqa: E501
from app.openapi_server.models.entity_status import EntityStatus  # noqa: E501
from app.openapi_server.models.granularity import Granularity  # noqa: E501
from app.openapi_server.models.metrics_response import MetricsResponse  # noqa: E501
from app.openapi_server.models.pinterest_lib_error import PinterestLibError  # noqa: E501
from app.openapi_server.models.pinterest_lib_pagination_order import PinterestLibPaginationOrder  # noqa: E501
from app.openapi_server.models.reporting_column_sync import ReportingColumnSync  # noqa: E501
from app.openapi_server.models.reporting_time_zone import ReportingTimeZone  # noqa: E501
from openapi_server import util


def ad_groups_analytics(start_date, end_date, ad_group_ids, columns, granularity, ad_account_id, click_window_days=None, engagement_window_days=None, view_window_days=None, conversion_report_time=None, aggregate_report_rows=None, reporting_timezone=None):  # noqa: E501
    """Get ad group analytics

    Get analytics for the specified ad groups in the specified &#x60;ad_account_id&#x60;, filtered by the specified options.  - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days. # noqa: E501

    :param start_date: Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
    :type start_date: str
    :param end_date: Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
    :type end_date: str
    :param ad_group_ids: List of Ad group Ids to use to filter the results.
    :type ad_group_ids: List[str]
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

    :rtype: List[AdGroupsAnalyticsMetrics]
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


def ad_groups_audience_sizing(ad_account_id, body):  # noqa: E501
    """Get audience sizing

    Get potential audience size for an ad group with given targeting criteria. Potential audience size estimates the number of people you may be able to reach per month with your campaign. It is based on historical advertising data and the targeting criteria you select. It does not guarantee results or take into account factors such as bid, budget, schedule, seasonality or product experiments. # noqa: E501

    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str
    :param body: 
    :type body: dict | bytes

    :rtype: AdGroupAudienceSizing
    """
    if connexion.request.is_json:
        body = AdGroupAudienceSizingCreate.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def ad_groups_bid_floor_get(ad_account_id, body):  # noqa: E501
    """Get bid floors

    List bid floors for your campaign configuration. Bid floors are given in microcurrency values based on the currency in the bid floor specification.  Microcurrency is used to track very small transactions, based on the currency set in the advertiser&#39;s profile.  A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser&#39;s profile.  **Equivalency equations**, using dollars as an example currency:  * $1 &#x3D; 1,000,000 microdollars * 1 microdollar &#x3D; $0.000001  **To convert between currency and microcurrency**, using dollars as an example currency:  * To convert dollars to microdollars, mutiply dollars by 1,000,000 * To convert microdollars to dollars, divide microdollars by 1,000,000  For more on bid floors see [Set your bid](https://help.pinterest.com/en/business/article/set-your-bid). # noqa: E501

    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str
    :param body: 
    :type body: dict | bytes

    :rtype: BidFloor
    """
    if connexion.request.is_json:
        body = BidFloorCreate.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def ad_groups_create(ad_account_id, body):  # noqa: E501
    """Create ad groups

    Create multiple new ad groups. All ads in a given ad group will have the same budget, bid, run dates, targeting, and placement (search, browse, other).  For more information, [click here](https://help.pinterest.com/en/business/article/campaign-structure).  **Notes:** - &#x60;bid_in_micro_currency&#x60; and &#x60;budget_in_micro_currency&#x60; should be expressed in microcurrency amounts based on the currency field set in the advertiser&#39;s profile.  Microcurrency is used to track very small transactions, based on the currency set in the advertiser&#39;s profile. A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser&#39;s profile.  **Equivalency equations**, using dollars as an example currency: - $1 &#x3D; 1,000,000 microdollars - 1 microdollar &#x3D; $0.000001  **To convert between currency and microcurrency**, using dollars as an example currency: - To convert dollars to microdollars, multiply dollars by 1,000,000 - To convert microdollars to dollars, divide microdollars by 1,000,000  - Ad groups belong to ad campaigns. Some types of campaigns (e.g. budget optimization) have limits on the number of ad groups they can hold. If you exceed those limits, you will get an error message. - Certain organizations with [closed beta](/docs/getting-started/using-beta-and-restricted-features/) access can set &#x60;start_time&#x60; and &#x60;end_time&#x60; at the ad group level for campaigns with Campaign Budget Optimization (CBO) objectives: &#x60;TRAFFIC&#x60;, &#x60;AWARENESS&#x60;, &#x60;WEB_CONVERSIONS&#x60;, and &#x60;CATALOG_SALES&#x60;. All other organizations can set these scheduling parameters for non-CBO campaigns only. - If the parent ad campaign has start and end times set, ad group start and end times must occur within the parent campaign schedule. # noqa: E501

    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str
    :param body: 
    :type body: list | bytes

    :rtype: AdGroupsCreate200Response
    """
    if connexion.request.is_json:
        body = [AdGroupCreateCreate.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    return 'do some magic!'


def ad_groups_dynamic_titles_download_csv(ad_account_id, ad_group_id):  # noqa: E501
    """Get dynamic titles CSV download URL

    Get a presigned S3 download URL for the dynamic titles review CSV. Returns 400 if titles have not been generated yet. # noqa: E501

    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str
    :param ad_group_id: Ad group ID.
    :type ad_group_id: str

    :rtype: DynamicTitlesDownloadCSV
    """
    return 'do some magic!'


def ad_groups_dynamic_titles_get_status(ad_account_id, ad_group_id):  # noqa: E501
    """Get dynamic titles status

    Get dynamic titles generation status for an ad group, including whether titles are ready for review and counts of generated and reviewed titles. # noqa: E501

    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str
    :param ad_group_id: Ad group ID.
    :type ad_group_id: str

    :rtype: DynamicTitlesGetStatus
    """
    return 'do some magic!'


def ad_groups_dynamic_titles_get_upload_url(ad_account_id, ad_group_id):  # noqa: E501
    """Get dynamic titles upload URL

    Get a presigned S3 upload URL for the dynamic titles review CSV and a request_id for submission. # noqa: E501

    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str
    :param ad_group_id: Ad group ID.
    :type ad_group_id: str

    :rtype: DynamicTitlesUploadURL
    """
    return 'do some magic!'


def ad_groups_dynamic_titles_process_csv(ad_account_id, ad_group_id, body):  # noqa: E501
    """Process dynamic titles CSV

    Validate and process the uploaded dynamic titles review CSV. Returns validation errors if the CSV is invalid. # noqa: E501

    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str
    :param ad_group_id: Ad group ID.
    :type ad_group_id: str
    :param body: 
    :type body: dict | bytes

    :rtype: DynamicTitlesProcessCSV
    """
    if connexion.request.is_json:
        body = DynamicTitlesProcessCSVCreate.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def ad_groups_get(ad_group_id, ad_account_id):  # noqa: E501
    """Get ad group

    Get a specific ad group given the ad group ID. # noqa: E501

    :param ad_group_id: Ad group ID.
    :type ad_group_id: str
    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str

    :rtype: AdGroup
    """
    return 'do some magic!'


def ad_groups_list(ad_account_id, bookmark=None, page_size=None, order=None, campaign_ids=None, ad_group_ids=None, entity_statuses=None, translate_interests_to_names=None):  # noqa: E501
    """List ad groups

    List ad groups based on provided campaign IDs or ad group IDs.(campaign_ids or ad_group_ids). **Note:** Provide only campaign_id or ad_group_id. Do not provide both. # noqa: E501

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
    :param ad_group_ids: List of Ad group Ids to retrieve keywords from. This feature is currently in BETA and is not available to all users.
    :type ad_group_ids: List[str]
    :param entity_statuses: Entity status
    :type entity_statuses: list | bytes
    :param translate_interests_to_names: Return interests as text names (if value is true) rather than topic IDs.
    :type translate_interests_to_names: bool

    :rtype: AdGroupsList200Response
    """
    if connexion.request.is_json:
        order = .from_dict(connexion.request.get_json())  # noqa: E501
    if connexion.request.is_json:
        entity_statuses = [EntityStatus.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    return 'do some magic!'


def ad_groups_targeting_analytics_get(ad_account_id, ad_group_ids, start_date, end_date, targeting_types, columns, granularity, click_window_days=None, engagement_window_days=None, view_window_days=None, conversion_report_time=None, attribution_types=None, reporting_timezone=None, sort_columns=None, sort_ascending=None):  # noqa: E501
    """Get targeting analytics for ad groups

    Get targeting analytics for one or more ad groups. For the requested ad group(s) and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \&quot;age_bucket\&quot;) for applicable values (e.g. \&quot;45-49\&quot;).  - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days. # noqa: E501

    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str
    :param ad_group_ids: List of Ad group Ids to use to filter the results.
    :type ad_group_ids: List[str]
    :param start_date: Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
    :type start_date: str
    :param end_date: Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
    :type end_date: str
    :param targeting_types: Targeting type breakdowns for the report. The reporting per targeting type is independent from each other. [\&quot;AGE_BUCKET_AND_GENDER\&quot;, \&quot;CREATIVE_ENHANCEMENTS\&quot;] are in BETA and not yet available to all users.
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
    :param sort_columns: Sort Columns.
    :type sort_columns: List[str]
    :param sort_ascending: Sort ascending.
    :type sort_ascending: bool

    :rtype: MetricsResponse
    """
    start_date = util.deserialize_date(start_date)
    end_date = util.deserialize_date(end_date)
    if connexion.request.is_json:
        targeting_types = [AdsAnalyticsAdGroupTargetingType.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    if connexion.request.is_json:
        columns = [ReportingColumnSync.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    if connexion.request.is_json:
        granularity = .from_dict(connexion.request.get_json())  # noqa: E501
    if connexion.request.is_json:
        attribution_types = [ConversionReportAttributionType.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    if connexion.request.is_json:
        reporting_timezone = .from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def ad_groups_update(ad_account_id, body):  # noqa: E501
    """Update ad groups

    Update multiple existing ad groups. # noqa: E501

    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str
    :param body: 
    :type body: list | bytes

    :rtype: AdGroupsCreate200Response
    """
    if connexion.request.is_json:
        body = [AdGroupUpdateBatchUpdate.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    return 'do some magic!'


def get_ad_groups_by_promotion_ids_list(ad_account_id, promotion_ids, bookmark=None, page_size=None, order=None):  # noqa: E501
    """List of ad groups using promotions IDs.

      Get a list of ad groups that are associated with those promotion ids # noqa: E501

    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str
    :param promotion_ids: List of Promotion IDs to use to filter the results.
    :type promotion_ids: List[str]
    :param bookmark: Cursor used to fetch the next page of items
    :type bookmark: str
    :param page_size: Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
    :type page_size: int
    :param order: The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items.
    :type order: dict | bytes

    :rtype: AdGroupsList200Response
    """
    if connexion.request.is_json:
        order = .from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
