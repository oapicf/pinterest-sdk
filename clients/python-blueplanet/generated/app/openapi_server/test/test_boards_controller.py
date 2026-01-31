# coding: utf-8

from __future__ import absolute_import

from flask import json
from io import BytesIO

from app.openapi_server.models.board import Board  # noqa: E501
from app.openapi_server.models.board_create import BoardCreate  # noqa: E501
from app.openapi_server.models.board_privacy_filter import BoardPrivacyFilter  # noqa: E501
from app.openapi_server.models.board_section import BoardSection  # noqa: E501
from app.openapi_server.models.board_sections_list200_response import BoardSectionsList200Response  # noqa: E501
from app.openapi_server.models.board_with_update_privacy import BoardWithUpdatePrivacy  # noqa: E501
from app.openapi_server.models.board_with_update_privacy_update import BoardWithUpdatePrivacyUpdate  # noqa: E501
from app.openapi_server.models.boards_list200_response import BoardsList200Response  # noqa: E501
from app.openapi_server.models.boards_list_pins200_response import BoardsListPins200Response  # noqa: E501
from app.openapi_server.models.creative_type import CreativeType  # noqa: E501
from app.openapi_server.models.error import Error  # noqa: E501
from app.openapi_server.models.pinterest_lib_error import PinterestLibError  # noqa: E501
from openapi_server.test import BaseTestCase


class TestBoardsController(BaseTestCase):
    """BoardsController integration test stubs"""

    def test_board_sections_create(self):
        """Test case for board_sections_create

        Create board section
        """
        body = {"name":"Salads","id":"549755885175"}
        query_string = [('ad_account_id', 'ad_account_id_example')]
        response = self.client.open(
            '/v5/boards/{board_id}/sections'.format(board_id='board_id_example'),
            method='POST',
            data=json.dumps(body),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_board_sections_delete(self):
        """Test case for board_sections_delete

        Delete board section
        """
        query_string = [('ad_account_id', 'ad_account_id_example')]
        response = self.client.open(
            '/v5/boards/{board_id}/sections/{section_id}'.format(board_id='board_id_example', section_id='section_id_example'),
            method='DELETE',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_board_sections_list(self):
        """Test case for board_sections_list

        List board sections
        """
        query_string = [('ad_account_id', 'ad_account_id_example'),
                        ('bookmark', 'bookmark_example'),
                        ('page_size', 25)]
        response = self.client.open(
            '/v5/boards/{board_id}/sections'.format(board_id='board_id_example'),
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_board_sections_list_pins(self):
        """Test case for board_sections_list_pins

        List Pins on board section
        """
        query_string = [('ad_account_id', 'ad_account_id_example'),
                        ('bookmark', 'bookmark_example'),
                        ('page_size', 25)]
        response = self.client.open(
            '/v5/boards/{board_id}/sections/{section_id}/pins'.format(board_id='board_id_example', section_id='section_id_example'),
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_board_sections_update(self):
        """Test case for board_sections_update

        Update board section
        """
        body = {"name":"Salads","id":"549755885175"}
        query_string = [('ad_account_id', 'ad_account_id_example')]
        response = self.client.open(
            '/v5/boards/{board_id}/sections/{section_id}'.format(board_id='board_id_example', section_id='section_id_example'),
            method='PATCH',
            data=json.dumps(body),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_boards_create(self):
        """Test case for boards_create

        Create board
        """
        body = {"name":"Summer recipes","description":"My favorite summer recipes","privacy":"","is_ads_only":True}
        query_string = [('ad_account_id', 'ad_account_id_example')]
        response = self.client.open(
            '/v5/boards',
            method='POST',
            data=json.dumps(body),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_boards_delete(self):
        """Test case for boards_delete

        Delete board
        """
        query_string = [('ad_account_id', 'ad_account_id_example')]
        response = self.client.open(
            '/v5/boards/{board_id}'.format(board_id='board_id_example'),
            method='DELETE',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_boards_get(self):
        """Test case for boards_get

        Get board
        """
        query_string = [('ad_account_id', 'ad_account_id_example')]
        response = self.client.open(
            '/v5/boards/{board_id}'.format(board_id='board_id_example'),
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_boards_list(self):
        """Test case for boards_list

        List boards
        """
        query_string = [('ad_account_id', 'ad_account_id_example'),
                        ('privacy', openapi_server.BoardPrivacyFilter()),
                        ('bookmark', 'bookmark_example'),
                        ('page_size', 25)]
        response = self.client.open(
            '/v5/boards',
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_boards_list_pins(self):
        """Test case for boards_list_pins

        List Pins on board
        """
        query_string = [('bookmark', 'bookmark_example'),
                        ('page_size', 25),
                        ('creative_types', [openapi_server.CreativeType()]),
                        ('ad_account_id', 'ad_account_id_example'),
                        ('pin_metrics', False)]
        response = self.client.open(
            '/v5/boards/{board_id}/pins'.format(board_id='board_id_example'),
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_boards_update(self):
        """Test case for boards_update

        Update board
        """
        body = {"name":"Summer recipes","description":"My favorite summer recipes","privacy":"PUBLIC"}
        query_string = [('ad_account_id', 'ad_account_id_example')]
        response = self.client.open(
            '/v5/boards/{board_id}'.format(board_id='board_id_example'),
            method='PATCH',
            data=json.dumps(body),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
