# coding: utf-8

from __future__ import absolute_import

from flask import json
from io import BytesIO

from app.openapi_server.models.ad_account import AdAccount  # noqa: E501
from app.openapi_server.models.ad_account_analytics_items import AdAccountAnalyticsItems  # noqa: E501
from app.openapi_server.models.ad_account_create import AdAccountCreate  # noqa: E501
from app.openapi_server.models.ad_accounts_list200_response import AdAccountsList200Response  # noqa: E501
from app.openapi_server.models.ads_analytics_account_targeting_type import AdsAnalyticsAccountTargetingType  # noqa: E501
from app.openapi_server.models.ads_analytics_create_async_request import AdsAnalyticsCreateAsyncRequest  # noqa: E501
from app.openapi_server.models.ads_analytics_create_async_response import AdsAnalyticsCreateAsyncResponse  # noqa: E501
from app.openapi_server.models.ads_analytics_get_async_response import AdsAnalyticsGetAsyncResponse  # noqa: E501
from app.openapi_server.models.conversion_product_report import ConversionProductReport  # noqa: E501
from app.openapi_server.models.conversion_product_report_create import ConversionProductReportCreate  # noqa: E501
from app.openapi_server.models.conversion_report_attribution_type import ConversionReportAttributionType  # noqa: E501
from app.openapi_server.models.granularity import Granularity  # noqa: E501
from app.openapi_server.models.mmm_report import MMMReport  # noqa: E501
from app.openapi_server.models.mmm_report_create import MMMReportCreate  # noqa: E501
from app.openapi_server.models.metrics_response import MetricsResponse  # noqa: E501
from app.openapi_server.models.pinterest_lib_error import PinterestLibError  # noqa: E501
from app.openapi_server.models.pinterest_lib_pagination_order import PinterestLibPaginationOrder  # noqa: E501
from app.openapi_server.models.reporting_column_sync import ReportingColumnSync  # noqa: E501
from app.openapi_server.models.reporting_time_zone import ReportingTimeZone  # noqa: E501
from app.openapi_server.models.template_based_report import TemplateBasedReport  # noqa: E501
from app.openapi_server.models.templates_list200_response import TemplatesList200Response  # noqa: E501
from openapi_server.test import BaseTestCase


class TestAdAccountsController(BaseTestCase):
    """AdAccountsController integration test stubs"""

    def test_ad_account_analytics(self):
        """Test case for ad_account_analytics

        Get ad account analytics
        """
        query_string = [('start_date', '2013-10-20'),
                        ('end_date', '2013-10-20'),
                        ('columns', [openapi_server.ReportingColumnSync()]),
                        ('granularity', openapi_server.Granularity()),
                        ('click_window_days', 30),
                        ('engagement_window_days', 30),
                        ('view_window_days', 1),
                        ('conversion_report_time', 'TIME_OF_AD_ACTION'),
                        ('reporting_timezone', openapi_server.ReportingTimeZone())]
        response = self.client.open(
            '/v5/ad_accounts/{ad_account_id}/analytics'.format(ad_account_id='ad_account_id_example'),
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_ad_account_targeting_analytics_get(self):
        """Test case for ad_account_targeting_analytics_get

        Get targeting analytics for an ad account
        """
        query_string = [('start_date', '2013-10-20'),
                        ('end_date', '2013-10-20'),
                        ('targeting_types', [openapi_server.AdsAnalyticsAccountTargetingType()]),
                        ('columns', [openapi_server.ReportingColumnSync()]),
                        ('granularity', openapi_server.Granularity()),
                        ('click_window_days', 30),
                        ('engagement_window_days', 30),
                        ('view_window_days', 1),
                        ('conversion_report_time', 'TIME_OF_AD_ACTION'),
                        ('attribution_types', [openapi_server.ConversionReportAttributionType()]),
                        ('reporting_timezone', openapi_server.ReportingTimeZone())]
        response = self.client.open(
            '/v5/ad_accounts/{ad_account_id}/targeting_analytics'.format(ad_account_id='ad_account_id_example'),
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_ad_accounts_create(self):
        """Test case for ad_accounts_create

        Create ad account
        """
        body = {"country":"AD","currency":"UNK","name":"name","owner_user_id":"owner_user_id","time_zone":"America/Los_Angeles"}
        response = self.client.open(
            '/v5/ad_accounts',
            method='POST',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_ad_accounts_get(self):
        """Test case for ad_accounts_get

        Get ad account
        """
        response = self.client.open(
            '/v5/ad_accounts/{ad_account_id}'.format(ad_account_id='ad_account_id_example'),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_ad_accounts_list(self):
        """Test case for ad_accounts_list

        List ad accounts
        """
        query_string = [('include_shared_accounts', True),
                        ('bookmark', 'bookmark_example'),
                        ('page_size', 25)]
        response = self.client.open(
            '/v5/ad_accounts',
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_analytics_create_conversion_product_report(self):
        """Test case for analytics_create_conversion_product_report

        Create a request for a brand, category, SKU report
        """
        body = {"ad_group_ids":["12345678"],"campaign_ids":["12345678"],"campaign_objective_types":["AWARENESS","AWARENESS","AWARENESS","AWARENESS","AWARENESS"],"click_window_days":"","columns":["AD_GROUP_ID","AD_GROUP_ID"],"conversion_product_attribution_type":"","conversion_product_breakdown":"","conversion_report_time":"","end_date":"2024-04-23","granularity":"","level":"","product_sku_ids":["WBC45678","WBC45679"],"report_name":"report_name","start_date":"2024-04-17","view_window_days":""}
        response = self.client.open(
            '/v5/ad_accounts/{ad_account_id}/reports/brand_category_sku'.format(ad_account_id='ad_account_id_example'),
            method='POST',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_analytics_create_mmm_report(self):
        """Test case for analytics_create_mmm_report

        Create a request for a Marketing Mix Modeling (MMM) report
        """
        body = {"advertiser_ids":["advertiser_ids","advertiser_ids"],"columns":["SPEND_IN_DOLLAR","SPEND_IN_DOLLAR"],"countries":["US","US"],"custom_column_ids":["custom_column_ids","custom_column_ids","custom_column_ids","custom_column_ids","custom_column_ids"],"end_date":"2020-12-20","granularity":"","level":"","report_name":"report_name","start_date":"2020-12-20","targeting_types":["GENDER"]}
        response = self.client.open(
            '/v5/ad_accounts/{ad_account_id}/mmm_reports'.format(ad_account_id='ad_account_id_example'),
            method='POST',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_analytics_create_report(self):
        """Test case for analytics_create_report

        Create async request for an account analytics report
        """
        body = {"ad_group_ids":[null,null,null,null,null],"ad_group_statuses":["RUNNING","RUNNING","RUNNING","RUNNING","RUNNING"],"ad_ids":[null,null,null,null,null],"ad_statuses":["APPROVED","APPROVED","APPROVED","APPROVED","APPROVED"],"attribution_types":["INDIVIDUAL","INDIVIDUAL"],"campaign_brand_label":"campaign_brand_label","campaign_custom_label":"campaign_custom_label","campaign_ids":[null,null,null,null,null],"campaign_objective_types":["AWARENESS","AWARENESS","AWARENESS","AWARENESS","AWARENESS"],"campaign_statuses":["RUNNING","RUNNING","RUNNING","RUNNING","RUNNING"],"click_window_days":"","columns":["SPEND_IN_MICRO_DOLLAR","SPEND_IN_MICRO_DOLLAR"],"combine_targeting_types":False,"conversion_report_time":"","custom_conversion_event_metrics":[{"custom_event_metrics_type":"ADE_COST_PER_ACTION","custom_event_name":"custom_event_name"},{"custom_event_metrics_type":"ADE_COST_PER_ACTION","custom_event_name":"custom_event_name"}],"end_date":"end_date","end_hour":1,"engagement_window_days":"","granularity":"","level":"","metrics_filters":[{"field":"SPEND_IN_DOLLAR","operator":"LESS_THAN","values":[6.027456183070403,6.027456183070403]},{"field":"SPEND_IN_DOLLAR","operator":"LESS_THAN","values":[6.027456183070403,6.027456183070403]}],"primary_sort":"","product_group_ids":[null,null,null,null,null],"product_group_statuses":["RUNNING","RUNNING","RUNNING","RUNNING","RUNNING"],"product_item_ids":[null,null,null,null,null],"report_format":"","reporting_timezone":"","start_date":"start_date","start_hour":3,"targeting_types":["KEYWORD","KEYWORD","KEYWORD","KEYWORD","KEYWORD"],"view_window_days":""}
        response = self.client.open(
            '/v5/ad_accounts/{ad_account_id}/reports'.format(ad_account_id='ad_account_id_example'),
            method='POST',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_analytics_create_template_report(self):
        """Test case for analytics_create_template_report

        Create async request for an analytics report using a template
        """
        query_string = [('start_date', '2013-10-20'),
                        ('end_date', '2013-10-20'),
                        ('granularity', openapi_server.Granularity())]
        response = self.client.open(
            '/v5/ad_accounts/{ad_account_id}/templates/{template_id}/reports'.format(ad_account_id='ad_account_id_example', template_id='template_id_example'),
            method='POST',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_analytics_get_conversion_product_report(self):
        """Test case for analytics_get_conversion_product_report

        Get advertiser brand, category, SKU report
        """
        query_string = [('token', 'token_example')]
        response = self.client.open(
            '/v5/ad_accounts/{ad_account_id}/reports/brand_category_sku'.format(ad_account_id='ad_account_id_example'),
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_analytics_get_mmm_report(self):
        """Test case for analytics_get_mmm_report

        Get advertiser Marketing Mix Modeling (MMM) report.
        """
        query_string = [('token', 'token_example')]
        response = self.client.open(
            '/v5/ad_accounts/{ad_account_id}/mmm_reports'.format(ad_account_id='ad_account_id_example'),
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_analytics_get_report(self):
        """Test case for analytics_get_report

        Get the account analytics report created by the async call
        """
        query_string = [('token', 'token_example')]
        response = self.client.open(
            '/v5/ad_accounts/{ad_account_id}/reports'.format(ad_account_id='ad_account_id_example'),
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_sandbox_delete(self):
        """Test case for sandbox_delete

        Delete ads data for ad account in API Sandbox
        """
        response = self.client.open(
            '/v5/ad_accounts/{ad_account_id}/sandbox'.format(ad_account_id='ad_account_id_example'),
            method='DELETE')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_templates_list(self):
        """Test case for templates_list

        List templates
        """
        query_string = [('bookmark', 'bookmark_example'),
                        ('page_size', 25),
                        ('order', openapi_server.PinterestLibPaginationOrder())]
        response = self.client.open(
            '/v5/ad_accounts/{ad_account_id}/templates'.format(ad_account_id='ad_account_id_example'),
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
