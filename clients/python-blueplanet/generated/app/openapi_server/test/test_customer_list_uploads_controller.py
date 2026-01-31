# coding: utf-8

from __future__ import absolute_import

from flask import json
from io import BytesIO

from app.openapi_server.models.customer_list_upload_create_request import CustomerListUploadCreateRequest  # noqa: E501
from app.openapi_server.models.customer_list_upload_create_response import CustomerListUploadCreateResponse  # noqa: E501
from app.openapi_server.models.customer_list_upload_response import CustomerListUploadResponse  # noqa: E501
from app.openapi_server.models.error import Error  # noqa: E501
from openapi_server.test import BaseTestCase


class TestCustomerListUploadsController(BaseTestCase):
    """CustomerListUploadsController integration test stubs"""

    def test_customer_list_uploads_create(self):
        """Test case for customer_list_uploads_create

        Create customer list upload
        """
        body = {"total_parts":2,"operation":"operation"}
        response = self.client.open(
            '/v5/ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads'.format(ad_account_id='ad_account_id_example', customer_list_id='customer_list_id_example'),
            method='POST',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_customer_list_uploads_get(self):
        """Test case for customer_list_uploads_get

        Get customer list upload
        """
        response = self.client.open(
            '/v5/ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads/{customer_list_upload_id}'.format(ad_account_id='ad_account_id_example', customer_list_id='customer_list_id_example', customer_list_upload_id='customer_list_upload_id_example'),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_customer_list_uploads_run(self):
        """Test case for customer_list_uploads_run

        Run customer list upload
        """
        response = self.client.open(
            '/v5/ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads/{customer_list_upload_id}/run'.format(ad_account_id='ad_account_id_example', customer_list_id='customer_list_id_example', customer_list_upload_id='customer_list_upload_id_example'),
            method='POST')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
