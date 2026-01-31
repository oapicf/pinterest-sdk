# coding: utf-8

from fastapi.testclient import TestClient


from pydantic import Field, field_validator  # noqa: F401
from typing_extensions import Annotated  # noqa: F401
from openapi_server.models.advertiser_defined_events_response import AdvertiserDefinedEventsResponse  # noqa: F401
from openapi_server.models.error import Error  # noqa: F401


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

