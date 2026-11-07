# coding: utf-8

from fastapi.testclient import TestClient


from pydantic import Field, field_validator  # noqa: F401
from typing import Any, List, Optional  # noqa: F401
from typing_extensions import Annotated  # noqa: F401
from openapi_server.models.board import Board  # noqa: F401
from openapi_server.models.board_create import BoardCreate  # noqa: F401
from openapi_server.models.board_privacy_filter import BoardPrivacyFilter  # noqa: F401
from openapi_server.models.board_section import BoardSection  # noqa: F401
from openapi_server.models.board_section_create import BoardSectionCreate  # noqa: F401
from openapi_server.models.board_section_update_with_required_body import BoardSectionUpdateWithRequiredBody  # noqa: F401
from openapi_server.models.board_sections_list200_response import BoardSectionsList200Response  # noqa: F401
from openapi_server.models.board_with_update_privacy import BoardWithUpdatePrivacy  # noqa: F401
from openapi_server.models.board_with_update_privacy_update import BoardWithUpdatePrivacyUpdate  # noqa: F401
from openapi_server.models.boards_list200_response import BoardsList200Response  # noqa: F401
from openapi_server.models.boards_list_pins200_response import BoardsListPins200Response  # noqa: F401
from openapi_server.models.creative_type import CreativeType  # noqa: F401
from openapi_server.models.pinterest_lib_error import PinterestLibError  # noqa: F401


def test_boards_list(client: TestClient):
    """Test case for boards_list

    List boards
    """
    params = [("ad_account_id", 'ad_account_id_example'),     ("privacy", openapi_server.BoardPrivacyFilter()),     ("bookmark", 'bookmark_example'),     ("page_size", 25)]
    headers = {
        "Authorization": "Bearer special-key",
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/boards",
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_boards_create(client: TestClient):
    """Test case for boards_create

    Create board
    """
    board_create = openapi_server.BoardCreate()
    params = [("ad_account_id", 'ad_account_id_example')]
    headers = {
        "Authorization": "Bearer special-key",
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/boards",
    #    headers=headers,
    #    json=board_create,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_boards_get(client: TestClient):
    """Test case for boards_get

    Get board
    """
    params = [("ad_account_id", 'ad_account_id_example')]
    headers = {
        "Authorization": "Bearer special-key",
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/boards/{board_id}".format(board_id='board_id_example'),
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_boards_delete(client: TestClient):
    """Test case for boards_delete

    Delete board
    """
    params = [("ad_account_id", 'ad_account_id_example')]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "DELETE",
    #    "/boards/{board_id}".format(board_id='board_id_example'),
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_boards_update(client: TestClient):
    """Test case for boards_update

    Update board
    """
    board_with_update_privacy_update = openapi_server.BoardWithUpdatePrivacyUpdate()
    params = [("ad_account_id", 'ad_account_id_example')]
    headers = {
        "Authorization": "Bearer special-key",
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "PATCH",
    #    "/boards/{board_id}".format(board_id='board_id_example'),
    #    headers=headers,
    #    json=board_with_update_privacy_update,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_boards_list_pins(client: TestClient):
    """Test case for boards_list_pins

    List Pins on board
    """
    params = [("creative_types", [openapi_server.CreativeType()]),     ("ad_account_id", 'ad_account_id_example'),     ("pin_metrics", False),     ("bookmark", 'bookmark_example'),     ("page_size", 25)]
    headers = {
        "Authorization": "Bearer special-key",
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/boards/{board_id}/pins".format(board_id='board_id_example'),
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_board_sections_list(client: TestClient):
    """Test case for board_sections_list

    List board sections
    """
    params = [("ad_account_id", 'ad_account_id_example'),     ("bookmark", 'bookmark_example'),     ("page_size", 25)]
    headers = {
        "Authorization": "Bearer special-key",
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/boards/{board_id}/sections".format(board_id='board_id_example'),
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_board_sections_create(client: TestClient):
    """Test case for board_sections_create

    Create board section
    """
    board_section_create = openapi_server.BoardSectionCreate()
    params = [("ad_account_id", 'ad_account_id_example')]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/boards/{board_id}/sections".format(board_id='board_id_example'),
    #    headers=headers,
    #    json=board_section_create,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_board_sections_delete(client: TestClient):
    """Test case for board_sections_delete

    Delete board section
    """
    params = [("ad_account_id", 'ad_account_id_example')]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "DELETE",
    #    "/boards/{board_id}/sections/{section_id}".format(board_id='board_id_example', section_id='section_id_example'),
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_board_sections_update(client: TestClient):
    """Test case for board_sections_update

    Update board section
    """
    board_section_update_with_required_body = openapi_server.BoardSectionUpdateWithRequiredBody()
    params = [("ad_account_id", 'ad_account_id_example')]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "PATCH",
    #    "/boards/{board_id}/sections/{section_id}".format(board_id='board_id_example', section_id='section_id_example'),
    #    headers=headers,
    #    json=board_section_update_with_required_body,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_board_sections_list_pins(client: TestClient):
    """Test case for board_sections_list_pins

    List Pins on board section
    """
    params = [("ad_account_id", 'ad_account_id_example'),     ("bookmark", 'bookmark_example'),     ("page_size", 25)]
    headers = {
        "Authorization": "Bearer special-key",
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/boards/{board_id}/sections/{section_id}/pins".format(board_id='board_id_example', section_id='section_id_example'),
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200

