# coding: utf-8

from fastapi.testclient import TestClient


from pydantic import Field, StrictStr, field_validator  # noqa: F401
from typing import Any, List, Optional  # noqa: F401
from typing_extensions import Annotated  # noqa: F401
from openapi_server.models.catalogs_local_stores_create200_response_inner import CatalogsLocalStoresCreate200ResponseInner  # noqa: F401
from openapi_server.models.catalogs_local_stores_delete200_response_inner import CatalogsLocalStoresDelete200ResponseInner  # noqa: F401
from openapi_server.models.catalogs_local_stores_list200_response import CatalogsLocalStoresList200Response  # noqa: F401
from openapi_server.models.local_inventory_items_batch import LocalInventoryItemsBatch  # noqa: F401
from openapi_server.models.local_inventory_items_batch_create import LocalInventoryItemsBatchCreate  # noqa: F401
from openapi_server.models.local_inventory_items_get import LocalInventoryItemsGet  # noqa: F401
from openapi_server.models.local_inventory_items_get_create import LocalInventoryItemsGetCreate  # noqa: F401
from openapi_server.models.local_store import LocalStore  # noqa: F401
from openapi_server.models.local_store_batch_update import LocalStoreBatchUpdate  # noqa: F401
from openapi_server.models.local_store_create import LocalStoreCreate  # noqa: F401
from openapi_server.models.pinterest_lib_error import PinterestLibError  # noqa: F401
from openapi_server.models.supplemental_items_batch_response import SupplementalItemsBatchResponse  # noqa: F401


def test_catalogs_local_inventory_items_batch_operate(client: TestClient):
    """Test case for catalogs_local_inventory_items_batch_operate

    Operate on local inventory item batch
    """
    local_inventory_items_batch_create = openapi_server.LocalInventoryItemsBatchCreate()
    params = [("ad_account_id", 'ad_account_id_example')]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/catalogs/{catalog_id}/local_inventory_items/batch".format(catalog_id='catalog_id_example'),
    #    headers=headers,
    #    json=local_inventory_items_batch_create,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_catalogs_local_inventory_items_post(client: TestClient):
    """Test case for catalogs_local_inventory_items_post

    Get local inventory items (POST)
    """
    local_inventory_items_get_create = openapi_server.LocalInventoryItemsGetCreate()
    params = [("ad_account_id", 'ad_account_id_example')]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/catalogs/{catalog_id}/local_inventory_items/query".format(catalog_id='catalog_id_example'),
    #    headers=headers,
    #    json=local_inventory_items_get_create,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_catalogs_local_stores_list(client: TestClient):
    """Test case for catalogs_local_stores_list

    List local stores
    """
    params = [("ids", ['ids_example']),     ("ad_account_id", 'ad_account_id_example'),     ("bookmark", 'bookmark_example'),     ("page_size", 25)]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/catalogs/{catalog_id}/local_stores".format(catalog_id='catalog_id_example'),
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_catalogs_local_stores_create(client: TestClient):
    """Test case for catalogs_local_stores_create

    Create local stores
    """
    local_store_create = [[openapi_server.LocalStoreCreate()]]
    params = [("ad_account_id", 'ad_account_id_example')]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/catalogs/{catalog_id}/local_stores".format(catalog_id='catalog_id_example'),
    #    headers=headers,
    #    json=local_store_create,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_catalogs_local_stores_delete(client: TestClient):
    """Test case for catalogs_local_stores_delete

    Delete local stores
    """
    params = [("ids", ['ids_example']),     ("ad_account_id", 'ad_account_id_example')]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "DELETE",
    #    "/catalogs/{catalog_id}/local_stores".format(catalog_id='catalog_id_example'),
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_catalogs_local_stores_update(client: TestClient):
    """Test case for catalogs_local_stores_update

    Update local stores
    """
    local_store_batch_update = [[openapi_server.LocalStoreBatchUpdate()]]
    params = [("ad_account_id", 'ad_account_id_example')]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "PATCH",
    #    "/catalogs/{catalog_id}/local_stores".format(catalog_id='catalog_id_example'),
    #    headers=headers,
    #    json=local_store_batch_update,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_catalogs_supplemental_items_batch_get(client: TestClient):
    """Test case for catalogs_supplemental_items_batch_get

    Get supplemental items batch status
    """
    params = [("ad_account_id", 'ad_account_id_example')]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/catalogs/{catalog_id}/supplemental_items/batch/{batch_id}".format(catalog_id='catalog_id_example', batch_id='batch_id_example'),
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200

