# coding: utf-8

from fastapi.testclient import TestClient


from pydantic import Field, field_validator  # noqa: F401
from typing import Optional  # noqa: F401
from typing_extensions import Annotated  # noqa: F401
from openapi_server.models.ad_accounts_audience import AdAccountsAudience  # noqa: F401
from openapi_server.models.ad_accounts_audience_create import AdAccountsAudienceCreate  # noqa: F401
from openapi_server.models.ad_accounts_audience_update import AdAccountsAudienceUpdate  # noqa: F401
from openapi_server.models.audience_ownership_type import AudienceOwnershipType  # noqa: F401
from openapi_server.models.audiences_list200_response import AudiencesList200Response  # noqa: F401
from openapi_server.models.pinterest_lib_error import PinterestLibError  # noqa: F401
from openapi_server.models.pinterest_lib_pagination_order import PinterestLibPaginationOrder  # noqa: F401


def test_audiences_list(client: TestClient):
    """Test case for audiences_list

    List audiences
    """
    params = [("bookmark", 'bookmark_example'),     ("page_size", 25),     ("order", openapi_server.PinterestLibPaginationOrder()),     ("ownership_type", openapi_server.AudienceOwnershipType()),     ("exclude_nca", False)]
    headers = {
        "Authorization": "Bearer special-key",
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/ad_accounts/{ad_account_id}/audiences".format(ad_account_id='ad_account_id_example'),
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_audiences_create(client: TestClient):
    """Test case for audiences_create

    Create audience
    """
    ad_accounts_audience_create = openapi_server.AdAccountsAudienceCreate()

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/ad_accounts/{ad_account_id}/audiences".format(ad_account_id='ad_account_id_example'),
    #    headers=headers,
    #    json=ad_accounts_audience_create,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_audiences_get(client: TestClient):
    """Test case for audiences_get

    Get audience
    """

    headers = {
        "Authorization": "Bearer special-key",
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/ad_accounts/{ad_account_id}/audiences/{audience_id}".format(audience_id='audience_id_example', ad_account_id='ad_account_id_example'),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_audiences_update(client: TestClient):
    """Test case for audiences_update

    Update audience
    """
    ad_accounts_audience_update = openapi_server.AdAccountsAudienceUpdate()

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "PATCH",
    #    "/ad_accounts/{ad_account_id}/audiences/{audience_id}".format(audience_id='audience_id_example', ad_account_id='ad_account_id_example'),
    #    headers=headers,
    #    json=ad_accounts_audience_update,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200

