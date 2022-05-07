# coding: utf-8

from fastapi.testclient import TestClient


from openapi_server.models.error import Error  # noqa: F401
from openapi_server.models.oauth_access_token_response import OauthAccessTokenResponse  # noqa: F401


def test_oauth_token(client: TestClient):
    """Test case for oauth_token

    Generate OAuth access token
    """

    headers = {
    }
    data = {
        "grant_type": 'grant_type_example'
    }
    response = client.request(
        "POST",
        "/oauth/token",
        headers=headers,
        data=data,
    )

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200

