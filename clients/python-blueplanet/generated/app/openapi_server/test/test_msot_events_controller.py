# coding: utf-8

from __future__ import absolute_import

from flask import json
from io import BytesIO

from app.openapi_server.models.conversion_msot_events import ConversionMSOTEvents  # noqa: E501
from app.openapi_server.models.error import Error  # noqa: E501
from openapi_server.test import BaseTestCase


class TestMsotEventsController(BaseTestCase):
    """MsotEventsController integration test stubs"""

    def test_msot_events_create(self):
        """Test case for msot_events_create

        Send Measurement Source Of Truth (MSOT) attributed conversion events
        """
        body = {"attribution_score":0.5,"total_events":2,"attribution_scope":"click","attribution_model":"multi_touch","event_timestamp":1451431341,"action_timestamps":[1451410040],"total_event_touchpoints":2,"event_id":"eventId0001","event_name":"add_to_cart","currency":"","ad_group_id":"2680060704746","value":123.45,"campaign_id":"626736533506"}
        response = self.client.open(
            '/v5/ad_accounts/{ad_account_id}/msot/events'.format(ad_account_id='ad_account_id_example'),
            method='POST',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
