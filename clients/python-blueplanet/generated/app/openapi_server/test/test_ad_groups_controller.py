# coding: utf-8

from __future__ import absolute_import

from flask import json
from io import BytesIO

from app.openapi_server.models.ad_group import AdGroup  # noqa: E501
from app.openapi_server.models.ad_group_audience_sizing import AdGroupAudienceSizing  # noqa: E501
from app.openapi_server.models.ad_group_audience_sizing_create import AdGroupAudienceSizingCreate  # noqa: E501
from app.openapi_server.models.ad_group_create_create import AdGroupCreateCreate  # noqa: E501
from app.openapi_server.models.ad_group_update_batch_update import AdGroupUpdateBatchUpdate  # noqa: E501
from app.openapi_server.models.ad_groups_analytics_metrics import AdGroupsAnalyticsMetrics  # noqa: E501
from app.openapi_server.models.ad_groups_create200_response import AdGroupsCreate200Response  # noqa: E501
from app.openapi_server.models.ad_groups_list200_response import AdGroupsList200Response  # noqa: E501
from app.openapi_server.models.ads_analytics_ad_group_targeting_type import AdsAnalyticsAdGroupTargetingType  # noqa: E501
from app.openapi_server.models.bid_floor import BidFloor  # noqa: E501
from app.openapi_server.models.bid_floor_create import BidFloorCreate  # noqa: E501
from app.openapi_server.models.conversion_report_attribution_type import ConversionReportAttributionType  # noqa: E501
from app.openapi_server.models.dynamic_titles_download_csv import DynamicTitlesDownloadCSV  # noqa: E501
from app.openapi_server.models.dynamic_titles_get_status import DynamicTitlesGetStatus  # noqa: E501
from app.openapi_server.models.dynamic_titles_process_csv import DynamicTitlesProcessCSV  # noqa: E501
from app.openapi_server.models.dynamic_titles_process_csv_create import DynamicTitlesProcessCSVCreate  # noqa: E501
from app.openapi_server.models.dynamic_titles_upload_url import DynamicTitlesUploadURL  # noqa: E501
from app.openapi_server.models.entity_status import EntityStatus  # noqa: E501
from app.openapi_server.models.granularity import Granularity  # noqa: E501
from app.openapi_server.models.metrics_response import MetricsResponse  # noqa: E501
from app.openapi_server.models.pinterest_lib_error import PinterestLibError  # noqa: E501
from app.openapi_server.models.pinterest_lib_pagination_order import PinterestLibPaginationOrder  # noqa: E501
from app.openapi_server.models.reporting_column_sync import ReportingColumnSync  # noqa: E501
from app.openapi_server.models.reporting_time_zone import ReportingTimeZone  # noqa: E501
from openapi_server.test import BaseTestCase


class TestAdGroupsController(BaseTestCase):
    """AdGroupsController integration test stubs"""

    def test_ad_groups_analytics(self):
        """Test case for ad_groups_analytics

        Get ad group analytics
        """
        query_string = [('start_date', '2013-10-20'),
                        ('end_date', '2013-10-20'),
                        ('ad_group_ids', ['ad_group_ids_example']),
                        ('columns', [openapi_server.ReportingColumnSync()]),
                        ('granularity', openapi_server.Granularity()),
                        ('click_window_days', 30),
                        ('engagement_window_days', 30),
                        ('view_window_days', 1),
                        ('conversion_report_time', 'TIME_OF_AD_ACTION'),
                        ('aggregate_report_rows', False),
                        ('reporting_timezone', openapi_server.ReportingTimeZone())]
        response = self.client.open(
            '/v5/ad_accounts/{ad_account_id}/ad_groups/analytics'.format(ad_account_id='ad_account_id_example'),
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_ad_groups_audience_sizing(self):
        """Test case for ad_groups_audience_sizing

        Get audience sizing
        """
        body = {"auto_targeting_enabled":True,"creative_types":["REGULAR","REGULAR"],"keywords":[{"match_type":"BROAD","value":"value"},{"match_type":"BROAD","value":"value"}],"placement_group":"","product_group_ids":[null,null],"targeting_spec":{"AGE_BUCKET":["18-24","18-24"],"APPTYPE":["android_mobile","android_mobile"],"AUDIENCE_EXCLUDE":[null,null],"AUDIENCE_INCLUDE":[null,null],"GENDER":["unknown","unknown"],"GEO":["GEO","GEO"],"GEO_EXCLUDE":["GEO_EXCLUDE","GEO_EXCLUDE"],"INTEREST":["INTEREST","INTEREST"],"LOCALE":["LOCALE","LOCALE"],"LOCATION":["LOCATION","LOCATION"],"LOCATION_EXCLUDE":["LOCATION_EXCLUDE","LOCATION_EXCLUDE"],"MAXIMUM_AGE":"MAXIMUM_AGE","MINIMUM_AGE":"MINIMUM_AGE","SHOPPING_RETARGETING":[{"lookback_window":30,"exclusion_window":14,"tag_types":[0,6]},{"lookback_window":30,"exclusion_window":14,"tag_types":[0,6]}],"TARGETING_STRATEGY":["CHOOSE_YOUR_OWN","CHOOSE_YOUR_OWN"]}}
        response = self.client.open(
            '/v5/ad_accounts/{ad_account_id}/ad_groups/audience_sizing'.format(ad_account_id='ad_account_id_example'),
            method='POST',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_ad_groups_bid_floor_get(self):
        """Test case for ad_groups_bid_floor_get

        Get bid floors
        """
        body = {"bid_floor_specs":[{"billable_event":"","countries":["AD","AD"],"creative_type":"","currency":"","objective_type":"","optimization_goal_metadata":""},{"billable_event":"","countries":["AD","AD"],"creative_type":"","currency":"","objective_type":"","optimization_goal_metadata":""}],"targeting_spec":""}
        response = self.client.open(
            '/v5/ad_accounts/{ad_account_id}/bid_floor'.format(ad_account_id='ad_account_id_example'),
            method='POST',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_ad_groups_create(self):
        """Test case for ad_groups_create

        Create ad groups
        """
        body = {"auto_targeting_enabled":True,"bid_in_micro_currency":0,"bid_multiplier":6.027456183070403,"bid_strategy_type":"AUTOMATIC_BID","billable_event":"CLICKTHROUGH","budget_in_micro_currency":1,"budget_type":"","campaign_id":"campaign_id","customer_segment_id":"","end_time":5,"ext_features":{"enabled":["TRENDS","TRENDS"]},"feed_profile_id":"feed_profile_id","is_creative_optimization":True,"is_local_inventory":True,"lifetime_frequency_cap":5,"local_inventory_radius_in_miles":2.3021358869347655,"name":"name","optimization_goal_metadata":"{}","pacing_delivery_type":"","performance_plus_campaign_settings":"{}","placement_group":"","placement_traffic_type":"","promotion_application_level":"ITEM","promotion_id":"0","promotion_ids":["promotion_ids","promotion_ids"],"start_time":7,"status":"","targeting_spec":{"AGE_BUCKET":["18-24","18-24"],"APPTYPE":["android_mobile","android_mobile"],"AUDIENCE_EXCLUDE":[null,null],"AUDIENCE_INCLUDE":[null,null],"GENDER":["unknown","unknown"],"GEO":["GEO","GEO"],"GEO_EXCLUDE":["GEO_EXCLUDE","GEO_EXCLUDE"],"INTEREST":["INTEREST","INTEREST"],"LOCALE":["LOCALE","LOCALE"],"LOCATION":["LOCATION","LOCATION"],"LOCATION_EXCLUDE":["LOCATION_EXCLUDE","LOCATION_EXCLUDE"],"MAXIMUM_AGE":"MAXIMUM_AGE","MINIMUM_AGE":"MINIMUM_AGE","SHOPPING_RETARGETING":[{"lookback_window":30,"exclusion_window":14,"tag_types":[0,6]},{"lookback_window":30,"exclusion_window":14,"tag_types":[0,6]}],"TARGETING_STRATEGY":["CHOOSE_YOUR_OWN","CHOOSE_YOUR_OWN"]},"targeting_template_ids":[null],"tracking_urls":{"impression":["URL1","URL2"],"click":["URL1","URL2"],"engagement":["URL1","URL2"],"buyable_button":["URL1","URL2"],"audience_verification":["URL1","URL2"]}}
        response = self.client.open(
            '/v5/ad_accounts/{ad_account_id}/ad_groups'.format(ad_account_id='ad_account_id_example'),
            method='POST',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_ad_groups_dynamic_titles_download_csv(self):
        """Test case for ad_groups_dynamic_titles_download_csv

        Get dynamic titles CSV download URL
        """
        response = self.client.open(
            '/v5/ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles/csv'.format(ad_account_id='ad_account_id_example', ad_group_id='ad_group_id_example'),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_ad_groups_dynamic_titles_get_status(self):
        """Test case for ad_groups_dynamic_titles_get_status

        Get dynamic titles status
        """
        response = self.client.open(
            '/v5/ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles/status'.format(ad_account_id='ad_account_id_example', ad_group_id='ad_group_id_example'),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_ad_groups_dynamic_titles_get_upload_url(self):
        """Test case for ad_groups_dynamic_titles_get_upload_url

        Get dynamic titles upload URL
        """
        response = self.client.open(
            '/v5/ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles/uploads'.format(ad_account_id='ad_account_id_example', ad_group_id='ad_group_id_example'),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_ad_groups_dynamic_titles_process_csv(self):
        """Test case for ad_groups_dynamic_titles_process_csv

        Process dynamic titles CSV
        """
        body = {"request_id":"request_id"}
        response = self.client.open(
            '/v5/ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles'.format(ad_account_id='ad_account_id_example', ad_group_id='ad_group_id_example'),
            method='POST',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_ad_groups_get(self):
        """Test case for ad_groups_get

        Get ad group
        """
        response = self.client.open(
            '/v5/ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}'.format(ad_group_id='ad_group_id_example', ad_account_id='ad_account_id_example'),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_ad_groups_list(self):
        """Test case for ad_groups_list

        List ad groups
        """
        query_string = [('bookmark', 'bookmark_example'),
                        ('page_size', 25),
                        ('order', openapi_server.PinterestLibPaginationOrder()),
                        ('campaign_ids', ['campaign_ids_example']),
                        ('ad_group_ids', ['ad_group_ids_example']),
                        ('entity_statuses', ["ACTIVE","PAUSED"]),
                        ('translate_interests_to_names', False)]
        response = self.client.open(
            '/v5/ad_accounts/{ad_account_id}/ad_groups'.format(ad_account_id='ad_account_id_example'),
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_ad_groups_targeting_analytics_get(self):
        """Test case for ad_groups_targeting_analytics_get

        Get targeting analytics for ad groups
        """
        query_string = [('ad_group_ids', ['ad_group_ids_example']),
                        ('start_date', '2013-10-20'),
                        ('end_date', '2013-10-20'),
                        ('targeting_types', [openapi_server.AdsAnalyticsAdGroupTargetingType()]),
                        ('columns', [openapi_server.ReportingColumnSync()]),
                        ('granularity', openapi_server.Granularity()),
                        ('click_window_days', 30),
                        ('engagement_window_days', 30),
                        ('view_window_days', 1),
                        ('conversion_report_time', 'TIME_OF_AD_ACTION'),
                        ('attribution_types', [openapi_server.ConversionReportAttributionType()]),
                        ('reporting_timezone', openapi_server.ReportingTimeZone()),
                        ('sort_columns', ['sort_columns_example']),
                        ('sort_ascending', True)]
        response = self.client.open(
            '/v5/ad_accounts/{ad_account_id}/ad_groups/targeting_analytics'.format(ad_account_id='ad_account_id_example'),
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_ad_groups_update(self):
        """Test case for ad_groups_update

        Update ad groups
        """
        body = {"auto_targeting_enabled":True,"bid_in_micro_currency":0,"bid_multiplier":6.027456183070403,"bid_strategy_type":"AUTOMATIC_BID","billable_event":"CLICKTHROUGH","budget_in_micro_currency":1,"budget_type":"DAILY","campaign_id":"campaign_id","customer_segment_id":"","end_time":5,"ext_features":{"enabled":["TRENDS","TRENDS"]},"feed_profile_id":"feed_profile_id","id":"id","is_creative_optimization":True,"is_local_inventory":True,"lifetime_frequency_cap":5,"local_inventory_radius_in_miles":2.3021358869347655,"name":"name","optimization_goal_metadata":"{}","pacing_delivery_type":"STANDARD","performance_plus_campaign_settings":"{}","placement_group":"","placement_traffic_type":"","promotion_application_level":"ITEM","promotion_id":"0","promotion_ids":["promotion_ids","promotion_ids"],"start_time":7,"status":"","targeting_spec":{"AGE_BUCKET":["18-24","18-24"],"APPTYPE":["android_mobile","android_mobile"],"AUDIENCE_EXCLUDE":[null,null],"AUDIENCE_INCLUDE":[null,null],"GENDER":["unknown","unknown"],"GEO":["GEO","GEO"],"GEO_EXCLUDE":["GEO_EXCLUDE","GEO_EXCLUDE"],"INTEREST":["INTEREST","INTEREST"],"LOCALE":["LOCALE","LOCALE"],"LOCATION":["LOCATION","LOCATION"],"LOCATION_EXCLUDE":["LOCATION_EXCLUDE","LOCATION_EXCLUDE"],"MAXIMUM_AGE":"MAXIMUM_AGE","MINIMUM_AGE":"MINIMUM_AGE","SHOPPING_RETARGETING":[{"lookback_window":30,"exclusion_window":14,"tag_types":[0,6]},{"lookback_window":30,"exclusion_window":14,"tag_types":[0,6]}],"TARGETING_STRATEGY":["CHOOSE_YOUR_OWN","CHOOSE_YOUR_OWN"]},"targeting_spec_operations":[{"field":"AUDIENCE_EXCLUDE","operation":"SET","values":["values","values"]},{"field":"AUDIENCE_EXCLUDE","operation":"SET","values":["values","values"]}],"targeting_template_ids":[null],"tracking_urls":{"impression":["URL1","URL2"],"click":["URL1","URL2"],"engagement":["URL1","URL2"],"buyable_button":["URL1","URL2"],"audience_verification":["URL1","URL2"]}}
        response = self.client.open(
            '/v5/ad_accounts/{ad_account_id}/ad_groups'.format(ad_account_id='ad_account_id_example'),
            method='PATCH',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_ad_groups_by_promotion_ids_list(self):
        """Test case for get_ad_groups_by_promotion_ids_list

        List of ad groups using promotions IDs.
        """
        query_string = [('bookmark', 'bookmark_example'),
                        ('page_size', 25),
                        ('order', openapi_server.PinterestLibPaginationOrder()),
                        ('promotion_ids', ['promotion_ids_example'])]
        response = self.client.open(
            '/v5/ad_accounts/{ad_account_id}/promotion_applied_entities'.format(ad_account_id='ad_account_id_example'),
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
