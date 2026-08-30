import connexion

from app.openapi_server.models.age_trends_bucket import AgeTrendsBucket  # noqa: E501
from app.openapi_server.models.featured_trend import FeaturedTrend  # noqa: E501
from app.openapi_server.models.gender_bucket import GenderBucket  # noqa: E501
from app.openapi_server.models.interests_enum import InterestsEnum  # noqa: E501
from app.openapi_server.models.pinterest_lib_error import PinterestLibError  # noqa: E501
from app.openapi_server.models.product_categories_engagement_type import ProductCategoriesEngagementType  # noqa: E501
from app.openapi_server.models.product_category_detail_lookback_window import ProductCategoryDetailLookbackWindow  # noqa: E501
from app.openapi_server.models.product_category_details import ProductCategoryDetails  # noqa: E501
from app.openapi_server.models.product_category_enum import ProductCategoryEnum  # noqa: E501
from app.openapi_server.models.product_category_region import ProductCategoryRegion  # noqa: E501
from app.openapi_server.models.trending_product_category import TrendingProductCategory  # noqa: E501
from app.openapi_server.models.trends_editorial import TrendsEditorial  # noqa: E501
from app.openapi_server.models.vertical_product_category import VerticalProductCategory  # noqa: E501
from openapi_server import util


def trends_editorial_articles_list(region):  # noqa: E501
    """Returns editorial articles for a given region

      Get a list of published editorial articles. Translations of the editorials will be provided if available; otherwise, the default language will be English. # noqa: E501

    :param region:      The geographic region of interest. Only top product categories within the specified region will be returned.      The &#x60;region&#x60; parameter is formatted as ISO 3166-2 country codes delimited by &#x60;+&#x60;.      - &#x60;US&#x60; - United States     - &#x60;GB+IE&#x60; - Great Britain &amp; Ireland     - &#x60;CA&#x60; - Canada
    :type region: dict | bytes

    :rtype: List[TrendsEditorial]
    """
    if connexion.request.is_json:
        region = .from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def trends_featured_topics_list(region, interest=None):  # noqa: E501
    """Get featured topics

      Enables advertisers to pull top five trending topics by interest and market, at full parity with the Pinterest Trends UI. # noqa: E501

    :param region:      The geographic region of interest. Only top product categories within the specified region will be returned.      The &#x60;region&#x60; parameter is formatted as ISO 3166-2 country codes delimited by &#x60;+&#x60;.      - &#x60;US&#x60; - United States     - &#x60;GB+IE&#x60; - Great Britain &amp; Ireland     - &#x60;CA&#x60; - Canada
    :type region: dict | bytes
    :param interest: Interest to filter by
    :type interest: dict | bytes

    :rtype: List[FeaturedTrend]
    """
    if connexion.request.is_json:
        region = .from_dict(connexion.request.get_json())  # noqa: E501
    if connexion.request.is_json:
        interest = .from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def trends_product_categories_details_list(product_categories, region, lookback_window=None, engagement_type=None):  # noqa: E501
    """Get product category details

      Enables advertisers to retrieve demographic information, related pins, and trend lines for specified product categories # noqa: E501

    :param product_categories: List of product categories
    :type product_categories: list | bytes
    :param region:      The geographic region of interest. Only top product categories within the specified region will be returned.      The &#x60;region&#x60; parameter is formatted as ISO 3166-2 country codes delimited by &#x60;+&#x60;.      - &#x60;US&#x60; - United States     - &#x60;GB+IE&#x60; - Great Britain &amp; Ireland     - &#x60;CA&#x60; - Canada
    :type region: dict | bytes
    :param lookback_window:   Time period for historical data analysis in days. The lookback window defines how far back in time the API will analyze data to compute trend metrics.   - &#x60;90&#x60; - Last 90 days (3 months)   - &#x60;180&#x60; - Last 180 days (6 months)   - &#x60;365&#x60; - Last 365 days (1 year)   - &#x60;730&#x60; - Last 730 days (2 years)
    :type lookback_window: dict | bytes
    :param engagement_type:     Type of engagement metric to analyze. - &#x60;ENGAGEMENT&#x60; - Overall engagement metric - &#x60;OUTBOUND_CLICK&#x60; - Number of outbound clicks - &#x60;SAVE&#x60; - Number of pin saves
    :type engagement_type: dict | bytes

    :rtype: List[ProductCategoryDetails]
    """
    if connexion.request.is_json:
        product_categories = [ProductCategoryEnum.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    if connexion.request.is_json:
        region = .from_dict(connexion.request.get_json())  # noqa: E501
    if connexion.request.is_json:
        lookback_window = .from_dict(connexion.request.get_json())  # noqa: E501
    if connexion.request.is_json:
        engagement_type = .from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def trends_product_categories_trending_list(region, verticals=None, ages=None, genders=None, engagement_type=None):  # noqa: E501
    """Get a list of growing Shopping Product Categories

      Get a list of growing Shopping Product Categories in ranked order allowing filtering by engagement type, vertical, age, and gender. # noqa: E501

    :param region:      The geographic region of interest. Only top product categories within the specified region will be returned.      The &#x60;region&#x60; parameter is formatted as ISO 3166-2 country codes delimited by &#x60;+&#x60;.      - &#x60;US&#x60; - United States     - &#x60;GB+IE&#x60; - Great Britain &amp; Ireland     - &#x60;CA&#x60; - Canada
    :type region: dict | bytes
    :param verticals: List of verticals to filter by
    :type verticals: list | bytes
    :param ages: Age to filter by. If not provided, the results will be filtered by all ages.
    :type ages: list | bytes
    :param genders: Gender to filter by, If not provided, the results will be filtered by all genders.
    :type genders: list | bytes
    :param engagement_type:     Type of engagement metric to analyze. - &#x60;ENGAGEMENT&#x60; - Overall engagement metric - &#x60;OUTBOUND_CLICK&#x60; - Number of outbound clicks - &#x60;SAVE&#x60; - Number of pin saves
    :type engagement_type: dict | bytes

    :rtype: List[TrendingProductCategory]
    """
    if connexion.request.is_json:
        region = .from_dict(connexion.request.get_json())  # noqa: E501
    if connexion.request.is_json:
        verticals = [VerticalProductCategory.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    if connexion.request.is_json:
        ages = [AgeTrendsBucket.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    if connexion.request.is_json:
        genders = [GenderBucket.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    if connexion.request.is_json:
        engagement_type = .from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
