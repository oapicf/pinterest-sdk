# coding: utf-8

from __future__ import absolute_import

from flask import json
from io import BytesIO

from app.openapi_server.models.error import Error  # noqa: E501
from app.openapi_server.models.granularity import Granularity  # noqa: E501
from app.openapi_server.models.product_group_analytics_response_inner import ProductGroupAnalyticsResponseInner  # noqa: E501
from app.openapi_server.models.product_group_promotion import ProductGroupPromotion  # noqa: E501
from app.openapi_server.models.product_group_promotion_create_request import ProductGroupPromotionCreateRequest  # noqa: E501
from app.openapi_server.models.product_group_promotion_response import ProductGroupPromotionResponse  # noqa: E501
from app.openapi_server.models.product_group_promotion_update_request import ProductGroupPromotionUpdateRequest  # noqa: E501
from app.openapi_server.models.product_group_promotions_list200_response import ProductGroupPromotionsList200Response  # noqa: E501
from app.openapi_server.models.reporting_time_zone import ReportingTimeZone  # noqa: E501
from openapi_server.test import BaseTestCase


class TestProductGroupPromotionsController(BaseTestCase):
    """ProductGroupPromotionsController integration test stubs"""

    def test_product_group_promotions_create(self):
        """Test case for product_group_promotions_create

        Create product group promotions
        """
        body = {"product_group_promotion":[{"slideshow_collections_description":"Description","creative_type":"REGULAR","collections_hero_pin_id":"123123","catalog_product_group_name":"catalogProductGroupName","collections_hero_destination_url":"http://www.pinterest.com","tracking_url":"https://www.pinterest.com","slideshow_collections_title":"Title","is_mdl":True,"status":"ACTIVE"},{"slideshow_collections_description":"Description","creative_type":"REGULAR","collections_hero_pin_id":"123123","catalog_product_group_name":"catalogProductGroupName","collections_hero_destination_url":"http://www.pinterest.com","tracking_url":"https://www.pinterest.com","slideshow_collections_title":"Title","is_mdl":True,"status":"ACTIVE"}],"ad_group_id":"2680059592705"}
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
        query_string = [('product_group_promotion_ids', ['product_group_promotion_ids_example']),
                        ('entity_statuses', ["ACTIVE","PAUSED"]),
                        ('ad_group_id', '123123123'),
                        ('page_size', 25),
                        ('order', 'ASCENDING'),
                        ('bookmark', 'bookmark_example')]
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
        body = {"product_group_promotion":[{"catalog_product_group_id":"1234123","slideshow_collections_description":"Description","creative_type":"REGULAR","collections_hero_pin_id":"123123","catalog_product_group_name":"ProductGroupName","collections_hero_destination_url":"http://www.pinterest.com","tracking_url":"https://www.pinterest.com","slideshow_collections_title":"Title","status":"ACTIVE","id":"2680059592705"},{"catalog_product_group_id":"1231231","slideshow_collections_description":"Other description","creative_type":"REGULAR","collections_hero_pin_id":"123124","catalog_product_group_name":"ProductGroupName","collections_hero_destination_url":"http://www.pinterest.com","tracking_url":"https://www.pinterest.com","slideshow_collections_title":"Title","status":"ACTIVE","id":"2680059592706"}],"ad_group_id":"26823439592705"}
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
                        ('columns', ['columns_example']),
                        ('granularity', openapi_server.Granularity()),
                        ('click_window_days', 30),
                        ('engagement_window_days', 30),
                        ('view_window_days', 1),
                        ('conversion_report_time', TIME_OF_AD_ACTION),
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
