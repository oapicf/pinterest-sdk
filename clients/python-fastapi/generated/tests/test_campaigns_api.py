# coding: utf-8

from fastapi.testclient import TestClient


from datetime import date  # noqa: F401
from pydantic import Field, field_validator  # noqa: F401
from typing import List, Optional, Union  # noqa: F401
from typing_extensions import Annotated  # noqa: F401
from openapi_server.models.ad_pin_analytics import AdPinAnalytics  # noqa: F401
from openapi_server.models.ads_analytics_campaign_targeting_type import AdsAnalyticsCampaignTargetingType  # noqa: F401
from openapi_server.models.campaign import Campaign  # noqa: F401
from openapi_server.models.campaign_batch_update_item import CampaignBatchUpdateItem  # noqa: F401
from openapi_server.models.campaign_batch_write_response_model import CampaignBatchWriteResponseModel  # noqa: F401
from openapi_server.models.campaign_create_item import CampaignCreateItem  # noqa: F401
from openapi_server.models.campaign_delivery_estimates_campaign import CampaignDeliveryEstimatesCampaign  # noqa: F401
from openapi_server.models.campaign_delivery_estimates_response import CampaignDeliveryEstimatesResponse  # noqa: F401
from openapi_server.models.campaigns_analytics_metrics import CampaignsAnalyticsMetrics  # noqa: F401
from openapi_server.models.campaigns_list200_response import CampaignsList200Response  # noqa: F401
from openapi_server.models.conversion_report_attribution_type import ConversionReportAttributionType  # noqa: F401
from openapi_server.models.entity_status import EntityStatus  # noqa: F401
from openapi_server.models.granularity import Granularity  # noqa: F401
from openapi_server.models.metrics_response import MetricsResponse  # noqa: F401
from openapi_server.models.pinterest_lib_error import PinterestLibError  # noqa: F401
from openapi_server.models.pinterest_lib_pagination_order import PinterestLibPaginationOrder  # noqa: F401
from openapi_server.models.reporting_column_sync import ReportingColumnSync  # noqa: F401
from openapi_server.models.reporting_time_zone import ReportingTimeZone  # noqa: F401


def test_campaigns_list(client: TestClient):
    """Test case for campaigns_list

    List campaigns
    """
    params = [("bookmark", 'bookmark_example'),     ("page_size", 25),     ("order", openapi_server.PinterestLibPaginationOrder()),     ("campaign_ids", ['campaign_ids_example']),     ("entity_statuses", ["ACTIVE","PAUSED"])]
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
    campaign_create_item = [[openapi_server.CampaignCreateItem()]]

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/ad_accounts/{ad_account_id}/campaigns".format(ad_account_id='ad_account_id_example'),
    #    headers=headers,
    #    json=campaign_create_item,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_campaigns_update(client: TestClient):
    """Test case for campaigns_update

    Update campaigns
    """
    campaign_batch_update_item = [[openapi_server.CampaignBatchUpdateItem()]]

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "PATCH",
    #    "/ad_accounts/{ad_account_id}/campaigns".format(ad_account_id='ad_account_id_example'),
    #    headers=headers,
    #    json=campaign_batch_update_item,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_campaigns_analytics(client: TestClient):
    """Test case for campaigns_analytics

    Get campaign analytics
    """
    params = [("start_date", '2013-10-20'),     ("end_date", '2013-10-20'),     ("campaign_ids", ['campaign_ids_example']),     ("columns", [openapi_server.ReportingColumnSync()]),     ("granularity", openapi_server.Granularity()),     ("click_window_days", 30),     ("engagement_window_days", 30),     ("view_window_days", 1),     ("conversion_report_time", 'TIME_OF_AD_ACTION'),     ("aggregate_report_rows", False),     ("reporting_timezone", openapi_server.ReportingTimeZone())]
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


def test_get_campaign_delivery_estimates(client: TestClient):
    """Test case for get_campaign_delivery_estimates

    Get campaign delivery estimates
    """
    campaign_delivery_estimates_campaign = [[openapi_server.CampaignDeliveryEstimatesCampaign()]]

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/ad_accounts/{ad_account_id}/campaigns/delivery_estimates".format(ad_account_id='ad_account_id_example'),
    #    headers=headers,
    #    json=campaign_delivery_estimates_campaign,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_campaign_targeting_analytics_get(client: TestClient):
    """Test case for campaign_targeting_analytics_get

    Get targeting analytics for campaigns
    """
    params = [("campaign_ids", ['campaign_ids_example']),     ("start_date", '2013-10-20'),     ("end_date", '2013-10-20'),     ("targeting_types", [openapi_server.AdsAnalyticsCampaignTargetingType()]),     ("columns", [openapi_server.ReportingColumnSync()]),     ("granularity", openapi_server.Granularity()),     ("click_window_days", 30),     ("engagement_window_days", 30),     ("view_window_days", 1),     ("conversion_report_time", 'TIME_OF_AD_ACTION'),     ("attribution_types", [openapi_server.ConversionReportAttributionType()]),     ("reporting_timezone", openapi_server.ReportingTimeZone())]
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
    #    "/ad_accounts/{ad_account_id}/campaigns/{campaign_id}".format(campaign_id='campaign_id_example', ad_account_id='ad_account_id_example'),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_ad_pins_analytics(client: TestClient):
    """Test case for ad_pins_analytics

    Get pins analytics
    """
    params = [("campaign_id", 'campaign_id_example'),     ("pin_ids", ['pin_ids_example']),     ("start_date", '2013-10-20'),     ("end_date", '2013-10-20'),     ("columns", [openapi_server.ReportingColumnSync()]),     ("granularity", openapi_server.Granularity()),     ("click_window_days", 30),     ("engagement_window_days", 30),     ("view_window_days", 1),     ("conversion_report_time", 'TIME_OF_AD_ACTION')]
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

