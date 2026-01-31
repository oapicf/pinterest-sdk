# coding: utf-8

from fastapi.testclient import TestClient


from datetime import date  # noqa: F401
from pydantic import Field, StrictBool, StrictInt, StrictStr, field_validator  # noqa: F401
from typing import List, Optional  # noqa: F401
from typing_extensions import Annotated  # noqa: F401
from openapi_server.models.ad_account import AdAccount  # noqa: F401
from openapi_server.models.ad_account_analytics_response_inner import AdAccountAnalyticsResponseInner  # noqa: F401
from openapi_server.models.ad_account_create import AdAccountCreate  # noqa: F401
from openapi_server.models.ad_accounts_list200_response import AdAccountsList200Response  # noqa: F401
from openapi_server.models.ads_analytics_create_async_request import AdsAnalyticsCreateAsyncRequest  # noqa: F401
from openapi_server.models.ads_analytics_create_async_response import AdsAnalyticsCreateAsyncResponse  # noqa: F401
from openapi_server.models.ads_analytics_get_async_response import AdsAnalyticsGetAsyncResponse  # noqa: F401
from openapi_server.models.ads_analytics_targeting_type import AdsAnalyticsTargetingType  # noqa: F401
from openapi_server.models.conversion_product_report_request import ConversionProductReportRequest  # noqa: F401
from openapi_server.models.conversion_report_attribution_type import ConversionReportAttributionType  # noqa: F401
from openapi_server.models.create_mmm_report_request import CreateMMMReportRequest  # noqa: F401
from openapi_server.models.create_mmm_report_response import CreateMMMReportResponse  # noqa: F401
from openapi_server.models.error import Error  # noqa: F401
from openapi_server.models.get_mmm_report_response import GetMMMReportResponse  # noqa: F401
from openapi_server.models.granularity import Granularity  # noqa: F401
from openapi_server.models.metrics_response import MetricsResponse  # noqa: F401
from openapi_server.models.pinterest_lib_error import PinterestLibError  # noqa: F401
from openapi_server.models.reporting_time_zone import ReportingTimeZone  # noqa: F401
from openapi_server.models.template_based_report import TemplateBasedReport  # noqa: F401
from openapi_server.models.templates_list200_response import TemplatesList200Response  # noqa: F401


def test_ad_accounts_list(client: TestClient):
    """Test case for ad_accounts_list

    List ad accounts
    """
    params = [("include_shared_accounts", True),     ("bookmark", 'bookmark_example'),     ("page_size", 25)]
    headers = {
        "Authorization": "Bearer special-key",
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/ad_accounts",
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_ad_accounts_create(client: TestClient):
    """Test case for ad_accounts_create

    Create ad account
    """
    ad_account_create = {"country":"AD","owner_user_id":"owner_user_id","name":"name","currency":"UNK"}

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/ad_accounts",
    #    headers=headers,
    #    json=ad_account_create,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_ad_accounts_get(client: TestClient):
    """Test case for ad_accounts_get

    Get ad account
    """

    headers = {
        "Authorization": "Bearer special-key",
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/ad_accounts/{ad_account_id}".format(ad_account_id='ad_account_id_example'),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_ad_account_analytics(client: TestClient):
    """Test case for ad_account_analytics

    Get ad account analytics
    """
    params = [("start_date", '2013-10-20'),     ("end_date", '2013-10-20'),     ("columns", ['columns_example']),     ("granularity", openapi_server.Granularity()),     ("click_window_days", 30),     ("engagement_window_days", 30),     ("view_window_days", 1),     ("conversion_report_time", TIME_OF_AD_ACTION),     ("reporting_timezone", openapi_server.ReportingTimeZone())]
    headers = {
        "Authorization": "Bearer special-key",
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/ad_accounts/{ad_account_id}/analytics".format(ad_account_id='ad_account_id_example'),
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_analytics_get_mmm_report(client: TestClient):
    """Test case for analytics_get_mmm_report

    Get advertiser Marketing Mix Modeling (MMM) report.
    """
    params = [("token", 'token_example')]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/ad_accounts/{ad_account_id}/mmm_reports".format(ad_account_id='ad_account_id_example'),
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_analytics_create_mmm_report(client: TestClient):
    """Test case for analytics_create_mmm_report

    Create a request for a Marketing Mix Modeling (MMM) report
    """
    create_mmm_report_request = {"end_date":"2020-12-20","level":"CAMPAIGN_TARGETING","columns":["SPEND_IN_DOLLAR","SPEND_IN_DOLLAR"],"granularity":"DAY","countries":["US","US"],"report_name":"report_name","targeting_types":["GENDER"],"start_date":"2020-12-20"}

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/ad_accounts/{ad_account_id}/mmm_reports".format(ad_account_id='ad_account_id_example'),
    #    headers=headers,
    #    json=create_mmm_report_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_analytics_get_report(client: TestClient):
    """Test case for analytics_get_report

    Get the account analytics report created by the async call
    """
    params = [("token", 'token_example')]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/ad_accounts/{ad_account_id}/reports".format(ad_account_id='ad_account_id_example'),
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_analytics_create_report(client: TestClient):
    """Test case for analytics_create_report

    Create async request for an account analytics report
    """
    ads_analytics_create_async_request = {"end_date":"2020-12-20","view_window_days":1,"report_format":"JSON","metrics_filters":[{"field":"SPEND_IN_DOLLAR","values":[5.962133916683182,5.962133916683182],"operator":"LESS_THAN"},{"field":"SPEND_IN_DOLLAR","values":[5.962133916683182,5.962133916683182],"operator":"LESS_THAN"}],"columns":["SPEND_IN_MICRO_DOLLAR","SPEND_IN_MICRO_DOLLAR"],"campaign_ids":["12345678"],"combine_targeting_types":0,"click_window_days":0,"conversion_report_time":"TIME_OF_AD_ACTION","product_group_ids":["12345678"],"campaign_objective_types":["AWARENESS"],"product_group_statuses":["RUNNING","PAUSED"],"reporting_timezone":"","campaign_statuses":["RUNNING","PAUSED"],"start_hour":5,"ad_group_ids":["12345678"],"end_hour":12,"targeting_types":["APPTYPE","APPTYPE","APPTYPE","APPTYPE","APPTYPE"],"start_date":"2020-12-20","custom_conversion_event_metrics":[{"custom_event_metrics_type":"ADE_COST_PER_ACTION","custom_event_name":"custom_event_name"},{"custom_event_metrics_type":"ADE_COST_PER_ACTION","custom_event_name":"custom_event_name"}],"level":"CAMPAIGN","ad_ids":["12345678"],"campaign_brand_label":"Brand","ad_statuses":["APPROVED","PAUSED"],"primary_sort":"BY_ID","attribution_types":["INDIVIDUAL","INDIVIDUAL"],"granularity":"granularity","ad_group_statuses":["RUNNING","PAUSED"],"engagement_window_days":6,"product_item_ids":["12345678"]}

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/ad_accounts/{ad_account_id}/reports".format(ad_account_id='ad_account_id_example'),
    #    headers=headers,
    #    json=ads_analytics_create_async_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_analytics_get_conversion_product_report(client: TestClient):
    """Test case for analytics_get_conversion_product_report

    Get advertiser brand, category, SKU report
    """
    params = [("token", 'token_example')]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/ad_accounts/{ad_account_id}/reports/brand_category_sku".format(ad_account_id='ad_account_id_example'),
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_analytics_create_conversion_product_report(client: TestClient):
    """Test case for analytics_create_conversion_product_report

    Create a request for a brand, category, SKU report
    """
    conversion_product_report_request = {"end_date":"2024-04-23","conversion_product_attribution_type":"DEFAULT","level":"ADVERTISER","view_window_days":6,"columns":["AD_GROUP_ID","AD_GROUP_ID"],"campaign_ids":["12345678"],"click_window_days":0,"conversion_report_time":"TIME_OF_AD_ACTION","campaign_objective_types":["AWARENESS","AWARENESS","AWARENESS","AWARENESS","AWARENESS"],"product_sku_ids":["WBC45678","WBC45679"],"granularity":"WEEK","ad_group_ids":["12345678"],"conversion_product_breakdown":"PRODUCT_BRAND","report_name":"report_name","start_date":"2024-03-17"}

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/ad_accounts/{ad_account_id}/reports/brand_category_sku".format(ad_account_id='ad_account_id_example'),
    #    headers=headers,
    #    json=conversion_product_report_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_sandbox_delete(client: TestClient):
    """Test case for sandbox_delete

    Delete ads data for ad account in API Sandbox
    """

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "DELETE",
    #    "/ad_accounts/{ad_account_id}/sandbox".format(ad_account_id='ad_account_id_example'),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_ad_account_targeting_analytics_get(client: TestClient):
    """Test case for ad_account_targeting_analytics_get

    Get targeting analytics for an ad account
    """
    params = [("start_date", '2013-10-20'),     ("end_date", '2013-10-20'),     ("targeting_types", [openapi_server.AdsAnalyticsTargetingType()]),     ("columns", ['columns_example']),     ("granularity", openapi_server.Granularity()),     ("click_window_days", 30),     ("engagement_window_days", 30),     ("view_window_days", 1),     ("conversion_report_time", TIME_OF_AD_ACTION),     ("attribution_types", [openapi_server.ConversionReportAttributionType()]),     ("reporting_timezone", openapi_server.ReportingTimeZone())]
    headers = {
        "Authorization": "Bearer special-key",
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/ad_accounts/{ad_account_id}/targeting_analytics".format(ad_account_id='ad_account_id_example'),
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_templates_list(client: TestClient):
    """Test case for templates_list

    List templates
    """
    params = [("page_size", 25),     ("order", 'ASCENDING'),     ("bookmark", 'bookmark_example')]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/ad_accounts/{ad_account_id}/templates".format(ad_account_id='ad_account_id_example'),
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_analytics_create_template_report(client: TestClient):
    """Test case for analytics_create_template_report

    Create async request for an analytics report using a template
    """
    params = [("start_date", '2013-10-20'),     ("end_date", '2013-10-20'),     ("granularity", openapi_server.Granularity())]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/ad_accounts/{ad_account_id}/templates/{template_id}/reports".format(ad_account_id='ad_account_id_example', template_id='template_id_example'),
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200

