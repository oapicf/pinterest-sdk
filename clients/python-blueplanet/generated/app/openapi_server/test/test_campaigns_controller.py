# coding: utf-8

from __future__ import absolute_import

from flask import json
from io import BytesIO

from app.openapi_server.models.ad_pin_analytics import AdPinAnalytics  # noqa: E501
from app.openapi_server.models.ads_analytics_campaign_targeting_type import AdsAnalyticsCampaignTargetingType  # noqa: E501
from app.openapi_server.models.campaign_create_request import CampaignCreateRequest  # noqa: E501
from app.openapi_server.models.campaign_create_response import CampaignCreateResponse  # noqa: E501
from app.openapi_server.models.campaign_response import CampaignResponse  # noqa: E501
from app.openapi_server.models.campaign_update_request import CampaignUpdateRequest  # noqa: E501
from app.openapi_server.models.campaign_update_response import CampaignUpdateResponse  # noqa: E501
from app.openapi_server.models.campaigns_analytics_response_inner import CampaignsAnalyticsResponseInner  # noqa: E501
from app.openapi_server.models.campaigns_list200_response import CampaignsList200Response  # noqa: E501
from app.openapi_server.models.conversion_report_attribution_type import ConversionReportAttributionType  # noqa: E501
from app.openapi_server.models.error import Error  # noqa: E501
from app.openapi_server.models.granularity import Granularity  # noqa: E501
from app.openapi_server.models.metrics_response import MetricsResponse  # noqa: E501
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
                        ('columns', ['columns_example']),
                        ('granularity', openapi_server.Granularity()),
                        ('click_window_days', 30),
                        ('engagement_window_days', 30),
                        ('view_window_days', 1),
                        ('conversion_report_time', TIME_OF_AD_ACTION)]
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
                        ('columns', ['columns_example']),
                        ('granularity', openapi_server.Granularity()),
                        ('click_window_days', 30),
                        ('engagement_window_days', 30),
                        ('view_window_days', 1),
                        ('conversion_report_time', TIME_OF_AD_ACTION),
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
                        ('columns', ['columns_example']),
                        ('granularity', openapi_server.Granularity()),
                        ('click_window_days', 30),
                        ('engagement_window_days', 30),
                        ('view_window_days', 1),
                        ('conversion_report_time', TIME_OF_AD_ACTION),
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
        body = {"bid_options":{"placement_multipliers":{"browse":0.9,"search":1.2,"related_pins":1.1},"app_type_multipliers":{"android_mobile":1.1,"android_tablet":1.1,"ipad":1.2,"iphone":1.2,"web":0.9,"web_mobile":0.8},"audience_multipliers":{"123":1.1,"456":1.2}},"default_ad_group_budget_in_micro_currency":0,"lifetime_spend_cap":1432744744,"end_time":1644023526,"is_flexible_daily_budgets":False,"daily_spend_cap":1432744744,"objective_type":"AWARENESS","is_campaign_budget_optimization":True,"is_performance_plus":True,"tracking_urls":"{}","ad_account_id":"549755885175","is_automated_campaign":False,"start_time":1580865126,"name":"ACME Tools","order_line_id":"549755885175","status":"ACTIVE"}
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
            '/v5/ad_accounts/{ad_account_id}/campaigns/{campaign_id}'.format(ad_account_id='ad_account_id_example', campaign_id='campaign_id_example'),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_campaigns_list(self):
        """Test case for campaigns_list

        List campaigns
        """
        query_string = [('campaign_ids', ['campaign_ids_example']),
                        ('entity_statuses', ["ACTIVE","PAUSED"]),
                        ('page_size', 25),
                        ('order', 'ASCENDING'),
                        ('bookmark', 'bookmark_example')]
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
        body = {"bid_options":{"placement_multipliers":{"browse":0.9,"search":1.2,"related_pins":1.1},"update_mask":["AUDIENCE","AUDIENCE"],"app_type_multipliers":{"android_mobile":1.1,"android_tablet":1.1,"ipad":1.2,"iphone":1.2,"web":0.9,"web_mobile":0.8},"audience_multipliers":{"123":1.1,"456":1.2}},"default_ad_group_budget_in_micro_currency":0,"lifetime_spend_cap":1432744744,"end_time":1644023526,"is_flexible_daily_budgets":True,"daily_spend_cap":1432744744,"objective_type":"objective_type","is_campaign_budget_optimization":True,"is_performance_plus":True,"tracking_urls":"{}","ad_account_id":"549755885175","is_automated_campaign":True,"start_time":1580865126,"name":"ACME Tools","order_line_id":"549755885175","id":"549755885175","status":"status"}
        response = self.client.open(
            '/v5/ad_accounts/{ad_account_id}/campaigns'.format(ad_account_id='ad_account_id_example'),
            method='PATCH',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
