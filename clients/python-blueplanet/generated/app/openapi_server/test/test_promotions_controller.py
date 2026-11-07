# coding: utf-8

from __future__ import absolute_import

from flask import json
from io import BytesIO

from app.openapi_server.models.pinterest_lib_error import PinterestLibError  # noqa: E501
from app.openapi_server.models.pinterest_lib_pagination_order import PinterestLibPaginationOrder  # noqa: E501
from app.openapi_server.models.promotion import Promotion  # noqa: E501
from app.openapi_server.models.promotion_batch_update import PromotionBatchUpdate  # noqa: E501
from app.openapi_server.models.promotion_create import PromotionCreate  # noqa: E501
from app.openapi_server.models.promotions_list200_response import PromotionsList200Response  # noqa: E501
from app.openapi_server.models.promotions_response import PromotionsResponse  # noqa: E501
from openapi_server.test import BaseTestCase


class TestPromotionsController(BaseTestCase):
    """PromotionsController integration test stubs"""

    def test_promotions_create(self):
        """Test case for promotions_create

        Create promotions
        """
        body = {"discount_status":"OTHER","end_time":0,"external_id":"external_id","platform_type":"platform_type","promotion_code":"promotion_code","promotion_custom_id":"promotion_custom_id","promotion_title":"promotion_title","promotion_type":"VARIABLE","start_time":6,"template_values":[{"amount":100,"currency_code":"UNK","custom_text":"My promotion","percent":10},{"amount":100,"currency_code":"UNK","custom_text":"My promotion","percent":10}]}
        response = self.client.open(
            '/v5/ad_accounts/{ad_account_id}/promotions'.format(ad_account_id='ad_account_id_example'),
            method='POST',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_promotions_delete(self):
        """Test case for promotions_delete

        Delete promotion by id
        """
        response = self.client.open(
            '/v5/ad_accounts/{ad_account_id}/promotions/{promotion_id}'.format(promotion_id='promotion_id_example', ad_account_id='ad_account_id_example'),
            method='DELETE')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_promotions_get(self):
        """Test case for promotions_get

        Get promotion by id
        """
        response = self.client.open(
            '/v5/ad_accounts/{ad_account_id}/promotions/{promotion_id}'.format(promotion_id='promotion_id_example', ad_account_id='ad_account_id_example'),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_promotions_list(self):
        """Test case for promotions_list

        Get promotions
        """
        query_string = [('bookmark', 'bookmark_example'),
                        ('page_size', 25),
                        ('order', openapi_server.PinterestLibPaginationOrder())]
        response = self.client.open(
            '/v5/ad_accounts/{ad_account_id}/promotions'.format(ad_account_id='ad_account_id_example'),
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_promotions_update(self):
        """Test case for promotions_update

        Update promotions
        """
        body = {"discount_status":"OTHER","end_time":0,"external_id":"external_id","id":"id","platform_type":"platform_type","promotion_code":"promotion_code","promotion_custom_id":"promotion_custom_id","promotion_title":"promotion_title","promotion_type":"VARIABLE","start_time":6,"template_values":[{"amount":100,"currency_code":"UNK","custom_text":"My promotion","percent":10},{"amount":100,"currency_code":"UNK","custom_text":"My promotion","percent":10}]}
        response = self.client.open(
            '/v5/ad_accounts/{ad_account_id}/promotions'.format(ad_account_id='ad_account_id_example'),
            method='PATCH',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
