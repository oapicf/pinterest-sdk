# coding: utf-8

from fastapi.testclient import TestClient


from pydantic import Field, field_validator  # noqa: F401
from typing import Any, List, Optional  # noqa: F401
from typing_extensions import Annotated  # noqa: F401
from openapi_server.models.catalogs_list_products_by_filter_request import CatalogsListProductsByFilterRequest  # noqa: F401
from openapi_server.models.catalogs_product_group_pins_list200_response import CatalogsProductGroupPinsList200Response  # noqa: F401
from openapi_server.models.catalogs_product_group_product_counts_vertical import CatalogsProductGroupProductCountsVertical  # noqa: F401
from openapi_server.models.catalogs_product_groups_create_many_request_items import CatalogsProductGroupsCreateManyRequestItems  # noqa: F401
from openapi_server.models.catalogs_product_groups_create_request_schema import CatalogsProductGroupsCreateRequestSchema  # noqa: F401
from openapi_server.models.catalogs_product_groups_list200_response import CatalogsProductGroupsList200Response  # noqa: F401
from openapi_server.models.catalogs_product_groups_update_request_schema import CatalogsProductGroupsUpdateRequestSchema  # noqa: F401
from openapi_server.models.catalogs_vertical_product_group import CatalogsVerticalProductGroup  # noqa: F401
from openapi_server.models.pinterest_lib_error import PinterestLibError  # noqa: F401


def test_catalogs_product_groups_list(client: TestClient):
    """Test case for catalogs_product_groups_list

    List product groups
    """
    params = [("id", [56]),     ("feed_id", 'feed_id_example'),     ("catalog_id", 'catalog_id_example'),     ("ad_account_id", 'ad_account_id_example'),     ("bookmark", 'bookmark_example'),     ("page_size", 25)]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/catalogs/product_groups",
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_catalogs_product_groups_create(client: TestClient):
    """Test case for catalogs_product_groups_create

    Create product group
    """
    catalogs_product_groups_create_request_schema = openapi_server.CatalogsProductGroupsCreateRequestSchema()
    params = [("ad_account_id", 'ad_account_id_example')]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/catalogs/product_groups",
    #    headers=headers,
    #    json=catalogs_product_groups_create_request_schema,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_catalogs_product_groups_create_many(client: TestClient):
    """Test case for catalogs_product_groups_create_many

    Create product groups
    """
    catalogs_product_groups_create_many_request_items = [[openapi_server.CatalogsProductGroupsCreateManyRequestItems()]]
    params = [("ad_account_id", 'ad_account_id_example')]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/catalogs/product_groups/multiple",
    #    headers=headers,
    #    json=catalogs_product_groups_create_many_request_items,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_catalogs_product_groups_delete_many(client: TestClient):
    """Test case for catalogs_product_groups_delete_many

    Delete product groups
    """
    params = [("id", [56]),     ("ad_account_id", 'ad_account_id_example')]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "DELETE",
    #    "/catalogs/product_groups/multiple",
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_catalogs_product_groups_get(client: TestClient):
    """Test case for catalogs_product_groups_get

    Get product group
    """
    params = [("ad_account_id", 'ad_account_id_example')]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/catalogs/product_groups/{product_group_id}".format(product_group_id='product_group_id_example'),
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_catalogs_product_groups_delete(client: TestClient):
    """Test case for catalogs_product_groups_delete

    Delete product group
    """
    params = [("ad_account_id", 'ad_account_id_example')]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "DELETE",
    #    "/catalogs/product_groups/{product_group_id}".format(product_group_id='product_group_id_example'),
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_catalogs_product_groups_update(client: TestClient):
    """Test case for catalogs_product_groups_update

    Update single product group
    """
    catalogs_product_groups_update_request_schema = openapi_server.CatalogsProductGroupsUpdateRequestSchema()
    params = [("ad_account_id", 'ad_account_id_example')]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "PATCH",
    #    "/catalogs/product_groups/{product_group_id}".format(product_group_id='product_group_id_example'),
    #    headers=headers,
    #    json=catalogs_product_groups_update_request_schema,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_catalogs_product_groups_product_counts_get(client: TestClient):
    """Test case for catalogs_product_groups_product_counts_get

    Get product counts
    """
    params = [("ad_account_id", 'ad_account_id_example')]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/catalogs/product_groups/{product_group_id}/product_counts".format(product_group_id='product_group_id_example'),
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_catalogs_product_group_pins_list(client: TestClient):
    """Test case for catalogs_product_group_pins_list

    List products by product group
    """
    params = [("ad_account_id", 'ad_account_id_example'),     ("pin_metrics", False),     ("bookmark", 'bookmark_example'),     ("page_size", 25)]
    headers = {
        "Authorization": "Bearer special-key",
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/catalogs/product_groups/{product_group_id}/products".format(product_group_id='product_group_id_example'),
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_products_by_product_group_filter_list(client: TestClient):
    """Test case for products_by_product_group_filter_list

    List products by filter
    """
    catalogs_list_products_by_filter_request = openapi_server.CatalogsListProductsByFilterRequest()
    params = [("bookmark", 'bookmark_example'),     ("page_size", 25),     ("ad_account_id", 'ad_account_id_example'),     ("pin_metrics", False)]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/catalogs/products/get_by_product_group_filters",
    #    headers=headers,
    #    json=catalogs_list_products_by_filter_request,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200

