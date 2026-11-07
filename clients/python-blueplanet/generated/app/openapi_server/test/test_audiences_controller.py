# coding: utf-8

from __future__ import absolute_import

from flask import json
from io import BytesIO

from app.openapi_server.models.ad_accounts_audience import AdAccountsAudience  # noqa: E501
from app.openapi_server.models.ad_accounts_audience_create import AdAccountsAudienceCreate  # noqa: E501
from app.openapi_server.models.ad_accounts_audience_update import AdAccountsAudienceUpdate  # noqa: E501
from app.openapi_server.models.audience_ownership_type import AudienceOwnershipType  # noqa: E501
from app.openapi_server.models.audiences_list200_response import AudiencesList200Response  # noqa: E501
from app.openapi_server.models.pinterest_lib_error import PinterestLibError  # noqa: E501
from app.openapi_server.models.pinterest_lib_pagination_order import PinterestLibPaginationOrder  # noqa: E501
from openapi_server.test import BaseTestCase


class TestAudiencesController(BaseTestCase):
    """AudiencesController integration test stubs"""

    def test_audiences_create(self):
        """Test case for audiences_create

        Create audience
        """
        body = {"ad_account_id":"ad_account_id","audience_type":"","description":"description","name":"name","rule":{"ad_account_id":"ad_account_id","ad_id":["ad_id","ad_id"],"campaign_id":["campaign_id","campaign_id"],"country":"country","customer_list_id":"customer_list_id","engagement_domain":["engagement_domain","engagement_domain"],"engagement_type":"engagement_type","engager_type":6,"event":"event","event_data":{"currency":"","lead_type":"Newsletter","line_items":"","order_id":"X-151481","order_quantity":1,"page_name":"Our Favorite Pins on Pinterest","promo_code":"WINTER10","property":"Athleta","search_query":"boots","value":"199.98","video_title":"How to style your Parker Boots"},"event_source":"{}","ingestion_source":"{}","objective_type":["AWARENESS","AWARENESS"],"percentage":1,"pin_id":["pin_id","pin_id"],"prefill":True,"retention_days":5,"seed_id":["seed_id","seed_id"],"url":["url","url"],"visitor_source_id":"visitor_source_id"}}
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
            '/v5/ad_accounts/{ad_account_id}/audiences/{audience_id}'.format(audience_id='audience_id_example', ad_account_id='ad_account_id_example'),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_audiences_list(self):
        """Test case for audiences_list

        List audiences
        """
        query_string = [('bookmark', 'bookmark_example'),
                        ('page_size', 25),
                        ('order', openapi_server.PinterestLibPaginationOrder()),
                        ('ownership_type', openapi_server.AudienceOwnershipType()),
                        ('exclude_nca', False)]
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
        body = {"ad_account_id":"ad_account_id","audience_type":"","description":"description","name":"name","operation_type":"","rule":{"ad_account_id":"ad_account_id","ad_id":["ad_id","ad_id"],"campaign_id":["campaign_id","campaign_id"],"country":"country","customer_list_id":"customer_list_id","engagement_domain":["engagement_domain","engagement_domain"],"engagement_type":"engagement_type","engager_type":6,"event":"event","event_data":{"currency":"","lead_type":"Newsletter","line_items":"","order_id":"X-151481","order_quantity":1,"page_name":"Our Favorite Pins on Pinterest","promo_code":"WINTER10","property":"Athleta","search_query":"boots","value":"199.98","video_title":"How to style your Parker Boots"},"event_source":"{}","ingestion_source":"{}","objective_type":["AWARENESS","AWARENESS"],"percentage":1,"pin_id":["pin_id","pin_id"],"prefill":True,"retention_days":5,"seed_id":["seed_id","seed_id"],"url":["url","url"],"visitor_source_id":"visitor_source_id"}}
        response = self.client.open(
            '/v5/ad_accounts/{ad_account_id}/audiences/{audience_id}'.format(audience_id='audience_id_example', ad_account_id='ad_account_id_example'),
            method='PATCH',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
