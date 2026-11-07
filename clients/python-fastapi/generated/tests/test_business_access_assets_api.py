# coding: utf-8

from fastapi.testclient import TestClient


from pydantic import Field, field_validator  # noqa: F401
from typing import List, Optional  # noqa: F401
from typing_extensions import Annotated  # noqa: F401
from openapi_server.models.asset_group_deletion import AssetGroupDeletion  # noqa: F401
from openapi_server.models.asset_group_deletion_delete import AssetGroupDeletionDelete  # noqa: F401
from openapi_server.models.asset_group_input import AssetGroupInput  # noqa: F401
from openapi_server.models.asset_group_input_create import AssetGroupInputCreate  # noqa: F401
from openapi_server.models.asset_group_modification import AssetGroupModification  # noqa: F401
from openapi_server.models.asset_group_modification_read_or_update import AssetGroupModificationReadOrUpdate  # noqa: F401
from openapi_server.models.asset_permission_type import AssetPermissionType  # noqa: F401
from openapi_server.models.asset_search_by import AssetSearchBy  # noqa: F401
from openapi_server.models.asset_sort_by import AssetSortBy  # noqa: F401
from openapi_server.models.business_asset_members_get200_response import BusinessAssetMembersGet200Response  # noqa: F401
from openapi_server.models.business_assets_get200_response import BusinessAssetsGet200Response  # noqa: F401
from openapi_server.models.business_member_assets_get_response import BusinessMemberAssetsGetResponse  # noqa: F401
from openapi_server.models.business_members_asset_access_delete_body import BusinessMembersAssetAccessDeleteBody  # noqa: F401
from openapi_server.models.business_partner_asset_access_get200_response import BusinessPartnerAssetAccessGet200Response  # noqa: F401
from openapi_server.models.delete_member_access_results_response_array import DeleteMemberAccessResultsResponseArray  # noqa: F401
from openapi_server.models.delete_partner_asset_access_body import DeletePartnerAssetAccessBody  # noqa: F401
from openapi_server.models.delete_partner_asset_access_results_response_array import DeletePartnerAssetAccessResultsResponseArray  # noqa: F401
from openapi_server.models.non_draft_entity_status import NonDraftEntityStatus  # noqa: F401
from openapi_server.models.permissions_with_owner import PermissionsWithOwner  # noqa: F401
from openapi_server.models.pinterest_lib_error import PinterestLibError  # noqa: F401
from openapi_server.models.update_member_asset_access_body import UpdateMemberAssetAccessBody  # noqa: F401
from openapi_server.models.update_member_assets_results_response_array import UpdateMemberAssetsResultsResponseArray  # noqa: F401
from openapi_server.models.update_partner_asset_access_body import UpdatePartnerAssetAccessBody  # noqa: F401
from openapi_server.models.update_partner_assets_results_response_array import UpdatePartnerAssetsResultsResponseArray  # noqa: F401


def test_asset_group_create(client: TestClient):
    """Test case for asset_group_create

    Create a new asset group.
    """
    asset_group_input_create = openapi_server.AssetGroupInputCreate()

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/businesses/{business_id}/asset_groups".format(business_id='business_id_example'),
    #    headers=headers,
    #    json=asset_group_input_create,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_asset_group_delete(client: TestClient):
    """Test case for asset_group_delete

    Delete asset groups.
    """
    asset_group_deletion_delete = openapi_server.AssetGroupDeletionDelete()

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "DELETE",
    #    "/businesses/{business_id}/asset_groups".format(business_id='business_id_example'),
    #    headers=headers,
    #    json=asset_group_deletion_delete,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_asset_group_update(client: TestClient):
    """Test case for asset_group_update

    Update asset groups.
    """
    asset_group_modification_read_or_update = openapi_server.AssetGroupModificationReadOrUpdate()

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "PATCH",
    #    "/businesses/{business_id}/asset_groups".format(business_id='business_id_example'),
    #    headers=headers,
    #    json=asset_group_modification_read_or_update,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_business_assets_get(client: TestClient):
    """Test case for business_assets_get

    List business assets
    """
    params = [("permissions", [openapi_server.PermissionsWithOwner()]),     ("child_asset_id", 'child_asset_id_example'),     ("asset_group_id", 'asset_group_id_example'),     ("asset_type", 'AD_ACCOUNT'),     ("start_index", 0),     ("bookmark", 'bookmark_example'),     ("page_size", 25)]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/businesses/{business_id}/assets".format(business_id='business_id_example'),
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_business_asset_members_get(client: TestClient):
    """Test case for business_asset_members_get

    Get members with access to asset
    """
    params = [("start_index", 0),     ("fetch_system_users", False),     ("bookmark", 'bookmark_example'),     ("page_size", 25)]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/businesses/{business_id}/assets/{asset_id}/members".format(business_id='business_id_example', asset_id='asset_id_example'),
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
    #    "/businesses/{business_id}/assets/{asset_id}/partners".format(business_id='business_id_example', asset_id='asset_id_example'),
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_business_members_asset_access_delete(client: TestClient):
    """Test case for business_members_asset_access_delete

    Delete member access to asset
    """
    business_members_asset_access_delete_body = openapi_server.BusinessMembersAssetAccessDeleteBody()

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "DELETE",
    #    "/businesses/{business_id}/members/assets/access".format(business_id='business_id_example'),
    #    headers=headers,
    #    json=business_members_asset_access_delete_body,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_business_members_asset_access_update(client: TestClient):
    """Test case for business_members_asset_access_update

    Assign/Update member asset permissions
    """
    update_member_asset_access_body = openapi_server.UpdateMemberAssetAccessBody()

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "PATCH",
    #    "/businesses/{business_id}/members/assets/access".format(business_id='business_id_example'),
    #    headers=headers,
    #    json=update_member_asset_access_body,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_business_member_assets_get(client: TestClient):
    """Test case for business_member_assets_get

    Get assets assigned to a member
    """
    params = [("asset_type", 'AD_ACCOUNT'),     ("start_index", 0),     ("sort_by", openapi_server.AssetSortBy()),     ("sort_ascending", True),     ("search_by", openapi_server.AssetSearchBy()),     ("search_value", 'search_value_example'),     ("asset_permission_type", openapi_server.AssetPermissionType()),     ("ad_account_statuses", [openapi_server.NonDraftEntityStatus()]),     ("bookmark", 'bookmark_example'),     ("page_size", 25)]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/businesses/{business_id}/members/{member_id}/assets".format(business_id='business_id_example', member_id='member_id_example'),
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_delete_partner_asset_access_handler_impl(client: TestClient):
    """Test case for delete_partner_asset_access_handler_impl

    Delete partner access to asset
    """
    delete_partner_asset_access_body = openapi_server.DeletePartnerAssetAccessBody()

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "DELETE",
    #    "/businesses/{business_id}/partners/assets".format(business_id='business_id_example'),
    #    headers=headers,
    #    json=delete_partner_asset_access_body,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_update_partner_asset_access_handler_impl(client: TestClient):
    """Test case for update_partner_asset_access_handler_impl

    Assign/Update partner asset permissions
    """
    update_partner_asset_access_body = openapi_server.UpdatePartnerAssetAccessBody()

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "PATCH",
    #    "/businesses/{business_id}/partners/assets".format(business_id='business_id_example'),
    #    headers=headers,
    #    json=update_partner_asset_access_body,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_business_partner_asset_access_get(client: TestClient):
    """Test case for business_partner_asset_access_get

    Get assets assigned to a partner or assets assigned by a partner
    """
    params = [("partner_type", 'INTERNAL'),     ("asset_type", 'AD_ACCOUNT'),     ("start_index", 0),     ("sort_by", openapi_server.AssetSortBy()),     ("sort_ascending", True),     ("search_by", openapi_server.AssetSearchBy()),     ("search_value", 'search_value_example'),     ("bookmark", 'bookmark_example'),     ("page_size", 25)]
    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/businesses/{business_id}/partners/{partner_id}/assets".format(business_id='business_id_example', partner_id='partner_id_example'),
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200

