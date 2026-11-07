# coding: utf-8

from fastapi.testclient import TestClient


from pydantic import Field, field_validator  # noqa: F401
from typing import Optional  # noqa: F401
from typing_extensions import Annotated  # noqa: F401
from openapi_server.models.conversion_events import ConversionEvents  # noqa: F401
from openapi_server.models.conversion_events_create import ConversionEventsCreate  # noqa: F401
from openapi_server.models.detailed_error import DetailedError  # noqa: F401
from openapi_server.models.pinterest_lib_error import PinterestLibError  # noqa: F401


def test_events_create(client: TestClient):
    """Test case for events_create

    Send conversions
    """
    conversion_events_create = openapi_server.ConversionEventsCreate()
    params = [("test", True)]
    headers = {
        "Authorization": "Bearer special-key",
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/ad_accounts/{ad_account_id}/events".format(ad_account_id='ad_account_id_example'),
    #    headers=headers,
    #    json=conversion_events_create,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200

