# coding: utf-8

from fastapi.testclient import TestClient


from pydantic import Field, field_validator  # noqa: F401
from typing import Any, Dict  # noqa: F401
from typing_extensions import Annotated  # noqa: F401
from openapi_server.models.conversion_msot_events_create import ConversionMSOTEventsCreate  # noqa: F401
from openapi_server.models.pinterest_lib_error import PinterestLibError  # noqa: F401


def test_msot_events_create(client: TestClient):
    """Test case for msot_events_create

    Send Measurement Source Of Truth (MSOT) attributed conversion events
    """
    conversion_msot_events_create = openapi_server.ConversionMSOTEventsCreate()

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/ad_accounts/{ad_account_id}/msot/events".format(ad_account_id='ad_account_id_example'),
    #    headers=headers,
    #    json=conversion_msot_events_create,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200

