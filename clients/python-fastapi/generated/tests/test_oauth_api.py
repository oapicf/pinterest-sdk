# coding: utf-8

from fastapi.testclient import TestClient


from pydantic import Field, StrictStr  # noqa: F401
from typing import Any, Optional  # noqa: F401
from typing_extensions import Annotated  # noqa: F401
from openapi_server.models.conversion_access_token import ConversionAccessToken  # noqa: F401
from openapi_server.models.oauth_access_token import OauthAccessToken  # noqa: F401
from openapi_server.models.pinterest_lib_error import PinterestLibError  # noqa: F401
from openapi_server.models.token_grant_type import TokenGrantType  # noqa: F401


def test_oauth_conversion_token(client: TestClient):
    """Test case for oauth_conversion_token

    Generate OAuth access token for conversion API
    """

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/oauth/conversion_token",
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_oauth_token(client: TestClient):
    """Test case for oauth_token

    Generate OAuth access token
    """

    headers = {
        "Authorization": "BasicZm9vOmJhcg==",
    }
    data = {
        "code": 'code_example',
        "continuous_refresh": 'continuous_refresh_example',
        "grant_type": openapi_server.TokenGrantType(),
        "redirect_uri": 'redirect_uri_example',
        "refresh_token": 'refresh_token_example',
        "scope": 'scope_example'
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/oauth/token",
    #    headers=headers,
    #    data=data,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_token_revoke(client: TestClient):
    """Test case for token_revoke

    Revoke a token
    """

    headers = {
        "Authorization": "BasicZm9vOmJhcg==",
    }
    data = {
        "token": 'token_example',
        "token_type_hint": openapi_server.TokenTypeHint()
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/oauth/token/revoke",
    #    headers=headers,
    #    data=data,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200

