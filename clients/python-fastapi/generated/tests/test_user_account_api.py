# coding: utf-8

from fastapi.testclient import TestClient


from datetime import date  # noqa: F401
from pydantic import Field, StrictBool, StrictInt, StrictStr, field_validator  # noqa: F401
from typing import Any, Dict, List, Optional  # noqa: F401
from typing_extensions import Annotated  # noqa: F401
from openapi_server.models.account import Account  # noqa: F401
from openapi_server.models.analytics_metrics_response import AnalyticsMetricsResponse  # noqa: F401
from openapi_server.models.boards_user_follows_list200_response import BoardsUserFollowsList200Response  # noqa: F401
from openapi_server.models.error import Error  # noqa: F401
from openapi_server.models.follow_user_request import FollowUserRequest  # noqa: F401
from openapi_server.models.followers_list200_response import FollowersList200Response  # noqa: F401
from openapi_server.models.linked_business import LinkedBusiness  # noqa: F401
from openapi_server.models.top_pins_analytics_response import TopPinsAnalyticsResponse  # noqa: F401
from openapi_server.models.top_video_pins_analytics_response import TopVideoPinsAnalyticsResponse  # noqa: F401
from openapi_server.models.user_account_followed_interests200_response import UserAccountFollowedInterests200Response  # noqa: F401
from openapi_server.models.user_following_get200_response import UserFollowingGet200Response  # noqa: F401
from openapi_server.models.user_summary import UserSummary  # noqa: F401
from openapi_server.models.user_website_summary import UserWebsiteSummary  # noqa: F401
from openapi_server.models.user_website_verification_code import UserWebsiteVerificationCode  # noqa: F401
from openapi_server.models.user_website_verify_request import UserWebsiteVerifyRequest  # noqa: F401
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
    params = [("start_date", '2013-10-20'),     ("end_date", '2013-10-20'),     ("from_claimed_content", BOTH),     ("pin_format", ALL),     ("app_types", ALL),     ("content_type", ALL),     ("source", ALL),     ("metric_types", ['metric_types_example']),     ("split_field", NO_SPLIT),     ("ad_account_id", 'ad_account_id_example')]
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
    params = [("start_date", '2013-10-20'),     ("end_date", '2013-10-20'),     ("sort_by", 'sort_by_example'),     ("from_claimed_content", BOTH),     ("pin_format", ALL),     ("app_types", ALL),     ("content_type", ALL),     ("source", ALL),     ("metric_types", ['metric_types_example']),     ("num_of_pins", 10),     ("created_in_last_n_days", 30),     ("ad_account_id", 'ad_account_id_example')]
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
    params = [("start_date", '2013-10-20'),     ("end_date", '2013-10-20'),     ("sort_by", 'sort_by_example'),     ("from_claimed_content", BOTH),     ("pin_format", ALL),     ("app_types", ALL),     ("content_type", ALL),     ("source", ALL),     ("metric_types", ['metric_types_example']),     ("num_of_pins", 10),     ("created_in_last_n_days", 30),     ("ad_account_id", 'ad_account_id_example')]
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
    params = [("bookmark", 'bookmark_example'),     ("page_size", 25),     ("feed_type", ALL),     ("explicit_following", False),     ("ad_account_id", 'ad_account_id_example')]
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
    params = [("bookmark", 'bookmark_example'),     ("page_size", 25),     ("explicit_following", False),     ("ad_account_id", 'ad_account_id_example')]
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
    follow_user_request = {"auto_follow":0}

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/user_account/following/{username}".format(username='username'),
    #    headers=headers,
    #    json=follow_user_request,
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
    user_website_verify_request = {"website":"pintest-website-12345678.test/test_1","verification_method":"METATAG"}
    params = [("ad_account_id", 'ad_account_id_example')]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/user_account/websites",
    #    headers=headers,
    #    json=user_website_verify_request,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_unverify_website_delete(client: TestClient):
    """Test case for unverify_website_delete

    Unverify website
    """
    params = [("website", 'mysite.test')]
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
    #    "/users/{username}/interests/follow".format(username='username'),
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200

