# coding: utf-8

from __future__ import absolute_import

from flask import json
from io import BytesIO

from app.openapi_server.models.pinterest_lib_error import PinterestLibError  # noqa: E501
from app.openapi_server.models.product_tags_bulk_add_request import ProductTagsBulkAddRequest  # noqa: E501
from app.openapi_server.models.product_tags_bulk_delete_request import ProductTagsBulkDeleteRequest  # noqa: E501
from app.openapi_server.models.product_tags_error import ProductTagsError  # noqa: E501
from app.openapi_server.models.product_tags_response import ProductTagsResponse  # noqa: E501
from openapi_server.test import BaseTestCase


class TestProductTagsController(BaseTestCase):
    """ProductTagsController integration test stubs"""

    def test_product_tags_bulk_add(self):
        """Test case for product_tags_bulk_add

        Add product tags to pin
        """
        body = {"product_tags":[{"pin_id":"pin_id"},{"pin_id":"pin_id"},{"pin_id":"pin_id"},{"pin_id":"pin_id"},{"pin_id":"pin_id"}]}
        response = self.client.open(
            '/v5/pins/{pin_id}/product_tags'.format(pin_id='pin_id_example'),
            method='POST',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_product_tags_bulk_delete(self):
        """Test case for product_tags_bulk_delete

        Delete product tags from pin
        """
        body = {"product_tags":[{"pin_id":"pin_id"},{"pin_id":"pin_id"},{"pin_id":"pin_id"},{"pin_id":"pin_id"},{"pin_id":"pin_id"}]}
        response = self.client.open(
            '/v5/pins/{pin_id}/product_tags/bulk-delete'.format(pin_id='pin_id_example'),
            method='POST',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_product_tags_list(self):
        """Test case for product_tags_list

        Get product tags for pin
        """
        response = self.client.open(
            '/v5/pins/{pin_id}/product_tags'.format(pin_id='pin_id_example'),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
