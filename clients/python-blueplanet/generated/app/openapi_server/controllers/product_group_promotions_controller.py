import connexion

from app.openapi_server.models.error import Error  # noqa: E501
from app.openapi_server.models.granularity import Granularity  # noqa: E501
from app.openapi_server.models.product_group_analytics_response_inner import ProductGroupAnalyticsResponseInner  # noqa: E501
from app.openapi_server.models.product_group_promotion import ProductGroupPromotion  # noqa: E501
from app.openapi_server.models.product_group_promotion_create_request import ProductGroupPromotionCreateRequest  # noqa: E501
from app.openapi_server.models.product_group_promotion_response import ProductGroupPromotionResponse  # noqa: E501
from app.openapi_server.models.product_group_promotion_update_request import ProductGroupPromotionUpdateRequest  # noqa: E501
from app.openapi_server.models.product_group_promotions_list200_response import ProductGroupPromotionsList200Response  # noqa: E501
from app.openapi_server.models.reporting_time_zone import ReportingTimeZone  # noqa: E501
from openapi_server import util


def product_group_promotions_create(ad_account_id, body):  # noqa: E501
    """Create product group promotions

    Add one or more product groups from your catalog to an existing ad group. (Product groups added to an ad group are a &#39;product group promotion.&#39;) # noqa: E501

    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str
    :param body: List of Product Group Promotions to create, size limit [1, 30].
    :type body: dict | bytes

    :rtype: ProductGroupPromotionResponse
    """
    if connexion.request.is_json:
        body = ProductGroupPromotionCreateRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def product_group_promotions_get(ad_account_id, product_group_promotion_id):  # noqa: E501
    """Get a product group promotion by id

    Get a product group promotion by id # noqa: E501

    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str
    :param product_group_promotion_id: Unique identifier of a product group promotion
    :type product_group_promotion_id: str

    :rtype: ProductGroupPromotion
    """
    return 'do some magic!'


def product_group_promotions_list(ad_account_id, product_group_promotion_ids=None, entity_statuses=None, ad_group_id=None, page_size=None, order=None, bookmark=None):  # noqa: E501
    """Get product group promotions

    List existing product group promotions associated with an ad account.  Include either ad_group_id or product_group_promotion_ids in your request.  &lt;b&gt;Note:&lt;/b&gt; ad_group_ids and product_group_promotion_ids are mutually exclusive parameters. Only provide one. If multiple options are provided, product_group_promotion_ids takes precedence over ad_group_ids. If none are provided, the endpoint returns an error. # noqa: E501

    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str
    :param product_group_promotion_ids: List of Product group promotion Ids.
    :type product_group_promotion_ids: List[str]
    :param entity_statuses: Entity status
    :type entity_statuses: List[str]
    :param ad_group_id: Ad group Id.
    :type ad_group_id: str
    :param page_size: Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.
    :type page_size: int
    :param order: The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
    :type order: str
    :param bookmark: Cursor used to fetch the next page of items
    :type bookmark: str

    :rtype: ProductGroupPromotionsList200Response
    """
    return 'do some magic!'


def product_group_promotions_update(ad_account_id, body):  # noqa: E501
    """Update product group promotions

    Update multiple existing Product Group Promotions (by product_group_id) # noqa: E501

    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str
    :param body: Parameters to update Product group promotions
    :type body: dict | bytes

    :rtype: ProductGroupPromotionResponse
    """
    if connexion.request.is_json:
        body = ProductGroupPromotionUpdateRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def product_groups_analytics(ad_account_id, start_date, end_date, product_group_ids, columns, granularity, click_window_days=None, engagement_window_days=None, view_window_days=None, conversion_report_time=None, reporting_timezone=None):  # noqa: E501
    """Get product group analytics

    Get analytics for the specified product groups in the specified &lt;code&gt;ad_account_id&lt;/code&gt;, filtered by the specified options. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager.   - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days. # noqa: E501

    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str
    :param start_date: Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
    :type start_date: str
    :param end_date: Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
    :type end_date: str
    :param product_group_ids: List of Product group Ids to use to filter the results.
    :type product_group_ids: List[str]
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
    :param reporting_timezone: Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users.
    :type reporting_timezone: dict | bytes

    :rtype: List[ProductGroupAnalyticsResponseInner]
    """
    start_date = util.deserialize_date(start_date)
    end_date = util.deserialize_date(end_date)
    if connexion.request.is_json:
        granularity = .from_dict(connexion.request.get_json())  # noqa: E501
    if connexion.request.is_json:
        reporting_timezone = .from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
