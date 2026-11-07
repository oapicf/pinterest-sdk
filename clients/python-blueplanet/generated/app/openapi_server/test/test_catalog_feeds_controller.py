# coding: utf-8

from __future__ import absolute_import

from flask import json
from io import BytesIO

from app.openapi_server.models.catalogs_feed import CatalogsFeed  # noqa: E501
from app.openapi_server.models.catalogs_feed_create_request_schema import CatalogsFeedCreateRequestSchema  # noqa: E501
from app.openapi_server.models.catalogs_feed_ingestion import CatalogsFeedIngestion  # noqa: E501
from app.openapi_server.models.catalogs_feed_update_request_schema import CatalogsFeedUpdateRequestSchema  # noqa: E501
from app.openapi_server.models.catalogs_item_validation_issue import CatalogsItemValidationIssue  # noqa: E501
from app.openapi_server.models.feed_processing_results_list200_response import FeedProcessingResultsList200Response  # noqa: E501
from app.openapi_server.models.feeds_list200_response import FeedsList200Response  # noqa: E501
from app.openapi_server.models.items_issues_list200_response import ItemsIssuesList200Response  # noqa: E501
from app.openapi_server.models.pinterest_lib_error import PinterestLibError  # noqa: E501
from openapi_server.test import BaseTestCase


class TestCatalogFeedsController(BaseTestCase):
    """CatalogFeedsController integration test stubs"""

    def test_feed_processing_results_list(self):
        """Test case for feed_processing_results_list

        List feed processing results
        """
        query_string = [('ad_account_id', 'ad_account_id_example'),
                        ('bookmark', 'bookmark_example'),
                        ('page_size', 25)]
        response = self.client.open(
            '/v5/catalogs/feeds/{feed_id}/processing_results'.format(feed_id='feed_id_example'),
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_feeds_create(self):
        """Test case for feeds_create

        Create feed
        """
        body = {"catalog_id":"catalog_id","catalog_type":"RETAIL","credentials":{"password":"password","username":"username"},"default_availability":"IN_STOCK","default_country":"AD","default_currency":"AED","default_locale":"af-ZA","format":"TSV","location":"location","name":"name","preferred_processing_schedule":{"time":"time","timezone":""},"status":""}
        query_string = [('ad_account_id', 'ad_account_id_example')]
        response = self.client.open(
            '/v5/catalogs/feeds',
            method='POST',
            data=json.dumps(body),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_feeds_delete(self):
        """Test case for feeds_delete

        Delete feed
        """
        query_string = [('ad_account_id', 'ad_account_id_example')]
        response = self.client.open(
            '/v5/catalogs/feeds/{feed_id}'.format(feed_id='feed_id_example'),
            method='DELETE',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_feeds_get(self):
        """Test case for feeds_get

        Get feed
        """
        query_string = [('ad_account_id', 'ad_account_id_example')]
        response = self.client.open(
            '/v5/catalogs/feeds/{feed_id}'.format(feed_id='feed_id_example'),
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_feeds_ingest(self):
        """Test case for feeds_ingest

        Ingest feed items
        """
        query_string = [('ad_account_id', 'ad_account_id_example')]
        response = self.client.open(
            '/v5/catalogs/feeds/{feed_id}/ingest'.format(feed_id='feed_id_example'),
            method='POST',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_feeds_list(self):
        """Test case for feeds_list

        List feeds
        """
        query_string = [('catalog_id', 'catalog_id_example'),
                        ('ad_account_id', 'ad_account_id_example'),
                        ('bookmark', 'bookmark_example'),
                        ('page_size', 25)]
        response = self.client.open(
            '/v5/catalogs/feeds',
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_feeds_update(self):
        """Test case for feeds_update

        Update feed
        """
        body = {"catalog_type":"RETAIL","credentials":{"password":"password","username":"username"},"default_availability":"IN_STOCK","default_currency":"AED","format":"TSV","location":"location","name":"name","preferred_processing_schedule":{"time":"time","timezone":""},"status":"ACTIVE"}
        query_string = [('ad_account_id', 'ad_account_id_example')]
        response = self.client.open(
            '/v5/catalogs/feeds/{feed_id}'.format(feed_id='feed_id_example'),
            method='PATCH',
            data=json.dumps(body),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_items_issues_list(self):
        """Test case for items_issues_list

        List item issues
        """
        query_string = [('item_numbers', [56]),
                        ('item_validation_issue', openapi_server.CatalogsItemValidationIssue()),
                        ('ad_account_id', 'ad_account_id_example'),
                        ('bookmark', 'bookmark_example'),
                        ('page_size', 25)]
        response = self.client.open(
            '/v5/catalogs/processing_results/{processing_result_id}/item_issues'.format(processing_result_id='processing_result_id_example'),
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
