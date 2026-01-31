# coding: utf-8

from __future__ import absolute_import

from flask import json
from io import BytesIO

from app.openapi_server.models.event_quality_score import EventQualityScore  # noqa: E501
from app.openapi_server.models.ingestion_source_options import IngestionSourceOptions  # noqa: E501
from app.openapi_server.models.lookback_period_options import LookbackPeriodOptions  # noqa: E501
from app.openapi_server.models.pinterest_lib_error import PinterestLibError  # noqa: E501
from app.openapi_server.models.source_platform_options import SourcePlatformOptions  # noqa: E501
from openapi_server.test import BaseTestCase


class TestConversionEqsController(BaseTestCase):
    """ConversionEqsController integration test stubs"""

    def test_conversion_eqs_list(self):
        """Test case for conversion_eqs_list

        Get event quality score (EQS)
        """
        query_string = [('lookback_period', openapi_server.LookbackPeriodOptions()),
                        ('source_platform', openapi_server.SourcePlatformOptions()),
                        ('ingestion_source', openapi_server.IngestionSourceOptions())]
        response = self.client.open(
            '/v5/ad_accounts/{ad_account_id}/conversion_eqs'.format(ad_account_id='ad_account_id_example'),
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
