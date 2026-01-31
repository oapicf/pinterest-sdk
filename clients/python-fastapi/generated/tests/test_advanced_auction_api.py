# coding: utf-8

from fastapi.testclient import TestClient


from pydantic import Field, field_validator  # noqa: F401
from typing import Optional  # noqa: F401
from typing_extensions import Annotated  # noqa: F401
from openapi_server.models.advanced_auction_items import AdvancedAuctionItems  # noqa: F401
from openapi_server.models.advanced_auction_items_get_request import AdvancedAuctionItemsGetRequest  # noqa: F401
from openapi_server.models.advanced_auction_items_submit_request import AdvancedAuctionItemsSubmitRequest  # noqa: F401
from openapi_server.models.advanced_auction_processed_items import AdvancedAuctionProcessedItems  # noqa: F401
from openapi_server.models.error import Error  # noqa: F401


def test_advanced_auction_items_get_post(client: TestClient):
    """Test case for advanced_auction_items_get_post

    Get item bid options (POST)
    """
    advanced_auction_items_get_request = {"catalog_id":"2680059592705","items":[{"country":"AD","item_id":"DS0294-M","language":"EN"},{"country":"AD","item_id":"DS0294-M","language":"EN"},{"country":"AD","item_id":"DS0294-M","language":"EN"},{"country":"AD","item_id":"DS0294-M","language":"EN"},{"country":"AD","item_id":"DS0294-M","language":"EN"}]}
    params = [("ad_account_id", 'ad_account_id_example')]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/advanced_auction/items/get",
    #    headers=headers,
    #    json=advanced_auction_items_get_request,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_advanced_auction_items_submit_post(client: TestClient):
    """Test case for advanced_auction_items_submit_post

    Operate on item level bid options
    """
    advanced_auction_items_submit_request = {"catalog_id":"2680059592705","items":[{"operation":"UPSERT"},{"operation":"UPSERT"},{"operation":"UPSERT"},{"operation":"UPSERT"},{"operation":"UPSERT"}]}
    params = [("ad_account_id", 'ad_account_id_example')]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/advanced_auction/items/submit",
    #    headers=headers,
    #    json=advanced_auction_items_submit_request,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200

