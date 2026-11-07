# coding: utf-8

from fastapi.testclient import TestClient


from pydantic import Field, field_validator  # noqa: F401
from typing import Optional  # noqa: F401
from typing_extensions import Annotated  # noqa: F401
from openapi_server.models.catalogs_items_batch import CatalogsItemsBatch  # noqa: F401
from openapi_server.models.catalogs_items_batch_post_request import CatalogsItemsBatchPostRequest  # noqa: F401
from openapi_server.models.catalogs_items_request import CatalogsItemsRequest  # noqa: F401
from openapi_server.models.items_post200_response import ItemsPost200Response  # noqa: F401
from openapi_server.models.pinterest_lib_error import PinterestLibError  # noqa: F401


def test_items_post(client: TestClient):
    """Test case for items_post

    Get catalogs items (POST)
    """
    catalogs_items_request = openapi_server.CatalogsItemsRequest()
    params = [("ad_account_id", 'ad_account_id_example')]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/catalogs/items",
    #    headers=headers,
    #    json=catalogs_items_request,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_items_batch_post(client: TestClient):
    """Test case for items_batch_post

    Operate on item batch
    """
    catalogs_items_batch_post_request = openapi_server.CatalogsItemsBatchPostRequest()
    params = [("ad_account_id", 'ad_account_id_example')]
    headers = {
        "Authorization": "Bearer special-key",
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/catalogs/items/batch",
    #    headers=headers,
    #    json=catalogs_items_batch_post_request,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_items_batch_get(client: TestClient):
    """Test case for items_batch_get

    Get item batch status
    """
    params = [("ad_account_id", 'ad_account_id_example')]
    headers = {
        "Authorization": "Bearer special-key",
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/catalogs/items/batch/{batch_id}".format(batch_id='batch_id_example'),
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200

