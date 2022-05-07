# coding: utf-8

from fastapi.testclient import TestClient


from openapi_server.models.error import Error  # noqa: F401
from openapi_server.models.media_upload import MediaUpload  # noqa: F401
from openapi_server.models.media_upload_details import MediaUploadDetails  # noqa: F401
from openapi_server.models.media_upload_request import MediaUploadRequest  # noqa: F401
from openapi_server.models.paginated import Paginated  # noqa: F401


def test_media_create(client: TestClient):
    """Test case for media_create

    Register media upload
    """
    media_upload_request = {"media_type":"video"}

    headers = {
        "Authorization": "Bearer special-key",
    }
    response = client.request(
        "POST",
        "/media",
        headers=headers,
        json=media_upload_request,
    )

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_media_get(client: TestClient):
    """Test case for media_get

    Get media upload details
    """

    headers = {
        "Authorization": "Bearer special-key",
    }
    response = client.request(
        "GET",
        "/media/{media_id}".format(media_id='media_id_example'),
        headers=headers,
    )

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_media_list(client: TestClient):
    """Test case for media_list

    List media uploads
    """
    params = [("bookmark", 'bookmark_example'),     ("page_size", 25)]
    headers = {
        "Authorization": "Bearer special-key",
    }
    response = client.request(
        "GET",
        "/media",
        headers=headers,
        params=params,
    )

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200

