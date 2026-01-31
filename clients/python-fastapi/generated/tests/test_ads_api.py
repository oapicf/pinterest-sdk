# coding: utf-8

from fastapi.testclient import TestClient


from datetime import date  # noqa: F401
from pydantic import Field, StrictInt, StrictStr, field_validator  # noqa: F401
from typing import List, Optional  # noqa: F401
from typing_extensions import Annotated  # noqa: F401
from openapi_server.models.ad_array_response import AdArrayResponse  # noqa: F401
from openapi_server.models.ad_create_request import AdCreateRequest  # noqa: F401
from openapi_server.models.ad_preview_request import AdPreviewRequest  # noqa: F401
from openapi_server.models.ad_preview_url_response import AdPreviewURLResponse  # noqa: F401
from openapi_server.models.ad_response import AdResponse  # noqa: F401
from openapi_server.models.ad_update_request import AdUpdateRequest  # noqa: F401
from openapi_server.models.ads_analytics_ad_targeting_type import AdsAnalyticsAdTargetingType  # noqa: F401
from openapi_server.models.ads_analytics_response_inner import AdsAnalyticsResponseInner  # noqa: F401
from openapi_server.models.ads_list200_response import AdsList200Response  # noqa: F401
from openapi_server.models.conversion_report_attribution_type import ConversionReportAttributionType  # noqa: F401
from openapi_server.models.error import Error  # noqa: F401
from openapi_server.models.granularity import Granularity  # noqa: F401
from openapi_server.models.metrics_response import MetricsResponse  # noqa: F401
from openapi_server.models.reporting_time_zone import ReportingTimeZone  # noqa: F401


def test_ad_previews_create(client: TestClient):
    """Test case for ad_previews_create

    Create ad preview with pin or image
    """
    ad_preview_request = {"image_url":"https://somewebsite.com/someimage.jpg","title":"My Preview Image"}

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
    params = [("campaign_ids", ['campaign_ids_example']),     ("ad_group_ids", ['ad_group_ids_example']),     ("ad_ids", ['ad_ids_example']),     ("entity_statuses", ["ACTIVE","PAUSED"]),     ("page_size", 25),     ("order", 'ASCENDING'),     ("bookmark", 'bookmark_example')]
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
    ad_create_request = [{"is_removable":0,"disclosure_type":"MED_GUIDE","view_tracking_url":"view_tracking_url","android_deep_link":"android_deep_link","destination_url":"destination_url","carousel_android_deep_links":["carousel_android_deep_links","carousel_android_deep_links"],"carousel_destination_urls":["carousel_destination_urls","carousel_destination_urls"],"tracking_urls":"{}","ios_deep_link":"ios_deep_link","carousel_ios_deep_links":["carousel_ios_deep_links","carousel_ios_deep_links"],"click_tracking_url":"click_tracking_url","is_pin_deleted":0,"disclosure_url":"disclosure_url","creative_type":"REGULAR","grid_click_type":"CLOSEUP","quiz_pin_data":"{}","name":"name","customizable_cta_type":"LEARN_MORE","lead_form_id":"lead_form_id","ad_group_id":"2680059592705","pin_id":"394205773611545468","status":"ACTIVE"}]

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/ad_accounts/{ad_account_id}/ads".format(ad_account_id='ad_account_id_example'),
    #    headers=headers,
    #    json=ad_create_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_ads_update(client: TestClient):
    """Test case for ads_update

    Update ads
    """
    ad_update_request = [{"is_removable":0,"disclosure_type":"MED_GUIDE","view_tracking_url":"view_tracking_url","android_deep_link":"android_deep_link","destination_url":"destination_url","carousel_android_deep_links":["carousel_android_deep_links","carousel_android_deep_links"],"carousel_destination_urls":["carousel_destination_urls","carousel_destination_urls"],"tracking_urls":"{}","ios_deep_link":"ios_deep_link","carousel_ios_deep_links":["carousel_ios_deep_links","carousel_ios_deep_links"],"click_tracking_url":"click_tracking_url","is_pin_deleted":0,"disclosure_url":"disclosure_url","creative_type":"REGULAR","grid_click_type":"CLOSEUP","quiz_pin_data":"{}","name":"name","customizable_cta_type":"LEARN_MORE","lead_form_id":"lead_form_id","id":"687195134316","ad_group_id":"2680059592705","pin_id":"394205773611545468","status":"ACTIVE"}]

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "PATCH",
    #    "/ad_accounts/{ad_account_id}/ads".format(ad_account_id='ad_account_id_example'),
    #    headers=headers,
    #    json=ad_update_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_ads_analytics(client: TestClient):
    """Test case for ads_analytics

    Get ad analytics
    """
    params = [("start_date", '2013-10-20'),     ("end_date", '2013-10-20'),     ("ad_ids", ['ad_ids_example']),     ("columns", ['columns_example']),     ("granularity", openapi_server.Granularity()),     ("click_window_days", 30),     ("engagement_window_days", 30),     ("view_window_days", 1),     ("conversion_report_time", TIME_OF_AD_ACTION),     ("pin_ids", ['pin_ids_example']),     ("campaign_ids", ['campaign_ids_example']),     ("reporting_timezone", openapi_server.ReportingTimeZone())]
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
    params = [("ad_ids", ['ad_ids_example']),     ("start_date", '2013-10-20'),     ("end_date", '2013-10-20'),     ("targeting_types", [openapi_server.AdsAnalyticsAdTargetingType()]),     ("columns", ['columns_example']),     ("granularity", openapi_server.Granularity()),     ("click_window_days", 30),     ("engagement_window_days", 30),     ("view_window_days", 1),     ("conversion_report_time", TIME_OF_AD_ACTION),     ("attribution_types", [openapi_server.ConversionReportAttributionType()]),     ("reporting_timezone", openapi_server.ReportingTimeZone())]
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
    #    "/ad_accounts/{ad_account_id}/ads/{ad_id}".format(ad_account_id='ad_account_id_example', ad_id='ad_id_example'),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200

