# coding: utf-8

from fastapi.testclient import TestClient


from pydantic import Field, StrictBool, StrictStr, field_validator  # noqa: F401
from typing import Any, List, Optional  # noqa: F401
from typing_extensions import Annotated  # noqa: F401
from openapi_server.models.brand_accounts_create200_response import BrandAccountsCreate200Response  # noqa: F401
from openapi_server.models.brand_accounts_create_request import BrandAccountsCreateRequest  # noqa: F401
from openapi_server.models.brand_accounts_update_request import BrandAccountsUpdateRequest  # noqa: F401
from openapi_server.models.delete_partners_request import DeletePartnersRequest  # noqa: F401
from openapi_server.models.delete_partners_response import DeletePartnersResponse  # noqa: F401
from openapi_server.models.deleted_members_response import DeletedMembersResponse  # noqa: F401
from openapi_server.models.error import Error  # noqa: F401
from openapi_server.models.get_business_employers200_response import GetBusinessEmployers200Response  # noqa: F401
from openapi_server.models.get_business_members200_response import GetBusinessMembers200Response  # noqa: F401
from openapi_server.models.get_business_partners200_response import GetBusinessPartners200Response  # noqa: F401
from openapi_server.models.member_business_role import MemberBusinessRole  # noqa: F401
from openapi_server.models.members_to_delete_body import MembersToDeleteBody  # noqa: F401
from openapi_server.models.partner_type import PartnerType  # noqa: F401
from openapi_server.models.system_user_update_request import SystemUserUpdateRequest  # noqa: F401
from openapi_server.models.update_member_business_role_body import UpdateMemberBusinessRoleBody  # noqa: F401
from openapi_server.models.update_member_results_response_array import UpdateMemberResultsResponseArray  # noqa: F401


def test_get_business_employers(client: TestClient):
    """Test case for get_business_employers

    List business employers for user
    """
    params = [("page_size", 25),     ("bookmark", 'bookmark_example')]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/businesses/employers",
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_system_user_update(client: TestClient):
    """Test case for system_user_update

    Update a system user information.
    """
    system_user_update_request = openapi_server.SystemUserUpdateRequest()

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "PATCH",
    #    "/businesses/{business_id}/system_users/{system_user_id}".format(business_id='729090764583391194', system_user_id='729090764583391194'),
    #    headers=headers,
    #    json=system_user_update_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_business_members(client: TestClient):
    """Test case for get_business_members

    Get business members
    """
    params = [("fetch_system_users", False),     ("assets_summary", False),     ("business_roles", [openapi_server.MemberBusinessRole()]),     ("member_ids", '00101010101,2222220101'),     ("start_index", 0),     ("bookmark", 'bookmark_example'),     ("page_size", 25)]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/businesses/{business_id}/members".format(business_id='729090764583391194'),
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_delete_business_membership(client: TestClient):
    """Test case for delete_business_membership

    Terminate business memberships
    """
    members_to_delete_body = {"members":[{"member_id":"140943737684417","business_role":"BIZ_ADMIN"},{"member_id":"140943737684417","business_role":"BIZ_ADMIN"},{"member_id":"140943737684417","business_role":"BIZ_ADMIN"},{"member_id":"140943737684417","business_role":"BIZ_ADMIN"},{"member_id":"140943737684417","business_role":"BIZ_ADMIN"}]}

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "DELETE",
    #    "/businesses/{business_id}/members".format(business_id='729090764583391194'),
    #    headers=headers,
    #    json=members_to_delete_body,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_update_business_memberships(client: TestClient):
    """Test case for update_business_memberships

    Update member's business role
    """
    update_member_business_role_body = [{"member_id":"140943737684417","business_role":"BIZ_ADMIN"}]

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "PATCH",
    #    "/businesses/{business_id}/members".format(business_id='729090764583391194'),
    #    headers=headers,
    #    json=update_member_business_role_body,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_business_partners(client: TestClient):
    """Test case for get_business_partners

    Get business partners
    """
    params = [("assets_summary", False),     ("partner_type", openapi_server.PartnerType()),     ("partner_ids", '00101010101,2222220101'),     ("start_index", 0),     ("page_size", 25),     ("bookmark", 'bookmark_example')]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/businesses/{business_id}/partners".format(business_id='729090764583391194'),
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_delete_business_partners(client: TestClient):
    """Test case for delete_business_partners

    Terminate business partnerships
    """
    delete_partners_request = {"partner_type":"partner_type","partner_ids":["1234567890123","1234567890123","1234567890123","1234567890123","1234567890123"]}

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "DELETE",
    #    "/businesses/{business_id}/partners".format(business_id='729090764583391194'),
    #    headers=headers,
    #    json=delete_partners_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_brand_accounts_create(client: TestClient):
    """Test case for brand_accounts_create

    Create a Brand Account
    """
    brand_accounts_create_request = openapi_server.BrandAccountsCreateRequest()

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/business_access/business_hierarchy/{business_hierarchy_id}/brand_accounts".format(business_hierarchy_id='7009386637860'),
    #    headers=headers,
    #    json=brand_accounts_create_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_brand_accounts_update(client: TestClient):
    """Test case for brand_accounts_update

    Update a Brand Account
    """
    brand_accounts_update_request = openapi_server.BrandAccountsUpdateRequest()

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "PATCH",
    #    "/business_access/business_hierarchy/{business_hierarchy_id}/brand_accounts/{brand_account_id}".format(business_hierarchy_id='7009386637860', brand_account_id='729090764583391194'),
    #    headers=headers,
    #    json=brand_accounts_update_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200

