# coding: utf-8

from fastapi.testclient import TestClient


from pydantic import Field, field_validator  # noqa: F401
from typing import Any  # noqa: F401
from typing_extensions import Annotated  # noqa: F401
from openapi_server.models.conversion_msot_events import ConversionMSOTEvents  # noqa: F401
from openapi_server.models.error import Error  # noqa: F401


def test_msot_events_create(client: TestClient):
    """Test case for msot_events_create

    Send Measurement Source Of Truth (MSOT) attributed conversion events
    """
    conversion_msot_events = {"attribution_score":0.5,"total_events":2,"attribution_scope":"click","attribution_model":"multi_touch","event_timestamp":1451431341,"action_timestamps":[1451410040],"total_event_touchpoints":2,"event_id":"eventId0001","event_name":"add_to_cart","currency":"","ad_group_id":"2680060704746","value":123.45,"campaign_id":"626736533506"}

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/ad_accounts/{ad_account_id}/msot/events".format(ad_account_id='ad_account_id_example'),
    #    headers=headers,
    #    json=conversion_msot_events,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200

