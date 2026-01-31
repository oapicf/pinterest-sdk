# coding: utf-8

from __future__ import absolute_import

from flask import json
from io import BytesIO

from app.openapi_server.models.error import Error  # noqa: E501
from app.openapi_server.models.terms_of_service import TermsOfService  # noqa: E501
from openapi_server.test import BaseTestCase


class TestTermsOfServiceController(BaseTestCase):
    """TermsOfServiceController integration test stubs"""

    def test_terms_of_service_get(self):
        """Test case for terms_of_service_get

        Get terms of service
        """
        query_string = [('include_html', False),
                        ('tos_type', 'tos_type_example')]
        response = self.client.open(
            '/v5/ad_accounts/{ad_account_id}/terms_of_service'.format(ad_account_id='ad_account_id_example'),
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
