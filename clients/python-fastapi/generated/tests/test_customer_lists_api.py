# coding: utf-8

from fastapi.testclient import TestClient


from pydantic import Field, field_validator  # noqa: F401
from typing import Optional  # noqa: F401
from typing_extensions import Annotated  # noqa: F401
from openapi_server.models.customer_list import CustomerList  # noqa: F401
from openapi_server.models.customer_list_create import CustomerListCreate  # noqa: F401
from openapi_server.models.customer_list_update_with_required_body import CustomerListUpdateWithRequiredBody  # noqa: F401
from openapi_server.models.customer_lists_list200_response import CustomerListsList200Response  # noqa: F401
from openapi_server.models.pinterest_lib_error import PinterestLibError  # noqa: F401
from openapi_server.models.pinterest_lib_pagination_order import PinterestLibPaginationOrder  # noqa: F401


def test_customer_lists_list(client: TestClient):
    """Test case for customer_lists_list

    Get customer lists
    """
    params = [("bookmark", 'bookmark_example'),     ("page_size", 25),     ("order", openapi_server.PinterestLibPaginationOrder()),     ("exclude_nca", False)]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/ad_accounts/{ad_account_id}/customer_lists".format(ad_account_id='ad_account_id_example'),
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_customer_lists_create(client: TestClient):
    """Test case for customer_lists_create

    Create customer lists
    """
    customer_list_create = openapi_server.CustomerListCreate()

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/ad_accounts/{ad_account_id}/customer_lists".format(ad_account_id='ad_account_id_example'),
    #    headers=headers,
    #    json=customer_list_create,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_customer_lists_get(client: TestClient):
    """Test case for customer_lists_get

    Get customer list
    """

    headers = {
        "Authorization": "Bearer special-key",
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}".format(ad_account_id='ad_account_id_example', customer_list_id='customer_list_id_example'),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_customer_lists_update(client: TestClient):
    """Test case for customer_lists_update

    Update customer list
    """
    customer_list_update_with_required_body = openapi_server.CustomerListUpdateWithRequiredBody()

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "PATCH",
    #    "/ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}".format(ad_account_id='ad_account_id_example', customer_list_id='customer_list_id_example'),
    #    headers=headers,
    #    json=customer_list_update_with_required_body,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200

