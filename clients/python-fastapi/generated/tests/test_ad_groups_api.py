# coding: utf-8

from fastapi.testclient import TestClient


from datetime import date  # noqa: F401
from pydantic import Field, StrictBool, StrictInt, StrictStr, field_validator  # noqa: F401
from typing import List, Optional  # noqa: F401
from typing_extensions import Annotated  # noqa: F401
from openapi_server.models.ad_group_array_response import AdGroupArrayResponse  # noqa: F401
from openapi_server.models.ad_group_audience_sizing_request import AdGroupAudienceSizingRequest  # noqa: F401
from openapi_server.models.ad_group_audience_sizing_response import AdGroupAudienceSizingResponse  # noqa: F401
from openapi_server.models.ad_group_create_request import AdGroupCreateRequest  # noqa: F401
from openapi_server.models.ad_group_response import AdGroupResponse  # noqa: F401
from openapi_server.models.ad_group_update_request import AdGroupUpdateRequest  # noqa: F401
from openapi_server.models.ad_groups_analytics_response_inner import AdGroupsAnalyticsResponseInner  # noqa: F401
from openapi_server.models.ad_groups_list200_response import AdGroupsList200Response  # noqa: F401
from openapi_server.models.ads_analytics_ad_group_targeting_type import AdsAnalyticsAdGroupTargetingType  # noqa: F401
from openapi_server.models.bid_floor import BidFloor  # noqa: F401
from openapi_server.models.bid_floor_request import BidFloorRequest  # noqa: F401
from openapi_server.models.conversion_report_attribution_type import ConversionReportAttributionType  # noqa: F401
from openapi_server.models.error import Error  # noqa: F401
from openapi_server.models.granularity import Granularity  # noqa: F401
from openapi_server.models.metrics_response import MetricsResponse  # noqa: F401
from openapi_server.models.reporting_time_zone import ReportingTimeZone  # noqa: F401


def test_ad_groups_list(client: TestClient):
    """Test case for ad_groups_list

    List ad groups
    """
    params = [("campaign_ids", ['campaign_ids_example']),     ("ad_group_ids", ['ad_group_ids_example']),     ("entity_statuses", ["ACTIVE","PAUSED"]),     ("page_size", 25),     ("order", 'ASCENDING'),     ("bookmark", 'bookmark_example'),     ("translate_interests_to_names", False)]
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
    ad_group_create_request = [{"bid_in_micro_currency":5000000,"targeting_template_ids":["643"],"is_creative_optimization":1,"end_time":5705424000,"promotion_application_level":"ITEM","promotion_id":"7834020347906","auto_targeting_enabled":1,"bid_multiplier":1,"tracking_urls":"{}","budget_in_micro_currency":5000000,"bid_strategy_type":"MAX_BID","start_time":5686848000,"billable_event":"CLICKTHROUGH","targeting_spec":{"location":["LOCATION","LOCATION"],"maximum_age":"65+","age_bucket":["35-44","50-54"],"audience_include":["AUDIENCE_INCLUDE","AUDIENCE_INCLUDE"],"shopping_retargeting":[{"lookback_window":30,"exclusion_window":14,"tag_types":[0,6]},{"lookback_window":30,"exclusion_window":14,"tag_types":[0,6]}],"targeting_strategy":["CHOOSE_YOUR_OWN","CHOOSE_YOUR_OWN"],"interest":["INTEREST","INTEREST"],"geo":["GEO","GEO"],"minimum_age":"18","locale":["LOCALE","LOCALE"],"gender":["unknown","unknown"],"apptype":["ipad","iphone"],"audience_exclude":["AUDIENCE_EXCLUDE","AUDIENCE_EXCLUDE"]},"name":"Ad Group For Pin: 687195905986","lifetime_frequency_cap":100,"optimization_goal_metadata":"{}","placement_group":"placement_group","budget_type":"DAILY","campaign_id":"626736533506","pacing_delivery_type":"STANDARD","status":"status"}]

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/ad_accounts/{ad_account_id}/ad_groups".format(ad_account_id='ad_account_id_example'),
    #    headers=headers,
    #    json=ad_group_create_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_ad_groups_update(client: TestClient):
    """Test case for ad_groups_update

    Update ad groups
    """
    ad_group_update_request = [{"bid_in_micro_currency":5000000,"targeting_template_ids":["643"],"is_creative_optimization":1,"end_time":5705424000,"promotion_application_level":"ITEM","promotion_id":"7834020347906","auto_targeting_enabled":1,"bid_multiplier":1,"tracking_urls":"{}","budget_in_micro_currency":5000000,"bid_strategy_type":"MAX_BID","start_time":5686848000,"billable_event":"CLICKTHROUGH","targeting_spec":{"location":["LOCATION","LOCATION"],"maximum_age":"65+","age_bucket":["35-44","50-54"],"audience_include":["AUDIENCE_INCLUDE","AUDIENCE_INCLUDE"],"shopping_retargeting":[{"lookback_window":30,"exclusion_window":14,"tag_types":[0,6]},{"lookback_window":30,"exclusion_window":14,"tag_types":[0,6]}],"targeting_strategy":["CHOOSE_YOUR_OWN","CHOOSE_YOUR_OWN"],"interest":["INTEREST","INTEREST"],"geo":["GEO","GEO"],"minimum_age":"18","locale":["LOCALE","LOCALE"],"gender":["unknown","unknown"],"apptype":["ipad","iphone"],"audience_exclude":["AUDIENCE_EXCLUDE","AUDIENCE_EXCLUDE"]},"name":"Ad Group For Pin: 687195905986","lifetime_frequency_cap":100,"id":"2680060704746","optimization_goal_metadata":"{}","placement_group":"placement_group","budget_type":"budget_type","campaign_id":"626736533506","pacing_delivery_type":"pacing_delivery_type","status":"status"}]

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "PATCH",
    #    "/ad_accounts/{ad_account_id}/ad_groups".format(ad_account_id='ad_account_id_example'),
    #    headers=headers,
    #    json=ad_group_update_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_ad_groups_analytics(client: TestClient):
    """Test case for ad_groups_analytics

    Get ad group analytics
    """
    params = [("start_date", '2013-10-20'),     ("end_date", '2013-10-20'),     ("ad_group_ids", ['ad_group_ids_example']),     ("columns", ['columns_example']),     ("granularity", openapi_server.Granularity()),     ("click_window_days", 30),     ("engagement_window_days", 30),     ("view_window_days", 1),     ("conversion_report_time", TIME_OF_AD_ACTION),     ("aggregate_report_rows", False),     ("reporting_timezone", openapi_server.ReportingTimeZone())]
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


def test_ad_groups_targeting_analytics_get(client: TestClient):
    """Test case for ad_groups_targeting_analytics_get

    Get targeting analytics for ad groups
    """
    params = [("ad_group_ids", ['ad_group_ids_example']),     ("start_date", '2013-10-20'),     ("end_date", '2013-10-20'),     ("targeting_types", [openapi_server.AdsAnalyticsAdGroupTargetingType()]),     ("columns", ['columns_example']),     ("granularity", openapi_server.Granularity()),     ("click_window_days", 30),     ("engagement_window_days", 30),     ("view_window_days", 1),     ("conversion_report_time", TIME_OF_AD_ACTION),     ("attribution_types", [openapi_server.ConversionReportAttributionType()]),     ("reporting_timezone", openapi_server.ReportingTimeZone())]
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


def test_ad_groups_audience_sizing(client: TestClient):
    """Test case for ad_groups_audience_sizing

    Get audience sizing
    """
    ad_group_audience_sizing_request = {"keywords":[{"match_type":"BROAD","value":"value"},{"match_type":"BROAD","value":"value"}],"targeting_spec":{"location":["LOCATION","LOCATION"],"maximum_age":"65+","age_bucket":["35-44","50-54"],"audience_include":["AUDIENCE_INCLUDE","AUDIENCE_INCLUDE"],"shopping_retargeting":[{"lookback_window":30,"exclusion_window":14,"tag_types":[0,6]},{"lookback_window":30,"exclusion_window":14,"tag_types":[0,6]}],"targeting_strategy":["CHOOSE_YOUR_OWN","CHOOSE_YOUR_OWN"],"interest":["INTEREST","INTEREST"],"geo":["GEO","GEO"],"minimum_age":"18","locale":["LOCALE","LOCALE"],"gender":["unknown","unknown"],"apptype":["ipad","iphone"],"audience_exclude":["AUDIENCE_EXCLUDE","AUDIENCE_EXCLUDE"]},"creative_types":["REGULAR","REGULAR"],"product_group_ids":["23423422123","23423422123"],"auto_targeting_enabled":1,"placement_group":"ALL"}

    headers = {
        "Authorization": "Bearer special-key",
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/ad_accounts/{ad_account_id}/ad_groups/audience_sizing".format(ad_account_id='ad_account_id_example'),
    #    headers=headers,
    #    json=ad_group_audience_sizing_request,
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
    #    "/ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}".format(ad_account_id='ad_account_id_example', ad_group_id='ad_group_id_example'),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_ad_groups_bid_floor_get(client: TestClient):
    """Test case for ad_groups_bid_floor_get

    Get bid floors
    """
    bid_floor_request = {"targeting_spec":{"geo":["BE-VOV"],"location":["US"],"locale":["cs"],"age_bucket":["25-34"],"audience_include":["2542620905473"],"shopping_retargeting":[{"lookback_window":30,"exclusion_window":14,"tag_types":[0,6]},{"lookback_window":30,"exclusion_window":14,"tag_types":[0,6]}],"gender":["male"],"targeting_strategy":["CHOOSE_YOUR_OWN"],"apptype":["iphone"],"audience_exclude":["2542620905475"],"interest":["925056443165"]},"bid_floor_specs":[{"billable_event":"CLICKTHROUGH","creative_type":"REGULAR","currency":"USD","countries":["US","US"],"optimization_goal_metadata":{"frequency_goal_metadata":{"timerange":"DAY","frequency":5},"conversion_tag_v3_goal_metadata":{"attribution_windows":{"view_window_days":1,"click_window_days":0,"engagement_window_days":6},"conversion_tag_id":"123456789","learning_mode_type":"ACTIVE","conversion_event":"PAGE_VISIT","is_roas_optimized":1,"cpa_goal_value_in_micro_currency":"123456789"},"scrollup_goal_metadata":{"scrollup_goal_value_in_micro_currency":"123456789"}}},{"billable_event":"CLICKTHROUGH","creative_type":"REGULAR","currency":"USD","countries":["US","US"],"optimization_goal_metadata":{"frequency_goal_metadata":{"timerange":"DAY","frequency":5},"conversion_tag_v3_goal_metadata":{"attribution_windows":{"view_window_days":1,"click_window_days":0,"engagement_window_days":6},"conversion_tag_id":"123456789","learning_mode_type":"ACTIVE","conversion_event":"PAGE_VISIT","is_roas_optimized":1,"cpa_goal_value_in_micro_currency":"123456789"},"scrollup_goal_metadata":{"scrollup_goal_value_in_micro_currency":"123456789"}}}]}

    headers = {
        "Authorization": "Bearer special-key",
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/ad_accounts/{ad_account_id}/bid_floor".format(ad_account_id='ad_account_id_example'),
    #    headers=headers,
    #    json=bid_floor_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200

