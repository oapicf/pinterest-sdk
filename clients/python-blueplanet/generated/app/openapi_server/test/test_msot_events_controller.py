# coding: utf-8

from __future__ import absolute_import

from flask import json
from io import BytesIO

from app.openapi_server.models.conversion_msot_events_create import ConversionMSOTEventsCreate  # noqa: E501
from app.openapi_server.models.pinterest_lib_error import PinterestLibError  # noqa: E501
from openapi_server.test import BaseTestCase


class TestMsotEventsController(BaseTestCase):
    """MsotEventsController integration test stubs"""

    def test_msot_events_create(self):
        """Test case for msot_events_create

        Send Measurement Source Of Truth (MSOT) attributed conversion events
        """
        body = {"action_timestamps":[1451410040],"ad_group_id":"2680060704746","attribution_model":"multi_touch","attribution_scope":"click","attribution_score":0.5,"campaign_id":"626736533506","click_window":"click_window","currency":"","event_id":"eventId0001","event_name":"add_to_cart","event_timestamp":1451431341,"total_event_touchpoints":2,"total_events":2,"total_events_fractional":0.08008281904610115,"value":123.45,"view_window":"view_window"}
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
