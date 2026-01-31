# coding: utf-8

from fastapi.testclient import TestClient


from pydantic import Field, StrictStr, field_validator  # noqa: F401
from typing import Optional  # noqa: F401
from typing_extensions import Annotated  # noqa: F401
from openapi_server.models.audience import Audience  # noqa: F401
from openapi_server.models.audience_create_request import AudienceCreateRequest  # noqa: F401
from openapi_server.models.audience_update_request import AudienceUpdateRequest  # noqa: F401
from openapi_server.models.audiences_list200_response import AudiencesList200Response  # noqa: F401
from openapi_server.models.error import Error  # noqa: F401


def test_audiences_list(client: TestClient):
    """Test case for audiences_list

    List audiences
    """
    params = [("bookmark", 'bookmark_example'),     ("order", 'ASCENDING'),     ("page_size", 25),     ("ownership_type", OWNED)]
    headers = {
        "Authorization": "Bearer special-key",
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/ad_accounts/{ad_account_id}/audiences".format(ad_account_id='ad_account_id_example'),
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_audiences_create(client: TestClient):
    """Test case for audiences_create

    Create audience
    """
    audience_create_request = {"audience_type":"audience_type","name":"string","rule":{"country":"US","visitor_source_id":"549755885175","prefill":1,"customer_list_id":"5497558859876","event_source":{"=":["web","mobile"]},"objective_type":["AWARENESS"],"event_data":{"video_title":"How to style your Parker Boots","page_name":"Our Favorite Pins on Pinterest","order_quantity":1,"property":"Athleta","currency":"","lead_type":"Newsletter","promo_code":"WINTER10","line_items":"","search_query":"boots","order_id":"X-151481","value":"199.98"},"seed_id":["2542620639259","2542620639261"],"url":["url","url"],"ad_account_id":"549755885175","ad_id":["687201361754"],"ingestion_source":{"=":["tag"]},"engager_type":1,"retention_days":30,"engagement_type":"click","percentage":3,"engagement_domain":["www.somedomain.com"],"event":"checkout","pin_id":["34567"],"campaign_id":["626744528398"]},"description":"string","ad_account_id":"549755885175"}

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/ad_accounts/{ad_account_id}/audiences".format(ad_account_id='ad_account_id_example'),
    #    headers=headers,
    #    json=audience_create_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_audiences_get(client: TestClient):
    """Test case for audiences_get

    Get audience
    """

    headers = {
        "Authorization": "Bearer special-key",
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/ad_accounts/{ad_account_id}/audiences/{audience_id}".format(ad_account_id='ad_account_id_example', audience_id='audience_id_example'),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_audiences_update(client: TestClient):
    """Test case for audiences_update

    Update audience
    """
    audience_update_request = {"operation_type":"UPDATE","name":"string","rule":{"country":"US","visitor_source_id":"549755885175","prefill":1,"customer_list_id":"5497558859876","event_source":{"=":["web","mobile"]},"objective_type":["AWARENESS"],"event_data":{"video_title":"How to style your Parker Boots","page_name":"Our Favorite Pins on Pinterest","order_quantity":1,"property":"Athleta","currency":"","lead_type":"Newsletter","promo_code":"WINTER10","line_items":"","search_query":"boots","order_id":"X-151481","value":"199.98"},"seed_id":["2542620639259","2542620639261"],"url":["url","url"],"ad_account_id":"549755885175","ad_id":["687201361754"],"ingestion_source":{"=":["tag"]},"engager_type":1,"retention_days":30,"engagement_type":"click","percentage":3,"engagement_domain":["www.somedomain.com"],"event":"checkout","pin_id":["34567"],"campaign_id":["626744528398"]},"description":"string","ad_account_id":"549755885175"}

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "PATCH",
    #    "/ad_accounts/{ad_account_id}/audiences/{audience_id}".format(ad_account_id='ad_account_id_example', audience_id='audience_id_example'),
    #    headers=headers,
    #    json=audience_update_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200

