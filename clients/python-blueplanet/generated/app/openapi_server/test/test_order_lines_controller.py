# coding: utf-8

from __future__ import absolute_import

from flask import json
from io import BytesIO

from app.openapi_server.models.error import Error  # noqa: E501
from app.openapi_server.models.order_line import OrderLine  # noqa: E501
from app.openapi_server.models.order_lines_list200_response import OrderLinesList200Response  # noqa: E501
from openapi_server.test import BaseTestCase


class TestOrderLinesController(BaseTestCase):
    """OrderLinesController integration test stubs"""

    def test_order_lines_get(self):
        """Test case for order_lines_get

        Get order line
        """
        response = self.client.open(
            '/v5/ad_accounts/{ad_account_id}/order_lines/{order_line_id}'.format(ad_account_id='ad_account_id_example', order_line_id='order_line_id_example'),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_order_lines_list(self):
        """Test case for order_lines_list

        Get order lines
        """
        query_string = [('page_size', 25),
                        ('order', 'ASCENDING'),
                        ('bookmark', 'bookmark_example')]
        response = self.client.open(
            '/v5/ad_accounts/{ad_account_id}/order_lines'.format(ad_account_id='ad_account_id_example'),
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
