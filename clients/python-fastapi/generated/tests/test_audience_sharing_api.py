# coding: utf-8

from fastapi.testclient import TestClient


from pydantic import Field, field_validator  # noqa: F401
from typing import Optional  # noqa: F401
from typing_extensions import Annotated  # noqa: F401
from openapi_server.models.ad_account_to_ad_account_shared_audience import AdAccountToAdAccountSharedAudience  # noqa: F401
from openapi_server.models.ad_account_to_ad_account_shared_audience_update_with_required_body import AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody  # noqa: F401
from openapi_server.models.ad_account_to_business_shared_audience import AdAccountToBusinessSharedAudience  # noqa: F401
from openapi_server.models.ad_account_to_business_shared_audience_update_with_required_body import AdAccountToBusinessSharedAudienceUpdateWithRequiredBody  # noqa: F401
from openapi_server.models.ad_accounts_audiences_shared_accounts_list200_response import AdAccountsAudiencesSharedAccountsList200Response  # noqa: F401
from openapi_server.models.audience_account_type import AudienceAccountType  # noqa: F401
from openapi_server.models.business_to_ad_account_shared_audience import BusinessToAdAccountSharedAudience  # noqa: F401
from openapi_server.models.business_to_ad_account_shared_audience_update_with_required_body import BusinessToAdAccountSharedAudienceUpdateWithRequiredBody  # noqa: F401
from openapi_server.models.business_to_business_shared_audience import BusinessToBusinessSharedAudience  # noqa: F401
from openapi_server.models.business_to_business_shared_audience_update_with_required_body import BusinessToBusinessSharedAudienceUpdateWithRequiredBody  # noqa: F401
from openapi_server.models.order import Order  # noqa: F401
from openapi_server.models.pinterest_lib_error import PinterestLibError  # noqa: F401
from openapi_server.models.shared_audiences_for_business_list200_response import SharedAudiencesForBusinessList200Response  # noqa: F401


def test_update_ad_account_to_ad_account_shared_audience(client: TestClient):
    """Test case for update_ad_account_to_ad_account_shared_audience

    Update audience sharing between ad accounts
    """
    ad_account_to_ad_account_shared_audience_update_with_required_body = openapi_server.AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody()

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "PATCH",
    #    "/ad_accounts/{ad_account_id}/audiences/ad_accounts/shared".format(ad_account_id='ad_account_id_example'),
    #    headers=headers,
    #    json=ad_account_to_ad_account_shared_audience_update_with_required_body,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_update_ad_account_to_business_shared_audience(client: TestClient):
    """Test case for update_ad_account_to_business_shared_audience

    Update audience sharing from an ad account to businesses
    """
    ad_account_to_business_shared_audience_update_with_required_body = openapi_server.AdAccountToBusinessSharedAudienceUpdateWithRequiredBody()

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "PATCH",
    #    "/ad_accounts/{ad_account_id}/audiences/businesses/shared".format(ad_account_id='ad_account_id_example'),
    #    headers=headers,
    #    json=ad_account_to_business_shared_audience_update_with_required_body,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_ad_accounts_audiences_shared_accounts_list(client: TestClient):
    """Test case for ad_accounts_audiences_shared_accounts_list

    List accounts with access to an audience owned by an ad account
    """
    params = [("audience_id", 'audience_id_example'),     ("account_type", openapi_server.AudienceAccountType()),     ("bookmark", 'bookmark_example'),     ("page_size", 25)]
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


def test_shared_audiences_for_business_list(client: TestClient):
    """Test case for shared_audiences_for_business_list

    List received audiences for a business
    """
    params = [("order", openapi_server.Order()),     ("bookmark", 'bookmark_example'),     ("page_size", 25)]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/businesses/{business_id}/audiences".format(business_id='business_id_example'),
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_update_business_to_ad_account_shared_audience(client: TestClient):
    """Test case for update_business_to_ad_account_shared_audience

    Update audience sharing from a business to ad accounts
    """
    business_to_ad_account_shared_audience_update_with_required_body = openapi_server.BusinessToAdAccountSharedAudienceUpdateWithRequiredBody()

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "PATCH",
    #    "/businesses/{business_id}/audiences/ad_accounts/shared".format(business_id='business_id_example'),
    #    headers=headers,
    #    json=business_to_ad_account_shared_audience_update_with_required_body,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_update_business_to_business_shared_audience(client: TestClient):
    """Test case for update_business_to_business_shared_audience

    Update audience sharing between businesses
    """
    business_to_business_shared_audience_update_with_required_body = openapi_server.BusinessToBusinessSharedAudienceUpdateWithRequiredBody()

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "PATCH",
    #    "/businesses/{business_id}/audiences/businesses/shared".format(business_id='business_id_example'),
    #    headers=headers,
    #    json=business_to_business_shared_audience_update_with_required_body,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_business_account_audiences_shared_accounts_list(client: TestClient):
    """Test case for business_account_audiences_shared_accounts_list

    List accounts with access to an audience owned by a business
    """
    params = [("audience_id", 'audience_id_example'),     ("account_type", openapi_server.AudienceAccountType()),     ("bookmark", 'bookmark_example'),     ("page_size", 25)]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/businesses/{business_id}/audiences/shared/accounts".format(business_id='business_id_example'),
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200

