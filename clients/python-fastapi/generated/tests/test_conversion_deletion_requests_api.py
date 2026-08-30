# coding: utf-8

from fastapi.testclient import TestClient


from pydantic import Field, StrictStr, field_validator  # noqa: F401
from typing import Any, Optional  # noqa: F401
from typing_extensions import Annotated  # noqa: F401
from openapi_server.models.conversion_deletion_request import ConversionDeletionRequest  # noqa: F401
from openapi_server.models.conversion_deletion_request_create import ConversionDeletionRequestCreate  # noqa: F401
from openapi_server.models.conversion_deletion_request_list200_response import ConversionDeletionRequestList200Response  # noqa: F401
from openapi_server.models.pinterest_lib_error import PinterestLibError  # noqa: F401
from openapi_server.models.pinterest_lib_pagination_order import PinterestLibPaginationOrder  # noqa: F401


def test_conversion_deletion_request_list(client: TestClient):
    """Test case for conversion_deletion_request_list

    List conversion deletion requests
    """
    params = [("bookmark", 'bookmark_example'),     ("page_size", 25),     ("order", openapi_server.PinterestLibPaginationOrder())]
    headers = {
        "Authorization": "Bearer special-key",
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/ad_accounts/{ad_account_id}/conversion_deletion_requests".format(ad_account_id='ad_account_id_example'),
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_conversion_deletion_request_create(client: TestClient):
    """Test case for conversion_deletion_request_create

    Create a conversion deletion request
    """
    conversion_deletion_request_create = openapi_server.ConversionDeletionRequestCreate()

    headers = {
        "Authorization": "Bearer special-key",
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/ad_accounts/{ad_account_id}/conversion_deletion_requests".format(ad_account_id='ad_account_id_example'),
    #    headers=headers,
    #    json=conversion_deletion_request_create,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_conversion_deletion_request_get(client: TestClient):
    """Test case for conversion_deletion_request_get

    Get a single conversion deletion request
    """

    headers = {
        "Authorization": "Bearer special-key",
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/ad_accounts/{ad_account_id}/conversion_deletion_requests/{request_id}".format(request_id='request_id_example', ad_account_id='ad_account_id_example'),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_conversion_deletion_request_delete(client: TestClient):
    """Test case for conversion_deletion_request_delete

    Delete a conversion deletion request
    """

    headers = {
        "Authorization": "Bearer special-key",
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "DELETE",
    #    "/ad_accounts/{ad_account_id}/conversion_deletion_requests/{request_id}".format(request_id='request_id_example', ad_account_id='ad_account_id_example'),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200

