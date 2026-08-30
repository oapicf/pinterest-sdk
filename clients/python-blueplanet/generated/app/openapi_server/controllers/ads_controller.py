import connexion

from app.openapi_server.models.ad import Ad  # noqa: E501
from app.openapi_server.models.ad_batch_update import AdBatchUpdate  # noqa: E501
from app.openapi_server.models.ad_batch_write_response_model import AdBatchWriteResponseModel  # noqa: E501
from app.openapi_server.models.ad_create import AdCreate  # noqa: E501
from app.openapi_server.models.ad_preview_request import AdPreviewRequest  # noqa: E501
from app.openapi_server.models.ad_preview_url_response import AdPreviewURLResponse  # noqa: E501
from app.openapi_server.models.ads_analytics import AdsAnalytics  # noqa: E501
from app.openapi_server.models.ads_analytics_ad_targeting_type import AdsAnalyticsAdTargetingType  # noqa: E501
from app.openapi_server.models.ads_list200_response import AdsList200Response  # noqa: E501
from app.openapi_server.models.campaign_ad_preview import CampaignAdPreview  # noqa: E501
from app.openapi_server.models.campaign_ad_preview_create import CampaignAdPreviewCreate  # noqa: E501
from app.openapi_server.models.campaign_ad_preview_create200_response_inner import CampaignAdPreviewCreate200ResponseInner  # noqa: E501
from app.openapi_server.models.campaign_ad_preview_delete200_response_inner import CampaignAdPreviewDelete200ResponseInner  # noqa: E501
from app.openapi_server.models.conversion_attribution_window_days import ConversionAttributionWindowDays  # noqa: E501
from app.openapi_server.models.conversion_report_attribution_type import ConversionReportAttributionType  # noqa: E501
from app.openapi_server.models.conversion_report_time_type import ConversionReportTimeType  # noqa: E501
from app.openapi_server.models.entity_status import EntityStatus  # noqa: E501
from app.openapi_server.models.granularity import Granularity  # noqa: E501
from app.openapi_server.models.metrics_response import MetricsResponse  # noqa: E501
from app.openapi_server.models.pinterest_lib_error import PinterestLibError  # noqa: E501
from app.openapi_server.models.pinterest_lib_pagination_order import PinterestLibPaginationOrder  # noqa: E501
from app.openapi_server.models.reporting_column_sync import ReportingColumnSync  # noqa: E501
from app.openapi_server.models.reporting_time_zone import ReportingTimeZone  # noqa: E501
from openapi_server import util


def ad_previews_create(ad_account_id, body):  # noqa: E501
    """Create ad preview with pin or image

    Create an ad preview given an ad account ID and either an existing organic pin ID or the URL for an image to be used to create the Pin and the ad.  If you are creating a preview from an existing Pin, that Pin must be promotable: that is, it must have a clickthrough link and meet other requirements. (See [Ads Overview](https://help.pinterest.com/en/business/article/promoted-pins-overview).)  You can view the returned preview URL on a webpage or iframe for 7 days, after which the URL expires. Collection ads are not currently supported ad preview. # noqa: E501

    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str
    :param body: 
    :type body: dict | bytes

    :rtype: AdPreviewURLResponse
    """
    if connexion.request.is_json:
        body = AdPreviewRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def ad_targeting_analytics_get(ad_account_id, ad_ids, start_date, end_date, targeting_types, columns, granularity, click_window_days=None, engagement_window_days=None, view_window_days=None, conversion_report_time=None, attribution_types=None, reporting_timezone=None, sort_columns=None, sort_ascending=None):  # noqa: E501
    """Get targeting analytics for ads

    Get targeting analytics for one or more ads. For the requested ad(s) and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \&quot;age_bucket\&quot;) for applicable values (e.g. \&quot;45-49\&quot;).  * The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. * If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. * If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days. # noqa: E501

    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str
    :param ad_ids: List of Ad Ids to use to filter the results.
    :type ad_ids: List[str]
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
    :type click_window_days: dict | bytes
    :param engagement_window_days: Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.  **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**.
    :type engagement_window_days: dict | bytes
    :param view_window_days: Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day.
    :type view_window_days: dict | bytes
    :param conversion_report_time: The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
    :type conversion_report_time: dict | bytes
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
        targeting_types = [AdsAnalyticsAdTargetingType.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    if connexion.request.is_json:
        columns = [ReportingColumnSync.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    if connexion.request.is_json:
        granularity = .from_dict(connexion.request.get_json())  # noqa: E501
    if connexion.request.is_json:
        click_window_days = .from_dict(connexion.request.get_json())  # noqa: E501
    if connexion.request.is_json:
        engagement_window_days = .from_dict(connexion.request.get_json())  # noqa: E501
    if connexion.request.is_json:
        view_window_days = .from_dict(connexion.request.get_json())  # noqa: E501
    if connexion.request.is_json:
        conversion_report_time = .from_dict(connexion.request.get_json())  # noqa: E501
    if connexion.request.is_json:
        attribution_types = [ConversionReportAttributionType.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    if connexion.request.is_json:
        reporting_timezone = .from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def ads_analytics(start_date, end_date, columns, granularity, ad_account_id, pin_ids=None, ad_ids=None, click_window_days=None, engagement_window_days=None, view_window_days=None, conversion_report_time=None, campaign_ids=None, reporting_timezone=None):  # noqa: E501
    """Get ad analytics

        Get analytics for the specified ads in the specified &#x60;ad_account_id&#x60;, filtered by the specified options.     - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.     - The request must contain either ad_ids or both campaign_ids and pin_ids.     - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days.     - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days. # noqa: E501

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
    :param pin_ids: List of Pin IDs.
    :type pin_ids: List[str]
    :param ad_ids: List of Ad Ids to use to filter the results.
    :type ad_ids: List[str]
    :param click_window_days: Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.
    :type click_window_days: 
    :param engagement_window_days: Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**.
    :type engagement_window_days: 
    :param view_window_days: Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day.
    :type view_window_days: 
    :param conversion_report_time: The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
    :type conversion_report_time: str
    :param campaign_ids: List of Campaign Ids to use to filter the results.
    :type campaign_ids: List[str]
    :param reporting_timezone: Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users.
    :type reporting_timezone: dict | bytes

    :rtype: List[AdsAnalytics]
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


def ads_create(ad_account_id, body):  # noqa: E501
    """Create ads

    Create multiple new ads. Request must contain ad_group_id, creative_type, and the source Pin pin_id. # noqa: E501

    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str
    :param body: 
    :type body: list | bytes

    :rtype: AdBatchWriteResponseModel
    """
    if connexion.request.is_json:
        body = [AdCreate.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    return 'do some magic!'


def ads_get(ad_id, ad_account_id):  # noqa: E501
    """Get ad

    Get a specific ad given the ad ID. If your pin is rejected, rejected_reasons will contain additional information from the Ad Review process. For more information about our policies and rejection reasons see the [Pinterest advertising standards](https://www.pinterest.com/_/_/policy/advertising-guidelines/). # noqa: E501

    :param ad_id: The ID of this ad.
    :type ad_id: str
    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str

    :rtype: Ad
    """
    return 'do some magic!'


def ads_list(ad_account_id, bookmark=None, page_size=None, order=None, campaign_ids=None, ad_group_ids=None, ad_ids=None, entity_statuses=None):  # noqa: E501
    """List ads

    List ads that meet the filters provided:     - Listed campaign ids or ad group ids or ad ids     - Listed entity statuses  If no filter is provided, all ads in the ad account are returned.  **Note:** Provide only &#x60;campaign_id&#x60; or &#x60;ad_group_id&#x60; or &#x60;ad_id&#x60;. Do not provide more than one type.  Review status is provided for each ad; if &#x60;review_status&#x60; is &#x60;REJECTED&#x60;, the &#x60;rejected_reasons&#x60; field will contain additional information.  For more, see [Pinterest advertising standards](https://policy.pinterest.com/en/advertising-guidelines). # noqa: E501

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
    :param ad_ids: List of Ad Ids to use to filter the results.
    :type ad_ids: List[str]
    :param entity_statuses: Entity status
    :type entity_statuses: list | bytes

    :rtype: AdsList200Response
    """
    if connexion.request.is_json:
        order = .from_dict(connexion.request.get_json())  # noqa: E501
    if connexion.request.is_json:
        entity_statuses = [EntityStatus.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    return 'do some magic!'


def ads_update(ad_account_id, body):  # noqa: E501
    """Update ads

    Update multiple existing ads # noqa: E501

    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str
    :param body: 
    :type body: list | bytes

    :rtype: AdBatchWriteResponseModel
    """
    if connexion.request.is_json:
        body = [AdBatchUpdate.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    return 'do some magic!'


def campaign_ad_preview_create(ad_account_id, body):  # noqa: E501
    """Create ad preview records for one or more ad groups

    Create ad preview records for one or more ad groups that can be shared. Each ad group is processed independently; individual failures do not block other previews. # noqa: E501

    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str
    :param body: 
    :type body: list | bytes

    :rtype: List[CampaignAdPreviewCreate200ResponseInner]
    """
    if connexion.request.is_json:
        body = [CampaignAdPreviewCreate.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    return 'do some magic!'


def campaign_ad_preview_delete(ad_group_ids, ad_account_id):  # noqa: E501
    """Delete ad preview records for one or more ad groups

    Delete ad preview records for one or more ad groups. All ad groups are validated before deleting any records. # noqa: E501

    :param ad_group_ids: List of Ad group Ids to use to filter the results.
    :type ad_group_ids: List[str]
    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str

    :rtype: List[CampaignAdPreviewDelete200ResponseInner]
    """
    return 'do some magic!'


def campaign_ad_preview_read(ad_group_ids, ad_account_id):  # noqa: E501
    """Fetch ad preview records for one or more ad groups

    Fetch ad preview records for one or more ad groups. Returns all active previews associated with the provided ad group IDs. # noqa: E501

    :param ad_group_ids: List of Ad group Ids to use to filter the results.
    :type ad_group_ids: List[str]
    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str

    :rtype: List[CampaignAdPreview]
    """
    return 'do some magic!'
