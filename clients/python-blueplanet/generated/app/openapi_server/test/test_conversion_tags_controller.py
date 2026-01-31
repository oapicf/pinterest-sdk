# coding: utf-8

from __future__ import absolute_import

from flask import json
from io import BytesIO

from app.openapi_server.models.conversion_event_response import ConversionEventResponse  # noqa: E501
from app.openapi_server.models.conversion_tag import ConversionTag  # noqa: E501
from app.openapi_server.models.conversion_tag_create import ConversionTagCreate  # noqa: E501
from app.openapi_server.models.conversion_tags_list200_response import ConversionTagsList200Response  # noqa: E501
from app.openapi_server.models.error import Error  # noqa: E501
from app.openapi_server.models.page_visit_conversion_tags_get200_response import PageVisitConversionTagsGet200Response  # noqa: E501
from app.openapi_server.models.pinterest_lib_error import PinterestLibError  # noqa: E501
from openapi_server.test import BaseTestCase


class TestConversionTagsController(BaseTestCase):
    """ConversionTagsController integration test stubs"""

    def test_conversion_tags_create(self):
        """Test case for conversion_tags_create

        Create conversion tag
        """
        body = {"aem_fnln_enabled":False,"aem_external_id_enabled":False,"aem_db_enabled":False,"aem_enabled":False,"name":"ACME Checkout Test Tag","md_frequency":0.6,"aem_ph_enabled":False,"aem_ge_enabled":False,"aem_loc_enabled":False}
        response = self.client.open(
            '/v5/ad_accounts/{ad_account_id}/conversion_tags'.format(ad_account_id='ad_account_id_example'),
            method='POST',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_conversion_tags_get(self):
        """Test case for conversion_tags_get

        Get conversion tag
        """
        response = self.client.open(
            '/v5/ad_accounts/{ad_account_id}/conversion_tags/{conversion_tag_id}'.format(ad_account_id='ad_account_id_example', conversion_tag_id='2617998078212'),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_conversion_tags_list(self):
        """Test case for conversion_tags_list

        List conversion tags
        """
        query_string = [('filter_deleted', False)]
        response = self.client.open(
            '/v5/ad_accounts/{ad_account_id}/conversion_tags'.format(ad_account_id='ad_account_id_example'),
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_ocpm_eligible_conversion_tags_get(self):
        """Test case for ocpm_eligible_conversion_tags_get

        Get Ocpm eligible conversion tags
        """
        response = self.client.open(
            '/v5/ad_accounts/{ad_account_id}/conversion_tags/ocpm_eligible'.format(ad_account_id='ad_account_id_example'),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_page_visit_conversion_tags_get(self):
        """Test case for page_visit_conversion_tags_get

        Get page visit conversion tags
        """
        query_string = [('page_size', 25),
                        ('order', 'ASCENDING'),
                        ('bookmark', 'bookmark_example')]
        response = self.client.open(
            '/v5/ad_accounts/{ad_account_id}/conversion_tags/page_visit'.format(ad_account_id='ad_account_id_example'),
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
