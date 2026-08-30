# coding: utf-8

from __future__ import absolute_import

from flask import json
from io import BytesIO

from app.openapi_server.models.catalogs_local_stores_create200_response_inner import CatalogsLocalStoresCreate200ResponseInner  # noqa: E501
from app.openapi_server.models.catalogs_local_stores_delete200_response_inner import CatalogsLocalStoresDelete200ResponseInner  # noqa: E501
from app.openapi_server.models.catalogs_local_stores_list200_response import CatalogsLocalStoresList200Response  # noqa: E501
from app.openapi_server.models.local_inventory_items_batch import LocalInventoryItemsBatch  # noqa: E501
from app.openapi_server.models.local_inventory_items_batch_create import LocalInventoryItemsBatchCreate  # noqa: E501
from app.openapi_server.models.local_inventory_items_get import LocalInventoryItemsGet  # noqa: E501
from app.openapi_server.models.local_inventory_items_get_create import LocalInventoryItemsGetCreate  # noqa: E501
from app.openapi_server.models.local_store import LocalStore  # noqa: E501
from app.openapi_server.models.local_store_batch_update import LocalStoreBatchUpdate  # noqa: E501
from app.openapi_server.models.local_store_create import LocalStoreCreate  # noqa: E501
from app.openapi_server.models.pinterest_lib_error import PinterestLibError  # noqa: E501
from app.openapi_server.models.supplemental_items_batch_response import SupplementalItemsBatchResponse  # noqa: E501
from openapi_server.test import BaseTestCase


class TestCatalogSupplementalController(BaseTestCase):
    """CatalogSupplementalController integration test stubs"""

    def test_catalogs_local_inventory_items_batch_operate(self):
        """Test case for catalogs_local_inventory_items_batch_operate

        Operate on local inventory item batch
        """
        body = {"operations":[{"attributes":{"ad_link":"https://examplelink.com","availability":"in stock","price":"49.99 USD","sale_price":"24.99 USD"},"item_id":"item_id_1","operation":"CREATE","store_code":"store_1"},{"attributes":{"ad_link":"https://examplelink.com","availability":"in stock","price":"49.99 USD","sale_price":"24.99 USD"},"item_id":"item_id_1","operation":"CREATE","store_code":"store_1"},{"attributes":{"ad_link":"https://examplelink.com","availability":"in stock","price":"49.99 USD","sale_price":"24.99 USD"},"item_id":"item_id_1","operation":"CREATE","store_code":"store_1"},{"attributes":{"ad_link":"https://examplelink.com","availability":"in stock","price":"49.99 USD","sale_price":"24.99 USD"},"item_id":"item_id_1","operation":"CREATE","store_code":"store_1"},{"attributes":{"ad_link":"https://examplelink.com","availability":"in stock","price":"49.99 USD","sale_price":"24.99 USD"},"item_id":"item_id_1","operation":"CREATE","store_code":"store_1"}]}
        query_string = [('ad_account_id', 'ad_account_id_example')]
        response = self.client.open(
            '/v5/catalogs/{catalog_id}/local_inventory_items/batch'.format(catalog_id='catalog_id_example'),
            method='POST',
            data=json.dumps(body),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_catalogs_local_inventory_items_post(self):
        """Test case for catalogs_local_inventory_items_post

        Get local inventory items (POST)
        """
        body = {"item_filters":[{"item_id":"item_id_1","store_code":"store_1"},{"item_id":"item_id_1","store_code":"store_1"},{"item_id":"item_id_1","store_code":"store_1"},{"item_id":"item_id_1","store_code":"store_1"},{"item_id":"item_id_1","store_code":"store_1"}]}
        query_string = [('ad_account_id', 'ad_account_id_example')]
        response = self.client.open(
            '/v5/catalogs/{catalog_id}/local_inventory_items/query'.format(catalog_id='catalog_id_example'),
            method='POST',
            data=json.dumps(body),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_catalogs_local_stores_create(self):
        """Test case for catalogs_local_stores_create

        Create local stores
        """
        body = {"address_primary":"123 Johnson St","address_secondary":"Suite 100","city":"Sunnyvale","country":"","latitude":-30.21,"longitude":50.45,"name":"Sunnyvale Store","postal_code":"94043","region":"CA","store_code":"store_1"}
        query_string = [('ad_account_id', 'ad_account_id_example')]
        response = self.client.open(
            '/v5/catalogs/{catalog_id}/local_stores'.format(catalog_id='catalog_id_example'),
            method='POST',
            data=json.dumps(body),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_catalogs_local_stores_delete(self):
        """Test case for catalogs_local_stores_delete

        Delete local stores
        """
        query_string = [('ids', ['ids_example']),
                        ('ad_account_id', 'ad_account_id_example')]
        response = self.client.open(
            '/v5/catalogs/{catalog_id}/local_stores'.format(catalog_id='catalog_id_example'),
            method='DELETE',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_catalogs_local_stores_list(self):
        """Test case for catalogs_local_stores_list

        List local stores
        """
        query_string = [('ids', ['ids_example']),
                        ('ad_account_id', 'ad_account_id_example'),
                        ('bookmark', 'bookmark_example'),
                        ('page_size', 25)]
        response = self.client.open(
            '/v5/catalogs/{catalog_id}/local_stores'.format(catalog_id='catalog_id_example'),
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_catalogs_local_stores_update(self):
        """Test case for catalogs_local_stores_update

        Update local stores
        """
        body = {"address_primary":"123 Johnson St","address_secondary":"Suite 100","city":"Sunnyvale","country":"","id":"1234567890","latitude":-30.21,"longitude":50.45,"name":"Sunnyvale Store","postal_code":"94043","region":"CA","store_code":"store_1"}
        query_string = [('ad_account_id', 'ad_account_id_example')]
        response = self.client.open(
            '/v5/catalogs/{catalog_id}/local_stores'.format(catalog_id='catalog_id_example'),
            method='PATCH',
            data=json.dumps(body),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_catalogs_supplemental_items_batch_get(self):
        """Test case for catalogs_supplemental_items_batch_get

        Get supplemental items batch status
        """
        query_string = [('ad_account_id', 'ad_account_id_example')]
        response = self.client.open(
            '/v5/catalogs/{catalog_id}/supplemental_items/batch/{batch_id}'.format(catalog_id='catalog_id_example', batch_id='batch_id_example'),
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
