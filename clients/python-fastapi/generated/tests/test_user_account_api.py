# coding: utf-8

from fastapi.testclient import TestClient


from datetime import date  # noqa: F401
from pydantic import Field, field_validator  # noqa: F401
from typing import Any, Dict, List, Optional, Union  # noqa: F401
from typing_extensions import Annotated  # noqa: F401
from openapi_server.models.account import Account  # noqa: F401
from openapi_server.models.analytics_metrics_response import AnalyticsMetricsResponse  # noqa: F401
from openapi_server.models.boards_list200_response import BoardsList200Response  # noqa: F401
from openapi_server.models.follow_user import FollowUser  # noqa: F401
from openapi_server.models.follow_user_create import FollowUserCreate  # noqa: F401
from openapi_server.models.followers_list200_response import FollowersList200Response  # noqa: F401
from openapi_server.models.linked_business import LinkedBusiness  # noqa: F401
from openapi_server.models.pinterest_lib_error import PinterestLibError  # noqa: F401
from openapi_server.models.querymetrictypes_items import QuerymetrictypesItems  # noqa: F401
from openapi_server.models.queryvideopinmetrictypes_items import QueryvideopinmetrictypesItems  # noqa: F401
from openapi_server.models.top_pins_analytics_response import TopPinsAnalyticsResponse  # noqa: F401
from openapi_server.models.top_pins_sort_by import TopPinsSortBy  # noqa: F401
from openapi_server.models.top_video_pins_analytics_response import TopVideoPinsAnalyticsResponse  # noqa: F401
from openapi_server.models.top_video_pins_sort_by import TopVideoPinsSortBy  # noqa: F401
from openapi_server.models.user_account_followed_interests200_response import UserAccountFollowedInterests200Response  # noqa: F401
from openapi_server.models.user_following_feed_type import UserFollowingFeedType  # noqa: F401
from openapi_server.models.user_website import UserWebsite  # noqa: F401
from openapi_server.models.user_website_create import UserWebsiteCreate  # noqa: F401
from openapi_server.models.user_website_verification import UserWebsiteVerification  # noqa: F401
from openapi_server.models.user_websites_get200_response import UserWebsitesGet200Response  # noqa: F401


def test_user_account_get(client: TestClient):
    """Test case for user_account_get

    Get user account
    """
    params = [("ad_account_id", 'ad_account_id_example')]
    headers = {
        "Authorization": "Bearer special-key",
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/user_account",
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_user_account_analytics(client: TestClient):
    """Test case for user_account_analytics

    Get user account analytics
    """
    params = [("start_date", '2013-10-20'),     ("end_date", '2013-10-20'),     ("from_claimed_content", 'BOTH'),     ("pin_format", 'ALL'),     ("app_types", 'ALL'),     ("content_type", 'ALL'),     ("source", 'ALL'),     ("metric_types", [openapi_server.QuerymetrictypesItems()]),     ("split_field", 'NO_SPLIT'),     ("ad_account_id", 'ad_account_id_example')]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/user_account/analytics",
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_user_account_analytics_top_pins(client: TestClient):
    """Test case for user_account_analytics_top_pins

    Get user account top pins analytics
    """
    params = [("start_date", '2013-10-20'),     ("end_date", '2013-10-20'),     ("sort_by", openapi_server.TopPinsSortBy()),     ("from_claimed_content", 'BOTH'),     ("pin_format", 'ALL'),     ("app_types", 'ALL'),     ("content_type", 'ALL'),     ("source", 'ALL'),     ("metric_types", [openapi_server.QuerymetrictypesItems()]),     ("num_of_pins", 10),     ("created_in_last_n_days", 3.4),     ("ad_account_id", 'ad_account_id_example')]
    headers = {
        "Authorization": "Bearer special-key",
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/user_account/analytics/top_pins",
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_user_account_analytics_top_video_pins(client: TestClient):
    """Test case for user_account_analytics_top_video_pins

    Get user account top video pins analytics
    """
    params = [("start_date", '2013-10-20'),     ("end_date", '2013-10-20'),     ("sort_by", openapi_server.TopVideoPinsSortBy()),     ("from_claimed_content", 'BOTH'),     ("pin_format", 'ALL'),     ("app_types", 'ALL'),     ("content_type", 'ALL'),     ("source", 'ALL'),     ("metric_types", [openapi_server.QueryvideopinmetrictypesItems()]),     ("num_of_pins", 10),     ("created_in_last_n_days", 3.4),     ("ad_account_id", 'ad_account_id_example')]
    headers = {
        "Authorization": "Bearer special-key",
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/user_account/analytics/top_video_pins",
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_linked_business_accounts_get(client: TestClient):
    """Test case for linked_business_accounts_get

    List linked businesses
    """

    headers = {
        "Authorization": "Bearer special-key",
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/user_account/businesses",
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_followers_list(client: TestClient):
    """Test case for followers_list

    List followers
    """
    params = [("bookmark", 'bookmark_example'),     ("page_size", 25)]
    headers = {
        "Authorization": "Bearer special-key",
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/user_account/followers",
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_user_following_get(client: TestClient):
    """Test case for user_following_get

    List following
    """
    params = [("ad_account_id", 'ad_account_id_example'),     ("explicit_following", False),     ("feed_type", 'ALL'),     ("bookmark", 'bookmark_example'),     ("page_size", 25)]
    headers = {
        "Authorization": "Bearer special-key",
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/user_account/following",
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_boards_user_follows_list(client: TestClient):
    """Test case for boards_user_follows_list

    List following boards
    """
    params = [("ad_account_id", 'ad_account_id_example'),     ("explicit_following", False),     ("bookmark", 'bookmark_example'),     ("page_size", 25)]
    headers = {
        "Authorization": "Bearer special-key",
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/user_account/following/boards",
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_follow_user_update(client: TestClient):
    """Test case for follow_user_update

    Follow user
    """
    follow_user_create = openapi_server.FollowUserCreate()

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/user_account/following/{username}".format(username='username_example'),
    #    headers=headers,
    #    json=follow_user_create,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_user_websites_get(client: TestClient):
    """Test case for user_websites_get

    Get user websites
    """
    params = [("bookmark", 'bookmark_example'),     ("page_size", 25)]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/user_account/websites",
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_verify_website_update(client: TestClient):
    """Test case for verify_website_update

    Verify website
    """
    user_website_create = openapi_server.UserWebsiteCreate()
    params = [("ad_account_id", 'ad_account_id_example')]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/user_account/websites",
    #    headers=headers,
    #    json=user_website_create,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_unverify_website_delete(client: TestClient):
    """Test case for unverify_website_delete

    Unverify website
    """
    params = [("website", 'website_example')]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "DELETE",
    #    "/user_account/websites",
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_website_verification_get(client: TestClient):
    """Test case for website_verification_get

    Get user verification code for website claiming
    """
    params = [("ad_account_id", 'ad_account_id_example')]
    headers = {
        "Authorization": "Bearer special-key",
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/user_account/websites/verification",
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_user_account_followed_interests(client: TestClient):
    """Test case for user_account_followed_interests

    List following interests
    """
    params = [("bookmark", 'bookmark_example'),     ("page_size", 25)]
    headers = {
        "Authorization": "Bearer special-key",
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/users/{username}/interests/follow".format(username='username_example'),
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200

