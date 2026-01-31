# coding: utf-8

from fastapi.testclient import TestClient


from pydantic import Field  # noqa: F401
from typing_extensions import Annotated  # noqa: F401
from openapi_server.models.error import Error  # noqa: F401
from openapi_server.models.notification_post_request import NotificationPostRequest  # noqa: F401
from openapi_server.models.notification_response import NotificationResponse  # noqa: F401


def test_notification_post(client: TestClient):
    """Test case for notification_post

    Receive notifications from external partners.
    """
    notification_post_request = openapi_server.NotificationPostRequest()

    headers = {
        "Authorization": "Bearer special-key",
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/notifications",
    #    headers=headers,
    #    json=notification_post_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200

