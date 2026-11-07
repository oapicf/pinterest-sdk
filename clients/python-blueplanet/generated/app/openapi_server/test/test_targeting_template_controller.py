# coding: utf-8

from __future__ import absolute_import

from flask import json
from io import BytesIO

from app.openapi_server.models.pinterest_lib_error import PinterestLibError  # noqa: E501
from app.openapi_server.models.pinterest_lib_pagination_order import PinterestLibPaginationOrder  # noqa: E501
from app.openapi_server.models.targeting_template import TargetingTemplate  # noqa: E501
from app.openapi_server.models.targeting_template_create import TargetingTemplateCreate  # noqa: E501
from app.openapi_server.models.targeting_template_list200_response import TargetingTemplateList200Response  # noqa: E501
from app.openapi_server.models.targeting_template_update_request_read_or_update import TargetingTemplateUpdateRequestReadOrUpdate  # noqa: E501
from openapi_server.test import BaseTestCase


class TestTargetingTemplateController(BaseTestCase):
    """TargetingTemplateController integration test stubs"""

    def test_targeting_template_create(self):
        """Test case for targeting_template_create

        Create targeting templates
        """
        body = {"auto_targeting_enabled":True,"keywords":[{"match_type":"BROAD","value":"couples halloween costumes"},{"match_type":"BROAD","value":"couples halloween costumes"}],"name":"name","placement_group":"ALL","targeting_attributes":"","tracking_urls":{"impression":["URL1","URL2"],"click":["URL1","URL2"],"engagement":["URL1","URL2"],"buyable_button":["URL1","URL2"],"audience_verification":["URL1","URL2"]}}
        response = self.client.open(
            '/v5/ad_accounts/{ad_account_id}/targeting_templates'.format(ad_account_id='ad_account_id_example'),
            method='POST',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_targeting_template_list(self):
        """Test case for targeting_template_list

        List targeting templates
        """
        query_string = [('bookmark', 'bookmark_example'),
                        ('page_size', 25),
                        ('order', openapi_server.PinterestLibPaginationOrder()),
                        ('include_sizing', False),
                        ('search_query', 'search_query_example')]
        response = self.client.open(
            '/v5/ad_accounts/{ad_account_id}/targeting_templates'.format(ad_account_id='ad_account_id_example'),
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_targeting_template_update(self):
        """Test case for targeting_template_update

        Update targeting templates
        """
        body = {"id":"643","operation_type":"UPDATE","targeting_attributes":""}
        response = self.client.open(
            '/v5/ad_accounts/{ad_account_id}/targeting_templates'.format(ad_account_id='ad_account_id_example'),
            method='PATCH',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
