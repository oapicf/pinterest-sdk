# coding: utf-8

from fastapi.testclient import TestClient


from pydantic import Field, StrictBool, StrictStr, field_validator  # noqa: F401
from typing import Any, Optional  # noqa: F401
from typing_extensions import Annotated  # noqa: F401
from openapi_server.models.customer_segment import CustomerSegment  # noqa: F401
from openapi_server.models.customer_segment_create import CustomerSegmentCreate  # noqa: F401
from openapi_server.models.customer_segment_list200_response import CustomerSegmentList200Response  # noqa: F401
from openapi_server.models.customer_segment_update_request_update_with_required_body import CustomerSegmentUpdateRequestUpdateWithRequiredBody  # noqa: F401
from openapi_server.models.pinterest_lib_error import PinterestLibError  # noqa: F401
from openapi_server.models.pinterest_lib_pagination_order import PinterestLibPaginationOrder  # noqa: F401


def test_customer_segment_list(client: TestClient):
    """Test case for customer_segment_list

    List customer segments
    """
    params = [("bookmark", 'bookmark_example'),     ("page_size", 25),     ("order", openapi_server.PinterestLibPaginationOrder()),     ("include_sizing", False),     ("search_query", 'search_query_example')]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/ad_accounts/{ad_account_id}/customer_segments".format(ad_account_id='ad_account_id_example'),
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_customer_segment_create(client: TestClient):
    """Test case for customer_segment_create

    Create customer segments
    """
    customer_segment_create = openapi_server.CustomerSegmentCreate()

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/ad_accounts/{ad_account_id}/customer_segments".format(ad_account_id='ad_account_id_example'),
    #    headers=headers,
    #    json=customer_segment_create,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_customer_segment_update(client: TestClient):
    """Test case for customer_segment_update

    Update customer segments
    """
    customer_segment_update_request_update_with_required_body = openapi_server.CustomerSegmentUpdateRequestUpdateWithRequiredBody()

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "PATCH",
    #    "/ad_accounts/{ad_account_id}/customer_segments".format(ad_account_id='ad_account_id_example'),
    #    headers=headers,
    #    json=customer_segment_update_request_update_with_required_body,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200

