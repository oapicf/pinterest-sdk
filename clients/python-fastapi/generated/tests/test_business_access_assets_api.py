# coding: utf-8

from fastapi.testclient import TestClient


from pydantic import Field, StrictBool, StrictStr, field_validator  # noqa: F401
from typing import Any, List, Optional  # noqa: F401
from typing_extensions import Annotated  # noqa: F401
from openapi_server.models.business_asset_members_get200_response import BusinessAssetMembersGet200Response  # noqa: F401
from openapi_server.models.business_asset_partners_get200_response import BusinessAssetPartnersGet200Response  # noqa: F401
from openapi_server.models.business_assets_get200_response import BusinessAssetsGet200Response  # noqa: F401
from openapi_server.models.business_member_assets_get200_response import BusinessMemberAssetsGet200Response  # noqa: F401
from openapi_server.models.business_members_asset_access_delete_request import BusinessMembersAssetAccessDeleteRequest  # noqa: F401
from openapi_server.models.business_partner_asset_access_get200_response import BusinessPartnerAssetAccessGet200Response  # noqa: F401
from openapi_server.models.create_asset_group_body import CreateAssetGroupBody  # noqa: F401
from openapi_server.models.create_asset_group_response import CreateAssetGroupResponse  # noqa: F401
from openapi_server.models.delete_asset_group_body import DeleteAssetGroupBody  # noqa: F401
from openapi_server.models.delete_asset_group_response import DeleteAssetGroupResponse  # noqa: F401
from openapi_server.models.delete_member_access_results_response_array import DeleteMemberAccessResultsResponseArray  # noqa: F401
from openapi_server.models.delete_partner_asset_access_body import DeletePartnerAssetAccessBody  # noqa: F401
from openapi_server.models.delete_partner_assets_results_response_array import DeletePartnerAssetsResultsResponseArray  # noqa: F401
from openapi_server.models.error import Error  # noqa: F401
from openapi_server.models.permissions_with_owner import PermissionsWithOwner  # noqa: F401
from openapi_server.models.update_asset_group_body import UpdateAssetGroupBody  # noqa: F401
from openapi_server.models.update_asset_group_response import UpdateAssetGroupResponse  # noqa: F401
from openapi_server.models.update_member_asset_access_body import UpdateMemberAssetAccessBody  # noqa: F401
from openapi_server.models.update_member_assets_results_response_array import UpdateMemberAssetsResultsResponseArray  # noqa: F401
from openapi_server.models.update_partner_asset_access_body import UpdatePartnerAssetAccessBody  # noqa: F401
from openapi_server.models.update_partner_assets_results_response_array import UpdatePartnerAssetsResultsResponseArray  # noqa: F401


def test_business_asset_members_get(client: TestClient):
    """Test case for business_asset_members_get

    Get members with access to asset
    """
    params = [("fetch_system_users", False),     ("bookmark", 'bookmark_example'),     ("page_size", 25),     ("start_index", 0)]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/businesses/{business_id}/assets/{asset_id}/members".format(business_id='729090764583391194', asset_id='729090764583391194'),
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_business_asset_partners_get(client: TestClient):
    """Test case for business_asset_partners_get

    Get partners with access to asset
    """
    params = [("start_index", 0),     ("bookmark", 'bookmark_example'),     ("page_size", 25)]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/businesses/{business_id}/assets/{asset_id}/partners".format(business_id='729090764583391194', asset_id='729090764583391194'),
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_business_assets_get(client: TestClient):
    """Test case for business_assets_get

    List business assets
    """
    params = [("permissions", [openapi_server.PermissionsWithOwner()]),     ("child_asset_id", '549764894835'),     ("asset_group_id", '7078106104032'),     ("asset_type", AD_ACCOUNT),     ("start_index", 0),     ("bookmark", 'bookmark_example'),     ("page_size", 25)]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/businesses/{business_id}/assets".format(business_id='729090764583391194'),
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_business_member_assets_get(client: TestClient):
    """Test case for business_member_assets_get

    Get assets assigned to a member
    """
    params = [("asset_type", AD_ACCOUNT),     ("start_index", 0),     ("bookmark", 'bookmark_example'),     ("page_size", 25)]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/businesses/{business_id}/members/{member_id}/assets".format(business_id='729090764583391194', member_id='729090764583391194'),
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_business_members_asset_access_delete(client: TestClient):
    """Test case for business_members_asset_access_delete

    Delete member access to asset
    """
    business_members_asset_access_delete_request = openapi_server.BusinessMembersAssetAccessDeleteRequest()

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "DELETE",
    #    "/businesses/{business_id}/members/assets/access".format(business_id='729090764583391194'),
    #    headers=headers,
    #    json=business_members_asset_access_delete_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_business_members_asset_access_update(client: TestClient):
    """Test case for business_members_asset_access_update

    Assign/Update member asset permissions
    """
    update_member_asset_access_body = {"accesses":[{"member_id":"140943737684417","permissions":["ANALYST","ADMIN"],"asset_id":"549755885175"},{"member_id":"140943737684417","permissions":["ANALYST","ADMIN"],"asset_id":"549755885175"},{"member_id":"140943737684417","permissions":["ANALYST","ADMIN"],"asset_id":"549755885175"},{"member_id":"140943737684417","permissions":["ANALYST","ADMIN"],"asset_id":"549755885175"},{"member_id":"140943737684417","permissions":["ANALYST","ADMIN"],"asset_id":"549755885175"}]}

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "PATCH",
    #    "/businesses/{business_id}/members/assets/access".format(business_id='729090764583391194'),
    #    headers=headers,
    #    json=update_member_asset_access_body,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_delete_partner_asset_access_handler_impl(client: TestClient):
    """Test case for delete_partner_asset_access_handler_impl

    Delete partner access to asset
    """
    delete_partner_asset_access_body = {"accesses":[{"partner_id":"1234567890123","partner_type":"INTERNAL","asset_id":"549755885175"},{"partner_id":"1234567890123","partner_type":"INTERNAL","asset_id":"549755885175"},{"partner_id":"1234567890123","partner_type":"INTERNAL","asset_id":"549755885175"},{"partner_id":"1234567890123","partner_type":"INTERNAL","asset_id":"549755885175"},{"partner_id":"1234567890123","partner_type":"INTERNAL","asset_id":"549755885175"}]}

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "DELETE",
    #    "/businesses/{business_id}/partners/assets".format(business_id='729090764583391194'),
    #    headers=headers,
    #    json=delete_partner_asset_access_body,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_update_partner_asset_access_handler_impl(client: TestClient):
    """Test case for update_partner_asset_access_handler_impl

    Assign/Update partner asset permissions
    """
    update_partner_asset_access_body = {"accesses":[{"partner_id":"1234567890123","permissions":["ANALYST","ADMIN"],"asset_id":"549755885175"},{"partner_id":"1234567890123","permissions":["ANALYST","ADMIN"],"asset_id":"549755885175"},{"partner_id":"1234567890123","permissions":["ANALYST","ADMIN"],"asset_id":"549755885175"},{"partner_id":"1234567890123","permissions":["ANALYST","ADMIN"],"asset_id":"549755885175"},{"partner_id":"1234567890123","permissions":["ANALYST","ADMIN"],"asset_id":"549755885175"}]}

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "PATCH",
    #    "/businesses/{business_id}/partners/assets".format(business_id='729090764583391194'),
    #    headers=headers,
    #    json=update_partner_asset_access_body,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_business_partner_asset_access_get(client: TestClient):
    """Test case for business_partner_asset_access_get

    Get assets assigned to a partner or assets assigned by a partner
    """
    params = [("partner_type", openapi_server.PartnerType()),     ("asset_type", AD_ACCOUNT),     ("start_index", 0),     ("page_size", 25),     ("bookmark", 'bookmark_example')]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/businesses/{business_id}/partners/{partner_id}/assets".format(business_id='729090764583391194', partner_id='729090764583391194'),
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_asset_group_create(client: TestClient):
    """Test case for asset_group_create

    Create a new asset group.
    """
    create_asset_group_body = {"asset_group_types":["BRAND","LOCATION_OR_LANGUAGE","PRODUCT_LINE","OTHER"],"asset_group_description":"Asset groups that has ad accounts shared in Canada","asset_group_name":"Canada Ad Accounts"}

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/businesses/{business_id}/asset_groups".format(business_id='729090764583391194'),
    #    headers=headers,
    #    json=create_asset_group_body,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_asset_group_delete(client: TestClient):
    """Test case for asset_group_delete

    Delete asset groups.
    """
    delete_asset_group_body = {"asset_groups_to_delete":["666791336903426391","666791336903426392"]}

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "DELETE",
    #    "/businesses/{business_id}/asset_groups".format(business_id='729090764583391194'),
    #    headers=headers,
    #    json=delete_asset_group_body,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_asset_group_update(client: TestClient):
    """Test case for asset_group_update

    Update asset groups.
    """
    update_asset_group_body = {"asset_groups_to_update":[{"asset_group_id":"666791336903426391","assets_to_add":["549755885175","549755885175"],"asset_group_types":["BRAND","LOCATION_OR_LANGUAGE","PRODUCT_LINE","OTHER"],"assets_to_remove":["549755885175","549755885175"],"name":"Canada Ad Accounts","description":"Asset groups that has ad accounts shared in Canada"},{"asset_group_id":"666791336903426391","assets_to_add":["549755885175","549755885175"],"asset_group_types":["BRAND","LOCATION_OR_LANGUAGE","PRODUCT_LINE","OTHER"],"assets_to_remove":["549755885175","549755885175"],"name":"Canada Ad Accounts","description":"Asset groups that has ad accounts shared in Canada"}]}

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "PATCH",
    #    "/businesses/{business_id}/asset_groups".format(business_id='729090764583391194'),
    #    headers=headers,
    #    json=update_asset_group_body,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200

