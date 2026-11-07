# coding: utf-8

from __future__ import absolute_import

from flask import json
from io import BytesIO

from app.openapi_server.models.leads_export_response_data import LeadsExportResponseData  # noqa: E501
from app.openapi_server.models.leads_exports import LeadsExports  # noqa: E501
from app.openapi_server.models.leads_exports_create import LeadsExportsCreate  # noqa: E501
from app.openapi_server.models.pinterest_lib_error import PinterestLibError  # noqa: E501
from openapi_server.test import BaseTestCase


class TestLeadsExportController(BaseTestCase):
    """LeadsExportController integration test stubs"""

    def test_leads_export_create(self):
        """Test case for leads_export_create

        Create a request to export leads collected from a lead ad
        """
        body = {"ad_id":"687201361754","end_date":"2020-12-20","start_date":"2020-12-20"}
        response = self.client.open(
            '/v5/ad_accounts/{ad_account_id}/leads_export'.format(ad_account_id='ad_account_id_example'),
            method='POST',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_leads_export_get(self):
        """Test case for leads_export_get

        Get the lead export from the lead export create call
        """
        response = self.client.open(
            '/v5/ad_accounts/{ad_account_id}/leads_export/{leads_export_id}'.format(ad_account_id='ad_account_id_example', leads_export_id='leads_export_id_example'),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
