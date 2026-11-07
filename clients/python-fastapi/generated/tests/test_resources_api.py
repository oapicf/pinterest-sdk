# coding: utf-8

from fastapi.testclient import TestClient


from pydantic import Field, field_validator  # noqa: F401
from typing import Any, Dict, List, Optional  # noqa: F401
from typing_extensions import Annotated  # noqa: F401
from openapi_server.models.ad_account_countries_get200_response import AdAccountCountriesGet200Response  # noqa: F401
from openapi_server.models.book_closed import BookClosed  # noqa: F401
from openapi_server.models.delivery_metrics_get200_response import DeliveryMetricsGet200Response  # noqa: F401
from openapi_server.models.pinterest_lib_error import PinterestLibError  # noqa: F401
from openapi_server.models.public_targeting_type import PublicTargetingType  # noqa: F401
from openapi_server.models.report_type import ReportType  # noqa: F401
from openapi_server.models.single_interest_targeting_option import SingleInterestTargetingOption  # noqa: F401


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
    params = [("report_type", openapi_server.ReportType())]
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
    params = [("var_date", 'var_date_example')]
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
    params = [("ad_account_id", 'ad_account_id_example'),     ("client_id", 'client_id_example'),     ("oauth_signature", 'oauth_signature_example'),     ("timestamp", 'timestamp_example')]
    headers = {
        "Authorization": "Bearer special-key",
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/resources/targeting/{targeting_type}".format(targeting_type=openapi_server.PublicTargetingType()),
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200

