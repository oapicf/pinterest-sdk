# coding: utf-8

from __future__ import absolute_import

from flask import json
from io import BytesIO

from app.openapi_server.models.audience import Audience  # noqa: E501
from app.openapi_server.models.audience_create_request import AudienceCreateRequest  # noqa: E501
from app.openapi_server.models.audience_update_request import AudienceUpdateRequest  # noqa: E501
from app.openapi_server.models.audiences_list200_response import AudiencesList200Response  # noqa: E501
from app.openapi_server.models.error import Error  # noqa: E501
from openapi_server.test import BaseTestCase


class TestAudiencesController(BaseTestCase):
    """AudiencesController integration test stubs"""

    def test_audiences_create(self):
        """Test case for audiences_create

        Create audience
        """
        body = {"audience_type":"audience_type","name":"string","rule":{"country":"US","visitor_source_id":"549755885175","prefill":True,"customer_list_id":"5497558859876","event_source":{"=":["web","mobile"]},"objective_type":["AWARENESS"],"event_data":{"video_title":"How to style your Parker Boots","page_name":"Our Favorite Pins on Pinterest","order_quantity":1,"property":"Athleta","currency":"","lead_type":"Newsletter","promo_code":"WINTER10","line_items":"","search_query":"boots","order_id":"X-151481","value":"199.98"},"seed_id":["2542620639259","2542620639261"],"url":["url","url"],"ad_account_id":"549755885175","ad_id":["687201361754"],"ingestion_source":{"=":["tag"]},"engager_type":1,"retention_days":30,"engagement_type":"click","percentage":3,"engagement_domain":["www.somedomain.com"],"event":"checkout","pin_id":["34567"],"campaign_id":["626744528398"]},"description":"string","ad_account_id":"549755885175"}
        response = self.client.open(
            '/v5/ad_accounts/{ad_account_id}/audiences'.format(ad_account_id='ad_account_id_example'),
            method='POST',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_audiences_get(self):
        """Test case for audiences_get

        Get audience
        """
        response = self.client.open(
            '/v5/ad_accounts/{ad_account_id}/audiences/{audience_id}'.format(ad_account_id='ad_account_id_example', audience_id='audience_id_example'),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_audiences_list(self):
        """Test case for audiences_list

        List audiences
        """
        query_string = [('bookmark', 'bookmark_example'),
                        ('order', 'ASCENDING'),
                        ('page_size', 25),
                        ('ownership_type', OWNED)]
        response = self.client.open(
            '/v5/ad_accounts/{ad_account_id}/audiences'.format(ad_account_id='ad_account_id_example'),
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_audiences_update(self):
        """Test case for audiences_update

        Update audience
        """
        body = {"operation_type":"UPDATE","name":"string","rule":{"country":"US","visitor_source_id":"549755885175","prefill":True,"customer_list_id":"5497558859876","event_source":{"=":["web","mobile"]},"objective_type":["AWARENESS"],"event_data":{"video_title":"How to style your Parker Boots","page_name":"Our Favorite Pins on Pinterest","order_quantity":1,"property":"Athleta","currency":"","lead_type":"Newsletter","promo_code":"WINTER10","line_items":"","search_query":"boots","order_id":"X-151481","value":"199.98"},"seed_id":["2542620639259","2542620639261"],"url":["url","url"],"ad_account_id":"549755885175","ad_id":["687201361754"],"ingestion_source":{"=":["tag"]},"engager_type":1,"retention_days":30,"engagement_type":"click","percentage":3,"engagement_domain":["www.somedomain.com"],"event":"checkout","pin_id":["34567"],"campaign_id":["626744528398"]},"description":"string","ad_account_id":"549755885175"}
        response = self.client.open(
            '/v5/ad_accounts/{ad_account_id}/audiences/{audience_id}'.format(ad_account_id='ad_account_id_example', audience_id='audience_id_example'),
            method='PATCH',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
