# coding: utf-8

from __future__ import absolute_import

from flask import json
from io import BytesIO

from app.openapi_server.models.error import Error  # noqa: E501
from app.openapi_server.models.search_partner_pins200_response import SearchPartnerPins200Response  # noqa: E501
from app.openapi_server.models.search_user_boards_get200_response import SearchUserBoardsGet200Response  # noqa: E501
from app.openapi_server.models.search_user_pins_list200_response import SearchUserPinsList200Response  # noqa: E501
from openapi_server.test import BaseTestCase


class TestSearchController(BaseTestCase):
    """SearchController integration test stubs"""

    def test_search_partner_pins(self):
        """Test case for search_partner_pins

        Search pins by a given search term
        """
        query_string = [('term', 'term_example'),
                        ('country_code', 'US'),
                        ('bookmark', 'bookmark_example'),
                        ('locale', 'locale_example'),
                        ('limit', 10)]
        response = self.client.open(
            '/v5/search/partner/pins',
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_search_user_boards_get(self):
        """Test case for search_user_boards_get

        Search user's boards
        """
        query_string = [('ad_account_id', 'ad_account_id_example'),
                        ('bookmark', 'bookmark_example'),
                        ('page_size', 25),
                        ('query', 'query_example')]
        response = self.client.open(
            '/v5/search/boards',
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_search_user_pins_list(self):
        """Test case for search_user_pins_list

        Search user's Pins
        """
        query_string = [('ad_account_id', 'ad_account_id_example'),
                        ('query', 'Plants'),
                        ('bookmark', 'bookmark_example')]
        response = self.client.open(
            '/v5/search/pins',
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
