# coding: utf-8

from __future__ import absolute_import

from flask import json
from io import BytesIO

from app.openapi_server.models.advertiser_defined_events_response import AdvertiserDefinedEventsResponse  # noqa: E501
from app.openapi_server.models.error import Error  # noqa: E501
from openapi_server.test import BaseTestCase


class TestConversionsController(BaseTestCase):
    """ConversionsController integration test stubs"""

    def test_advertiser_defined_events_get(self):
        """Test case for advertiser_defined_events_get

        Get advertiser defined events
        """
        response = self.client.open(
            '/v5/ad_accounts/{ad_account_id}/advertiser_defined_events'.format(ad_account_id='ad_account_id_example'),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
