# coding: utf-8

from __future__ import absolute_import

from flask import json
from io import BytesIO

from app.openapi_server.models.ad_accounts_subscriptions_get_list200_response import AdAccountsSubscriptionsGetList200Response  # noqa: E501
from app.openapi_server.models.lead_subscription import LeadSubscription  # noqa: E501
from app.openapi_server.models.lead_subscription_post_params_create import LeadSubscriptionPostParamsCreate  # noqa: E501
from app.openapi_server.models.pinterest_lib_error import PinterestLibError  # noqa: E501
from openapi_server.test import BaseTestCase


class TestLeadAdsController(BaseTestCase):
    """LeadAdsController integration test stubs"""

    def test_ad_accounts_subscriptions_del_by_id(self):
        """Test case for ad_accounts_subscriptions_del_by_id

        Delete lead ads subscription
        """
        response = self.client.open(
            '/v5/ad_accounts/{ad_account_id}/leads/subscriptions/{subscription_id}'.format(ad_account_id='ad_account_id_example', subscription_id='subscription_id_example'),
            method='DELETE')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_ad_accounts_subscriptions_get_by_id(self):
        """Test case for ad_accounts_subscriptions_get_by_id

        Get lead ads subscription by ID
        """
        response = self.client.open(
            '/v5/ad_accounts/{ad_account_id}/leads/subscriptions/{subscription_id}'.format(ad_account_id='ad_account_id_example', subscription_id='subscription_id_example'),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_ad_accounts_subscriptions_get_list(self):
        """Test case for ad_accounts_subscriptions_get_list

        Get lead ads subscriptions
        """
        query_string = [('bookmark', 'bookmark_example'),
                        ('page_size', 25)]
        response = self.client.open(
            '/v5/ad_accounts/{ad_account_id}/leads/subscriptions'.format(ad_account_id='ad_account_id_example'),
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_ad_accounts_subscriptions_post(self):
        """Test case for ad_accounts_subscriptions_post

        Create lead ads subscription
        """
        body = {"webhook_url":"webhook_url","partner_refresh_token":"partner_refresh_token","lead_form_id":"lead_form_id","partner_metadata":{"subscriber_key":"subscriber_key"},"partner_access_token":"partner_access_token"}
        response = self.client.open(
            '/v5/ad_accounts/{ad_account_id}/leads/subscriptions'.format(ad_account_id='ad_account_id_example'),
            method='POST',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
