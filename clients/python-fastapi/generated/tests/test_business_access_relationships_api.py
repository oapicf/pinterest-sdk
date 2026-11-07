# coding: utf-8

from fastapi.testclient import TestClient


from pydantic import Field, field_validator  # noqa: F401
from typing import Any, List, Optional  # noqa: F401
from typing_extensions import Annotated  # noqa: F401
from openapi_server.models.brand_account import BrandAccount  # noqa: F401
from openapi_server.models.brand_account_create import BrandAccountCreate  # noqa: F401
from openapi_server.models.brand_account_update import BrandAccountUpdate  # noqa: F401
from openapi_server.models.business_membership_member import BusinessMembershipMember  # noqa: F401
from openapi_server.models.delete_business_membership200_response import DeleteBusinessMembership200Response  # noqa: F401
from openapi_server.models.delete_business_membership_body import DeleteBusinessMembershipBody  # noqa: F401
from openapi_server.models.delete_business_partners import DeleteBusinessPartners  # noqa: F401
from openapi_server.models.delete_business_partners_delete import DeleteBusinessPartnersDelete  # noqa: F401
from openapi_server.models.get_business_employers200_response import GetBusinessEmployers200Response  # noqa: F401
from openapi_server.models.member_business_role import MemberBusinessRole  # noqa: F401
from openapi_server.models.partner_type import PartnerType  # noqa: F401
from openapi_server.models.pinterest_lib_error import PinterestLibError  # noqa: F401
from openapi_server.models.system_user_update_with_required_body import SystemUserUpdateWithRequiredBody  # noqa: F401
from openapi_server.models.update_business_memberships_response import UpdateBusinessMembershipsResponse  # noqa: F401


def test_brand_accounts_create(client: TestClient):
    """Test case for brand_accounts_create

    Create a Brand Account
    """
    brand_account_create = openapi_server.BrandAccountCreate()

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/business_access/business_hierarchy/{business_hierarchy_id}/brand_accounts".format(business_hierarchy_id='business_hierarchy_id_example'),
    #    headers=headers,
    #    json=brand_account_create,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_brand_accounts_update(client: TestClient):
    """Test case for brand_accounts_update

    Update a Brand Account
    """
    brand_account_update = openapi_server.BrandAccountUpdate()

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "PATCH",
    #    "/business_access/business_hierarchy/{business_hierarchy_id}/brand_accounts/{brand_account_id}".format(brand_account_id='brand_account_id_example', business_hierarchy_id='business_hierarchy_id_example'),
    #    headers=headers,
    #    json=brand_account_update,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_business_employers(client: TestClient):
    """Test case for get_business_employers

    List business employers for user
    """
    params = [("assets_summary", True),     ("bookmark", 'bookmark_example'),     ("page_size", 25)]
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


def test_get_business_members(client: TestClient):
    """Test case for get_business_members

    Get business members
    """
    params = [("fetch_system_users", False),     ("assets_summary", False),     ("business_roles", [openapi_server.MemberBusinessRole()]),     ("member_ids", 'member_ids_example'),     ("start_index", 0),     ("bookmark", 'bookmark_example'),     ("page_size", 25)]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/businesses/{business_id}/members".format(business_id='business_id_example'),
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_delete_business_membership(client: TestClient):
    """Test case for delete_business_membership

    Terminate business memberships
    """
    delete_business_membership_body = openapi_server.DeleteBusinessMembershipBody()

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "DELETE",
    #    "/businesses/{business_id}/members".format(business_id='business_id_example'),
    #    headers=headers,
    #    json=delete_business_membership_body,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_update_business_memberships(client: TestClient):
    """Test case for update_business_memberships

    Update member's business role
    """
    business_membership_member = [[openapi_server.BusinessMembershipMember()]]

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "PATCH",
    #    "/businesses/{business_id}/members".format(business_id='business_id_example'),
    #    headers=headers,
    #    json=business_membership_member,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_business_partners(client: TestClient):
    """Test case for get_business_partners

    Get business partners
    """
    params = [("assets_summary", False),     ("partner_type", openapi_server.PartnerType()),     ("partner_ids", 'partner_ids_example'),     ("start_index", 0),     ("sort_ascending", True),     ("bookmark", 'bookmark_example'),     ("page_size", 25)]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/businesses/{business_id}/partners".format(business_id='business_id_example'),
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_delete_business_partners(client: TestClient):
    """Test case for delete_business_partners

    Terminate business partnerships
    """
    delete_business_partners_delete = openapi_server.DeleteBusinessPartnersDelete()

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "DELETE",
    #    "/businesses/{business_id}/partners".format(business_id='business_id_example'),
    #    headers=headers,
    #    json=delete_business_partners_delete,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_system_user_update(client: TestClient):
    """Test case for system_user_update

    Update a system user information.
    """
    system_user_update_with_required_body = openapi_server.SystemUserUpdateWithRequiredBody()

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "PATCH",
    #    "/businesses/{business_id}/system_users/{system_user_id}".format(business_id='business_id_example', system_user_id='system_user_id_example'),
    #    headers=headers,
    #    json=system_user_update_with_required_body,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200

