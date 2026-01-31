# coding: utf-8

from __future__ import absolute_import

from flask import json
from io import BytesIO

from app.openapi_server.models.ad_accounts_country_response import AdAccountsCountryResponse  # noqa: E501
from app.openapi_server.models.book_closed_response import BookClosedResponse  # noqa: E501
from app.openapi_server.models.delivery_metrics_response import DeliveryMetricsResponse  # noqa: E501
from app.openapi_server.models.error import Error  # noqa: E501
from app.openapi_server.models.single_interest_targeting_option_response import SingleInterestTargetingOptionResponse  # noqa: E501
from openapi_server.test import BaseTestCase


class TestResourcesController(BaseTestCase):
    """ResourcesController integration test stubs"""

    def test_ad_account_countries_get(self):
        """Test case for ad_account_countries_get

        Get ad accounts countries
        """
        response = self.client.open(
            '/v5/resources/ad_account_countries',
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_delivery_metrics_get(self):
        """Test case for delivery_metrics_get

        Get available metrics' definitions
        """
        query_string = [('report_type', 'report_type_example')]
        response = self.client.open(
            '/v5/resources/delivery_metrics',
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_interest_targeting_options_get(self):
        """Test case for interest_targeting_options_get

        Get interest details
        """
        response = self.client.open(
            '/v5/resources/targeting/interests/{interest_id}'.format(interest_id='interest_id_example'),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_lead_form_questions_get(self):
        """Test case for lead_form_questions_get

        Get lead form questions
        """
        response = self.client.open(
            '/v5/resources/lead_form_questions',
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_metrics_ready_state_get(self):
        """Test case for metrics_ready_state_get

        Get metrics ready state
        """
        query_string = [('_date', '2022-07-13')]
        response = self.client.open(
            '/v5/resources/metrics_ready_state',
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_targeting_options_get(self):
        """Test case for targeting_options_get

        Get targeting options
        """
        query_string = [('client_id', '1094834'),
                        ('oauth_signature', '8209f'),
                        ('timestamp', '1618338184277'),
                        ('ad_account_id', 'ad_account_id_example')]
        response = self.client.open(
            '/v5/resources/targeting/{targeting_type}'.format(targeting_type='APPTYPE'),
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
