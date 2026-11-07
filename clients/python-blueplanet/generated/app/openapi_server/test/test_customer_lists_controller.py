# coding: utf-8

from __future__ import absolute_import

from flask import json
from io import BytesIO

from app.openapi_server.models.customer_list import CustomerList  # noqa: E501
from app.openapi_server.models.customer_list_create import CustomerListCreate  # noqa: E501
from app.openapi_server.models.customer_list_update_with_required_body import CustomerListUpdateWithRequiredBody  # noqa: E501
from app.openapi_server.models.customer_lists_list200_response import CustomerListsList200Response  # noqa: E501
from app.openapi_server.models.pinterest_lib_error import PinterestLibError  # noqa: E501
from app.openapi_server.models.pinterest_lib_pagination_order import PinterestLibPaginationOrder  # noqa: E501
from openapi_server.test import BaseTestCase


class TestCustomerListsController(BaseTestCase):
    """CustomerListsController integration test stubs"""

    def test_customer_lists_create(self):
        """Test case for customer_lists_create

        Create customer lists
        """
        body = {"is_nca":True,"list_type":"","name":"The Glengarry Glen Ross leads","records":"email1@pinterest.com,email2@pinterest.com,..<more records>","records_v2":[{"email":"email","external_id":"external_id","hashed_phone_number":"hashed_phone_number","hashed_pinner_id":"hashed_pinner_id","ip_address":"ip_address","liveramp_envelope":"liveramp_envelope","maid":"maid","user_agent":"user_agent"},{"email":"email","external_id":"external_id","hashed_phone_number":"hashed_phone_number","hashed_pinner_id":"hashed_pinner_id","ip_address":"ip_address","liveramp_envelope":"liveramp_envelope","maid":"maid","user_agent":"user_agent"}]}
        response = self.client.open(
            '/v5/ad_accounts/{ad_account_id}/customer_lists'.format(ad_account_id='ad_account_id_example'),
            method='POST',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_customer_lists_get(self):
        """Test case for customer_lists_get

        Get customer list
        """
        response = self.client.open(
            '/v5/ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}'.format(ad_account_id='ad_account_id_example', customer_list_id='customer_list_id_example'),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_customer_lists_list(self):
        """Test case for customer_lists_list

        Get customer lists
        """
        query_string = [('bookmark', 'bookmark_example'),
                        ('page_size', 25),
                        ('order', openapi_server.PinterestLibPaginationOrder()),
                        ('exclude_nca', False)]
        response = self.client.open(
            '/v5/ad_accounts/{ad_account_id}/customer_lists'.format(ad_account_id='ad_account_id_example'),
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_customer_lists_update(self):
        """Test case for customer_lists_update

        Update customer list
        """
        body = {"operation_type":"","records":"email1@pinterest.com,email2@pinterest.com,..<more records>","records_v2":[{"email":"email","external_id":"external_id","hashed_phone_number":"hashed_phone_number","hashed_pinner_id":"hashed_pinner_id","ip_address":"ip_address","liveramp_envelope":"liveramp_envelope","maid":"maid","user_agent":"user_agent"},{"email":"email","external_id":"external_id","hashed_phone_number":"hashed_phone_number","hashed_pinner_id":"hashed_pinner_id","ip_address":"ip_address","liveramp_envelope":"liveramp_envelope","maid":"maid","user_agent":"user_agent"}]}
        response = self.client.open(
            '/v5/ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}'.format(ad_account_id='ad_account_id_example', customer_list_id='customer_list_id_example'),
            method='PATCH',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
