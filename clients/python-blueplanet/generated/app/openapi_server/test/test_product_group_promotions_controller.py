# coding: utf-8

from __future__ import absolute_import

from flask import json
from io import BytesIO

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
from openapi_server.test import BaseTestCase


class TestProductGroupPromotionsController(BaseTestCase):
    """ProductGroupPromotionsController integration test stubs"""

    def test_product_group_promotions_create(self):
        """Test case for product_group_promotions_create

        Create product group promotions
        """
        body = {"ad_group_id":"2680059592705","product_group_promotion":[{"slideshow_collections_description":"Description","creative_type":"REGULAR","collections_hero_pin_id":"123123","catalog_product_group_name":"catalogProductGroupName to create","collections_hero_destination_url":"http://www.pinterest.com","tracking_url":"https://www.pinterest.com","slideshow_collections_title":"Title","status":"ACTIVE","is_mdl":True},{"id":"2680059592705","catalog_product_group_id":"1234123","slideshow_collections_description":"Description","creative_type":"REGULAR","collections_hero_pin_id":"123123","catalog_product_group_name":"catalogProductGroupName to update","collections_hero_destination_url":"http://www.pinterest.com","tracking_url":"https://www.pinterest.com","slideshow_collections_title":"Title","status":"ACTIVE"}]}
        response = self.client.open(
            '/v5/ad_accounts/{ad_account_id}/product_group_promotions'.format(ad_account_id='ad_account_id_example'),
            method='POST',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_product_group_promotions_get(self):
        """Test case for product_group_promotions_get

        Get a product group promotion by id
        """
        response = self.client.open(
            '/v5/ad_accounts/{ad_account_id}/product_group_promotions/{product_group_promotion_id}'.format(ad_account_id='ad_account_id_example', product_group_promotion_id='product_group_promotion_id_example'),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_product_group_promotions_list(self):
        """Test case for product_group_promotions_list

        Get product group promotions
        """
        query_string = [('bookmark', 'bookmark_example'),
                        ('page_size', 25),
                        ('order', openapi_server.PinterestLibPaginationOrder()),
                        ('product_group_promotion_ids', ['product_group_promotion_ids_example']),
                        ('entity_statuses', ["ACTIVE","PAUSED"]),
                        ('ad_group_id', 'ad_group_id_example')]
        response = self.client.open(
            '/v5/ad_accounts/{ad_account_id}/product_group_promotions'.format(ad_account_id='ad_account_id_example'),
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_product_group_promotions_update(self):
        """Test case for product_group_promotions_update

        Update product group promotions
        """
        body = {"ad_group_id":"2680059592705","product_group_promotion":[{"slideshow_collections_description":"Description","creative_type":"REGULAR","collections_hero_pin_id":"123123","catalog_product_group_name":"catalogProductGroupName to create","collections_hero_destination_url":"http://www.pinterest.com","tracking_url":"https://www.pinterest.com","slideshow_collections_title":"Title","status":"ACTIVE","is_mdl":True},{"id":"2680059592705","catalog_product_group_id":"1234123","slideshow_collections_description":"Description","creative_type":"REGULAR","collections_hero_pin_id":"123123","catalog_product_group_name":"catalogProductGroupName to update","collections_hero_destination_url":"http://www.pinterest.com","tracking_url":"https://www.pinterest.com","slideshow_collections_title":"Title","status":"ACTIVE"}]}
        response = self.client.open(
            '/v5/ad_accounts/{ad_account_id}/product_group_promotions'.format(ad_account_id='ad_account_id_example'),
            method='PATCH',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_product_groups_analytics(self):
        """Test case for product_groups_analytics

        Get product group analytics
        """
        query_string = [('start_date', '2013-10-20'),
                        ('end_date', '2013-10-20'),
                        ('product_group_ids', ['product_group_ids_example']),
                        ('columns', [openapi_server.ReportingColumnSync()]),
                        ('granularity', openapi_server.Granularity()),
                        ('click_window_days', 30),
                        ('engagement_window_days', 30),
                        ('view_window_days', 1),
                        ('conversion_report_time', 'TIME_OF_AD_ACTION'),
                        ('reporting_timezone', openapi_server.ReportingTimeZone())]
        response = self.client.open(
            '/v5/ad_accounts/{ad_account_id}/product_groups/analytics'.format(ad_account_id='ad_account_id_example'),
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
