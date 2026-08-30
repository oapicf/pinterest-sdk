# coding: utf-8

from fastapi.testclient import TestClient


from pydantic import Field, field_validator  # noqa: F401
from typing import Any  # noqa: F401
from typing_extensions import Annotated  # noqa: F401
from openapi_server.models.pinterest_lib_error import PinterestLibError  # noqa: F401
from openapi_server.models.product_tags_bulk_add_request import ProductTagsBulkAddRequest  # noqa: F401
from openapi_server.models.product_tags_bulk_delete_request import ProductTagsBulkDeleteRequest  # noqa: F401
from openapi_server.models.product_tags_error import ProductTagsError  # noqa: F401
from openapi_server.models.product_tags_response import ProductTagsResponse  # noqa: F401


def test_product_tags_list(client: TestClient):
    """Test case for product_tags_list

    Get product tags for pin
    """

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/pins/{pin_id}/product_tags".format(pin_id='pin_id_example'),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_product_tags_bulk_add(client: TestClient):
    """Test case for product_tags_bulk_add

    Add product tags to pin
    """
    product_tags_bulk_add_request = openapi_server.ProductTagsBulkAddRequest()

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/pins/{pin_id}/product_tags".format(pin_id='pin_id_example'),
    #    headers=headers,
    #    json=product_tags_bulk_add_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_product_tags_bulk_delete(client: TestClient):
    """Test case for product_tags_bulk_delete

    Delete product tags from pin
    """
    product_tags_bulk_delete_request = openapi_server.ProductTagsBulkDeleteRequest()

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/pins/{pin_id}/product_tags/bulk-delete".format(pin_id='pin_id_example'),
    #    headers=headers,
    #    json=product_tags_bulk_delete_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200

