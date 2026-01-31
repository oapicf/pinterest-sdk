# coding: utf-8

from __future__ import absolute_import

from flask import json
from io import BytesIO

from app.openapi_server.models.creative_type import CreativeType  # noqa: E501
from app.openapi_server.models.error import Error  # noqa: E501
from app.openapi_server.models.pin import Pin  # noqa: E501
from app.openapi_server.models.pin_analytics_metrics_response import PinAnalyticsMetricsResponse  # noqa: E501
from app.openapi_server.models.pin_create import PinCreate  # noqa: E501
from app.openapi_server.models.pin_update import PinUpdate  # noqa: E501
from app.openapi_server.models.pins_list200_response import PinsList200Response  # noqa: E501
from app.openapi_server.models.pins_save_request import PinsSaveRequest  # noqa: E501
from app.openapi_server.models.pinterest_lib_error import PinterestLibError  # noqa: E501
from openapi_server.test import BaseTestCase


class TestPinsController(BaseTestCase):
    """PinsController integration test stubs"""

    def test_multi_pins_analytics(self):
        """Test case for multi_pins_analytics

        Get multiple Pin analytics
        """
        query_string = [('pin_ids', ['pin_ids_example']),
                        ('start_date', '2013-10-20'),
                        ('end_date', '2013-10-20'),
                        ('app_types', ALL),
                        ('metric_types', ['metric_types_example']),
                        ('ad_account_id', 'ad_account_id_example')]
        response = self.client.open(
            '/v5/pins/analytics',
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_pins_analytics(self):
        """Test case for pins_analytics

        Get Pin analytics
        """
        query_string = [('start_date', '2013-10-20'),
                        ('end_date', '2013-10-20'),
                        ('app_types', ALL),
                        ('metric_types', ['metric_types_example']),
                        ('split_field', NO_SPLIT),
                        ('ad_account_id', 'ad_account_id_example')]
        response = self.client.open(
            '/v5/pins/{pin_id}/analytics'.format(pin_id='pin_id_example'),
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_pins_create(self):
        """Test case for pins_create

        Create Pin
        """
        body = {"dominant_color":"dominant_color","media_source":{"content_type":"image/jpeg","data":"data","source_type":"image_base64","is_standard":True},"alt_text":"alt_text","board_id":"board_id","parent_pin_id":"parent_pin_id","link":"link","description":"description","title":"title","sponsor_id":"sponsor_id","board_section_id":"board_section_id"}
        query_string = [('ad_account_id', 'ad_account_id_example')]
        response = self.client.open(
            '/v5/pins',
            method='POST',
            data=json.dumps(body),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_pins_delete(self):
        """Test case for pins_delete

        Delete Pin
        """
        query_string = [('ad_account_id', 'ad_account_id_example')]
        response = self.client.open(
            '/v5/pins/{pin_id}'.format(pin_id='pin_id_example'),
            method='DELETE',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_pins_get(self):
        """Test case for pins_get

        Get Pin
        """
        query_string = [('ad_account_id', 'ad_account_id_example'),
                        ('pin_metrics', False)]
        response = self.client.open(
            '/v5/pins/{pin_id}'.format(pin_id='pin_id_example'),
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_pins_list(self):
        """Test case for pins_list

        List Pins
        """
        query_string = [('pin_filter', 'pin_filter_example'),
                        ('pin_metrics', False),
                        ('include_protected_pins', False),
                        ('pin_type', 'pin_type_example'),
                        ('creative_types', [openapi_server.CreativeType()]),
                        ('ad_account_id', 'ad_account_id_example'),
                        ('bookmark', 'bookmark_example'),
                        ('page_size', 25)]
        response = self.client.open(
            '/v5/pins',
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_pins_save(self):
        """Test case for pins_save

        Save Pin
        """
        body = openapi_server.PinsSaveRequest()
        query_string = [('ad_account_id', 'ad_account_id_example')]
        response = self.client.open(
            '/v5/pins/{pin_id}/save'.format(pin_id='pin_id_example'),
            method='POST',
            data=json.dumps(body),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_pins_update(self):
        """Test case for pins_update

        Update Pin
        """
        body = {"alt_text":"alt_text","board_id":"board_id","link":"link","description":"description","title":"title","board_section_id":"board_section_id","carousel_slots":[{"link":"link","description":"description","title":"title"},{"link":"link","description":"description","title":"title"}]}
        query_string = [('ad_account_id', 'ad_account_id_example')]
        response = self.client.open(
            '/v5/pins/{pin_id}'.format(pin_id='pin_id_example'),
            method='PATCH',
            data=json.dumps(body),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
