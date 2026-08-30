import connexion

from app.openapi_server.models.asset_group_deletion import AssetGroupDeletion  # noqa: E501
from app.openapi_server.models.asset_group_deletion_delete import AssetGroupDeletionDelete  # noqa: E501
from app.openapi_server.models.asset_group_input import AssetGroupInput  # noqa: E501
from app.openapi_server.models.asset_group_input_create import AssetGroupInputCreate  # noqa: E501
from app.openapi_server.models.asset_group_modification import AssetGroupModification  # noqa: E501
from app.openapi_server.models.asset_group_modification_read_or_update import AssetGroupModificationReadOrUpdate  # noqa: E501
from app.openapi_server.models.asset_permission_type import AssetPermissionType  # noqa: E501
from app.openapi_server.models.asset_search_by import AssetSearchBy  # noqa: E501
from app.openapi_server.models.asset_sort_by import AssetSortBy  # noqa: E501
from app.openapi_server.models.business_asset_members_get200_response import BusinessAssetMembersGet200Response  # noqa: E501
from app.openapi_server.models.business_assets_get200_response import BusinessAssetsGet200Response  # noqa: E501
from app.openapi_server.models.business_member_assets_get_response import BusinessMemberAssetsGetResponse  # noqa: E501
from app.openapi_server.models.business_members_asset_access_delete_body import BusinessMembersAssetAccessDeleteBody  # noqa: E501
from app.openapi_server.models.business_partner_asset_access_get200_response import BusinessPartnerAssetAccessGet200Response  # noqa: E501
from app.openapi_server.models.delete_member_access_results_response_array import DeleteMemberAccessResultsResponseArray  # noqa: E501
from app.openapi_server.models.delete_partner_asset_access_body import DeletePartnerAssetAccessBody  # noqa: E501
from app.openapi_server.models.delete_partner_asset_access_results_response_array import DeletePartnerAssetAccessResultsResponseArray  # noqa: E501
from app.openapi_server.models.non_draft_entity_status import NonDraftEntityStatus  # noqa: E501
from app.openapi_server.models.permissions_with_owner import PermissionsWithOwner  # noqa: E501
from app.openapi_server.models.pinterest_lib_error import PinterestLibError  # noqa: E501
from app.openapi_server.models.update_member_asset_access_body import UpdateMemberAssetAccessBody  # noqa: E501
from app.openapi_server.models.update_member_assets_results_response_array import UpdateMemberAssetsResultsResponseArray  # noqa: E501
from app.openapi_server.models.update_partner_asset_access_body import UpdatePartnerAssetAccessBody  # noqa: E501
from app.openapi_server.models.update_partner_assets_results_response_array import UpdatePartnerAssetsResultsResponseArray  # noqa: E501
from openapi_server import util


def asset_group_create(business_id, body):  # noqa: E501
    """Create a new asset group.

    Create a new asset group with the specified parameters. - An [asset group](https://help.pinterest.com/en/business/article/asset-groups) is a custom group of assets based on how you would like to manage your accounts. # noqa: E501

    :param business_id: Unique identifier of the requesting business.
    :type business_id: str
    :param body: 
    :type body: dict | bytes

    :rtype: AssetGroupInput
    """
    if connexion.request.is_json:
        body = AssetGroupInputCreate.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def asset_group_delete(business_id, body):  # noqa: E501
    """Delete asset groups.

    Delete a batch of asset groups. # noqa: E501

    :param business_id: Unique identifier of the requesting business.
    :type business_id: str
    :param body: 
    :type body: dict | bytes

    :rtype: AssetGroupDeletion
    """
    if connexion.request.is_json:
        body = AssetGroupDeletionDelete.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def asset_group_update(business_id, body):  # noqa: E501
    """Update asset groups.

    Update a batch of asset groups with the specified parameters. # noqa: E501

    :param business_id: Unique identifier of the requesting business.
    :type business_id: str
    :param body: 
    :type body: dict | bytes

    :rtype: AssetGroupModification
    """
    if connexion.request.is_json:
        body = AssetGroupModificationReadOrUpdate.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def business_asset_members_get(business_id, asset_id, start_index=None, fetch_system_users=None, bookmark=None, page_size=None):  # noqa: E501
    """Get members with access to asset

    Get all the members the requesting business has granted access to on the given asset. # noqa: E501

    :param business_id: Unique identifier of the requesting business.
    :type business_id: str
    :param asset_id: Unique identifier of a business asset.
    :type asset_id: str
    :param start_index: An index to start fetching the results from. Only the results starting from this index will be returned.
    :type start_index: int
    :param fetch_system_users: Fetches system users if True. Fetches regular user employees if False.
    :type fetch_system_users: bool
    :param bookmark: Cursor used to fetch the next page of items
    :type bookmark: str
    :param page_size: Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
    :type page_size: int

    :rtype: BusinessAssetMembersGet200Response
    """
    return 'do some magic!'


def business_asset_partners_get(business_id, asset_id, start_index=None, bookmark=None, page_size=None):  # noqa: E501
    """Get partners with access to asset

    Get all the partners the requesting business has granted access to on the given asset. Note: If the asset has been shared with you, an empty array will be returned. This is because an asset shared with you cannot be shared with a different partner. # noqa: E501

    :param business_id: Unique identifier of the requesting business.
    :type business_id: str
    :param asset_id: Unique identifier of a business asset.
    :type asset_id: str
    :param start_index: An index to start fetching the results from. Only the results starting from this index will be returned.
    :type start_index: int
    :param bookmark: Cursor used to fetch the next page of items
    :type bookmark: str
    :param page_size: Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
    :type page_size: int

    :rtype: BusinessAssetMembersGet200Response
    """
    return 'do some magic!'


def business_assets_get(business_id, permissions=None, child_asset_id=None, asset_group_id=None, asset_type=None, start_index=None, bookmark=None, page_size=None):  # noqa: E501
    """List business assets

    Get all the assets the requesting business has access to. This includes assets the business owns and assets the business has access to through partnerships. # noqa: E501

    :param business_id: Unique identifier of the requesting business.
    :type business_id: str
    :param permissions: A list of asset permissions used to filter the assets. Only assets where the requesting business has at least one of the specified permissions will be returned.
    :type permissions: list | bytes
    :param child_asset_id: A child asset unique identifier. Used to fetch asset groups that contain the asset id as a child.
    :type child_asset_id: str
    :param asset_group_id: An asset group unique identifier. Used to fetch assets contained within the specified asset group.
    :type asset_group_id: str
    :param asset_type: A resource type to filter the assets by. Only assets of the specified type will be returned.
    :type asset_type: str
    :param start_index: An index to start fetching the results from. Only the results starting from this index will be returned.
    :type start_index: int
    :param bookmark: Cursor used to fetch the next page of items
    :type bookmark: str
    :param page_size: Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
    :type page_size: int

    :rtype: BusinessAssetsGet200Response
    """
    if connexion.request.is_json:
        permissions = [PermissionsWithOwner.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    return 'do some magic!'


def business_member_assets_get(business_id, member_id, asset_type=None, start_index=None, sort_by=None, sort_ascending=None, search_by=None, search_value=None, asset_permission_type=None, ad_account_statuses=None, bookmark=None, page_size=None):  # noqa: E501
    """Get assets assigned to a member

    Get assets on which you assigned asset permissions to the given member. Can be used to: - get all assets, regardless of asset type or - get assets of one asset type by using the asset_type query. The return response will include the permissions the member has to that asset and the asset type. # noqa: E501

    :param business_id: Unique identifier of the requesting business.
    :type business_id: str
    :param member_id: The member id to fetch assets for.
    :type member_id: str
    :param asset_type: A resource type to filter the assets by. Only assets of the specified type will be returned.
    :type asset_type: str
    :param start_index: An index to start fetching the results from. Only the results starting from this index will be returned.
    :type start_index: int
    :param sort_by: The field to sort member assets by
    :type sort_by: dict | bytes
    :param sort_ascending: Sort assets in ascending order
    :type sort_ascending: bool
    :param search_by: The field to search member assets by
    :type search_by: dict | bytes
    :param search_value: The value to search for
    :type search_value: str
    :param asset_permission_type: The type of asset permission to filter by
    :type asset_permission_type: dict | bytes
    :param ad_account_statuses: A list of ad account statuses to filter the assets by. Only used when asset_type is AD_ACCOUNT.
    :type ad_account_statuses: list | bytes
    :param bookmark: Cursor used to fetch the next page of items
    :type bookmark: str
    :param page_size: Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
    :type page_size: int

    :rtype: BusinessMemberAssetsGetResponse
    """
    if connexion.request.is_json:
        sort_by = .from_dict(connexion.request.get_json())  # noqa: E501
    if connexion.request.is_json:
        search_by = .from_dict(connexion.request.get_json())  # noqa: E501
    if connexion.request.is_json:
        asset_permission_type = .from_dict(connexion.request.get_json())  # noqa: E501
    if connexion.request.is_json:
        ad_account_statuses = [NonDraftEntityStatus.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    return 'do some magic!'


def business_members_asset_access_delete(business_id, body):  # noqa: E501
    """Delete member access to asset

    Terminate multiple members&#39; access to an asset. # noqa: E501

    :param business_id: Unique identifier of the requesting business.
    :type business_id: str
    :param body: 
    :type body: dict | bytes

    :rtype: DeleteMemberAccessResultsResponseArray
    """
    if connexion.request.is_json:
        body = BusinessMembersAssetAccessDeleteBody.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def business_members_asset_access_update(business_id, body):  # noqa: E501
    """Assign/Update member asset permissions

    Grant multiple members access to assets and/or update multiple member&#39;s exisiting permissions to an asset. Note: Not all listed permissions are applicable to each asset type. For example, PROFILE_PUBLISHER would not be applicable to an asset of type AD_ACCOUNT. The permission level PROFILE_PUBLISHER is only available to an asset of the type PROFILE. # noqa: E501

    :param business_id: Unique identifier of the requesting business.
    :type business_id: str
    :param body: 
    :type body: dict | bytes

    :rtype: UpdateMemberAssetsResultsResponseArray
    """
    if connexion.request.is_json:
        body = UpdateMemberAssetAccessBody.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def business_partner_asset_access_get(business_id, partner_id, partner_type=None, asset_type=None, start_index=None, sort_by=None, sort_ascending=None, search_by=None, search_value=None, bookmark=None, page_size=None):  # noqa: E501
    """Get assets assigned to a partner or assets assigned by a partner

    Can be used to get the business assets your partner has granted you access to or the business assets you have granted your partner access to. If you specify: - partner_type&#x3D;INTERNAL, you will retrieve your business assets that the partner has access to. - partner_type&#x3D;EXTERNAL, you will retrieve the partner&#39;s business assets that the partner has granted you access to. # noqa: E501

    :param business_id: Unique identifier of the requesting business.
    :type business_id: str
    :param partner_id: The partner id to be bound to the Business
    :type partner_id: str
    :param partner_type: Specifies whether to fetch internal or external (shared) partners.  If partner_type&#x3D;INTERNAL, the asset being queried is for accesses the partner has to your business assets.  If partner_type&#x3D;EXTERNAL, the asset being queried is for the accesses you have to the partner&#39;s business asset.
    :type partner_type: str
    :param asset_type: A resource type to filter the assets by. Only assets of the specified type will be returned.
    :type asset_type: str
    :param start_index: An index to start fetching the results from. Only the results starting from this index will be returned.
    :type start_index: int
    :param sort_by: The field to sort member assets by
    :type sort_by: dict | bytes
    :param sort_ascending: Sort assets in ascending order
    :type sort_ascending: bool
    :param search_by: The field to search member assets by
    :type search_by: dict | bytes
    :param search_value: The value to search for
    :type search_value: str
    :param bookmark: Cursor used to fetch the next page of items
    :type bookmark: str
    :param page_size: Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
    :type page_size: int

    :rtype: BusinessPartnerAssetAccessGet200Response
    """
    if connexion.request.is_json:
        sort_by = .from_dict(connexion.request.get_json())  # noqa: E501
    if connexion.request.is_json:
        search_by = .from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def delete_partner_asset_access_handler_impl(business_id, body):  # noqa: E501
    """Delete partner access to asset

    Terminate multiple partners&#39; access to an asset. If - partner_type&#x3D;INTERNAL: You will terminate a partner&#39;s asset access to your business assets. - partner_type&#x3D;EXTERNAL: You will terminate your own access to your partner&#39;s business assets. # noqa: E501

    :param business_id: Unique identifier of the requesting business.
    :type business_id: str
    :param body: 
    :type body: dict | bytes

    :rtype: DeletePartnerAssetAccessResultsResponseArray
    """
    if connexion.request.is_json:
        body = DeletePartnerAssetAccessBody.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def update_partner_asset_access_handler_impl(business_id, body):  # noqa: E501
    """Assign/Update partner asset permissions

    Grant multiple partners access to assets and/or update multiple partner&#39;s exisiting permissions to an asset. If your partner already had permissions on the asset, they will be overriden with the new permissions you assign to them. To learn more about permission levels, visit https://help.pinterest.com/en/business/article/business-manager-overview  Note: Not all listed permissions are applicable to each asset type. For example, PROFILE_PUBLISHER would not be applicable to an asset of type AD_ACCOUNT. The permission level PROFILE_PUBLISHER is only available to an asset of the type PROFILE. # noqa: E501

    :param business_id: Unique identifier of the requesting business.
    :type business_id: str
    :param body: 
    :type body: dict | bytes

    :rtype: UpdatePartnerAssetsResultsResponseArray
    """
    if connexion.request.is_json:
        body = UpdatePartnerAssetAccessBody.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
