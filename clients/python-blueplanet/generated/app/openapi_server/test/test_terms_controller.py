# coding: utf-8

from __future__ import absolute_import

from flask import json
from io import BytesIO

from app.openapi_server.models.error import Error  # noqa: E501
from app.openapi_server.models.related_terms import RelatedTerms  # noqa: E501
from openapi_server.test import BaseTestCase


class TestTermsController(BaseTestCase):
    """TermsController integration test stubs"""

    def test_terms_related_list(self):
        """Test case for terms_related_list

        List related terms
        """
        query_string = [('terms', ['terms_example'])]
        response = self.client.open(
            '/v5/terms/related',
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_terms_suggested_list(self):
        """Test case for terms_suggested_list

        List suggested terms
        """
        query_string = [('term', 'sports'),
                        ('limit', 4)]
        response = self.client.open(
            '/v5/terms/suggested',
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
