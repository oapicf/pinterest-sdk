# coding: utf-8

from __future__ import absolute_import

from flask import json
from io import BytesIO

from app.openapi_server.models.ad_pin_analytics import AdPinAnalytics  # noqa: E501
from app.openapi_server.models.ads_analytics_campaign_targeting_type import AdsAnalyticsCampaignTargetingType  # noqa: E501
from app.openapi_server.models.campaign import Campaign  # noqa: E501
from app.openapi_server.models.campaign_batch_update_item import CampaignBatchUpdateItem  # noqa: E501
from app.openapi_server.models.campaign_batch_write_response_model import CampaignBatchWriteResponseModel  # noqa: E501
from app.openapi_server.models.campaign_create_item import CampaignCreateItem  # noqa: E501
from app.openapi_server.models.campaign_delivery_estimates_campaign import CampaignDeliveryEstimatesCampaign  # noqa: E501
from app.openapi_server.models.campaign_delivery_estimates_response import CampaignDeliveryEstimatesResponse  # noqa: E501
from app.openapi_server.models.campaigns_analytics_metrics import CampaignsAnalyticsMetrics  # noqa: E501
from app.openapi_server.models.campaigns_list200_response import CampaignsList200Response  # noqa: E501
from app.openapi_server.models.conversion_report_attribution_type import ConversionReportAttributionType  # noqa: E501
from app.openapi_server.models.entity_status import EntityStatus  # noqa: E501
from app.openapi_server.models.granularity import Granularity  # noqa: E501
from app.openapi_server.models.metrics_response import MetricsResponse  # noqa: E501
from app.openapi_server.models.pinterest_lib_error import PinterestLibError  # noqa: E501
from app.openapi_server.models.pinterest_lib_pagination_order import PinterestLibPaginationOrder  # noqa: E501
from app.openapi_server.models.reporting_column_sync import ReportingColumnSync  # noqa: E501
from app.openapi_server.models.reporting_time_zone import ReportingTimeZone  # noqa: E501
from openapi_server.test import BaseTestCase


class TestCampaignsController(BaseTestCase):
    """CampaignsController integration test stubs"""

    def test_ad_pins_analytics(self):
        """Test case for ad_pins_analytics

        Get pins analytics
        """
        query_string = [('campaign_id', 'campaign_id_example'),
                        ('pin_ids', ['pin_ids_example']),
                        ('start_date', '2013-10-20'),
                        ('end_date', '2013-10-20'),
                        ('columns', [openapi_server.ReportingColumnSync()]),
                        ('granularity', openapi_server.Granularity()),
                        ('click_window_days', 30),
                        ('engagement_window_days', 30),
                        ('view_window_days', 1),
                        ('conversion_report_time', 'TIME_OF_AD_ACTION')]
        response = self.client.open(
            '/v5/ad_accounts/{ad_account_id}/pins/analytics'.format(ad_account_id='ad_account_id_example'),
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_campaign_targeting_analytics_get(self):
        """Test case for campaign_targeting_analytics_get

        Get targeting analytics for campaigns
        """
        query_string = [('campaign_ids', ['campaign_ids_example']),
                        ('start_date', '2013-10-20'),
                        ('end_date', '2013-10-20'),
                        ('targeting_types', [openapi_server.AdsAnalyticsCampaignTargetingType()]),
                        ('columns', [openapi_server.ReportingColumnSync()]),
                        ('granularity', openapi_server.Granularity()),
                        ('click_window_days', 30),
                        ('engagement_window_days', 30),
                        ('view_window_days', 1),
                        ('conversion_report_time', 'TIME_OF_AD_ACTION'),
                        ('attribution_types', [openapi_server.ConversionReportAttributionType()]),
                        ('reporting_timezone', openapi_server.ReportingTimeZone())]
        response = self.client.open(
            '/v5/ad_accounts/{ad_account_id}/campaigns/targeting_analytics'.format(ad_account_id='ad_account_id_example'),
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_campaigns_analytics(self):
        """Test case for campaigns_analytics

        Get campaign analytics
        """
        query_string = [('start_date', '2013-10-20'),
                        ('end_date', '2013-10-20'),
                        ('campaign_ids', ['campaign_ids_example']),
                        ('columns', [openapi_server.ReportingColumnSync()]),
                        ('granularity', openapi_server.Granularity()),
                        ('click_window_days', 30),
                        ('engagement_window_days', 30),
                        ('view_window_days', 1),
                        ('conversion_report_time', 'TIME_OF_AD_ACTION'),
                        ('aggregate_report_rows', False),
                        ('reporting_timezone', openapi_server.ReportingTimeZone())]
        response = self.client.open(
            '/v5/ad_accounts/{ad_account_id}/campaigns/analytics'.format(ad_account_id='ad_account_id_example'),
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_campaigns_create(self):
        """Test case for campaigns_create

        Create campaigns
        """
        body = {"ad_account_id":"549755885175","app_id":"429047995","app_platform":"IOS","bid_options":"","daily_spend_cap":1432744744,"default_ad_group_budget_in_micro_currency":0,"end_time":1644023526,"intended_promotion_type":"LEGACY","is_automated_campaign":True,"is_campaign_budget_optimization":True,"is_flexible_daily_budgets":True,"is_ltv_optimized":True,"is_performance_plus":True,"is_top_of_search":True,"lifetime_spend_cap":1432744744,"name":"ACME Tools","objective_type":"AWARENESS","order_line_id":"549755885175","start_time":1580865126,"status":"","tracking_urls":"{}"}
        response = self.client.open(
            '/v5/ad_accounts/{ad_account_id}/campaigns'.format(ad_account_id='ad_account_id_example'),
            method='POST',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_campaigns_get(self):
        """Test case for campaigns_get

        Get campaign
        """
        response = self.client.open(
            '/v5/ad_accounts/{ad_account_id}/campaigns/{campaign_id}'.format(campaign_id='campaign_id_example', ad_account_id='ad_account_id_example'),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_campaigns_list(self):
        """Test case for campaigns_list

        List campaigns
        """
        query_string = [('bookmark', 'bookmark_example'),
                        ('page_size', 25),
                        ('order', openapi_server.PinterestLibPaginationOrder()),
                        ('campaign_ids', ['campaign_ids_example']),
                        ('entity_statuses', ["ACTIVE","PAUSED"])]
        response = self.client.open(
            '/v5/ad_accounts/{ad_account_id}/campaigns'.format(ad_account_id='ad_account_id_example'),
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_campaigns_update(self):
        """Test case for campaigns_update

        Update campaigns
        """
        body = {"ad_account_id":"549755885175","app_id":"429047995","app_platform":"IOS","bid_options":"","daily_spend_cap":1432744744,"default_ad_group_budget_in_micro_currency":0,"end_time":1644023526,"id":"549755885175","intended_promotion_type":"LEGACY","is_automated_campaign":True,"is_campaign_budget_optimization":True,"is_flexible_daily_budgets":True,"is_ltv_optimized":True,"is_performance_plus":True,"is_top_of_search":True,"lifetime_spend_cap":1432744744,"name":"ACME Tools","objective_type":"AWARENESS","order_line_id":"549755885175","performance_plus_campaign_settings":"{}","start_time":1580865126,"status":"ACTIVE","tracking_urls":"{}"}
        response = self.client.open(
            '/v5/ad_accounts/{ad_account_id}/campaigns'.format(ad_account_id='ad_account_id_example'),
            method='PATCH',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_campaign_delivery_estimates(self):
        """Test case for get_campaign_delivery_estimates

        Get campaign delivery estimates
        """
        body = {"ad_groups":[{"auto_targeting_enabled":True,"creative_types":["REGULAR","REGULAR"],"keywords":[{"match_type":"","value":"value"},{"match_type":"","value":"value"}],"monthly_frequency_cap":0,"optimization_goal_metadata":{"conversion_tag_v3_goal_metadata":{"attribution_windows":{"click_window_days":6,"engagement_window_days":1,"view_window_days":5},"conversion_event":"PAGE_VISIT","conversion_tag_id":"conversion_tag_id","cpa_goal_value_in_micro_currency":"cpa_goal_value_in_micro_currency","is_roas_optimized":True,"reporting_event":"reporting_event"},"frequency_goal_metadata":{"frequency":12,"timerange":"THIRTY_DAY"},"scrollup_goal_metadata":{"scrollup_goal_value_in_micro_currency":"scrollup_goal_value_in_micro_currency"}},"optimization_type":"","placement_group":"ALL","product_group_ids":[null,null],"targeting_spec":{"AGE_BUCKET":["18-24","18-24"],"APPTYPE":["android_mobile","android_mobile"],"AUDIENCE_EXCLUDE":[null,null],"AUDIENCE_INCLUDE":[null,null],"GENDER":["unknown","unknown"],"GEO":["GEO","GEO"],"GEO_EXCLUDE":["GEO_EXCLUDE","GEO_EXCLUDE"],"INTEREST":["INTEREST","INTEREST"],"LOCALE":["LOCALE","LOCALE"],"LOCATION":["LOCATION","LOCATION"],"LOCATION_EXCLUDE":["LOCATION_EXCLUDE","LOCATION_EXCLUDE"],"MAXIMUM_AGE":"MAXIMUM_AGE","MINIMUM_AGE":"MINIMUM_AGE","SHOPPING_RETARGETING":[{"lookback_window":30,"exclusion_window":14,"tag_types":[0,6]},{"lookback_window":30,"exclusion_window":14,"tag_types":[0,6]}],"TARGETING_STRATEGY":["CHOOSE_YOUR_OWN","CHOOSE_YOUR_OWN"]}},{"auto_targeting_enabled":True,"creative_types":["REGULAR","REGULAR"],"keywords":[{"match_type":"","value":"value"},{"match_type":"","value":"value"}],"monthly_frequency_cap":0,"optimization_goal_metadata":{"conversion_tag_v3_goal_metadata":{"attribution_windows":{"click_window_days":6,"engagement_window_days":1,"view_window_days":5},"conversion_event":"PAGE_VISIT","conversion_tag_id":"conversion_tag_id","cpa_goal_value_in_micro_currency":"cpa_goal_value_in_micro_currency","is_roas_optimized":True,"reporting_event":"reporting_event"},"frequency_goal_metadata":{"frequency":12,"timerange":"THIRTY_DAY"},"scrollup_goal_metadata":{"scrollup_goal_value_in_micro_currency":"scrollup_goal_value_in_micro_currency"}},"optimization_type":"","placement_group":"ALL","product_group_ids":[null,null],"targeting_spec":{"AGE_BUCKET":["18-24","18-24"],"APPTYPE":["android_mobile","android_mobile"],"AUDIENCE_EXCLUDE":[null,null],"AUDIENCE_INCLUDE":[null,null],"GENDER":["unknown","unknown"],"GEO":["GEO","GEO"],"GEO_EXCLUDE":["GEO_EXCLUDE","GEO_EXCLUDE"],"INTEREST":["INTEREST","INTEREST"],"LOCALE":["LOCALE","LOCALE"],"LOCATION":["LOCATION","LOCATION"],"LOCATION_EXCLUDE":["LOCATION_EXCLUDE","LOCATION_EXCLUDE"],"MAXIMUM_AGE":"MAXIMUM_AGE","MINIMUM_AGE":"MINIMUM_AGE","SHOPPING_RETARGETING":[{"lookback_window":30,"exclusion_window":14,"tag_types":[0,6]},{"lookback_window":30,"exclusion_window":14,"tag_types":[0,6]}],"TARGETING_STRATEGY":["CHOOSE_YOUR_OWN","CHOOSE_YOUR_OWN"]}},{"auto_targeting_enabled":True,"creative_types":["REGULAR","REGULAR"],"keywords":[{"match_type":"","value":"value"},{"match_type":"","value":"value"}],"monthly_frequency_cap":0,"optimization_goal_metadata":{"conversion_tag_v3_goal_metadata":{"attribution_windows":{"click_window_days":6,"engagement_window_days":1,"view_window_days":5},"conversion_event":"PAGE_VISIT","conversion_tag_id":"conversion_tag_id","cpa_goal_value_in_micro_currency":"cpa_goal_value_in_micro_currency","is_roas_optimized":True,"reporting_event":"reporting_event"},"frequency_goal_metadata":{"frequency":12,"timerange":"THIRTY_DAY"},"scrollup_goal_metadata":{"scrollup_goal_value_in_micro_currency":"scrollup_goal_value_in_micro_currency"}},"optimization_type":"","placement_group":"ALL","product_group_ids":[null,null],"targeting_spec":{"AGE_BUCKET":["18-24","18-24"],"APPTYPE":["android_mobile","android_mobile"],"AUDIENCE_EXCLUDE":[null,null],"AUDIENCE_INCLUDE":[null,null],"GENDER":["unknown","unknown"],"GEO":["GEO","GEO"],"GEO_EXCLUDE":["GEO_EXCLUDE","GEO_EXCLUDE"],"INTEREST":["INTEREST","INTEREST"],"LOCALE":["LOCALE","LOCALE"],"LOCATION":["LOCATION","LOCATION"],"LOCATION_EXCLUDE":["LOCATION_EXCLUDE","LOCATION_EXCLUDE"],"MAXIMUM_AGE":"MAXIMUM_AGE","MINIMUM_AGE":"MINIMUM_AGE","SHOPPING_RETARGETING":[{"lookback_window":30,"exclusion_window":14,"tag_types":[0,6]},{"lookback_window":30,"exclusion_window":14,"tag_types":[0,6]}],"TARGETING_STRATEGY":["CHOOSE_YOUR_OWN","CHOOSE_YOUR_OWN"]}},{"auto_targeting_enabled":True,"creative_types":["REGULAR","REGULAR"],"keywords":[{"match_type":"","value":"value"},{"match_type":"","value":"value"}],"monthly_frequency_cap":0,"optimization_goal_metadata":{"conversion_tag_v3_goal_metadata":{"attribution_windows":{"click_window_days":6,"engagement_window_days":1,"view_window_days":5},"conversion_event":"PAGE_VISIT","conversion_tag_id":"conversion_tag_id","cpa_goal_value_in_micro_currency":"cpa_goal_value_in_micro_currency","is_roas_optimized":True,"reporting_event":"reporting_event"},"frequency_goal_metadata":{"frequency":12,"timerange":"THIRTY_DAY"},"scrollup_goal_metadata":{"scrollup_goal_value_in_micro_currency":"scrollup_goal_value_in_micro_currency"}},"optimization_type":"","placement_group":"ALL","product_group_ids":[null,null],"targeting_spec":{"AGE_BUCKET":["18-24","18-24"],"APPTYPE":["android_mobile","android_mobile"],"AUDIENCE_EXCLUDE":[null,null],"AUDIENCE_INCLUDE":[null,null],"GENDER":["unknown","unknown"],"GEO":["GEO","GEO"],"GEO_EXCLUDE":["GEO_EXCLUDE","GEO_EXCLUDE"],"INTEREST":["INTEREST","INTEREST"],"LOCALE":["LOCALE","LOCALE"],"LOCATION":["LOCATION","LOCATION"],"LOCATION_EXCLUDE":["LOCATION_EXCLUDE","LOCATION_EXCLUDE"],"MAXIMUM_AGE":"MAXIMUM_AGE","MINIMUM_AGE":"MINIMUM_AGE","SHOPPING_RETARGETING":[{"lookback_window":30,"exclusion_window":14,"tag_types":[0,6]},{"lookback_window":30,"exclusion_window":14,"tag_types":[0,6]}],"TARGETING_STRATEGY":["CHOOSE_YOUR_OWN","CHOOSE_YOUR_OWN"]}},{"auto_targeting_enabled":True,"creative_types":["REGULAR","REGULAR"],"keywords":[{"match_type":"","value":"value"},{"match_type":"","value":"value"}],"monthly_frequency_cap":0,"optimization_goal_metadata":{"conversion_tag_v3_goal_metadata":{"attribution_windows":{"click_window_days":6,"engagement_window_days":1,"view_window_days":5},"conversion_event":"PAGE_VISIT","conversion_tag_id":"conversion_tag_id","cpa_goal_value_in_micro_currency":"cpa_goal_value_in_micro_currency","is_roas_optimized":True,"reporting_event":"reporting_event"},"frequency_goal_metadata":{"frequency":12,"timerange":"THIRTY_DAY"},"scrollup_goal_metadata":{"scrollup_goal_value_in_micro_currency":"scrollup_goal_value_in_micro_currency"}},"optimization_type":"","placement_group":"ALL","product_group_ids":[null,null],"targeting_spec":{"AGE_BUCKET":["18-24","18-24"],"APPTYPE":["android_mobile","android_mobile"],"AUDIENCE_EXCLUDE":[null,null],"AUDIENCE_INCLUDE":[null,null],"GENDER":["unknown","unknown"],"GEO":["GEO","GEO"],"GEO_EXCLUDE":["GEO_EXCLUDE","GEO_EXCLUDE"],"INTEREST":["INTEREST","INTEREST"],"LOCALE":["LOCALE","LOCALE"],"LOCATION":["LOCATION","LOCATION"],"LOCATION_EXCLUDE":["LOCATION_EXCLUDE","LOCATION_EXCLUDE"],"MAXIMUM_AGE":"MAXIMUM_AGE","MINIMUM_AGE":"MINIMUM_AGE","SHOPPING_RETARGETING":[{"lookback_window":30,"exclusion_window":14,"tag_types":[0,6]},{"lookback_window":30,"exclusion_window":14,"tag_types":[0,6]}],"TARGETING_STRATEGY":["CHOOSE_YOUR_OWN","CHOOSE_YOUR_OWN"]}}],"budget_duration_type":"FIXED_DAILY","daily_spend_cap":50000000,"end_date":"end_date","lifetime_spend_cap":500000000,"objective_type":"AWARENESS","start_date":"start_date"}
        response = self.client.open(
            '/v5/ad_accounts/{ad_account_id}/campaigns/delivery_estimates'.format(ad_account_id='ad_account_id_example'),
            method='POST',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
