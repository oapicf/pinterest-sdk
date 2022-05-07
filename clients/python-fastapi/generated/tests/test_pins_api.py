# coding: utf-8

from fastapi.testclient import TestClient


from openapi_server.models.analytics_metrics_response import AnalyticsMetricsResponse  # noqa: F401
from openapi_server.models.error import Error  # noqa: F401
from openapi_server.models.pin import Pin  # noqa: F401


def test_pins_analytics(client: TestClient):
    """Test case for pins_analytics

    Get Pin analytics
    """
    params = [("start_date", '2013-10-20'),     ("end_date", '2013-10-20'),     ("app_types", 'ALL'),     ("metric_types", ['metric_types_example']),     ("split_field", 'NO_SPLIT'),     ("ad_account_id", 'ad_account_id_example')]
    headers = {
        "Authorization": "Bearer special-key",
    }
    response = client.request(
        "GET",
        "/pins/{pin_id}/analytics".format(pin_id='pin_id_example'),
        headers=headers,
        params=params,
    )

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_pins_create(client: TestClient):
    """Test case for pins_create

    Create Pin
    """
    pin = {"board_owner":"{}","media_source":"{}","alt_text":"alt_text","board_id":"board_id","link":"https://www.pinterest.com/","created_at":"2020-01-01T20:10:40Z","description":"description","id":"813744226420795884","media":"{}","title":"title","board_section_id":"board_section_id"}

    headers = {
        "Authorization": "Bearer special-key",
    }
    response = client.request(
        "POST",
        "/pins",
        headers=headers,
        json=pin,
    )

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_pins_delete(client: TestClient):
    """Test case for pins_delete

    Delete Pin
    """

    headers = {
        "Authorization": "Bearer special-key",
    }
    response = client.request(
        "DELETE",
        "/pins/{pin_id}".format(pin_id='pin_id_example'),
        headers=headers,
    )

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_pins_get(client: TestClient):
    """Test case for pins_get

    Get Pin
    """
    params = [("ad_account_id", 'ad_account_id_example')]
    headers = {
        "Authorization": "Bearer special-key",
    }
    response = client.request(
        "GET",
        "/pins/{pin_id}".format(pin_id='pin_id_example'),
        headers=headers,
        params=params,
    )

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200

