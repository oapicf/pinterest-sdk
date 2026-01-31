# coding: utf-8

from fastapi.testclient import TestClient


from pydantic import Field, StrictStr, field_validator  # noqa: F401
from typing import Any, Optional  # noqa: F401
from typing_extensions import Annotated  # noqa: F401
from openapi_server.models.ad_accounts_subscriptions_get_list200_response import AdAccountsSubscriptionsGetList200Response  # noqa: F401
from openapi_server.models.lead_subscription import LeadSubscription  # noqa: F401
from openapi_server.models.lead_subscription_post_params_create import LeadSubscriptionPostParamsCreate  # noqa: F401
from openapi_server.models.pinterest_lib_error import PinterestLibError  # noqa: F401


def test_ad_accounts_subscriptions_get_list(client: TestClient):
    """Test case for ad_accounts_subscriptions_get_list

    Get lead ads subscriptions
    """
    params = [("bookmark", 'bookmark_example'),     ("page_size", 25)]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/ad_accounts/{ad_account_id}/leads/subscriptions".format(ad_account_id='ad_account_id_example'),
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_ad_accounts_subscriptions_post(client: TestClient):
    """Test case for ad_accounts_subscriptions_post

    Create lead ads subscription
    """
    lead_subscription_post_params_create = {"webhook_url":"webhook_url","partner_refresh_token":"partner_refresh_token","lead_form_id":"lead_form_id","partner_metadata":{"subscriber_key":"subscriber_key"},"partner_access_token":"partner_access_token"}

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/ad_accounts/{ad_account_id}/leads/subscriptions".format(ad_account_id='ad_account_id_example'),
    #    headers=headers,
    #    json=lead_subscription_post_params_create,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_ad_accounts_subscriptions_get_by_id(client: TestClient):
    """Test case for ad_accounts_subscriptions_get_by_id

    Get lead ads subscription by ID
    """

    headers = {
        "Authorization": "Bearer special-key",
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/ad_accounts/{ad_account_id}/leads/subscriptions/{subscription_id}".format(ad_account_id='ad_account_id_example', subscription_id='subscription_id_example'),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_ad_accounts_subscriptions_del_by_id(client: TestClient):
    """Test case for ad_accounts_subscriptions_del_by_id

    Delete lead ads subscription
    """

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "DELETE",
    #    "/ad_accounts/{ad_account_id}/leads/subscriptions/{subscription_id}".format(ad_account_id='ad_account_id_example', subscription_id='subscription_id_example'),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200

