# coding: utf-8

from fastapi.testclient import TestClient


from pydantic import Field, StrictStr, field_validator  # noqa: F401
from typing import Any, Dict, List, Optional  # noqa: F401
from typing_extensions import Annotated  # noqa: F401
from openapi_server.models.ad_accounts_country_response import AdAccountsCountryResponse  # noqa: F401
from openapi_server.models.book_closed_response import BookClosedResponse  # noqa: F401
from openapi_server.models.delivery_metrics_response import DeliveryMetricsResponse  # noqa: F401
from openapi_server.models.error import Error  # noqa: F401
from openapi_server.models.single_interest_targeting_option_response import SingleInterestTargetingOptionResponse  # noqa: F401


def test_ad_account_countries_get(client: TestClient):
    """Test case for ad_account_countries_get

    Get ad accounts countries
    """

    headers = {
        "Authorization": "Bearer special-key",
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/resources/ad_account_countries",
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_delivery_metrics_get(client: TestClient):
    """Test case for delivery_metrics_get

    Get available metrics' definitions
    """
    params = [("report_type", 'report_type_example')]
    headers = {
        "Authorization": "Bearer special-key",
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/resources/delivery_metrics",
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_lead_form_questions_get(client: TestClient):
    """Test case for lead_form_questions_get

    Get lead form questions
    """

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/resources/lead_form_questions",
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_metrics_ready_state_get(client: TestClient):
    """Test case for metrics_ready_state_get

    Get metrics ready state
    """
    params = [("var_date", '2022-07-13')]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/resources/metrics_ready_state",
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_interest_targeting_options_get(client: TestClient):
    """Test case for interest_targeting_options_get

    Get interest details
    """

    headers = {
        "Authorization": "Bearer special-key",
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/resources/targeting/interests/{interest_id}".format(interest_id='interest_id_example'),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_targeting_options_get(client: TestClient):
    """Test case for targeting_options_get

    Get targeting options
    """
    params = [("client_id", '1094834'),     ("oauth_signature", '8209f'),     ("timestamp", '1618338184277'),     ("ad_account_id", 'ad_account_id_example')]
    headers = {
        "Authorization": "Bearer special-key",
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/resources/targeting/{targeting_type}".format(targeting_type='APPTYPE'),
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200

