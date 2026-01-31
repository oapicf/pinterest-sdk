# coding: utf-8

from __future__ import absolute_import

from flask import json
from io import BytesIO

from app.openapi_server.models.catalogs_items import CatalogsItems  # noqa: E501
from app.openapi_server.models.catalogs_items_batch import CatalogsItemsBatch  # noqa: E501
from app.openapi_server.models.catalogs_items_request import CatalogsItemsRequest  # noqa: E501
from app.openapi_server.models.error import Error  # noqa: E501
from app.openapi_server.models.items_batch_post_request import ItemsBatchPostRequest  # noqa: E501
from openapi_server.test import BaseTestCase


class TestCatalogItemsController(BaseTestCase):
    """CatalogItemsController integration test stubs"""

    def test_items_batch_get(self):
        """Test case for items_batch_get

        Get item batch status
        """
        query_string = [('ad_account_id', 'ad_account_id_example')]
        response = self.client.open(
            '/v5/catalogs/items/batch/{batch_id}'.format(batch_id='66753b9bb65c46c49bd8503b27fecf9e'),
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_items_batch_post(self):
        """Test case for items_batch_post

        Operate on item batch
        """
        body = openapi_server.ItemsBatchPostRequest()
        query_string = [('ad_account_id', 'ad_account_id_example')]
        response = self.client.open(
            '/v5/catalogs/items/batch',
            method='POST',
            data=json.dumps(body),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_items_post(self):
        """Test case for items_post

        Get catalogs items (POST)
        """
        body = {"country":"AD","language":"af-ZA","filters":{"catalog_type":"RETAIL"}}
        query_string = [('ad_account_id', 'ad_account_id_example')]
        response = self.client.open(
            '/v5/catalogs/items',
            method='POST',
            data=json.dumps(body),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
