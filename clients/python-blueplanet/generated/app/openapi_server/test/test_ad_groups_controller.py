# coding: utf-8

from __future__ import absolute_import

from flask import json
from io import BytesIO

from app.openapi_server.models.ad_group_array_response import AdGroupArrayResponse  # noqa: E501
from app.openapi_server.models.ad_group_audience_sizing_request import AdGroupAudienceSizingRequest  # noqa: E501
from app.openapi_server.models.ad_group_audience_sizing_response import AdGroupAudienceSizingResponse  # noqa: E501
from app.openapi_server.models.ad_group_create_request import AdGroupCreateRequest  # noqa: E501
from app.openapi_server.models.ad_group_response import AdGroupResponse  # noqa: E501
from app.openapi_server.models.ad_group_update_request import AdGroupUpdateRequest  # noqa: E501
from app.openapi_server.models.ad_groups_analytics_response_inner import AdGroupsAnalyticsResponseInner  # noqa: E501
from app.openapi_server.models.ad_groups_list200_response import AdGroupsList200Response  # noqa: E501
from app.openapi_server.models.ads_analytics_ad_group_targeting_type import AdsAnalyticsAdGroupTargetingType  # noqa: E501
from app.openapi_server.models.bid_floor import BidFloor  # noqa: E501
from app.openapi_server.models.bid_floor_request import BidFloorRequest  # noqa: E501
from app.openapi_server.models.conversion_report_attribution_type import ConversionReportAttributionType  # noqa: E501
from app.openapi_server.models.error import Error  # noqa: E501
from app.openapi_server.models.granularity import Granularity  # noqa: E501
from app.openapi_server.models.metrics_response import MetricsResponse  # noqa: E501
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
                        ('columns', ['columns_example']),
                        ('granularity', openapi_server.Granularity()),
                        ('click_window_days', 30),
                        ('engagement_window_days', 30),
                        ('view_window_days', 1),
                        ('conversion_report_time', TIME_OF_AD_ACTION),
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
        body = {"keywords":[{"match_type":"BROAD","value":"value"},{"match_type":"BROAD","value":"value"}],"targeting_spec":{"LOCATION":["LOCATION","LOCATION"],"MAXIMUM_AGE":"65+","AGE_BUCKET":["35-44","50-54"],"AUDIENCE_INCLUDE":["AUDIENCE_INCLUDE","AUDIENCE_INCLUDE"],"SHOPPING_RETARGETING":[{"lookback_window":30,"exclusion_window":14,"tag_types":[0,6]},{"lookback_window":30,"exclusion_window":14,"tag_types":[0,6]}],"TARGETING_STRATEGY":["CHOOSE_YOUR_OWN","CHOOSE_YOUR_OWN"],"INTEREST":["INTEREST","INTEREST"],"GEO":["GEO","GEO"],"MINIMUM_AGE":"18","LOCALE":["LOCALE","LOCALE"],"GENDER":["unknown","unknown"],"APPTYPE":["ipad","iphone"],"AUDIENCE_EXCLUDE":["AUDIENCE_EXCLUDE","AUDIENCE_EXCLUDE"]},"creative_types":["REGULAR","REGULAR"],"product_group_ids":["23423422123","23423422123"],"auto_targeting_enabled":True,"placement_group":"ALL"}
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
        body = {"targeting_spec":{"GEO":["BE-VOV"],"LOCATION":["US"],"LOCALE":["cs"],"AGE_BUCKET":["25-34"],"AUDIENCE_INCLUDE":["2542620905473"],"SHOPPING_RETARGETING":[{"lookback_window":30,"exclusion_window":14,"tag_types":[0,6]},{"lookback_window":30,"exclusion_window":14,"tag_types":[0,6]}],"GENDER":["male"],"TARGETING_STRATEGY":["CHOOSE_YOUR_OWN"],"APPTYPE":["iphone"],"AUDIENCE_EXCLUDE":["2542620905475"],"INTEREST":["925056443165"]},"bid_floor_specs":[{"billable_event":"CLICKTHROUGH","creative_type":"REGULAR","currency":"USD","countries":["US","US"],"optimization_goal_metadata":{"frequency_goal_metadata":{"timerange":"DAY","frequency":5},"conversion_tag_v3_goal_metadata":{"attribution_windows":{"view_window_days":1,"click_window_days":0,"engagement_window_days":6},"conversion_tag_id":"123456789","learning_mode_type":"ACTIVE","conversion_event":"PAGE_VISIT","is_roas_optimized":True,"cpa_goal_value_in_micro_currency":"123456789"},"scrollup_goal_metadata":{"scrollup_goal_value_in_micro_currency":"123456789"}}},{"billable_event":"CLICKTHROUGH","creative_type":"REGULAR","currency":"USD","countries":["US","US"],"optimization_goal_metadata":{"frequency_goal_metadata":{"timerange":"DAY","frequency":5},"conversion_tag_v3_goal_metadata":{"attribution_windows":{"view_window_days":1,"click_window_days":0,"engagement_window_days":6},"conversion_tag_id":"123456789","learning_mode_type":"ACTIVE","conversion_event":"PAGE_VISIT","is_roas_optimized":True,"cpa_goal_value_in_micro_currency":"123456789"},"scrollup_goal_metadata":{"scrollup_goal_value_in_micro_currency":"123456789"}}}]}
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
        body = {"bid_in_micro_currency":5000000,"targeting_template_ids":["643"],"is_creative_optimization":True,"end_time":5705424000,"promotion_application_level":"ITEM","promotion_id":"7834020347906","auto_targeting_enabled":True,"bid_multiplier":1,"tracking_urls":"{}","budget_in_micro_currency":5000000,"bid_strategy_type":"MAX_BID","start_time":5686848000,"billable_event":"CLICKTHROUGH","targeting_spec":{"LOCATION":["LOCATION","LOCATION"],"MAXIMUM_AGE":"65+","AGE_BUCKET":["35-44","50-54"],"AUDIENCE_INCLUDE":["AUDIENCE_INCLUDE","AUDIENCE_INCLUDE"],"SHOPPING_RETARGETING":[{"lookback_window":30,"exclusion_window":14,"tag_types":[0,6]},{"lookback_window":30,"exclusion_window":14,"tag_types":[0,6]}],"TARGETING_STRATEGY":["CHOOSE_YOUR_OWN","CHOOSE_YOUR_OWN"],"INTEREST":["INTEREST","INTEREST"],"GEO":["GEO","GEO"],"MINIMUM_AGE":"18","LOCALE":["LOCALE","LOCALE"],"GENDER":["unknown","unknown"],"APPTYPE":["ipad","iphone"],"AUDIENCE_EXCLUDE":["AUDIENCE_EXCLUDE","AUDIENCE_EXCLUDE"]},"name":"Ad Group For Pin: 687195905986","lifetime_frequency_cap":100,"optimization_goal_metadata":"{}","placement_group":"placement_group","budget_type":"DAILY","campaign_id":"626736533506","pacing_delivery_type":"STANDARD","status":"status"}
        response = self.client.open(
            '/v5/ad_accounts/{ad_account_id}/ad_groups'.format(ad_account_id='ad_account_id_example'),
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
            '/v5/ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}'.format(ad_account_id='ad_account_id_example', ad_group_id='ad_group_id_example'),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_ad_groups_list(self):
        """Test case for ad_groups_list

        List ad groups
        """
        query_string = [('campaign_ids', ['campaign_ids_example']),
                        ('ad_group_ids', ['ad_group_ids_example']),
                        ('entity_statuses', ["ACTIVE","PAUSED"]),
                        ('page_size', 25),
                        ('order', 'ASCENDING'),
                        ('bookmark', 'bookmark_example'),
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
                        ('columns', ['columns_example']),
                        ('granularity', openapi_server.Granularity()),
                        ('click_window_days', 30),
                        ('engagement_window_days', 30),
                        ('view_window_days', 1),
                        ('conversion_report_time', TIME_OF_AD_ACTION),
                        ('attribution_types', [openapi_server.ConversionReportAttributionType()]),
                        ('reporting_timezone', openapi_server.ReportingTimeZone())]
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
        body = {"bid_in_micro_currency":5000000,"targeting_template_ids":["643"],"is_creative_optimization":True,"end_time":5705424000,"promotion_application_level":"ITEM","promotion_id":"7834020347906","auto_targeting_enabled":True,"bid_multiplier":1,"tracking_urls":"{}","budget_in_micro_currency":5000000,"bid_strategy_type":"MAX_BID","start_time":5686848000,"billable_event":"CLICKTHROUGH","targeting_spec":{"LOCATION":["LOCATION","LOCATION"],"MAXIMUM_AGE":"65+","AGE_BUCKET":["35-44","50-54"],"AUDIENCE_INCLUDE":["AUDIENCE_INCLUDE","AUDIENCE_INCLUDE"],"SHOPPING_RETARGETING":[{"lookback_window":30,"exclusion_window":14,"tag_types":[0,6]},{"lookback_window":30,"exclusion_window":14,"tag_types":[0,6]}],"TARGETING_STRATEGY":["CHOOSE_YOUR_OWN","CHOOSE_YOUR_OWN"],"INTEREST":["INTEREST","INTEREST"],"GEO":["GEO","GEO"],"MINIMUM_AGE":"18","LOCALE":["LOCALE","LOCALE"],"GENDER":["unknown","unknown"],"APPTYPE":["ipad","iphone"],"AUDIENCE_EXCLUDE":["AUDIENCE_EXCLUDE","AUDIENCE_EXCLUDE"]},"name":"Ad Group For Pin: 687195905986","lifetime_frequency_cap":100,"id":"2680060704746","optimization_goal_metadata":"{}","placement_group":"placement_group","budget_type":"budget_type","campaign_id":"626736533506","pacing_delivery_type":"pacing_delivery_type","status":"status"}
        response = self.client.open(
            '/v5/ad_accounts/{ad_account_id}/ad_groups'.format(ad_account_id='ad_account_id_example'),
            method='PATCH',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
