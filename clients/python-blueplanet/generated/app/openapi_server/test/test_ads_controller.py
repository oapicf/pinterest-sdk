# coding: utf-8

from __future__ import absolute_import

from flask import json
from io import BytesIO

from app.openapi_server.models.ad import Ad  # noqa: E501
from app.openapi_server.models.ad_batch_update import AdBatchUpdate  # noqa: E501
from app.openapi_server.models.ad_batch_write_response_model import AdBatchWriteResponseModel  # noqa: E501
from app.openapi_server.models.ad_create import AdCreate  # noqa: E501
from app.openapi_server.models.ad_preview_request import AdPreviewRequest  # noqa: E501
from app.openapi_server.models.ad_preview_url_response import AdPreviewURLResponse  # noqa: E501
from app.openapi_server.models.ads_analytics import AdsAnalytics  # noqa: E501
from app.openapi_server.models.ads_analytics_ad_targeting_type import AdsAnalyticsAdTargetingType  # noqa: E501
from app.openapi_server.models.ads_list200_response import AdsList200Response  # noqa: E501
from app.openapi_server.models.campaign_ad_preview import CampaignAdPreview  # noqa: E501
from app.openapi_server.models.campaign_ad_preview_create import CampaignAdPreviewCreate  # noqa: E501
from app.openapi_server.models.campaign_ad_preview_create200_response_inner import CampaignAdPreviewCreate200ResponseInner  # noqa: E501
from app.openapi_server.models.campaign_ad_preview_delete200_response_inner import CampaignAdPreviewDelete200ResponseInner  # noqa: E501
from app.openapi_server.models.conversion_attribution_window_days import ConversionAttributionWindowDays  # noqa: E501
from app.openapi_server.models.conversion_report_attribution_type import ConversionReportAttributionType  # noqa: E501
from app.openapi_server.models.conversion_report_time_type import ConversionReportTimeType  # noqa: E501
from app.openapi_server.models.entity_status import EntityStatus  # noqa: E501
from app.openapi_server.models.granularity import Granularity  # noqa: E501
from app.openapi_server.models.metrics_response import MetricsResponse  # noqa: E501
from app.openapi_server.models.pinterest_lib_error import PinterestLibError  # noqa: E501
from app.openapi_server.models.pinterest_lib_pagination_order import PinterestLibPaginationOrder  # noqa: E501
from app.openapi_server.models.reporting_column_sync import ReportingColumnSync  # noqa: E501
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
                        ('columns', [openapi_server.ReportingColumnSync()]),
                        ('granularity', openapi_server.Granularity()),
                        ('click_window_days', openapi_server.ConversionAttributionWindowDays()),
                        ('engagement_window_days', openapi_server.ConversionAttributionWindowDays()),
                        ('view_window_days', openapi_server.ConversionAttributionWindowDays()),
                        ('conversion_report_time', openapi_server.ConversionReportTimeType()),
                        ('attribution_types', [openapi_server.ConversionReportAttributionType()]),
                        ('reporting_timezone', openapi_server.ReportingTimeZone()),
                        ('sort_columns', ['sort_columns_example']),
                        ('sort_ascending', True)]
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
        query_string = [('pin_ids', ['pin_ids_example']),
                        ('start_date', '2013-10-20'),
                        ('end_date', '2013-10-20'),
                        ('ad_ids', ['ad_ids_example']),
                        ('columns', [openapi_server.ReportingColumnSync()]),
                        ('granularity', openapi_server.Granularity()),
                        ('click_window_days', 30),
                        ('engagement_window_days', 30),
                        ('view_window_days', 1),
                        ('conversion_report_time', 'TIME_OF_AD_ACTION'),
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
        body = {"ad_group_id":"ad_group_id","android_deep_link":"android_deep_link","carousel_android_deep_links":["carousel_android_deep_links","carousel_android_deep_links"],"carousel_destination_urls":["carousel_destination_urls","carousel_destination_urls"],"carousel_ios_deep_links":["carousel_ios_deep_links","carousel_ios_deep_links"],"click_tracking_url":"click_tracking_url","collection_items_destination_url_template":"collection_items_destination_url_template","collections_header_type":"","creative_type":"REGULAR","customizable_cta_type":"LEARN_MORE","destination_url":"destination_url","disclosure_type":"MED_GUIDE","disclosure_url":"disclosure_url","grid_click_type":"CLOSEUP","ios_deep_link":"ios_deep_link","is_carting":True,"is_collage_accepted_terms":True,"is_collage_single_destination":True,"is_pin_deleted":True,"is_removable":True,"lead_form_id":"lead_form_id","name":"name","pin_id":"pin_id","quiz_pin_data":"{}","status":"ACTIVE","tracking_urls":{"impression":["URL1","URL2"],"click":["URL1","URL2"],"engagement":["URL1","URL2"],"buyable_button":["URL1","URL2"],"audience_verification":["URL1","URL2"]},"view_tracking_url":"view_tracking_url"}
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
            '/v5/ad_accounts/{ad_account_id}/ads/{ad_id}'.format(ad_id='ad_id_example', ad_account_id='ad_account_id_example'),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_ads_list(self):
        """Test case for ads_list

        List ads
        """
        query_string = [('bookmark', 'bookmark_example'),
                        ('page_size', 25),
                        ('order', openapi_server.PinterestLibPaginationOrder()),
                        ('campaign_ids', ['campaign_ids_example']),
                        ('ad_group_ids', ['ad_group_ids_example']),
                        ('ad_ids', ['ad_ids_example']),
                        ('entity_statuses', ["ACTIVE","PAUSED"])]
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
        body = {"ad_group_id":"ad_group_id","android_deep_link":"android_deep_link","carousel_android_deep_links":["carousel_android_deep_links","carousel_android_deep_links"],"carousel_destination_urls":["carousel_destination_urls","carousel_destination_urls"],"carousel_ios_deep_links":["carousel_ios_deep_links","carousel_ios_deep_links"],"click_tracking_url":"click_tracking_url","collection_items_destination_url_template":"collection_items_destination_url_template","collections_header_type":"","creative_type":"REGULAR","customizable_cta_type":"LEARN_MORE","destination_url":"destination_url","disclosure_type":"MED_GUIDE","disclosure_url":"disclosure_url","grid_click_type":"CLOSEUP","id":"id","ios_deep_link":"ios_deep_link","is_carting":True,"is_collage_accepted_terms":True,"is_collage_single_destination":True,"is_pin_deleted":True,"is_removable":True,"lead_form_id":"lead_form_id","name":"name","pin_id":"pin_id","quiz_pin_data":"{}","status":"ACTIVE","tracking_urls":{"impression":["URL1","URL2"],"click":["URL1","URL2"],"engagement":["URL1","URL2"],"buyable_button":["URL1","URL2"],"audience_verification":["URL1","URL2"]},"view_tracking_url":"view_tracking_url"}
        response = self.client.open(
            '/v5/ad_accounts/{ad_account_id}/ads'.format(ad_account_id='ad_account_id_example'),
            method='PATCH',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_campaign_ad_preview_create(self):
        """Test case for campaign_ad_preview_create

        Create ad preview records for one or more ad groups
        """
        body = {"ad_group_id":"1234567890"}
        response = self.client.open(
            '/v5/ad_accounts/{ad_account_id}/campaign_ad_preview'.format(ad_account_id='ad_account_id_example'),
            method='POST',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_campaign_ad_preview_delete(self):
        """Test case for campaign_ad_preview_delete

        Delete ad preview records for one or more ad groups
        """
        query_string = [('ad_group_ids', ['ad_group_ids_example'])]
        response = self.client.open(
            '/v5/ad_accounts/{ad_account_id}/campaign_ad_preview'.format(ad_account_id='ad_account_id_example'),
            method='DELETE',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_campaign_ad_preview_read(self):
        """Test case for campaign_ad_preview_read

        Fetch ad preview records for one or more ad groups
        """
        query_string = [('ad_group_ids', ['ad_group_ids_example'])]
        response = self.client.open(
            '/v5/ad_accounts/{ad_account_id}/campaign_ad_preview'.format(ad_account_id='ad_account_id_example'),
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
