# coding: utf-8

from fastapi.testclient import TestClient


from datetime import date  # noqa: F401
from pydantic import Field, StrictBool, StrictInt, StrictStr, field_validator  # noqa: F401
from typing import List, Optional  # noqa: F401
from typing_extensions import Annotated  # noqa: F401
from openapi_server.models.ad_pin_analytics import AdPinAnalytics  # noqa: F401
from openapi_server.models.ads_analytics_campaign_targeting_type import AdsAnalyticsCampaignTargetingType  # noqa: F401
from openapi_server.models.campaign_create_request import CampaignCreateRequest  # noqa: F401
from openapi_server.models.campaign_create_response import CampaignCreateResponse  # noqa: F401
from openapi_server.models.campaign_response import CampaignResponse  # noqa: F401
from openapi_server.models.campaign_update_request import CampaignUpdateRequest  # noqa: F401
from openapi_server.models.campaign_update_response import CampaignUpdateResponse  # noqa: F401
from openapi_server.models.campaigns_analytics_response_inner import CampaignsAnalyticsResponseInner  # noqa: F401
from openapi_server.models.campaigns_list200_response import CampaignsList200Response  # noqa: F401
from openapi_server.models.conversion_report_attribution_type import ConversionReportAttributionType  # noqa: F401
from openapi_server.models.error import Error  # noqa: F401
from openapi_server.models.granularity import Granularity  # noqa: F401
from openapi_server.models.metrics_response import MetricsResponse  # noqa: F401
from openapi_server.models.reporting_time_zone import ReportingTimeZone  # noqa: F401


def test_campaigns_list(client: TestClient):
    """Test case for campaigns_list

    List campaigns
    """
    params = [("campaign_ids", ['campaign_ids_example']),     ("entity_statuses", ["ACTIVE","PAUSED"]),     ("page_size", 25),     ("order", 'ASCENDING'),     ("bookmark", 'bookmark_example')]
    headers = {
        "Authorization": "Bearer special-key",
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/ad_accounts/{ad_account_id}/campaigns".format(ad_account_id='ad_account_id_example'),
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_campaigns_create(client: TestClient):
    """Test case for campaigns_create

    Create campaigns
    """
    campaign_create_request = [{"bid_options":{"placement_multipliers":{"browse":0.9,"search":1.2,"related_pins":1.1},"app_type_multipliers":{"android_mobile":1.1,"android_tablet":1.1,"ipad":1.2,"iphone":1.2,"web":0.9,"web_mobile":0.8},"audience_multipliers":{"123":1.1,"456":1.2}},"default_ad_group_budget_in_micro_currency":0,"lifetime_spend_cap":1432744744,"end_time":1644023526,"is_flexible_daily_budgets":0,"daily_spend_cap":1432744744,"objective_type":"AWARENESS","is_campaign_budget_optimization":1,"is_performance_plus":1,"tracking_urls":"{}","ad_account_id":"549755885175","is_automated_campaign":0,"start_time":1580865126,"name":"ACME Tools","order_line_id":"549755885175","status":"ACTIVE"}]

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/ad_accounts/{ad_account_id}/campaigns".format(ad_account_id='ad_account_id_example'),
    #    headers=headers,
    #    json=campaign_create_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_campaigns_update(client: TestClient):
    """Test case for campaigns_update

    Update campaigns
    """
    campaign_update_request = [{"bid_options":{"placement_multipliers":{"browse":0.9,"search":1.2,"related_pins":1.1},"update_mask":["AUDIENCE","AUDIENCE"],"app_type_multipliers":{"android_mobile":1.1,"android_tablet":1.1,"ipad":1.2,"iphone":1.2,"web":0.9,"web_mobile":0.8},"audience_multipliers":{"123":1.1,"456":1.2}},"default_ad_group_budget_in_micro_currency":0,"lifetime_spend_cap":1432744744,"end_time":1644023526,"is_flexible_daily_budgets":1,"daily_spend_cap":1432744744,"objective_type":"objective_type","is_campaign_budget_optimization":1,"is_performance_plus":1,"tracking_urls":"{}","ad_account_id":"549755885175","is_automated_campaign":1,"start_time":1580865126,"name":"ACME Tools","order_line_id":"549755885175","id":"549755885175","status":"status"}]

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "PATCH",
    #    "/ad_accounts/{ad_account_id}/campaigns".format(ad_account_id='ad_account_id_example'),
    #    headers=headers,
    #    json=campaign_update_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_campaigns_analytics(client: TestClient):
    """Test case for campaigns_analytics

    Get campaign analytics
    """
    params = [("start_date", '2013-10-20'),     ("end_date", '2013-10-20'),     ("campaign_ids", ['campaign_ids_example']),     ("columns", ['columns_example']),     ("granularity", openapi_server.Granularity()),     ("click_window_days", 30),     ("engagement_window_days", 30),     ("view_window_days", 1),     ("conversion_report_time", TIME_OF_AD_ACTION),     ("aggregate_report_rows", False),     ("reporting_timezone", openapi_server.ReportingTimeZone())]
    headers = {
        "Authorization": "Bearer special-key",
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/ad_accounts/{ad_account_id}/campaigns/analytics".format(ad_account_id='ad_account_id_example'),
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_campaign_targeting_analytics_get(client: TestClient):
    """Test case for campaign_targeting_analytics_get

    Get targeting analytics for campaigns
    """
    params = [("campaign_ids", ['campaign_ids_example']),     ("start_date", '2013-10-20'),     ("end_date", '2013-10-20'),     ("targeting_types", [openapi_server.AdsAnalyticsCampaignTargetingType()]),     ("columns", ['columns_example']),     ("granularity", openapi_server.Granularity()),     ("click_window_days", 30),     ("engagement_window_days", 30),     ("view_window_days", 1),     ("conversion_report_time", TIME_OF_AD_ACTION),     ("attribution_types", [openapi_server.ConversionReportAttributionType()]),     ("reporting_timezone", openapi_server.ReportingTimeZone())]
    headers = {
        "Authorization": "Bearer special-key",
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/ad_accounts/{ad_account_id}/campaigns/targeting_analytics".format(ad_account_id='ad_account_id_example'),
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_campaigns_get(client: TestClient):
    """Test case for campaigns_get

    Get campaign
    """

    headers = {
        "Authorization": "Bearer special-key",
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/ad_accounts/{ad_account_id}/campaigns/{campaign_id}".format(ad_account_id='ad_account_id_example', campaign_id='campaign_id_example'),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_ad_pins_analytics(client: TestClient):
    """Test case for ad_pins_analytics

    Get pins analytics
    """
    params = [("campaign_id", 'campaign_id_example'),     ("pin_ids", ['pin_ids_example']),     ("start_date", '2013-10-20'),     ("end_date", '2013-10-20'),     ("columns", ['columns_example']),     ("granularity", openapi_server.Granularity()),     ("click_window_days", 30),     ("engagement_window_days", 30),     ("view_window_days", 1),     ("conversion_report_time", TIME_OF_AD_ACTION)]
    headers = {
        "Authorization": "Bearer special-key",
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/ad_accounts/{ad_account_id}/pins/analytics".format(ad_account_id='ad_account_id_example'),
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200

