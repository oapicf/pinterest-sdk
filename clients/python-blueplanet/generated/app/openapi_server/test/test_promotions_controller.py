# coding: utf-8

from __future__ import absolute_import

from flask import json
from io import BytesIO

from app.openapi_server.models.error import Error  # noqa: E501
from app.openapi_server.models.promotion_create_request import PromotionCreateRequest  # noqa: E501
from app.openapi_server.models.promotion_response import PromotionResponse  # noqa: E501
from app.openapi_server.models.promotion_update_request import PromotionUpdateRequest  # noqa: E501
from app.openapi_server.models.promotions_list200_response import PromotionsList200Response  # noqa: E501
from app.openapi_server.models.promotions_response import PromotionsResponse  # noqa: E501
from openapi_server.test import BaseTestCase


class TestPromotionsController(BaseTestCase):
    """PromotionsController integration test stubs"""

    def test_promotions_create(self):
        """Test case for promotions_create

        Create promotions
        """
        body = {"promotion_type":"VARIABLE","start_time":1677003860,"promotion_custom_id":"freeshipping_2025","discount_status":"ACTIVE","platform_type":"DEFAULT","promotion_title":"Black Friday 10% off","promotion_code":"blackfriday10","end_time":1678003860,"external_id":"abc","template_values":[{"amount":100,"custom_text":"My promotion","percent":10,"currency_code":"UNK"},{"amount":100,"custom_text":"My promotion","percent":10,"currency_code":"UNK"}]}
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
            '/v5/ad_accounts/{ad_account_id}/promotions/{promotion_id}'.format(ad_account_id='ad_account_id_example', promotion_id='promotion_id_example'),
            method='DELETE')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_promotions_get(self):
        """Test case for promotions_get

        Get promotion by id
        """
        response = self.client.open(
            '/v5/ad_accounts/{ad_account_id}/promotions/{promotion_id}'.format(ad_account_id='ad_account_id_example', promotion_id='promotion_id_example'),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_promotions_list(self):
        """Test case for promotions_list

        Get promotions
        """
        query_string = [('page_size', 25),
                        ('order', 'ASCENDING'),
                        ('bookmark', 'bookmark_example')]
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
        body = {"promotion_type":"VARIABLE","start_time":1677003860,"promotion_custom_id":"freeshipping_2025","discount_status":"ACTIVE","platform_type":"DEFAULT","promotion_title":"Black Friday 10% off","promotion_code":"blackfriday10","end_time":1678003860,"external_id":"abc","template_values":[{"amount":100,"custom_text":"My promotion","percent":10,"currency_code":"UNK"},{"amount":100,"custom_text":"My promotion","percent":10,"currency_code":"UNK"}],"id":"7834020347906","status":"ACTIVE"}
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
