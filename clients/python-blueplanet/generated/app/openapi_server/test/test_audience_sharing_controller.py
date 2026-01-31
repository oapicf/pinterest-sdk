# coding: utf-8

from __future__ import absolute_import

from flask import json
from io import BytesIO

from app.openapi_server.models.ad_accounts_audiences_shared_accounts_list200_response import AdAccountsAudiencesSharedAccountsList200Response  # noqa: E501
from app.openapi_server.models.audience_account_type import AudienceAccountType  # noqa: E501
from app.openapi_server.models.audiences_list200_response import AudiencesList200Response  # noqa: E501
from app.openapi_server.models.business_shared_audience import BusinessSharedAudience  # noqa: E501
from app.openapi_server.models.business_shared_audience_response import BusinessSharedAudienceResponse  # noqa: E501
from app.openapi_server.models.error import Error  # noqa: E501
from app.openapi_server.models.shared_audience import SharedAudience  # noqa: E501
from app.openapi_server.models.shared_audience_response import SharedAudienceResponse  # noqa: E501
from openapi_server.test import BaseTestCase


class TestAudienceSharingController(BaseTestCase):
    """AudienceSharingController integration test stubs"""

    def test_ad_accounts_audiences_shared_accounts_list(self):
        """Test case for ad_accounts_audiences_shared_accounts_list

        List accounts with access to an audience owned by an ad account
        """
        query_string = [('audience_id', 'audience_id_example'),
                        ('account_type', AD_ACCOUNT),
                        ('page_size', 25),
                        ('bookmark', 'bookmark_example')]
        response = self.client.open(
            '/v5/ad_accounts/{ad_account_id}/audiences/shared/accounts'.format(ad_account_id='ad_account_id_example'),
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_business_account_audiences_shared_accounts_list(self):
        """Test case for business_account_audiences_shared_accounts_list

        List accounts with access to an audience owned by a business
        """
        query_string = [('audience_id', 'audience_id_example'),
                        ('account_type', AD_ACCOUNT),
                        ('page_size', 25),
                        ('bookmark', 'bookmark_example')]
        response = self.client.open(
            '/v5/businesses/{business_id}/audiences/shared/accounts'.format(business_id='729090764583391194'),
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_shared_audiences_for_business_list(self):
        """Test case for shared_audiences_for_business_list

        List received audiences for a business
        """
        query_string = [('bookmark', 'bookmark_example'),
                        ('order', 'ASCENDING'),
                        ('page_size', 25)]
        response = self.client.open(
            '/v5/businesses/{business_id}/audiences'.format(business_id='729090764583391194'),
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_ad_account_to_ad_account_shared_audience(self):
        """Test case for update_ad_account_to_ad_account_shared_audience

        Update audience sharing between ad accounts
        """
        body = {"recipient_account_ids":["recipient_account_ids","recipient_account_ids"],"operation_type":"SHARE","audience_id":"2542621871096"}
        response = self.client.open(
            '/v5/ad_accounts/{ad_account_id}/audiences/ad_accounts/shared'.format(ad_account_id='ad_account_id_example'),
            method='PATCH',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_ad_account_to_business_shared_audience(self):
        """Test case for update_ad_account_to_business_shared_audience

        Update audience sharing from an ad account to businesses
        """
        body = {"operation_type":"SHARE","recipient_business_ids":["recipient_business_ids","recipient_business_ids"],"audience_id":"2542621871096"}
        response = self.client.open(
            '/v5/ad_accounts/{ad_account_id}/audiences/businesses/shared'.format(ad_account_id='ad_account_id_example'),
            method='PATCH',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_business_to_ad_account_shared_audience(self):
        """Test case for update_business_to_ad_account_shared_audience

        Update audience sharing from a business to ad accounts
        """
        body = {"recipient_account_ids":["recipient_account_ids","recipient_account_ids"],"operation_type":"SHARE","audience_id":"2542621871096"}
        response = self.client.open(
            '/v5/businesses/{business_id}/audiences/ad_accounts/shared'.format(business_id='729090764583391194'),
            method='PATCH',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_business_to_business_shared_audience(self):
        """Test case for update_business_to_business_shared_audience

        Update audience sharing between businesses
        """
        body = {"operation_type":"SHARE","recipient_business_ids":["recipient_business_ids","recipient_business_ids"],"audience_id":"2542621871096"}
        response = self.client.open(
            '/v5/businesses/{business_id}/audiences/businesses/shared'.format(business_id='729090764583391194'),
            method='PATCH',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
