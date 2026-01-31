# coding: utf-8

from __future__ import absolute_import

from flask import json
from io import BytesIO

from app.openapi_server.models.catalog import Catalog  # noqa: E501
from app.openapi_server.models.catalogs_available_filter_values import CatalogsAvailableFilterValues  # noqa: E501
from app.openapi_server.models.catalogs_create_request import CatalogsCreateRequest  # noqa: E501
from app.openapi_server.models.catalogs_list200_response import CatalogsList200Response  # noqa: E501
from app.openapi_server.models.catalogs_locale import CatalogsLocale  # noqa: E501
from app.openapi_server.models.country import Country  # noqa: E501
from app.openapi_server.models.error import Error  # noqa: E501
from openapi_server.test import BaseTestCase


class TestCatalogsController(BaseTestCase):
    """CatalogsController integration test stubs"""

    def test_catalogs_available_filter_values(self):
        """Test case for catalogs_available_filter_values

        List available filter values
        """
        query_string = [('catalog_id', 'catalog_id_example'),
                        ('feed_id', 'feed_id_example'),
                        ('country', openapi_server.Country()),
                        ('language', openapi_server.CatalogsLocale()),
                        ('ad_account_id', 'ad_account_id_example')]
        response = self.client.open(
            '/v5/catalogs/available_filter_values',
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_catalogs_create(self):
        """Test case for catalogs_create

        Create catalog
        """
        body = {"catalog_type":"RETAIL","name":"name"}
        query_string = [('ad_account_id', 'ad_account_id_example')]
        response = self.client.open(
            '/v5/catalogs',
            method='POST',
            data=json.dumps(body),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_catalogs_list(self):
        """Test case for catalogs_list

        List catalogs
        """
        query_string = [('bookmark', 'bookmark_example'),
                        ('page_size', 25),
                        ('ad_account_id', 'ad_account_id_example')]
        response = self.client.open(
            '/v5/catalogs',
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
