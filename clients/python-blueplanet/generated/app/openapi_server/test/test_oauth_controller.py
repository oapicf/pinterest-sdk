# coding: utf-8

from __future__ import absolute_import

from flask import json
from io import BytesIO

from app.openapi_server.models.conversion_access_token_response import ConversionAccessTokenResponse  # noqa: E501
from app.openapi_server.models.error import Error  # noqa: E501
from app.openapi_server.models.oauth_access_token_response import OauthAccessTokenResponse  # noqa: E501
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
        data = dict(grant_type='grant_type_example')
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
                    token_type_hint='token_type_hint_example')
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
