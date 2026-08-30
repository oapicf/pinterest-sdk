# coding: utf-8

from __future__ import absolute_import

from flask import json
from io import BytesIO

from app.openapi_server.models.customer_segment import CustomerSegment  # noqa: E501
from app.openapi_server.models.customer_segment_create import CustomerSegmentCreate  # noqa: E501
from app.openapi_server.models.customer_segment_list200_response import CustomerSegmentList200Response  # noqa: E501
from app.openapi_server.models.customer_segment_update_request_update_with_required_body import CustomerSegmentUpdateRequestUpdateWithRequiredBody  # noqa: E501
from app.openapi_server.models.pinterest_lib_error import PinterestLibError  # noqa: E501
from app.openapi_server.models.pinterest_lib_pagination_order import PinterestLibPaginationOrder  # noqa: E501
from openapi_server.test import BaseTestCase


class TestCustomerSegmentController(BaseTestCase):
    """CustomerSegmentController integration test stubs"""

    def test_customer_segment_create(self):
        """Test case for customer_segment_create

        Create customer segments
        """
        body = {"audience_ids":["audience_ids","audience_ids"],"name":"name"}
        response = self.client.open(
            '/v5/ad_accounts/{ad_account_id}/customer_segments'.format(ad_account_id='ad_account_id_example'),
            method='POST',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_customer_segment_list(self):
        """Test case for customer_segment_list

        List customer segments
        """
        query_string = [('bookmark', 'bookmark_example'),
                        ('page_size', 25),
                        ('order', openapi_server.PinterestLibPaginationOrder()),
                        ('include_sizing', False),
                        ('search_query', 'search_query_example')]
        response = self.client.open(
            '/v5/ad_accounts/{ad_account_id}/customer_segments'.format(ad_account_id='ad_account_id_example'),
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_customer_segment_update(self):
        """Test case for customer_segment_update

        Update customer segments
        """
        body = {"audience_ids":["audience_ids","audience_ids"],"id":"id","operation_type":"UPDATE"}
        response = self.client.open(
            '/v5/ad_accounts/{ad_account_id}/customer_segments'.format(ad_account_id='ad_account_id_example'),
            method='PATCH',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
