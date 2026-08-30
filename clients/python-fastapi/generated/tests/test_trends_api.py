# coding: utf-8

from fastapi.testclient import TestClient


from pydantic import Field  # noqa: F401
from typing import List, Optional  # noqa: F401
from typing_extensions import Annotated  # noqa: F401
from openapi_server.models.age_trends_bucket import AgeTrendsBucket  # noqa: F401
from openapi_server.models.featured_trend import FeaturedTrend  # noqa: F401
from openapi_server.models.gender_bucket import GenderBucket  # noqa: F401
from openapi_server.models.interests_enum import InterestsEnum  # noqa: F401
from openapi_server.models.pinterest_lib_error import PinterestLibError  # noqa: F401
from openapi_server.models.product_categories_engagement_type import ProductCategoriesEngagementType  # noqa: F401
from openapi_server.models.product_category_detail_lookback_window import ProductCategoryDetailLookbackWindow  # noqa: F401
from openapi_server.models.product_category_details import ProductCategoryDetails  # noqa: F401
from openapi_server.models.product_category_enum import ProductCategoryEnum  # noqa: F401
from openapi_server.models.product_category_region import ProductCategoryRegion  # noqa: F401
from openapi_server.models.trending_product_category import TrendingProductCategory  # noqa: F401
from openapi_server.models.trends_editorial import TrendsEditorial  # noqa: F401
from openapi_server.models.vertical_product_category import VerticalProductCategory  # noqa: F401


def test_trends_editorial_articles_list(client: TestClient):
    """Test case for trends_editorial_articles_list

    Returns editorial articles for a given region
    """
    params = [("region", openapi_server.ProductCategoryRegion())]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/trends/editorial_articles",
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_trends_product_categories_details_list(client: TestClient):
    """Test case for trends_product_categories_details_list

    Get product category details
    """
    params = [("product_categories", [openapi_server.ProductCategoryEnum()]),     ("region", openapi_server.ProductCategoryRegion()),     ("lookback_window", openapi_server.ProductCategoryDetailLookbackWindow()),     ("engagement_type", openapi_server.ProductCategoriesEngagementType())]
    headers = {
        "Authorization": "Bearer special-key",
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/trends/product_categories/details",
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_trends_product_categories_trending_list(client: TestClient):
    """Test case for trends_product_categories_trending_list

    Get a list of growing Shopping Product Categories
    """
    params = [("region", openapi_server.ProductCategoryRegion()),     ("verticals", [openapi_server.VerticalProductCategory()]),     ("ages", [openapi_server.AgeTrendsBucket()]),     ("genders", [openapi_server.GenderBucket()]),     ("engagement_type", openapi_server.ProductCategoriesEngagementType())]
    headers = {
        "Authorization": "Bearer special-key",
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/trends/product_categories/trending",
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_trends_featured_topics_list(client: TestClient):
    """Test case for trends_featured_topics_list

    Get featured topics
    """
    params = [("interest", openapi_server.InterestsEnum()),     ("region", openapi_server.ProductCategoryRegion())]
    headers = {
        "Authorization": "Bearer special-key",
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/trends/topics/featured",
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200

