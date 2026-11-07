# coding: utf-8

from __future__ import absolute_import

from flask import json
from io import BytesIO

from app.openapi_server.models.catalogs_list_products_by_filter_request import CatalogsListProductsByFilterRequest  # noqa: E501
from app.openapi_server.models.catalogs_product_group_pins_list200_response import CatalogsProductGroupPinsList200Response  # noqa: E501
from app.openapi_server.models.catalogs_product_group_product_counts_vertical import CatalogsProductGroupProductCountsVertical  # noqa: E501
from app.openapi_server.models.catalogs_product_groups_create_many_request_items import CatalogsProductGroupsCreateManyRequestItems  # noqa: E501
from app.openapi_server.models.catalogs_product_groups_create_request_schema import CatalogsProductGroupsCreateRequestSchema  # noqa: E501
from app.openapi_server.models.catalogs_product_groups_list200_response import CatalogsProductGroupsList200Response  # noqa: E501
from app.openapi_server.models.catalogs_product_groups_update_request_schema import CatalogsProductGroupsUpdateRequestSchema  # noqa: E501
from app.openapi_server.models.catalogs_vertical_product_group import CatalogsVerticalProductGroup  # noqa: E501
from app.openapi_server.models.pinterest_lib_error import PinterestLibError  # noqa: E501
from openapi_server.test import BaseTestCase


class TestCatalogProductGroupsController(BaseTestCase):
    """CatalogProductGroupsController integration test stubs"""

    def test_catalogs_product_group_pins_list(self):
        """Test case for catalogs_product_group_pins_list

        List products by product group
        """
        query_string = [('ad_account_id', 'ad_account_id_example'),
                        ('pin_metrics', False),
                        ('bookmark', 'bookmark_example'),
                        ('page_size', 25)]
        response = self.client.open(
            '/v5/catalogs/product_groups/{product_group_id}/products'.format(product_group_id='product_group_id_example'),
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_catalogs_product_groups_create(self):
        """Test case for catalogs_product_groups_create

        Create product group
        """
        body = {"description":"description","feed_id":"2680059592705","filters":{"any_of":[{"MIN_PRICE":{"inclusion":True,"negated":True,"values":0.14658129805029452}},{"MIN_PRICE":{"inclusion":True,"negated":True,"values":0.14658129805029452}}]},"is_featured":True,"name":"name"}
        query_string = [('ad_account_id', 'ad_account_id_example')]
        response = self.client.open(
            '/v5/catalogs/product_groups',
            method='POST',
            data=json.dumps(body),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_catalogs_product_groups_create_many(self):
        """Test case for catalogs_product_groups_create_many

        Create product groups
        """
        body = {"description":"description","feed_id":"2680059592705","filters":{"any_of":[{"MIN_PRICE":{"inclusion":True,"negated":True,"values":0.14658129805029452}},{"MIN_PRICE":{"inclusion":True,"negated":True,"values":0.14658129805029452}}]},"is_featured":True,"name":"name"}
        query_string = [('ad_account_id', 'ad_account_id_example')]
        response = self.client.open(
            '/v5/catalogs/product_groups/multiple',
            method='POST',
            data=json.dumps(body),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_catalogs_product_groups_delete(self):
        """Test case for catalogs_product_groups_delete

        Delete product group
        """
        query_string = [('ad_account_id', 'ad_account_id_example')]
        response = self.client.open(
            '/v5/catalogs/product_groups/{product_group_id}'.format(product_group_id='product_group_id_example'),
            method='DELETE',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_catalogs_product_groups_delete_many(self):
        """Test case for catalogs_product_groups_delete_many

        Delete product groups
        """
        query_string = [('id', [56]),
                        ('ad_account_id', 'ad_account_id_example')]
        response = self.client.open(
            '/v5/catalogs/product_groups/multiple',
            method='DELETE',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_catalogs_product_groups_get(self):
        """Test case for catalogs_product_groups_get

        Get product group
        """
        query_string = [('ad_account_id', 'ad_account_id_example')]
        response = self.client.open(
            '/v5/catalogs/product_groups/{product_group_id}'.format(product_group_id='product_group_id_example'),
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_catalogs_product_groups_list(self):
        """Test case for catalogs_product_groups_list

        List product groups
        """
        query_string = [('id', [56]),
                        ('feed_id', 'feed_id_example'),
                        ('catalog_id', 'catalog_id_example'),
                        ('ad_account_id', 'ad_account_id_example'),
                        ('bookmark', 'bookmark_example'),
                        ('page_size', 25)]
        response = self.client.open(
            '/v5/catalogs/product_groups',
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_catalogs_product_groups_product_counts_get(self):
        """Test case for catalogs_product_groups_product_counts_get

        Get product counts
        """
        query_string = [('ad_account_id', 'ad_account_id_example')]
        response = self.client.open(
            '/v5/catalogs/product_groups/{product_group_id}/product_counts'.format(product_group_id='product_group_id_example'),
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_catalogs_product_groups_update(self):
        """Test case for catalogs_product_groups_update

        Update single product group
        """
        body = {"description":"description","is_featured":True,"name":"name"}
        query_string = [('ad_account_id', 'ad_account_id_example')]
        response = self.client.open(
            '/v5/catalogs/product_groups/{product_group_id}'.format(product_group_id='product_group_id_example'),
            method='PATCH',
            data=json.dumps(body),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_products_by_product_group_filter_list(self):
        """Test case for products_by_product_group_filter_list

        List products by filter
        """
        body = {"feed_id":"2680059592705","filters":{"any_of":[{"MIN_PRICE":{"inclusion":True,"negated":True,"values":0.14658129805029452}},{"MIN_PRICE":{"inclusion":True,"negated":True,"values":0.14658129805029452}}]}}
        query_string = [('bookmark', 'bookmark_example'),
                        ('page_size', 25),
                        ('ad_account_id', 'ad_account_id_example'),
                        ('pin_metrics', False)]
        response = self.client.open(
            '/v5/catalogs/products/get_by_product_group_filters',
            method='POST',
            data=json.dumps(body),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
