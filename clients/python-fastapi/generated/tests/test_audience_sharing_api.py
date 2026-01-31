# coding: utf-8

from fastapi.testclient import TestClient


from pydantic import Field, StrictStr, field_validator  # noqa: F401
from typing import Optional  # noqa: F401
from typing_extensions import Annotated  # noqa: F401
from openapi_server.models.ad_accounts_audiences_shared_accounts_list200_response import AdAccountsAudiencesSharedAccountsList200Response  # noqa: F401
from openapi_server.models.audience_account_type import AudienceAccountType  # noqa: F401
from openapi_server.models.audiences_list200_response import AudiencesList200Response  # noqa: F401
from openapi_server.models.business_shared_audience import BusinessSharedAudience  # noqa: F401
from openapi_server.models.business_shared_audience_response import BusinessSharedAudienceResponse  # noqa: F401
from openapi_server.models.error import Error  # noqa: F401
from openapi_server.models.shared_audience import SharedAudience  # noqa: F401
from openapi_server.models.shared_audience_response import SharedAudienceResponse  # noqa: F401


def test_ad_accounts_audiences_shared_accounts_list(client: TestClient):
    """Test case for ad_accounts_audiences_shared_accounts_list

    List accounts with access to an audience owned by an ad account
    """
    params = [("audience_id", 'audience_id_example'),     ("account_type", AD_ACCOUNT),     ("page_size", 25),     ("bookmark", 'bookmark_example')]
    headers = {
        "Authorization": "Bearer special-key",
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/ad_accounts/{ad_account_id}/audiences/shared/accounts".format(ad_account_id='ad_account_id_example'),
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_update_ad_account_to_ad_account_shared_audience(client: TestClient):
    """Test case for update_ad_account_to_ad_account_shared_audience

    Update audience sharing between ad accounts
    """
    shared_audience = {"recipient_account_ids":["recipient_account_ids","recipient_account_ids"],"operation_type":"SHARE","audience_id":"2542621871096"}

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "PATCH",
    #    "/ad_accounts/{ad_account_id}/audiences/ad_accounts/shared".format(ad_account_id='ad_account_id_example'),
    #    headers=headers,
    #    json=shared_audience,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_update_ad_account_to_business_shared_audience(client: TestClient):
    """Test case for update_ad_account_to_business_shared_audience

    Update audience sharing from an ad account to businesses
    """
    business_shared_audience = {"operation_type":"SHARE","recipient_business_ids":["recipient_business_ids","recipient_business_ids"],"audience_id":"2542621871096"}

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "PATCH",
    #    "/ad_accounts/{ad_account_id}/audiences/businesses/shared".format(ad_account_id='ad_account_id_example'),
    #    headers=headers,
    #    json=business_shared_audience,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_shared_audiences_for_business_list(client: TestClient):
    """Test case for shared_audiences_for_business_list

    List received audiences for a business
    """
    params = [("bookmark", 'bookmark_example'),     ("order", 'ASCENDING'),     ("page_size", 25)]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/businesses/{business_id}/audiences".format(business_id='729090764583391194'),
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_business_account_audiences_shared_accounts_list(client: TestClient):
    """Test case for business_account_audiences_shared_accounts_list

    List accounts with access to an audience owned by a business
    """
    params = [("audience_id", 'audience_id_example'),     ("account_type", AD_ACCOUNT),     ("page_size", 25),     ("bookmark", 'bookmark_example')]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/businesses/{business_id}/audiences/shared/accounts".format(business_id='729090764583391194'),
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_update_business_to_ad_account_shared_audience(client: TestClient):
    """Test case for update_business_to_ad_account_shared_audience

    Update audience sharing from a business to ad accounts
    """
    shared_audience = {"recipient_account_ids":["recipient_account_ids","recipient_account_ids"],"operation_type":"SHARE","audience_id":"2542621871096"}

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "PATCH",
    #    "/businesses/{business_id}/audiences/ad_accounts/shared".format(business_id='729090764583391194'),
    #    headers=headers,
    #    json=shared_audience,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_update_business_to_business_shared_audience(client: TestClient):
    """Test case for update_business_to_business_shared_audience

    Update audience sharing between businesses
    """
    business_shared_audience = {"operation_type":"SHARE","recipient_business_ids":["recipient_business_ids","recipient_business_ids"],"audience_id":"2542621871096"}

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "PATCH",
    #    "/businesses/{business_id}/audiences/businesses/shared".format(business_id='729090764583391194'),
    #    headers=headers,
    #    json=business_shared_audience,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200

