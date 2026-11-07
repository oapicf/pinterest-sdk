# coding: utf-8

from fastapi.testclient import TestClient


from pydantic import Field, field_validator  # noqa: F401
from typing import Optional  # noqa: F401
from typing_extensions import Annotated  # noqa: F401
from openapi_server.models.boards_list200_response import BoardsList200Response  # noqa: F401
from openapi_server.models.pins_list200_response import PinsList200Response  # noqa: F401
from openapi_server.models.pinterest_lib_error import PinterestLibError  # noqa: F401
from openapi_server.models.search_partner_pins200_response import SearchPartnerPins200Response  # noqa: F401


def test_search_user_boards_get(client: TestClient):
    """Test case for search_user_boards_get

    Search user's boards
    """
    params = [("ad_account_id", 'ad_account_id_example'),     ("query", 'query_example'),     ("bookmark", 'bookmark_example'),     ("page_size", 25)]
    headers = {
        "Authorization": "Bearer special-key",
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/search/boards",
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_search_partner_pins(client: TestClient):
    """Test case for search_partner_pins

    Search pins by a given search term
    """
    params = [("term", 'term_example'),     ("country_code", 'country_code_example'),     ("bookmark", 'bookmark_example'),     ("locale", 'locale_example'),     ("limit", 10)]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/search/partner/pins",
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_search_user_pins_list(client: TestClient):
    """Test case for search_user_pins_list

    Search user's Pins
    """
    params = [("ad_account_id", 'ad_account_id_example'),     ("query", 'query_example'),     ("bookmark", 'bookmark_example')]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/search/pins",
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200

