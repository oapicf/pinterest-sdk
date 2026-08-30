import connexion

from app.openapi_server.models.entity_status import EntityStatus  # noqa: E501
from app.openapi_server.models.granularity import Granularity  # noqa: E501
from app.openapi_server.models.pinterest_lib_error import PinterestLibError  # noqa: E501
from app.openapi_server.models.pinterest_lib_pagination_order import PinterestLibPaginationOrder  # noqa: E501
from app.openapi_server.models.product_group_analytics_items import ProductGroupAnalyticsItems  # noqa: E501
from app.openapi_server.models.product_group_promotion import ProductGroupPromotion  # noqa: E501
from app.openapi_server.models.product_group_promotions import ProductGroupPromotions  # noqa: E501
from app.openapi_server.models.product_group_promotions_create import ProductGroupPromotionsCreate  # noqa: E501
from app.openapi_server.models.product_group_promotions_list200_response import ProductGroupPromotionsList200Response  # noqa: E501
from app.openapi_server.models.product_group_promotions_update_with_required_body import ProductGroupPromotionsUpdateWithRequiredBody  # noqa: E501
from app.openapi_server.models.reporting_column_sync import ReportingColumnSync  # noqa: E501
from app.openapi_server.models.reporting_time_zone import ReportingTimeZone  # noqa: E501
from openapi_server import util


def product_group_promotions_create(ad_account_id, body):  # noqa: E501
    """Create product group promotions

    Add one or more product groups from your catalog to an existing ad group. (Product groups added to an ad group are a &#39;product group promotion.&#39;) # noqa: E501

    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str
    :param body: 
    :type body: dict | bytes

    :rtype: ProductGroupPromotions
    """
    if connexion.request.is_json:
        body = ProductGroupPromotionsCreate.from_dict(connexion.request.get_json())  # noqa: E501
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


def product_group_promotions_list(ad_account_id, bookmark=None, page_size=None, order=None, product_group_promotion_ids=None, entity_statuses=None, ad_group_id=None):  # noqa: E501
    """Get product group promotions

    List existing product group promotions associated with an ad account.  Include either ad_group_id or product_group_promotion_ids in your request.  **Note:** ad_group_ids and product_group_promotion_ids are mutually exclusive parameters. Only provide one. If multiple options are provided, product_group_promotion_ids takes precedence over ad_group_ids. If none are provided, the endpoint returns an error. # noqa: E501

    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str
    :param bookmark: Cursor used to fetch the next page of items
    :type bookmark: str
    :param page_size: Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
    :type page_size: int
    :param order: The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items.
    :type order: dict | bytes
    :param product_group_promotion_ids: List of Product group promotion Ids.
    :type product_group_promotion_ids: List[str]
    :param entity_statuses: Entity status
    :type entity_statuses: list | bytes
    :param ad_group_id: Ad group Id.
    :type ad_group_id: str

    :rtype: ProductGroupPromotionsList200Response
    """
    if connexion.request.is_json:
        order = .from_dict(connexion.request.get_json())  # noqa: E501
    if connexion.request.is_json:
        entity_statuses = [EntityStatus.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    return 'do some magic!'


def product_group_promotions_update(ad_account_id, body):  # noqa: E501
    """Update product group promotions

    Update multiple existing Product Group Promotions (by product_group_id) # noqa: E501

    :param ad_account_id: Unique identifier of an ad account.
    :type ad_account_id: str
    :param body: 
    :type body: dict | bytes

    :rtype: ProductGroupPromotions
    """
    if connexion.request.is_json:
        body = ProductGroupPromotionsUpdateWithRequiredBody.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def product_groups_analytics(start_date, end_date, product_group_ids, columns, granularity, ad_account_id, click_window_days=None, engagement_window_days=None, view_window_days=None, conversion_report_time=None, reporting_timezone=None):  # noqa: E501
    """Get product group analytics

    Get analytics for the specified product groups in the specified &#x60;ad_account_id&#x60;, filtered by the specified options.  - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days. # noqa: E501

    :param start_date: Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
    :type start_date: str
    :param end_date: Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
    :type end_date: str
    :param product_group_ids: List of Product group Ids to use to filter the results.
    :type product_group_ids: List[str]
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
    :param reporting_timezone: Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users.
    :type reporting_timezone: dict | bytes

    :rtype: List[ProductGroupAnalyticsItems]
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
