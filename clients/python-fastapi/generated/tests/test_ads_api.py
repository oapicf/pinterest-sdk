# coding: utf-8

from fastapi.testclient import TestClient


from datetime import date  # noqa: F401
from pydantic import Field, field_validator  # noqa: F401
from typing import Any, List, Optional, Union  # noqa: F401
from typing_extensions import Annotated  # noqa: F401
from openapi_server.models.ad import Ad  # noqa: F401
from openapi_server.models.ad_batch_update import AdBatchUpdate  # noqa: F401
from openapi_server.models.ad_batch_write_response_model import AdBatchWriteResponseModel  # noqa: F401
from openapi_server.models.ad_create import AdCreate  # noqa: F401
from openapi_server.models.ad_preview_request import AdPreviewRequest  # noqa: F401
from openapi_server.models.ad_preview_url_response import AdPreviewURLResponse  # noqa: F401
from openapi_server.models.ads_analytics import AdsAnalytics  # noqa: F401
from openapi_server.models.ads_analytics_ad_targeting_type import AdsAnalyticsAdTargetingType  # noqa: F401
from openapi_server.models.ads_list200_response import AdsList200Response  # noqa: F401
from openapi_server.models.campaign_ad_preview import CampaignAdPreview  # noqa: F401
from openapi_server.models.campaign_ad_preview_create import CampaignAdPreviewCreate  # noqa: F401
from openapi_server.models.campaign_ad_preview_create200_response_inner import CampaignAdPreviewCreate200ResponseInner  # noqa: F401
from openapi_server.models.campaign_ad_preview_delete200_response_inner import CampaignAdPreviewDelete200ResponseInner  # noqa: F401
from openapi_server.models.conversion_attribution_window_days import ConversionAttributionWindowDays  # noqa: F401
from openapi_server.models.conversion_report_attribution_type import ConversionReportAttributionType  # noqa: F401
from openapi_server.models.conversion_report_time_type import ConversionReportTimeType  # noqa: F401
from openapi_server.models.entity_status import EntityStatus  # noqa: F401
from openapi_server.models.granularity import Granularity  # noqa: F401
from openapi_server.models.metrics_response import MetricsResponse  # noqa: F401
from openapi_server.models.pinterest_lib_error import PinterestLibError  # noqa: F401
from openapi_server.models.pinterest_lib_pagination_order import PinterestLibPaginationOrder  # noqa: F401
from openapi_server.models.reporting_column_sync import ReportingColumnSync  # noqa: F401
from openapi_server.models.reporting_time_zone import ReportingTimeZone  # noqa: F401


def test_ad_previews_create(client: TestClient):
    """Test case for ad_previews_create

    Create ad preview with pin or image
    """
    ad_preview_request = openapi_server.AdPreviewRequest()

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/ad_accounts/{ad_account_id}/ad_previews".format(ad_account_id='ad_account_id_example'),
    #    headers=headers,
    #    json=ad_preview_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_ads_list(client: TestClient):
    """Test case for ads_list

    List ads
    """
    params = [("bookmark", 'bookmark_example'),     ("page_size", 25),     ("order", openapi_server.PinterestLibPaginationOrder()),     ("campaign_ids", ['campaign_ids_example']),     ("ad_group_ids", ['ad_group_ids_example']),     ("ad_ids", ['ad_ids_example']),     ("entity_statuses", ["ACTIVE","PAUSED"])]
    headers = {
        "Authorization": "Bearer special-key",
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/ad_accounts/{ad_account_id}/ads".format(ad_account_id='ad_account_id_example'),
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_ads_create(client: TestClient):
    """Test case for ads_create

    Create ads
    """
    ad_create = [[openapi_server.AdCreate()]]

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/ad_accounts/{ad_account_id}/ads".format(ad_account_id='ad_account_id_example'),
    #    headers=headers,
    #    json=ad_create,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_ads_update(client: TestClient):
    """Test case for ads_update

    Update ads
    """
    ad_batch_update = [[openapi_server.AdBatchUpdate()]]

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "PATCH",
    #    "/ad_accounts/{ad_account_id}/ads".format(ad_account_id='ad_account_id_example'),
    #    headers=headers,
    #    json=ad_batch_update,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_ads_analytics(client: TestClient):
    """Test case for ads_analytics

    Get ad analytics
    """
    params = [("pin_ids", ['pin_ids_example']),     ("start_date", '2013-10-20'),     ("end_date", '2013-10-20'),     ("ad_ids", ['ad_ids_example']),     ("columns", [openapi_server.ReportingColumnSync()]),     ("granularity", openapi_server.Granularity()),     ("click_window_days", 30),     ("engagement_window_days", 30),     ("view_window_days", 1),     ("conversion_report_time", 'TIME_OF_AD_ACTION'),     ("campaign_ids", ['campaign_ids_example']),     ("reporting_timezone", openapi_server.ReportingTimeZone())]
    headers = {
        "Authorization": "Bearer special-key",
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/ad_accounts/{ad_account_id}/ads/analytics".format(ad_account_id='ad_account_id_example'),
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_ad_targeting_analytics_get(client: TestClient):
    """Test case for ad_targeting_analytics_get

    Get targeting analytics for ads
    """
    params = [("ad_ids", ['ad_ids_example']),     ("start_date", '2013-10-20'),     ("end_date", '2013-10-20'),     ("targeting_types", [openapi_server.AdsAnalyticsAdTargetingType()]),     ("columns", [openapi_server.ReportingColumnSync()]),     ("granularity", openapi_server.Granularity()),     ("click_window_days", openapi_server.ConversionAttributionWindowDays()),     ("engagement_window_days", openapi_server.ConversionAttributionWindowDays()),     ("view_window_days", openapi_server.ConversionAttributionWindowDays()),     ("conversion_report_time", openapi_server.ConversionReportTimeType()),     ("attribution_types", [openapi_server.ConversionReportAttributionType()]),     ("reporting_timezone", openapi_server.ReportingTimeZone()),     ("sort_columns", ['sort_columns_example']),     ("sort_ascending", True)]
    headers = {
        "Authorization": "Bearer special-key",
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/ad_accounts/{ad_account_id}/ads/targeting_analytics".format(ad_account_id='ad_account_id_example'),
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_ads_get(client: TestClient):
    """Test case for ads_get

    Get ad
    """

    headers = {
        "Authorization": "Bearer special-key",
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/ad_accounts/{ad_account_id}/ads/{ad_id}".format(ad_id='ad_id_example', ad_account_id='ad_account_id_example'),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_campaign_ad_preview_read(client: TestClient):
    """Test case for campaign_ad_preview_read

    Fetch ad preview records for one or more ad groups
    """
    params = [("ad_group_ids", ['ad_group_ids_example'])]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/ad_accounts/{ad_account_id}/campaign_ad_preview".format(ad_account_id='ad_account_id_example'),
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_campaign_ad_preview_create(client: TestClient):
    """Test case for campaign_ad_preview_create

    Create ad preview records for one or more ad groups
    """
    campaign_ad_preview_create = [[openapi_server.CampaignAdPreviewCreate()]]

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/ad_accounts/{ad_account_id}/campaign_ad_preview".format(ad_account_id='ad_account_id_example'),
    #    headers=headers,
    #    json=campaign_ad_preview_create,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_campaign_ad_preview_delete(client: TestClient):
    """Test case for campaign_ad_preview_delete

    Delete ad preview records for one or more ad groups
    """
    params = [("ad_group_ids", ['ad_group_ids_example'])]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "DELETE",
    #    "/ad_accounts/{ad_account_id}/campaign_ad_preview".format(ad_account_id='ad_account_id_example'),
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200

