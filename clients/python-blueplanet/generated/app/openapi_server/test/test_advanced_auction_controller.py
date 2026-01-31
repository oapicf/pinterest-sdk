# coding: utf-8

from __future__ import absolute_import

from flask import json
from io import BytesIO

from app.openapi_server.models.advanced_auction_items import AdvancedAuctionItems  # noqa: E501
from app.openapi_server.models.advanced_auction_items_get_request import AdvancedAuctionItemsGetRequest  # noqa: E501
from app.openapi_server.models.advanced_auction_items_submit_request import AdvancedAuctionItemsSubmitRequest  # noqa: E501
from app.openapi_server.models.advanced_auction_processed_items import AdvancedAuctionProcessedItems  # noqa: E501
from app.openapi_server.models.error import Error  # noqa: E501
from openapi_server.test import BaseTestCase


class TestAdvancedAuctionController(BaseTestCase):
    """AdvancedAuctionController integration test stubs"""

    def test_advanced_auction_items_get_post(self):
        """Test case for advanced_auction_items_get_post

        Get item bid options (POST)
        """
        body = {"catalog_id":"2680059592705","items":[{"country":"AD","item_id":"DS0294-M","language":"EN"},{"country":"AD","item_id":"DS0294-M","language":"EN"},{"country":"AD","item_id":"DS0294-M","language":"EN"},{"country":"AD","item_id":"DS0294-M","language":"EN"},{"country":"AD","item_id":"DS0294-M","language":"EN"}]}
        query_string = [('ad_account_id', 'ad_account_id_example')]
        response = self.client.open(
            '/v5/advanced_auction/items/get',
            method='POST',
            data=json.dumps(body),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_advanced_auction_items_submit_post(self):
        """Test case for advanced_auction_items_submit_post

        Operate on item level bid options
        """
        body = {"catalog_id":"2680059592705","items":[{"operation":"UPSERT"},{"operation":"UPSERT"},{"operation":"UPSERT"},{"operation":"UPSERT"},{"operation":"UPSERT"}]}
        query_string = [('ad_account_id', 'ad_account_id_example')]
        response = self.client.open(
            '/v5/advanced_auction/items/submit',
            method='POST',
            data=json.dumps(body),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
