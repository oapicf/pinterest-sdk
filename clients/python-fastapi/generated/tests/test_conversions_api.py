# coding: utf-8

from fastapi.testclient import TestClient


from pydantic import Field, field_validator  # noqa: F401
from typing import List  # noqa: F401
from typing_extensions import Annotated  # noqa: F401
from openapi_server.models.advertiser_defined_events_create200_response import AdvertiserDefinedEventsCreate200Response  # noqa: F401
from openapi_server.models.advertiser_defined_events_create_request import AdvertiserDefinedEventsCreateRequest  # noqa: F401
from openapi_server.models.advertiser_defined_events_get200_response import AdvertiserDefinedEventsGet200Response  # noqa: F401
from openapi_server.models.pinterest_lib_error import PinterestLibError  # noqa: F401


def test_advertiser_defined_events_get(client: TestClient):
    """Test case for advertiser_defined_events_get

    Get advertiser defined events
    """

    headers = {
        "Authorization": "Bearer special-key",
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/ad_accounts/{ad_account_id}/advertiser_defined_events".format(ad_account_id='ad_account_id_example'),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_advertiser_defined_events_create(client: TestClient):
    """Test case for advertiser_defined_events_create

    Create advertiser defined events
    """
    advertiser_defined_events_create_request = openapi_server.AdvertiserDefinedEventsCreateRequest()

    headers = {
        "Authorization": "Bearer special-key",
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/ad_accounts/{ad_account_id}/advertiser_defined_events".format(ad_account_id='ad_account_id_example'),
    #    headers=headers,
    #    json=advertiser_defined_events_create_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_advertiser_defined_events_delete(client: TestClient):
    """Test case for advertiser_defined_events_delete

    Delete advertiser defined events
    """
    params = [("event_names", ['event_names_example'])]
    headers = {
        "Authorization": "Bearer special-key",
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "DELETE",
    #    "/ad_accounts/{ad_account_id}/advertiser_defined_events".format(ad_account_id='ad_account_id_example'),
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_advertiser_defined_events_update(client: TestClient):
    """Test case for advertiser_defined_events_update

    Update advertiser defined events
    """
    advertiser_defined_events_create_request = openapi_server.AdvertiserDefinedEventsCreateRequest()

    headers = {
        "Authorization": "Bearer special-key",
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "PATCH",
    #    "/ad_accounts/{ad_account_id}/advertiser_defined_events".format(ad_account_id='ad_account_id_example'),
    #    headers=headers,
    #    json=advertiser_defined_events_create_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200

