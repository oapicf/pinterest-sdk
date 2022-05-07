# coding: utf-8

from fastapi.testclient import TestClient


from openapi_server.models.account import Account  # noqa: F401
from openapi_server.models.analytics_metrics_response import AnalyticsMetricsResponse  # noqa: F401
from openapi_server.models.error import Error  # noqa: F401


def test_user_account_analytics(client: TestClient):
    """Test case for user_account_analytics

    Get user account analytics
    """
    params = [("start_date", '2013-10-20'),     ("end_date", '2013-10-20'),     ("from_claimed_content", 'BOTH'),     ("pin_format", 'ALL'),     ("app_types", 'ALL'),     ("metric_types", ['metric_types_example']),     ("split_field", 'NO_SPLIT'),     ("ad_account_id", 'ad_account_id_example')]
    headers = {
        "Authorization": "Bearer special-key",
    }
    response = client.request(
        "GET",
        "/user_account/analytics",
        headers=headers,
        params=params,
    )

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_user_account_get(client: TestClient):
    """Test case for user_account_get

    Get user account
    """
    params = [("ad_account_id", 'ad_account_id_example')]
    headers = {
        "Authorization": "Bearer special-key",
    }
    response = client.request(
        "GET",
        "/user_account",
        headers=headers,
        params=params,
    )

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200

