# coding: utf-8

from __future__ import absolute_import

from flask import json
from io import BytesIO

from app.openapi_server.models.advertiser_defined_events_create200_response import AdvertiserDefinedEventsCreate200Response  # noqa: E501
from app.openapi_server.models.advertiser_defined_events_create_request import AdvertiserDefinedEventsCreateRequest  # noqa: E501
from app.openapi_server.models.advertiser_defined_events_get200_response import AdvertiserDefinedEventsGet200Response  # noqa: E501
from app.openapi_server.models.pinterest_lib_error import PinterestLibError  # noqa: E501
from openapi_server.test import BaseTestCase


class TestConversionsController(BaseTestCase):
    """ConversionsController integration test stubs"""

    def test_advertiser_defined_events_create(self):
        """Test case for advertiser_defined_events_create

        Create advertiser defined events
        """
        body = {"items":[{"mapped_conversion_type":"SIGNUP","name":"newsletter_signup"},{"mapped_conversion_type":"SIGNUP","name":"newsletter_signup"}]}
        response = self.client.open(
            '/v5/ad_accounts/{ad_account_id}/advertiser_defined_events'.format(ad_account_id='ad_account_id_example'),
            method='POST',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_advertiser_defined_events_delete(self):
        """Test case for advertiser_defined_events_delete

        Delete advertiser defined events
        """
        query_string = [('event_names', ['event_names_example'])]
        response = self.client.open(
            '/v5/ad_accounts/{ad_account_id}/advertiser_defined_events'.format(ad_account_id='ad_account_id_example'),
            method='DELETE',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_advertiser_defined_events_get(self):
        """Test case for advertiser_defined_events_get

        Get advertiser defined events
        """
        response = self.client.open(
            '/v5/ad_accounts/{ad_account_id}/advertiser_defined_events'.format(ad_account_id='ad_account_id_example'),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_advertiser_defined_events_update(self):
        """Test case for advertiser_defined_events_update

        Update advertiser defined events
        """
        body = {"items":[{"mapped_conversion_type":"SIGNUP","name":"newsletter_signup"},{"mapped_conversion_type":"SIGNUP","name":"newsletter_signup"}]}
        response = self.client.open(
            '/v5/ad_accounts/{ad_account_id}/advertiser_defined_events'.format(ad_account_id='ad_account_id_example'),
            method='PATCH',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
