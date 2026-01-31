# coding: utf-8

from __future__ import absolute_import

from flask import json
from io import BytesIO

from app.openapi_server.models.ad_array_response import AdArrayResponse  # noqa: E501
from app.openapi_server.models.ad_create_request import AdCreateRequest  # noqa: E501
from app.openapi_server.models.ad_preview_request import AdPreviewRequest  # noqa: E501
from app.openapi_server.models.ad_preview_url_response import AdPreviewURLResponse  # noqa: E501
from app.openapi_server.models.ad_response import AdResponse  # noqa: E501
from app.openapi_server.models.ad_update_request import AdUpdateRequest  # noqa: E501
from app.openapi_server.models.ads_analytics_ad_targeting_type import AdsAnalyticsAdTargetingType  # noqa: E501
from app.openapi_server.models.ads_analytics_response_inner import AdsAnalyticsResponseInner  # noqa: E501
from app.openapi_server.models.ads_list200_response import AdsList200Response  # noqa: E501
from app.openapi_server.models.conversion_report_attribution_type import ConversionReportAttributionType  # noqa: E501
from app.openapi_server.models.error import Error  # noqa: E501
from app.openapi_server.models.granularity import Granularity  # noqa: E501
from app.openapi_server.models.metrics_response import MetricsResponse  # noqa: E501
from app.openapi_server.models.reporting_time_zone import ReportingTimeZone  # noqa: E501
from openapi_server.test import BaseTestCase


class TestAdsController(BaseTestCase):
    """AdsController integration test stubs"""

    def test_ad_previews_create(self):
        """Test case for ad_previews_create

        Create ad preview with pin or image
        """
        body = {"image_url":"https://somewebsite.com/someimage.jpg","title":"My Preview Image"}
        response = self.client.open(
            '/v5/ad_accounts/{ad_account_id}/ad_previews'.format(ad_account_id='ad_account_id_example'),
            method='POST',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_ad_targeting_analytics_get(self):
        """Test case for ad_targeting_analytics_get

        Get targeting analytics for ads
        """
        query_string = [('ad_ids', ['ad_ids_example']),
                        ('start_date', '2013-10-20'),
                        ('end_date', '2013-10-20'),
                        ('targeting_types', [openapi_server.AdsAnalyticsAdTargetingType()]),
                        ('columns', ['columns_example']),
                        ('granularity', openapi_server.Granularity()),
                        ('click_window_days', 30),
                        ('engagement_window_days', 30),
                        ('view_window_days', 1),
                        ('conversion_report_time', TIME_OF_AD_ACTION),
                        ('attribution_types', [openapi_server.ConversionReportAttributionType()]),
                        ('reporting_timezone', openapi_server.ReportingTimeZone())]
        response = self.client.open(
            '/v5/ad_accounts/{ad_account_id}/ads/targeting_analytics'.format(ad_account_id='ad_account_id_example'),
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_ads_analytics(self):
        """Test case for ads_analytics

        Get ad analytics
        """
        query_string = [('start_date', '2013-10-20'),
                        ('end_date', '2013-10-20'),
                        ('ad_ids', ['ad_ids_example']),
                        ('columns', ['columns_example']),
                        ('granularity', openapi_server.Granularity()),
                        ('click_window_days', 30),
                        ('engagement_window_days', 30),
                        ('view_window_days', 1),
                        ('conversion_report_time', TIME_OF_AD_ACTION),
                        ('pin_ids', ['pin_ids_example']),
                        ('campaign_ids', ['campaign_ids_example']),
                        ('reporting_timezone', openapi_server.ReportingTimeZone())]
        response = self.client.open(
            '/v5/ad_accounts/{ad_account_id}/ads/analytics'.format(ad_account_id='ad_account_id_example'),
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_ads_create(self):
        """Test case for ads_create

        Create ads
        """
        body = {"is_removable":False,"disclosure_type":"MED_GUIDE","view_tracking_url":"view_tracking_url","android_deep_link":"android_deep_link","destination_url":"destination_url","carousel_android_deep_links":["carousel_android_deep_links","carousel_android_deep_links"],"carousel_destination_urls":["carousel_destination_urls","carousel_destination_urls"],"tracking_urls":"{}","ios_deep_link":"ios_deep_link","carousel_ios_deep_links":["carousel_ios_deep_links","carousel_ios_deep_links"],"click_tracking_url":"click_tracking_url","is_pin_deleted":False,"disclosure_url":"disclosure_url","creative_type":"REGULAR","grid_click_type":"CLOSEUP","quiz_pin_data":"{}","name":"name","customizable_cta_type":"LEARN_MORE","lead_form_id":"lead_form_id","ad_group_id":"2680059592705","pin_id":"394205773611545468","status":"ACTIVE"}
        response = self.client.open(
            '/v5/ad_accounts/{ad_account_id}/ads'.format(ad_account_id='ad_account_id_example'),
            method='POST',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_ads_get(self):
        """Test case for ads_get

        Get ad
        """
        response = self.client.open(
            '/v5/ad_accounts/{ad_account_id}/ads/{ad_id}'.format(ad_account_id='ad_account_id_example', ad_id='ad_id_example'),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_ads_list(self):
        """Test case for ads_list

        List ads
        """
        query_string = [('campaign_ids', ['campaign_ids_example']),
                        ('ad_group_ids', ['ad_group_ids_example']),
                        ('ad_ids', ['ad_ids_example']),
                        ('entity_statuses', ["ACTIVE","PAUSED"]),
                        ('page_size', 25),
                        ('order', 'ASCENDING'),
                        ('bookmark', 'bookmark_example')]
        response = self.client.open(
            '/v5/ad_accounts/{ad_account_id}/ads'.format(ad_account_id='ad_account_id_example'),
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_ads_update(self):
        """Test case for ads_update

        Update ads
        """
        body = {"is_removable":False,"disclosure_type":"MED_GUIDE","view_tracking_url":"view_tracking_url","android_deep_link":"android_deep_link","destination_url":"destination_url","carousel_android_deep_links":["carousel_android_deep_links","carousel_android_deep_links"],"carousel_destination_urls":["carousel_destination_urls","carousel_destination_urls"],"tracking_urls":"{}","ios_deep_link":"ios_deep_link","carousel_ios_deep_links":["carousel_ios_deep_links","carousel_ios_deep_links"],"click_tracking_url":"click_tracking_url","is_pin_deleted":False,"disclosure_url":"disclosure_url","creative_type":"REGULAR","grid_click_type":"CLOSEUP","quiz_pin_data":"{}","name":"name","customizable_cta_type":"LEARN_MORE","lead_form_id":"lead_form_id","id":"687195134316","ad_group_id":"2680059592705","pin_id":"394205773611545468","status":"ACTIVE"}
        response = self.client.open(
            '/v5/ad_accounts/{ad_account_id}/ads'.format(ad_account_id='ad_account_id_example'),
            method='PATCH',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
