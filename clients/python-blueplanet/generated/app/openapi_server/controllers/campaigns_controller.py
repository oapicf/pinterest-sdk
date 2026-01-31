import connexion

from app.openapi_server.models.ad_pin_analytics import AdPinAnalytics  # noqa: E501
from app.openapi_server.models.ads_analytics_campaign_targeting_type import AdsAnalyticsCampaignTargetingType  # noqa: E501
from app.openapi_server.models.campaign_create_request import CampaignCreateRequest  # noqa: E501
from app.openapi_server.models.campaign_create_response import CampaignCreateResponse  # noqa: E501
from app.openapi_server.models.campaign_response import CampaignResponse  # noqa: E501
from app.openapi_server.models.campaign_update_request import CampaignUpdateRequest  # noqa: E501
from app.openapi_server.models.campaign_update_response import CampaignUpdateResponse  # noqa: E501
from app.openapi_server.models.campaigns_analytics_response_inner import CampaignsAnalyticsResponseInner  # noqa: E501
from app.openapi_server.models.campaigns_list200_response import CampaignsList200Response  # noqa: E501
from app.openapi_server.models.conversion_report_attribution_type import ConversionReportAttributionType  # noqa: E501
from app.openapi_server.models.error import Error  # noqa: E501
from app.openapi_server.models.granularity import Granularity  # noqa: E501
from app.openapi_server.models.metrics_response import MetricsResponse  # noqa: E501
from app.openapi_server.models.reporting_time_zone import ReportingTimeZone  # noqa: E501
from openapi_server import util


def ad_pins_analytics(ad_account_id, campaign_id, pin_ids, start_date, end_date, columns, granularity, click_window_days=None, engagement_window_days=None, view_window_days=None, conversion_report_time=None):  # noqa: E501
    """Get pins analytics

    Get analytics for the pins given a campaign and pins in the specified &lt;code&gt;ad_account_id&lt;/code&gt;, filtered by the specified options. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days. Data will not be provided for conversion metrics but will be available for non-conversion metrics. # noqa: E501

    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str
    :param campaign_id: Campaign Id to use to filter the results.
    :type campaign_id: str
    :param pin_ids: List of Pin IDs.
    :type pin_ids: List[str]
    :param start_date: Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
    :type start_date: str
    :param end_date: Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
    :type end_date: str
    :param columns: Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned
    :type columns: List[str]
    :param granularity: TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly
    :type granularity: dict | bytes
    :param click_window_days: Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.
    :type click_window_days: int
    :param engagement_window_days: Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.&lt;br&gt; &lt;strong&gt;Note:&lt;/strong&gt; This parameter no longer returns new data. However, you can still access historic data through &lt;strong&gt;Sept 30, 2027&lt;/strong&gt;.
    :type engagement_window_days: int
    :param view_window_days: Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day.
    :type view_window_days: int
    :param conversion_report_time: The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
    :type conversion_report_time: str

    :rtype: List[AdPinAnalytics]
    """
    start_date = util.deserialize_date(start_date)
    end_date = util.deserialize_date(end_date)
    if connexion.request.is_json:
        granularity = .from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def campaign_targeting_analytics_get(ad_account_id, campaign_ids, start_date, end_date, targeting_types, columns, granularity, click_window_days=None, engagement_window_days=None, view_window_days=None, conversion_report_time=None, attribution_types=None, reporting_timezone=None):  # noqa: E501
    """Get targeting analytics for campaigns

    Get targeting analytics for one or more campaigns. For the requested account and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \&quot;age_bucket\&quot;) for applicable values (e.g. \&quot;45-49\&quot;). &lt;p/&gt; - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days. # noqa: E501

    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str
    :param campaign_ids: List of Campaign Ids to use to filter the results.
    :type campaign_ids: List[str]
    :param start_date: Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
    :type start_date: str
    :param end_date: Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
    :type end_date: str
    :param targeting_types: Targeting type breakdowns for the report. The reporting per targeting type &lt;br&gt; is independent from each other. [\&quot;AGE_BUCKET_AND_GENDER\&quot;] is in BETA and not yet available to all users.
    :type targeting_types: list | bytes
    :param columns: Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned
    :type columns: List[str]
    :param granularity: TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly
    :type granularity: dict | bytes
    :param click_window_days: Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.
    :type click_window_days: int
    :param engagement_window_days: Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.&lt;br&gt; &lt;strong&gt;Note:&lt;/strong&gt; This parameter no longer returns new data. However, you can still access historic data through &lt;strong&gt;Sept 30, 2027&lt;/strong&gt;.
    :type engagement_window_days: int
    :param view_window_days: Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day.
    :type view_window_days: int
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
        granularity = .from_dict(connexion.request.get_json())  # noqa: E501
    if connexion.request.is_json:
        attribution_types = [ConversionReportAttributionType.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    if connexion.request.is_json:
        reporting_timezone = .from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def campaigns_analytics(ad_account_id, start_date, end_date, campaign_ids, columns, granularity, click_window_days=None, engagement_window_days=None, view_window_days=None, conversion_report_time=None, aggregate_report_rows=None, reporting_timezone=None):  # noqa: E501
    """Get campaign analytics

    Get analytics for the specified campaigns in the specified &lt;code&gt;ad_account_id&lt;/code&gt;, filtered by the specified options. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days. # noqa: E501

    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str
    :param start_date: Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
    :type start_date: str
    :param end_date: Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
    :type end_date: str
    :param campaign_ids: List of Campaign Ids to use to filter the results.
    :type campaign_ids: List[str]
    :param columns: Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned
    :type columns: List[str]
    :param granularity: TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly
    :type granularity: dict | bytes
    :param click_window_days: Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.
    :type click_window_days: int
    :param engagement_window_days: Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.&lt;br&gt; &lt;strong&gt;Note:&lt;/strong&gt; This parameter no longer returns new data. However, you can still access historic data through &lt;strong&gt;Sept 30, 2027&lt;/strong&gt;.
    :type engagement_window_days: int
    :param view_window_days: Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day.
    :type view_window_days: int
    :param conversion_report_time: The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
    :type conversion_report_time: str
    :param aggregate_report_rows: Determines if report rows should be aggregated across all requested entities. This feature is currently in BETA and is not available to all users.
    :type aggregate_report_rows: bool
    :param reporting_timezone: Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users.
    :type reporting_timezone: dict | bytes

    :rtype: List[CampaignsAnalyticsResponseInner]
    """
    start_date = util.deserialize_date(start_date)
    end_date = util.deserialize_date(end_date)
    if connexion.request.is_json:
        granularity = .from_dict(connexion.request.get_json())  # noqa: E501
    if connexion.request.is_json:
        reporting_timezone = .from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def campaigns_create(ad_account_id, body):  # noqa: E501
    """Create campaigns

    Create multiple new campaigns. Every campaign has its own campaign_id and houses one or more ad groups, which contain one or more ads. For more, see &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/set-up-your-campaign/\&quot;&gt;Set up your campaign&lt;/a&gt;. &lt;p/&gt; &lt;strong&gt;Note:&lt;/strong&gt; - The values for &#39;lifetime_spend_cap&#39; and &#39;daily_spend_cap&#39; are microcurrency amounts based on the currency field set in the advertiser&#39;s profile. (e.g. USD) &lt;p/&gt; &lt;p&gt;Microcurrency is used to track very small transactions, based on the currency set in the advertiser’s profile.&lt;/p&gt; &lt;p&gt;A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser’s profile.&lt;/p&gt; &lt;p&gt;&lt;strong&gt;Equivalency equations&lt;/strong&gt;, using dollars as an example currency:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;$1 &#x3D; 1,000,000 microdollars&lt;/li&gt;   &lt;li&gt;1 microdollar &#x3D; $0.000001 &lt;/li&gt; &lt;/ul&gt; &lt;p&gt;&lt;strong&gt;To convert between currency and microcurrency&lt;/strong&gt;, using dollars as an example currency:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;To convert dollars to microdollars, mutiply dollars by 1,000,000&lt;/li&gt;   &lt;li&gt;To convert microdollars to dollars, divide microdollars by 1,000,000&lt;/li&gt; &lt;/ul&gt; # noqa: E501

    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str
    :param body: Array of campaigns.
    :type body: list | bytes

    :rtype: CampaignCreateResponse
    """
    if connexion.request.is_json:
        body = [CampaignCreateRequest.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    return 'do some magic!'


def campaigns_get(ad_account_id, campaign_id):  # noqa: E501
    """Get campaign

    Get a specific campaign given the campaign ID. # noqa: E501

    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str
    :param campaign_id: Campaign ID, must be associated with the ad account ID provided in the path.
    :type campaign_id: str

    :rtype: CampaignResponse
    """
    return 'do some magic!'


def campaigns_list(ad_account_id, campaign_ids=None, entity_statuses=None, page_size=None, order=None, bookmark=None):  # noqa: E501
    """List campaigns

    Get a list of the campaigns in the specified &lt;code&gt;ad_account_id&lt;/code&gt;, filtered by the specified options. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager. # noqa: E501

    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str
    :param campaign_ids: List of Campaign Ids to use to filter the results.
    :type campaign_ids: List[str]
    :param entity_statuses: Entity status
    :type entity_statuses: List[str]
    :param page_size: Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.
    :type page_size: int
    :param order: The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
    :type order: str
    :param bookmark: Cursor used to fetch the next page of items
    :type bookmark: str

    :rtype: CampaignsList200Response
    """
    return 'do some magic!'


def campaigns_update(ad_account_id, body):  # noqa: E501
    """Update campaigns

    &lt;p&gt;Update multiple ad campaigns based on campaign_ids. &lt;/p&gt; &lt;p&gt;&lt;strong&gt;Note:&lt;/strong&gt;&lt;/p&gt; - &lt;p&gt;The values for &#x60;lifetime_spend_cap&#x60; and &#x60;daily_spend_cap&#x60; are microcurrency amounts based on the currency field set in the advertiser&#39;s profile. (e.g. USD) &lt;p/&gt; &lt;p&gt;Microcurrency is used to track very small transactions, based on the currency set in the advertiser&#39;s profile.&lt;/p&gt; &lt;p&gt;A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser&#39;s profile.&lt;/p&gt; &lt;p&gt;&lt;strong&gt;Equivalency equations&lt;/strong&gt;, using dollars as an example currency:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;$1 &#x3D; 1,000,000 microdollars&lt;/li&gt;   &lt;li&gt;1 microdollar &#x3D; $0.000001 &lt;/li&gt; &lt;/ul&gt; &lt;p&gt;&lt;strong&gt;To convert between currency and microcurrency&lt;/strong&gt;, using dollars as an example currency:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;To convert dollars to microdollars, mutiply dollars by 1,000,000&lt;/li&gt;   &lt;li&gt;To convert microdollars to dollars, divide microdollars by 1,000,000&lt;/li&gt; &lt;/ul&gt; # noqa: E501

    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str
    :param body: Array of campaigns.
    :type body: list | bytes

    :rtype: CampaignUpdateResponse
    """
    if connexion.request.is_json:
        body = [CampaignUpdateRequest.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    return 'do some magic!'
