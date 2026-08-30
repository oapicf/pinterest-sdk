# coding: utf-8

from __future__ import absolute_import

from flask import json
from io import BytesIO

from app.openapi_server.models.conversion_deletion_request import ConversionDeletionRequest  # noqa: E501
from app.openapi_server.models.conversion_deletion_request_create import ConversionDeletionRequestCreate  # noqa: E501
from app.openapi_server.models.conversion_deletion_request_list200_response import ConversionDeletionRequestList200Response  # noqa: E501
from app.openapi_server.models.pinterest_lib_error import PinterestLibError  # noqa: E501
from app.openapi_server.models.pinterest_lib_pagination_order import PinterestLibPaginationOrder  # noqa: E501
from openapi_server.test import BaseTestCase


class TestConversionDeletionRequestsController(BaseTestCase):
    """ConversionDeletionRequestsController integration test stubs"""

    def test_conversion_deletion_request_create(self):
        """Test case for conversion_deletion_request_create

        Create a conversion deletion request
        """
        body = {"deletion_targets":""}
        response = self.client.open(
            '/v5/ad_accounts/{ad_account_id}/conversion_deletion_requests'.format(ad_account_id='ad_account_id_example'),
            method='POST',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_conversion_deletion_request_delete(self):
        """Test case for conversion_deletion_request_delete

        Delete a conversion deletion request
        """
        response = self.client.open(
            '/v5/ad_accounts/{ad_account_id}/conversion_deletion_requests/{request_id}'.format(request_id='request_id_example', ad_account_id='ad_account_id_example'),
            method='DELETE')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_conversion_deletion_request_get(self):
        """Test case for conversion_deletion_request_get

        Get a single conversion deletion request
        """
        response = self.client.open(
            '/v5/ad_accounts/{ad_account_id}/conversion_deletion_requests/{request_id}'.format(request_id='request_id_example', ad_account_id='ad_account_id_example'),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_conversion_deletion_request_list(self):
        """Test case for conversion_deletion_request_list

        List conversion deletion requests
        """
        query_string = [('bookmark', 'bookmark_example'),
                        ('page_size', 25),
                        ('order', openapi_server.PinterestLibPaginationOrder())]
        response = self.client.open(
            '/v5/ad_accounts/{ad_account_id}/conversion_deletion_requests'.format(ad_account_id='ad_account_id_example'),
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
