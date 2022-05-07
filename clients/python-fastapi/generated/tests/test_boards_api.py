# coding: utf-8

from fastapi.testclient import TestClient


from openapi_server.models.board import Board  # noqa: F401
from openapi_server.models.board_section import BoardSection  # noqa: F401
from openapi_server.models.board_update import BoardUpdate  # noqa: F401
from openapi_server.models.error import Error  # noqa: F401
from openapi_server.models.paginated import Paginated  # noqa: F401


def test_board_sections_create(client: TestClient):
    """Test case for board_sections_create

    Create board section
    """
    board_section = {"name":"Salads","id":"549755885175"}

    headers = {
        "Authorization": "Bearer special-key",
    }
    response = client.request(
        "POST",
        "/boards/{board_id}/sections".format(board_id='board_id_example'),
        headers=headers,
        json=board_section,
    )

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_board_sections_delete(client: TestClient):
    """Test case for board_sections_delete

    Delete board section
    """

    headers = {
        "Authorization": "Bearer special-key",
    }
    response = client.request(
        "DELETE",
        "/boards/{board_id}/sections/{section_id}".format(board_id='board_id_example', section_id='section_id_example'),
        headers=headers,
    )

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_board_sections_list(client: TestClient):
    """Test case for board_sections_list

    List board sections
    """
    params = [("bookmark", 'bookmark_example'),     ("page_size", 25)]
    headers = {
        "Authorization": "Bearer special-key",
    }
    response = client.request(
        "GET",
        "/boards/{board_id}/sections".format(board_id='board_id_example'),
        headers=headers,
        params=params,
    )

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_board_sections_list_pins(client: TestClient):
    """Test case for board_sections_list_pins

    List Pins on board section
    """
    params = [("bookmark", 'bookmark_example'),     ("page_size", 25)]
    headers = {
        "Authorization": "Bearer special-key",
    }
    response = client.request(
        "GET",
        "/boards/{board_id}/sections/{section_id}/pins".format(board_id='board_id_example', section_id='section_id_example'),
        headers=headers,
        params=params,
    )

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_board_sections_update(client: TestClient):
    """Test case for board_sections_update

    Update board section
    """
    board_section = {"name":"Salads","id":"549755885175"}

    headers = {
        "Authorization": "Bearer special-key",
    }
    response = client.request(
        "PATCH",
        "/boards/{board_id}/sections/{section_id}".format(board_id='board_id_example', section_id='section_id_example'),
        headers=headers,
        json=board_section,
    )

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_boards_create(client: TestClient):
    """Test case for boards_create

    Create board
    """
    board = {"owner":"{}","name":"Summer Recipes","description":"My favorite summer recipes","privacy":"PUBLIC","id":"549755885175"}

    headers = {
        "Authorization": "Bearer special-key",
    }
    response = client.request(
        "POST",
        "/boards",
        headers=headers,
        json=board,
    )

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_boards_delete(client: TestClient):
    """Test case for boards_delete

    Delete board
    """

    headers = {
        "Authorization": "Bearer special-key",
    }
    response = client.request(
        "DELETE",
        "/boards/{board_id}".format(board_id='board_id_example'),
        headers=headers,
    )

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_boards_get(client: TestClient):
    """Test case for boards_get

    Get board
    """

    headers = {
        "Authorization": "Bearer special-key",
    }
    response = client.request(
        "GET",
        "/boards/{board_id}".format(board_id='board_id_example'),
        headers=headers,
    )

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_boards_list(client: TestClient):
    """Test case for boards_list

    List boards
    """
    params = [("bookmark", 'bookmark_example'),     ("page_size", 25),     ("privacy", 'privacy_example')]
    headers = {
        "Authorization": "Bearer special-key",
    }
    response = client.request(
        "GET",
        "/boards",
        headers=headers,
        params=params,
    )

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_boards_list_pins(client: TestClient):
    """Test case for boards_list_pins

    List Pins on board
    """
    params = [("bookmark", 'bookmark_example'),     ("page_size", 25)]
    headers = {
        "Authorization": "Bearer special-key",
    }
    response = client.request(
        "GET",
        "/boards/{board_id}/pins".format(board_id='board_id_example'),
        headers=headers,
        params=params,
    )

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_boards_update(client: TestClient):
    """Test case for boards_update

    Update board
    """
    board_update = {"name":"Summer Recipes","description":"My favorite summer recipes","privacy":"PUBLIC"}

    headers = {
        "Authorization": "Bearer special-key",
    }
    response = client.request(
        "PATCH",
        "/boards/{board_id}".format(board_id='board_id_example'),
        headers=headers,
        json=board_update,
    )

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200

