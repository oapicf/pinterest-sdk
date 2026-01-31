# coding: utf-8

from __future__ import absolute_import

from flask import json
from io import BytesIO

from app.openapi_server.models.audience_definition_response import AudienceDefinitionResponse  # noqa: E501
from app.openapi_server.models.audience_insight_type import AudienceInsightType  # noqa: E501
from app.openapi_server.models.audience_insights_response import AudienceInsightsResponse  # noqa: E501
from app.openapi_server.models.error import Error  # noqa: E501
from openapi_server.test import BaseTestCase


class TestAudienceInsightsController(BaseTestCase):
    """AudienceInsightsController integration test stubs"""

    def test_audience_insights_get(self):
        """Test case for audience_insights_get

        Get audience insights
        """
        query_string = [('audience_insight_type', YOUR_TOTAL_AUDIENCE)]
        response = self.client.open(
            '/v5/ad_accounts/{ad_account_id}/audience_insights'.format(ad_account_id='ad_account_id_example'),
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_audience_insights_scope_and_type_get(self):
        """Test case for audience_insights_scope_and_type_get

        Get audience insights scope and type
        """
        response = self.client.open(
            '/v5/ad_accounts/{ad_account_id}/insights/audiences'.format(ad_account_id='ad_account_id_example'),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
