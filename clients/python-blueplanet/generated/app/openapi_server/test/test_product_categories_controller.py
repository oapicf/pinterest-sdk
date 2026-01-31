# coding: utf-8

from __future__ import absolute_import

from flask import json
from io import BytesIO

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
from app.openapi_server.models.vertical_product_category import VerticalProductCategory  # noqa: E501
from openapi_server.test import BaseTestCase


class TestProductCategoriesController(BaseTestCase):
    """ProductCategoriesController integration test stubs"""

    def test_trends_featured_topics_list(self):
        """Test case for trends_featured_topics_list

        Get featured topics
        """
        query_string = [('interest', openapi_server.InterestsEnum()),
                        ('region', openapi_server.ProductCategoryRegion())]
        response = self.client.open(
            '/v5/trends/topics/featured',
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_trends_product_categories_details_list(self):
        """Test case for trends_product_categories_details_list

        Get product category details
        """
        query_string = [('product_categories', [openapi_server.ProductCategoryEnum()]),
                        ('region', openapi_server.ProductCategoryRegion()),
                        ('lookback_window', openapi_server.ProductCategoryDetailLookbackWindow()),
                        ('engagement_type', openapi_server.ProductCategoriesEngagementType())]
        response = self.client.open(
            '/v5/trends/product_categories/details',
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_trends_product_categories_trending_list(self):
        """Test case for trends_product_categories_trending_list

        Get a list of growing Shopping Product Categories
        """
        query_string = [('region', openapi_server.ProductCategoryRegion()),
                        ('verticals', [openapi_server.VerticalProductCategory()]),
                        ('ages', [openapi_server.AgeTrendsBucket()]),
                        ('genders', [openapi_server.GenderBucket()]),
                        ('engagement_type', openapi_server.ProductCategoriesEngagementType())]
        response = self.client.open(
            '/v5/trends/product_categories/trending',
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
