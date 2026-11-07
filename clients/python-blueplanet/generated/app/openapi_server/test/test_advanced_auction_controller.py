# coding: utf-8

from __future__ import absolute_import

from flask import json
from io import BytesIO

from app.openapi_server.models.advanced_auction_items import AdvancedAuctionItems  # noqa: E501
from app.openapi_server.models.advanced_auction_items_get_request import AdvancedAuctionItemsGetRequest  # noqa: E501
from app.openapi_server.models.advanced_auction_items_submit_request import AdvancedAuctionItemsSubmitRequest  # noqa: E501
from app.openapi_server.models.advanced_auction_processed_items import AdvancedAuctionProcessedItems  # noqa: E501
from app.openapi_server.models.pinterest_lib_error import PinterestLibError  # noqa: E501
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
        body = {"catalog_id":"2680059592705","items":[{"item_id":"DS0294-M","country":"US","language":"EN","operation":"UPSERT","bid_options":{"bid_in_micro_currency":5000000,"app_type_multipliers":{"android_mobile":1.1,"android_tablet":1.1,"ipad":1.2,"iphone":1.2,"web":0.9,"web_mobile":0.8}},"update_mask":["BID","APP_TYPE_BID_MULTIPLIER_SET"],"errors":[{"code":6,"message":"Bid in micro currency should be non-negative"}]},{"item_id":"DS0294-M","country":"US","language":"EN","operation":"UPSERT","bid_options":{"bid_in_micro_currency":5000000,"app_type_multipliers":{"android_mobile":1.1,"android_tablet":1.1,"ipad":1.2,"iphone":1.2,"web":0.9,"web_mobile":0.8}},"update_mask":["BID","APP_TYPE_BID_MULTIPLIER_SET"],"errors":[{"code":6,"message":"Bid in micro currency should be non-negative"}]},{"item_id":"DS0294-M","country":"US","language":"EN","operation":"UPSERT","bid_options":{"bid_in_micro_currency":5000000,"app_type_multipliers":{"android_mobile":1.1,"android_tablet":1.1,"ipad":1.2,"iphone":1.2,"web":0.9,"web_mobile":0.8}},"update_mask":["BID","APP_TYPE_BID_MULTIPLIER_SET"],"errors":[{"code":6,"message":"Bid in micro currency should be non-negative"}]},{"item_id":"DS0294-M","country":"US","language":"EN","operation":"UPSERT","bid_options":{"bid_in_micro_currency":5000000,"app_type_multipliers":{"android_mobile":1.1,"android_tablet":1.1,"ipad":1.2,"iphone":1.2,"web":0.9,"web_mobile":0.8}},"update_mask":["BID","APP_TYPE_BID_MULTIPLIER_SET"],"errors":[{"code":6,"message":"Bid in micro currency should be non-negative"}]},{"item_id":"DS0294-M","country":"US","language":"EN","operation":"UPSERT","bid_options":{"bid_in_micro_currency":5000000,"app_type_multipliers":{"android_mobile":1.1,"android_tablet":1.1,"ipad":1.2,"iphone":1.2,"web":0.9,"web_mobile":0.8}},"update_mask":["BID","APP_TYPE_BID_MULTIPLIER_SET"],"errors":[{"code":6,"message":"Bid in micro currency should be non-negative"}]}]}
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
