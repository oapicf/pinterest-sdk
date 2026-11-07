# coding: utf-8

from __future__ import absolute_import

from flask import json
from io import BytesIO

from app.openapi_server.models.integration_logs_invalid_log_response import IntegrationLogsInvalidLogResponse  # noqa: E501
from app.openapi_server.models.integration_logs_request_create import IntegrationLogsRequestCreate  # noqa: E501
from app.openapi_server.models.integration_logs_success_response import IntegrationLogsSuccessResponse  # noqa: E501
from app.openapi_server.models.integration_metadata import IntegrationMetadata  # noqa: E501
from app.openapi_server.models.integration_metadata_create import IntegrationMetadataCreate  # noqa: E501
from app.openapi_server.models.integration_metadata_update import IntegrationMetadataUpdate  # noqa: E501
from app.openapi_server.models.integration_record import IntegrationRecord  # noqa: E501
from app.openapi_server.models.integrations_get_list200_response import IntegrationsGetList200Response  # noqa: E501
from app.openapi_server.models.pinterest_lib_error import PinterestLibError  # noqa: E501
from openapi_server.test import BaseTestCase


class TestIntegrationsController(BaseTestCase):
    """IntegrationsController integration test stubs"""

    def test_integrations_commerce_del(self):
        """Test case for integrations_commerce_del

        Delete commerce integration
        """
        response = self.client.open(
            '/v5/integrations/commerce/{external_business_id}'.format(external_business_id='external_business_id_example'),
            method='DELETE')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_integrations_commerce_get(self):
        """Test case for integrations_commerce_get

        Get commerce integration
        """
        response = self.client.open(
            '/v5/integrations/commerce/{external_business_id}'.format(external_business_id='external_business_id_example'),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_integrations_commerce_patch(self):
        """Test case for integrations_commerce_patch

        Update commerce integration
        """
        body = {"additional_id_1":"additional_id_1","connected_advertiser_id":"connected_advertiser_id","connected_lba_id":"connected_lba_id","connected_merchant_id":"connected_merchant_id","connected_tag_id":"connected_tag_id","partner_access_token":"partner_access_token","partner_access_token_expiry":0.8008281904610115,"partner_metadata":"partner_metadata","partner_primary_email":"partner_primary_email","partner_refresh_token":"partner_refresh_token","partner_refresh_token_expiry":6.027456183070403,"scopes":"scopes"}
        response = self.client.open(
            '/v5/integrations/commerce/{external_business_id}'.format(external_business_id='external_business_id_example'),
            method='PATCH',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_integrations_commerce_post(self):
        """Test case for integrations_commerce_post

        Create commerce integration
        """
        body = {"additional_id_1":"additional_id_1","connected_advertiser_id":"connected_advertiser_id","connected_lba_id":"connected_lba_id","connected_merchant_id":"connected_merchant_id","connected_tag_id":"connected_tag_id","external_business_id":"external_business_id","partner_access_token":"partner_access_token","partner_access_token_expiry":0.8008281904610115,"partner_metadata":"partner_metadata","partner_primary_email":"partner_primary_email","partner_refresh_token":"partner_refresh_token","partner_refresh_token_expiry":6.027456183070403,"scopes":"scopes"}
        response = self.client.open(
            '/v5/integrations/commerce',
            method='POST',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_integrations_get_by_id(self):
        """Test case for integrations_get_by_id

        Get integration metadata
        """
        response = self.client.open(
            '/v5/integrations/{id}'.format(id='id_example'),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_integrations_get_list(self):
        """Test case for integrations_get_list

        Get integration metadata list
        """
        query_string = [('bookmark', 'bookmark_example'),
                        ('page_size', 25)]
        response = self.client.open(
            '/v5/integrations',
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_integrations_logs_post(self):
        """Test case for integrations_logs_post

        Receives batched logs from integration applications.
        """
        body = {"logs":[{"advertiser_id":"advertiser_id","app_version_number":"app_version_number","client_timestamp":0,"error":{"cause":"cause","column_number":6,"file_name":"file_name","line_number":1,"message":"message","message_detail":"message_detail","name":"name","number":5,"stack_trace":"stack_trace"},"event_type":"","external_business_id":"external_business_id","feed_profile_id":"feed_profile_id","log_level":"","merchant_id":"merchant_id","message":"message","platform_version_number":"platform_version_number","request":{"host":"host","method":"GET","path":"path","request_headers":{"key":"request_headers"},"response_headers":{"key":"response_headers"},"response_status_code":5},"tag_id":"tag_id"},{"advertiser_id":"advertiser_id","app_version_number":"app_version_number","client_timestamp":0,"error":{"cause":"cause","column_number":6,"file_name":"file_name","line_number":1,"message":"message","message_detail":"message_detail","name":"name","number":5,"stack_trace":"stack_trace"},"event_type":"","external_business_id":"external_business_id","feed_profile_id":"feed_profile_id","log_level":"","merchant_id":"merchant_id","message":"message","platform_version_number":"platform_version_number","request":{"host":"host","method":"GET","path":"path","request_headers":{"key":"request_headers"},"response_headers":{"key":"response_headers"},"response_status_code":5},"tag_id":"tag_id"},{"advertiser_id":"advertiser_id","app_version_number":"app_version_number","client_timestamp":0,"error":{"cause":"cause","column_number":6,"file_name":"file_name","line_number":1,"message":"message","message_detail":"message_detail","name":"name","number":5,"stack_trace":"stack_trace"},"event_type":"","external_business_id":"external_business_id","feed_profile_id":"feed_profile_id","log_level":"","merchant_id":"merchant_id","message":"message","platform_version_number":"platform_version_number","request":{"host":"host","method":"GET","path":"path","request_headers":{"key":"request_headers"},"response_headers":{"key":"response_headers"},"response_status_code":5},"tag_id":"tag_id"},{"advertiser_id":"advertiser_id","app_version_number":"app_version_number","client_timestamp":0,"error":{"cause":"cause","column_number":6,"file_name":"file_name","line_number":1,"message":"message","message_detail":"message_detail","name":"name","number":5,"stack_trace":"stack_trace"},"event_type":"","external_business_id":"external_business_id","feed_profile_id":"feed_profile_id","log_level":"","merchant_id":"merchant_id","message":"message","platform_version_number":"platform_version_number","request":{"host":"host","method":"GET","path":"path","request_headers":{"key":"request_headers"},"response_headers":{"key":"response_headers"},"response_status_code":5},"tag_id":"tag_id"},{"advertiser_id":"advertiser_id","app_version_number":"app_version_number","client_timestamp":0,"error":{"cause":"cause","column_number":6,"file_name":"file_name","line_number":1,"message":"message","message_detail":"message_detail","name":"name","number":5,"stack_trace":"stack_trace"},"event_type":"","external_business_id":"external_business_id","feed_profile_id":"feed_profile_id","log_level":"","merchant_id":"merchant_id","message":"message","platform_version_number":"platform_version_number","request":{"host":"host","method":"GET","path":"path","request_headers":{"key":"request_headers"},"response_headers":{"key":"response_headers"},"response_status_code":5},"tag_id":"tag_id"}]}
        response = self.client.open(
            '/v5/integrations/logs',
            method='POST',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
