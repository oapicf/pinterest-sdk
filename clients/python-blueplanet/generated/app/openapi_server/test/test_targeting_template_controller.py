# coding: utf-8

from __future__ import absolute_import

from flask import json
from io import BytesIO

from app.openapi_server.models.error import Error  # noqa: E501
from app.openapi_server.models.targeting_template_create import TargetingTemplateCreate  # noqa: E501
from app.openapi_server.models.targeting_template_get_response_data import TargetingTemplateGetResponseData  # noqa: E501
from app.openapi_server.models.targeting_template_list200_response import TargetingTemplateList200Response  # noqa: E501
from app.openapi_server.models.targeting_template_update_request import TargetingTemplateUpdateRequest  # noqa: E501
from openapi_server.test import BaseTestCase


class TestTargetingTemplateController(BaseTestCase):
    """TargetingTemplateController integration test stubs"""

    def test_targeting_template_create(self):
        """Test case for targeting_template_create

        Create targeting templates
        """
        body = {"targeting_attributes":{"LOCATION":["LOCATION","LOCATION"],"MAXIMUM_AGE":"65+","AGE_BUCKET":["35-44","50-54"],"AUDIENCE_INCLUDE":["AUDIENCE_INCLUDE","AUDIENCE_INCLUDE"],"SHOPPING_RETARGETING":[{"lookback_window":30,"exclusion_window":14,"tag_types":[0,6]},{"lookback_window":30,"exclusion_window":14,"tag_types":[0,6]}],"TARGETING_STRATEGY":["CHOOSE_YOUR_OWN","CHOOSE_YOUR_OWN"],"INTEREST":["INTEREST","INTEREST"],"GEO":["GEO","GEO"],"MINIMUM_AGE":"18","LOCALE":["LOCALE","LOCALE"],"GENDER":["unknown","unknown"],"APPTYPE":["ipad","iphone"],"AUDIENCE_EXCLUDE":["AUDIENCE_EXCLUDE","AUDIENCE_EXCLUDE"]},"keywords":[{"value":"cats","match_type":"EXACT_NEGATIVE"}],"name":"Gaming","auto_targeting_enabled":True,"placement_group":"ALL","tracking_urls":{"impression":["URL1","URL2"],"click":["URL1","URL2"],"engagement":["URL1","URL2"],"buyable_button":["URL1","URL2"],"audience_verification":["URL1","URL2"]}}
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
        query_string = [('order', 'ASCENDING'),
                        ('include_sizing', False),
                        ('search_query', 'gaming'),
                        ('page_size', 25),
                        ('bookmark', 'bookmark_example')]
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
        body = {"targeting_attributes":{"LOCATION":["LOCATION","LOCATION"],"MAXIMUM_AGE":"65+","AGE_BUCKET":["35-44","50-54"],"AUDIENCE_INCLUDE":["AUDIENCE_INCLUDE","AUDIENCE_INCLUDE"],"SHOPPING_RETARGETING":[{"lookback_window":30,"exclusion_window":14,"tag_types":[0,6]},{"lookback_window":30,"exclusion_window":14,"tag_types":[0,6]}],"TARGETING_STRATEGY":["CHOOSE_YOUR_OWN","CHOOSE_YOUR_OWN"],"INTEREST":["INTEREST","INTEREST"],"GEO":["GEO","GEO"],"MINIMUM_AGE":"18","LOCALE":["LOCALE","LOCALE"],"GENDER":["unknown","unknown"],"APPTYPE":["ipad","iphone"],"AUDIENCE_EXCLUDE":["AUDIENCE_EXCLUDE","AUDIENCE_EXCLUDE"]},"operation_type":"REMOVE","id":"643"}
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
