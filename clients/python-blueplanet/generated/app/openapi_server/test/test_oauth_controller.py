# coding: utf-8

from __future__ import absolute_import

from flask import json
from io import BytesIO

from app.openapi_server.models.conversion_access_token import ConversionAccessToken  # noqa: E501
from app.openapi_server.models.oauth_access_token import OauthAccessToken  # noqa: E501
from app.openapi_server.models.pinterest_lib_error import PinterestLibError  # noqa: E501
from app.openapi_server.models.token_grant_type import TokenGrantType  # noqa: E501
from app.openapi_server.models.token_type_hint import TokenTypeHint  # noqa: E501
from openapi_server.test import BaseTestCase


class TestOauthController(BaseTestCase):
    """OauthController integration test stubs"""

    def test_oauth_conversion_token(self):
        """Test case for oauth_conversion_token

        Generate OAuth access token for conversion API
        """
        response = self.client.open(
            '/v5/oauth/conversion_token',
            method='POST')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_oauth_token(self):
        """Test case for oauth_token

        Generate OAuth access token
        """
        data = dict(code='code_example',
                    continuous_refresh='continuous_refresh_example',
                    grant_type=openapi_server.TokenGrantType(),
                    redirect_uri='redirect_uri_example',
                    refresh_token='refresh_token_example',
                    scope='scope_example')
        response = self.client.open(
            '/v5/oauth/token',
            method='POST',
            data=data,
            content_type='application/x-www-form-urlencoded')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_token_revoke(self):
        """Test case for token_revoke

        Revoke a token
        """
        data = dict(token='token_example',
                    token_type_hint=openapi_server.TokenTypeHint())
        response = self.client.open(
            '/v5/oauth/token/revoke',
            method='POST',
            data=data,
            content_type='application/x-www-form-urlencoded')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
