# coding: utf-8

from __future__ import absolute_import

from flask import json
from io import BytesIO

from app.openapi_server.models.media import Media  # noqa: E501
from app.openapi_server.models.media_list200_response import MediaList200Response  # noqa: E501
from app.openapi_server.models.media_upload import MediaUpload  # noqa: E501
from app.openapi_server.models.media_upload_create import MediaUploadCreate  # noqa: E501
from app.openapi_server.models.pinterest_lib_error import PinterestLibError  # noqa: E501
from openapi_server.test import BaseTestCase


class TestMediaController(BaseTestCase):
    """MediaController integration test stubs"""

    def test_media_create(self):
        """Test case for media_create

        Register media upload
        """
        body = {"media_type":"video"}
        response = self.client.open(
            '/v5/media',
            method='POST',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_media_get(self):
        """Test case for media_get

        Get media upload details
        """
        response = self.client.open(
            '/v5/media/{media_id}'.format(media_id='media_id_example'),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_media_list(self):
        """Test case for media_list

        List media uploads
        """
        query_string = [('bookmark', 'bookmark_example'),
                        ('page_size', 25)]
        response = self.client.open(
            '/v5/media',
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
