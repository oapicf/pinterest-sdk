# coding: utf-8

from __future__ import absolute_import

from flask import json
from io import BytesIO

from app.openapi_server.models.catalogs_create_report_response import CatalogsCreateReportResponse  # noqa: E501
from app.openapi_server.models.catalogs_report import CatalogsReport  # noqa: E501
from app.openapi_server.models.catalogs_report_parameters import CatalogsReportParameters  # noqa: E501
from app.openapi_server.models.catalogs_report_stats_parameters import CatalogsReportStatsParameters  # noqa: E501
from app.openapi_server.models.pinterest_lib_error import PinterestLibError  # noqa: E501
from app.openapi_server.models.reports_stats200_response import ReportsStats200Response  # noqa: E501
from openapi_server.test import BaseTestCase


class TestCatalogReportsController(BaseTestCase):
    """CatalogReportsController integration test stubs"""

    def test_reports_create(self):
        """Test case for reports_create

        Build catalogs report
        """
        body = {"catalog_type":"RETAIL","report":{"feed_id":"feed_id","processing_result_id":"processing_result_id","report_type":"FEED_INGESTION_ISSUES"}}
        query_string = [('ad_account_id', 'ad_account_id_example')]
        response = self.client.open(
            '/v5/catalogs/reports',
            method='POST',
            data=json.dumps(body),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_reports_get(self):
        """Test case for reports_get

        Get catalogs report
        """
        query_string = [('ad_account_id', 'ad_account_id_example'),
                        ('token', 'token_example')]
        response = self.client.open(
            '/v5/catalogs/reports',
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_reports_stats(self):
        """Test case for reports_stats

        List report stats
        """
        query_string = [('ad_account_id', 'ad_account_id_example'),
                        ('parameters', {'key': openapi_server.CatalogsReportStatsParameters()}),
                        ('bookmark', 'bookmark_example'),
                        ('page_size', 25)]
        response = self.client.open(
            '/v5/catalogs/reports/stats',
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
