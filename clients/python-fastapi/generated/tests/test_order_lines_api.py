# coding: utf-8

from fastapi.testclient import TestClient


from pydantic import Field, StrictStr, field_validator  # noqa: F401
from typing import Optional  # noqa: F401
from typing_extensions import Annotated  # noqa: F401
from openapi_server.models.error import Error  # noqa: F401
from openapi_server.models.order_line import OrderLine  # noqa: F401
from openapi_server.models.order_lines_list200_response import OrderLinesList200Response  # noqa: F401


def test_order_lines_list(client: TestClient):
    """Test case for order_lines_list

    Get order lines
    """
    params = [("page_size", 25),     ("order", 'ASCENDING'),     ("bookmark", 'bookmark_example')]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/ad_accounts/{ad_account_id}/order_lines".format(ad_account_id='ad_account_id_example'),
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_order_lines_get(client: TestClient):
    """Test case for order_lines_get

    Get order line
    """

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/ad_accounts/{ad_account_id}/order_lines/{order_line_id}".format(ad_account_id='ad_account_id_example', order_line_id='order_line_id_example'),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200

