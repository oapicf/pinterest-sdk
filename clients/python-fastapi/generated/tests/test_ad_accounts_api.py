# coding: utf-8

from fastapi.testclient import TestClient


from datetime import date  # noqa: F401
from pydantic import Field, StrictStr, field_validator  # noqa: F401
from typing import List, Optional, Union  # noqa: F401
from typing_extensions import Annotated  # noqa: F401
from openapi_server.models.ad_account import AdAccount  # noqa: F401
from openapi_server.models.ad_account_analytics_items import AdAccountAnalyticsItems  # noqa: F401
from openapi_server.models.ad_account_create import AdAccountCreate  # noqa: F401
from openapi_server.models.ad_accounts_list200_response import AdAccountsList200Response  # noqa: F401
from openapi_server.models.ads_analytics_account_targeting_type import AdsAnalyticsAccountTargetingType  # noqa: F401
from openapi_server.models.ads_analytics_create_async_request import AdsAnalyticsCreateAsyncRequest  # noqa: F401
from openapi_server.models.ads_analytics_create_async_response import AdsAnalyticsCreateAsyncResponse  # noqa: F401
from openapi_server.models.ads_analytics_get_async_response import AdsAnalyticsGetAsyncResponse  # noqa: F401
from openapi_server.models.conversion_product_report import ConversionProductReport  # noqa: F401
from openapi_server.models.conversion_product_report_create import ConversionProductReportCreate  # noqa: F401
from openapi_server.models.conversion_report_attribution_type import ConversionReportAttributionType  # noqa: F401
from openapi_server.models.granularity import Granularity  # noqa: F401
from openapi_server.models.mmm_report import MMMReport  # noqa: F401
from openapi_server.models.mmm_report_create import MMMReportCreate  # noqa: F401
from openapi_server.models.metrics_response import MetricsResponse  # noqa: F401
from openapi_server.models.pinterest_lib_error import PinterestLibError  # noqa: F401
from openapi_server.models.pinterest_lib_pagination_order import PinterestLibPaginationOrder  # noqa: F401
from openapi_server.models.reporting_column_sync import ReportingColumnSync  # noqa: F401
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
    ad_account_create = openapi_server.AdAccountCreate()

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
    params = [("start_date", '2013-10-20'),     ("end_date", '2013-10-20'),     ("columns", [openapi_server.ReportingColumnSync()]),     ("granularity", openapi_server.Granularity()),     ("click_window_days", 30),     ("engagement_window_days", 30),     ("view_window_days", 1),     ("conversion_report_time", 'TIME_OF_AD_ACTION'),     ("reporting_timezone", openapi_server.ReportingTimeZone())]
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
    mmm_report_create = openapi_server.MMMReportCreate()

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/ad_accounts/{ad_account_id}/mmm_reports".format(ad_account_id='ad_account_id_example'),
    #    headers=headers,
    #    json=mmm_report_create,
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
    ads_analytics_create_async_request = openapi_server.AdsAnalyticsCreateAsyncRequest()

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
    conversion_product_report_create = openapi_server.ConversionProductReportCreate()

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/ad_accounts/{ad_account_id}/reports/brand_category_sku".format(ad_account_id='ad_account_id_example'),
    #    headers=headers,
    #    json=conversion_product_report_create,
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
    params = [("start_date", '2013-10-20'),     ("end_date", '2013-10-20'),     ("targeting_types", [openapi_server.AdsAnalyticsAccountTargetingType()]),     ("columns", [openapi_server.ReportingColumnSync()]),     ("granularity", openapi_server.Granularity()),     ("click_window_days", 30),     ("engagement_window_days", 30),     ("view_window_days", 1),     ("conversion_report_time", 'TIME_OF_AD_ACTION'),     ("attribution_types", [openapi_server.ConversionReportAttributionType()]),     ("reporting_timezone", openapi_server.ReportingTimeZone())]
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
    params = [("bookmark", 'bookmark_example'),     ("page_size", 25),     ("order", openapi_server.PinterestLibPaginationOrder())]
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

