# coding: utf-8

from fastapi.testclient import TestClient


from datetime import date  # noqa: F401
from pydantic import Field, field_validator  # noqa: F401
from typing import List, Optional, Union  # noqa: F401
from typing_extensions import Annotated  # noqa: F401
from openapi_server.models.ad_group import AdGroup  # noqa: F401
from openapi_server.models.ad_group_audience_sizing import AdGroupAudienceSizing  # noqa: F401
from openapi_server.models.ad_group_audience_sizing_create import AdGroupAudienceSizingCreate  # noqa: F401
from openapi_server.models.ad_group_create_create import AdGroupCreateCreate  # noqa: F401
from openapi_server.models.ad_group_update_batch_update import AdGroupUpdateBatchUpdate  # noqa: F401
from openapi_server.models.ad_groups_analytics_metrics import AdGroupsAnalyticsMetrics  # noqa: F401
from openapi_server.models.ad_groups_create200_response import AdGroupsCreate200Response  # noqa: F401
from openapi_server.models.ad_groups_list200_response import AdGroupsList200Response  # noqa: F401
from openapi_server.models.ads_analytics_ad_group_targeting_type import AdsAnalyticsAdGroupTargetingType  # noqa: F401
from openapi_server.models.bid_floor import BidFloor  # noqa: F401
from openapi_server.models.bid_floor_create import BidFloorCreate  # noqa: F401
from openapi_server.models.conversion_report_attribution_type import ConversionReportAttributionType  # noqa: F401
from openapi_server.models.dynamic_titles_download_csv import DynamicTitlesDownloadCSV  # noqa: F401
from openapi_server.models.dynamic_titles_get_status import DynamicTitlesGetStatus  # noqa: F401
from openapi_server.models.dynamic_titles_process_csv import DynamicTitlesProcessCSV  # noqa: F401
from openapi_server.models.dynamic_titles_process_csv_create import DynamicTitlesProcessCSVCreate  # noqa: F401
from openapi_server.models.dynamic_titles_upload_url import DynamicTitlesUploadURL  # noqa: F401
from openapi_server.models.entity_status import EntityStatus  # noqa: F401
from openapi_server.models.granularity import Granularity  # noqa: F401
from openapi_server.models.metrics_response import MetricsResponse  # noqa: F401
from openapi_server.models.pinterest_lib_error import PinterestLibError  # noqa: F401
from openapi_server.models.pinterest_lib_pagination_order import PinterestLibPaginationOrder  # noqa: F401
from openapi_server.models.reporting_column_sync import ReportingColumnSync  # noqa: F401
from openapi_server.models.reporting_time_zone import ReportingTimeZone  # noqa: F401


def test_ad_groups_list(client: TestClient):
    """Test case for ad_groups_list

    List ad groups
    """
    params = [("bookmark", 'bookmark_example'),     ("page_size", 25),     ("order", openapi_server.PinterestLibPaginationOrder()),     ("campaign_ids", ['campaign_ids_example']),     ("ad_group_ids", ['ad_group_ids_example']),     ("entity_statuses", ["ACTIVE","PAUSED"]),     ("translate_interests_to_names", False)]
    headers = {
        "Authorization": "Bearer special-key",
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/ad_accounts/{ad_account_id}/ad_groups".format(ad_account_id='ad_account_id_example'),
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_ad_groups_create(client: TestClient):
    """Test case for ad_groups_create

    Create ad groups
    """
    ad_group_create_create = [[openapi_server.AdGroupCreateCreate()]]

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/ad_accounts/{ad_account_id}/ad_groups".format(ad_account_id='ad_account_id_example'),
    #    headers=headers,
    #    json=ad_group_create_create,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_ad_groups_update(client: TestClient):
    """Test case for ad_groups_update

    Update ad groups
    """
    ad_group_update_batch_update = [[openapi_server.AdGroupUpdateBatchUpdate()]]

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "PATCH",
    #    "/ad_accounts/{ad_account_id}/ad_groups".format(ad_account_id='ad_account_id_example'),
    #    headers=headers,
    #    json=ad_group_update_batch_update,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_ad_groups_analytics(client: TestClient):
    """Test case for ad_groups_analytics

    Get ad group analytics
    """
    params = [("start_date", '2013-10-20'),     ("end_date", '2013-10-20'),     ("ad_group_ids", ['ad_group_ids_example']),     ("columns", [openapi_server.ReportingColumnSync()]),     ("granularity", openapi_server.Granularity()),     ("click_window_days", 30),     ("engagement_window_days", 30),     ("view_window_days", 1),     ("conversion_report_time", 'TIME_OF_AD_ACTION'),     ("aggregate_report_rows", False),     ("reporting_timezone", openapi_server.ReportingTimeZone())]
    headers = {
        "Authorization": "Bearer special-key",
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/ad_accounts/{ad_account_id}/ad_groups/analytics".format(ad_account_id='ad_account_id_example'),
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_ad_groups_audience_sizing(client: TestClient):
    """Test case for ad_groups_audience_sizing

    Get audience sizing
    """
    ad_group_audience_sizing_create = openapi_server.AdGroupAudienceSizingCreate()

    headers = {
        "Authorization": "Bearer special-key",
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/ad_accounts/{ad_account_id}/ad_groups/audience_sizing".format(ad_account_id='ad_account_id_example'),
    #    headers=headers,
    #    json=ad_group_audience_sizing_create,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_ad_groups_targeting_analytics_get(client: TestClient):
    """Test case for ad_groups_targeting_analytics_get

    Get targeting analytics for ad groups
    """
    params = [("ad_group_ids", ['ad_group_ids_example']),     ("start_date", '2013-10-20'),     ("end_date", '2013-10-20'),     ("targeting_types", [openapi_server.AdsAnalyticsAdGroupTargetingType()]),     ("columns", [openapi_server.ReportingColumnSync()]),     ("granularity", openapi_server.Granularity()),     ("click_window_days", 30),     ("engagement_window_days", 30),     ("view_window_days", 1),     ("conversion_report_time", 'TIME_OF_AD_ACTION'),     ("attribution_types", [openapi_server.ConversionReportAttributionType()]),     ("reporting_timezone", openapi_server.ReportingTimeZone()),     ("sort_columns", ['sort_columns_example']),     ("sort_ascending", True)]
    headers = {
        "Authorization": "Bearer special-key",
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/ad_accounts/{ad_account_id}/ad_groups/targeting_analytics".format(ad_account_id='ad_account_id_example'),
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_ad_groups_get(client: TestClient):
    """Test case for ad_groups_get

    Get ad group
    """

    headers = {
        "Authorization": "Bearer special-key",
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}".format(ad_group_id='ad_group_id_example', ad_account_id='ad_account_id_example'),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_ad_groups_dynamic_titles_process_csv(client: TestClient):
    """Test case for ad_groups_dynamic_titles_process_csv

    Process dynamic titles CSV
    """
    dynamic_titles_process_csv_create = openapi_server.DynamicTitlesProcessCSVCreate()

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles".format(ad_account_id='ad_account_id_example', ad_group_id='ad_group_id_example'),
    #    headers=headers,
    #    json=dynamic_titles_process_csv_create,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_ad_groups_dynamic_titles_download_csv(client: TestClient):
    """Test case for ad_groups_dynamic_titles_download_csv

    Get dynamic titles CSV download URL
    """

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles/csv".format(ad_account_id='ad_account_id_example', ad_group_id='ad_group_id_example'),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_ad_groups_dynamic_titles_get_status(client: TestClient):
    """Test case for ad_groups_dynamic_titles_get_status

    Get dynamic titles status
    """

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles/status".format(ad_account_id='ad_account_id_example', ad_group_id='ad_group_id_example'),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_ad_groups_dynamic_titles_get_upload_url(client: TestClient):
    """Test case for ad_groups_dynamic_titles_get_upload_url

    Get dynamic titles upload URL
    """

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles/uploads".format(ad_account_id='ad_account_id_example', ad_group_id='ad_group_id_example'),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_ad_groups_bid_floor_get(client: TestClient):
    """Test case for ad_groups_bid_floor_get

    Get bid floors
    """
    bid_floor_create = openapi_server.BidFloorCreate()

    headers = {
        "Authorization": "Bearer special-key",
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/ad_accounts/{ad_account_id}/bid_floor".format(ad_account_id='ad_account_id_example'),
    #    headers=headers,
    #    json=bid_floor_create,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_ad_groups_by_promotion_ids_list(client: TestClient):
    """Test case for get_ad_groups_by_promotion_ids_list

    List of ad groups using promotions IDs.
    """
    params = [("bookmark", 'bookmark_example'),     ("page_size", 25),     ("order", openapi_server.PinterestLibPaginationOrder()),     ("promotion_ids", ['promotion_ids_example'])]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/ad_accounts/{ad_account_id}/promotion_applied_entities".format(ad_account_id='ad_account_id_example'),
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200

