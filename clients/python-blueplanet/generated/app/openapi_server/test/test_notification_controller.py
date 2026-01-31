# coding: utf-8

from __future__ import absolute_import

from flask import json
from io import BytesIO

from app.openapi_server.models.error import Error  # noqa: E501
from app.openapi_server.models.notification_post_request import NotificationPostRequest  # noqa: E501
from app.openapi_server.models.notification_response import NotificationResponse  # noqa: E501
from openapi_server.test import BaseTestCase


class TestNotificationController(BaseTestCase):
    """NotificationController integration test stubs"""

    def test_notification_post(self):
        """Test case for notification_post

        Receive notifications from external partners.
        """
        body = openapi_server.NotificationPostRequest()
        response = self.client.open(
            '/v5/notifications',
            method='POST',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
