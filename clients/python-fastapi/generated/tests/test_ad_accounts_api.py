# coding: utf-8

from fastapi.testclient import TestClient


from openapi_server.models.ads_analytics_create_async_request import AdsAnalyticsCreateAsyncRequest  # noqa: F401
from openapi_server.models.ads_analytics_create_async_response import AdsAnalyticsCreateAsyncResponse  # noqa: F401
from openapi_server.models.ads_analytics_get_async_response import AdsAnalyticsGetAsyncResponse  # noqa: F401
from openapi_server.models.error import Error  # noqa: F401
from openapi_server.models.granularity import Granularity  # noqa: F401
from openapi_server.models.paginated import Paginated  # noqa: F401


def test_ad_account_analytics(client: TestClient):
    """Test case for ad_account_analytics

    Get ad account analytics
    """
    params = [("start_date", '2013-10-20'),     ("end_date", '2013-10-20'),     ("columns", ['columns_example']),     ("granularity", openapi_server.Granularity()),     ("click_window_days", 30),     ("engagement_window_days", 30),     ("view_window_days", 1),     ("conversion_report_time", 'TIME_OF_AD_ACTION')]
    headers = {
        "Authorization": "Bearer special-key",
    }
    response = client.request(
        "GET",
        "/ad_accounts/{ad_account_id}/analytics".format(ad_account_id='ad_account_id_example'),
        headers=headers,
        params=params,
    )

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_ad_accounts_list(client: TestClient):
    """Test case for ad_accounts_list

    List ad accounts
    """
    params = [("bookmark", 'bookmark_example'),     ("page_size", 25),     ("include_shared_accounts", True)]
    headers = {
        "Authorization": "Bearer special-key",
    }
    response = client.request(
        "GET",
        "/ad_accounts",
        headers=headers,
        params=params,
    )

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_ad_groups_analytics(client: TestClient):
    """Test case for ad_groups_analytics

    Get ad group analytics
    """
    params = [("start_date", '2013-10-20'),     ("end_date", '2013-10-20'),     ("ad_group_ids", ['ad_group_ids_example']),     ("columns", ['columns_example']),     ("granularity", openapi_server.Granularity()),     ("click_window_days", 30),     ("engagement_window_days", 30),     ("view_window_days", 1),     ("conversion_report_time", 'TIME_OF_AD_ACTION')]
    headers = {
        "Authorization": "Bearer special-key",
    }
    response = client.request(
        "GET",
        "/ad_accounts/{ad_account_id}/ad_groups/analytics".format(ad_account_id='ad_account_id_example'),
        headers=headers,
        params=params,
    )

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_ad_groups_list(client: TestClient):
    """Test case for ad_groups_list

    List ad groups
    """
    params = [("campaign_ids", ['campaign_ids_example']),     ("ad_group_ids", ['ad_group_ids_example']),     ("entity_statuses", ['entity_statuses_example']),     ("page_size", 25),     ("order", 'ASCENDING'),     ("bookmark", 'bookmark_example'),     ("translate_interests_to_names", False)]
    headers = {
        "Authorization": "Bearer special-key",
    }
    response = client.request(
        "GET",
        "/ad_accounts/{ad_account_id}/ad_groups".format(ad_account_id='ad_account_id_example'),
        headers=headers,
        params=params,
    )

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_ads_analytics(client: TestClient):
    """Test case for ads_analytics

    Get ad analytics
    """
    params = [("start_date", '2013-10-20'),     ("end_date", '2013-10-20'),     ("ad_ids", ['ad_ids_example']),     ("columns", ['columns_example']),     ("granularity", openapi_server.Granularity()),     ("click_window_days", 30),     ("engagement_window_days", 30),     ("view_window_days", 1),     ("conversion_report_time", 'TIME_OF_AD_ACTION')]
    headers = {
        "Authorization": "Bearer special-key",
    }
    response = client.request(
        "GET",
        "/ad_accounts/{ad_account_id}/ads/analytics".format(ad_account_id='ad_account_id_example'),
        headers=headers,
        params=params,
    )

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_ads_list(client: TestClient):
    """Test case for ads_list

    List ads
    """
    params = [("campaign_ids", ['campaign_ids_example']),     ("ad_group_ids", ['ad_group_ids_example']),     ("ad_ids", ['ad_ids_example']),     ("entity_statuses", ['entity_statuses_example']),     ("page_size", 25),     ("order", 'ASCENDING'),     ("bookmark", 'bookmark_example')]
    headers = {
        "Authorization": "Bearer special-key",
    }
    response = client.request(
        "GET",
        "/ad_accounts/{ad_account_id}/ads".format(ad_account_id='ad_account_id_example'),
        headers=headers,
        params=params,
    )

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_analytics_create_report(client: TestClient):
    """Test case for analytics_create_report

    Create async request for an account analytics report
    """
    ads_analytics_create_async_request = null

    headers = {
        "Authorization": "Bearer special-key",
    }
    response = client.request(
        "POST",
        "/ad_accounts/{ad_account_id}/reports".format(ad_account_id='ad_account_id_example'),
        headers=headers,
        json=ads_analytics_create_async_request,
    )

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
    response = client.request(
        "GET",
        "/ad_accounts/{ad_account_id}/reports".format(ad_account_id='ad_account_id_example'),
        headers=headers,
        params=params,
    )

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_campaigns_analytics(client: TestClient):
    """Test case for campaigns_analytics

    Get campaign analytics
    """
    params = [("start_date", '2013-10-20'),     ("end_date", '2013-10-20'),     ("campaign_ids", ['campaign_ids_example']),     ("columns", ['columns_example']),     ("granularity", openapi_server.Granularity()),     ("click_window_days", 30),     ("engagement_window_days", 30),     ("view_window_days", 1),     ("conversion_report_time", 'TIME_OF_AD_ACTION')]
    headers = {
        "Authorization": "Bearer special-key",
    }
    response = client.request(
        "GET",
        "/ad_accounts/{ad_account_id}/campaigns/analytics".format(ad_account_id='ad_account_id_example'),
        headers=headers,
        params=params,
    )

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_campaigns_list(client: TestClient):
    """Test case for campaigns_list

    List campaigns
    """
    params = [("campaign_ids", ['campaign_ids_example']),     ("entity_statuses", ['entity_statuses_example']),     ("page_size", 25),     ("order", 'ASCENDING'),     ("bookmark", 'bookmark_example')]
    headers = {
        "Authorization": "Bearer special-key",
    }
    response = client.request(
        "GET",
        "/ad_accounts/{ad_account_id}/campaigns".format(ad_account_id='ad_account_id_example'),
        headers=headers,
        params=params,
    )

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_product_groups_analytics(client: TestClient):
    """Test case for product_groups_analytics

    Get product group analytics
    """
    params = [("start_date", '2013-10-20'),     ("end_date", '2013-10-20'),     ("product_group_ids", ['product_group_ids_example']),     ("columns", ['columns_example']),     ("granularity", openapi_server.Granularity()),     ("click_window_days", 30),     ("engagement_window_days", 30),     ("view_window_days", 1),     ("conversion_report_time", 'TIME_OF_AD_ACTION')]
    headers = {
        "Authorization": "Bearer special-key",
    }
    response = client.request(
        "GET",
        "/ad_accounts/{ad_account_id}/product_groups/analytics".format(ad_account_id='ad_account_id_example'),
        headers=headers,
        params=params,
    )

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200

