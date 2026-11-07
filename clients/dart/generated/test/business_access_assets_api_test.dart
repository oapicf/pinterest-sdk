//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

import 'package:openapi/api.dart';
import 'package:test/test.dart';


/// tests for BusinessAccessAssetsApi
void main() {
  // final instance = BusinessAccessAssetsApi();

  group('tests for BusinessAccessAssetsApi', () {
    // Create a new asset group.
    //
    // Create a new asset group with the specified parameters. - An [asset group](https://help.pinterest.com/en/business/article/asset-groups) is a custom group of assets based on how you would like to manage your accounts.
    //
    //Future<AssetGroupInput> assetGroupCreate(String businessId, AssetGroupInputCreate assetGroupInputCreate) async
    test('test assetGroupCreate', () async {
      // TODO
    });

    // Delete asset groups.
    //
    // Delete a batch of asset groups.
    //
    //Future<AssetGroupDeletion> assetGroupDelete(String businessId, AssetGroupDeletionDelete assetGroupDeletionDelete) async
    test('test assetGroupDelete', () async {
      // TODO
    });

    // Update asset groups.
    //
    // Update a batch of asset groups with the specified parameters.
    //
    //Future<AssetGroupModification> assetGroupUpdate(String businessId, AssetGroupModificationReadOrUpdate assetGroupModificationReadOrUpdate) async
    test('test assetGroupUpdate', () async {
      // TODO
    });

    // Get members with access to asset
    //
    // Get all the members the requesting business has granted access to on the given asset.
    //
    //Future<BusinessAssetMembersGet200Response> businessAssetMembersGet(String businessId, String assetId, { int startIndex, bool fetchSystemUsers, String bookmark, int pageSize }) async
    test('test businessAssetMembersGet', () async {
      // TODO
    });

    // Get partners with access to asset
    //
    // Get all the partners the requesting business has granted access to on the given asset. Note: If the asset has been shared with you, an empty array will be returned. This is because an asset shared with you cannot be shared with a different partner.
    //
    //Future<BusinessAssetMembersGet200Response> businessAssetPartnersGet(String businessId, String assetId, { int startIndex, String bookmark, int pageSize }) async
    test('test businessAssetPartnersGet', () async {
      // TODO
    });

    // List business assets
    //
    // Get all the assets the requesting business has access to. This includes assets the business owns and assets the business has access to through partnerships.
    //
    //Future<BusinessAssetsGet200Response> businessAssetsGet(String businessId, { List<PermissionsWithOwner> permissions, String childAssetId, String assetGroupId, String assetType, int startIndex, String bookmark, int pageSize }) async
    test('test businessAssetsGet', () async {
      // TODO
    });

    // Get assets assigned to a member
    //
    // Get assets on which you assigned asset permissions to the given member. Can be used to: - get all assets, regardless of asset type or - get assets of one asset type by using the asset_type query. The return response will include the permissions the member has to that asset and the asset type.
    //
    //Future<BusinessMemberAssetsGetResponse> businessMemberAssetsGet(String businessId, String memberId, { String assetType, int startIndex, AssetSortBy sortBy, bool sortAscending, AssetSearchBy searchBy, String searchValue, AssetPermissionType assetPermissionType, List<NonDraftEntityStatus> adAccountStatuses, String bookmark, int pageSize }) async
    test('test businessMemberAssetsGet', () async {
      // TODO
    });

    // Delete member access to asset
    //
    // Terminate multiple members' access to an asset.
    //
    //Future<DeleteMemberAccessResultsResponseArray> businessMembersAssetAccessDelete(String businessId, BusinessMembersAssetAccessDeleteBody businessMembersAssetAccessDeleteBody) async
    test('test businessMembersAssetAccessDelete', () async {
      // TODO
    });

    // Assign/Update member asset permissions
    //
    // Grant multiple members access to assets and/or update multiple member's exisiting permissions to an asset. Note: Not all listed permissions are applicable to each asset type. For example, PROFILE_PUBLISHER would not be applicable to an asset of type AD_ACCOUNT. The permission level PROFILE_PUBLISHER is only available to an asset of the type PROFILE.
    //
    //Future<UpdateMemberAssetsResultsResponseArray> businessMembersAssetAccessUpdate(String businessId, UpdateMemberAssetAccessBody updateMemberAssetAccessBody) async
    test('test businessMembersAssetAccessUpdate', () async {
      // TODO
    });

    // Get assets assigned to a partner or assets assigned by a partner
    //
    // Can be used to get the business assets your partner has granted you access to or the business assets you have granted your partner access to. If you specify: - partner_type=INTERNAL, you will retrieve your business assets that the partner has access to. - partner_type=EXTERNAL, you will retrieve the partner's business assets that the partner has granted you access to.
    //
    //Future<BusinessPartnerAssetAccessGet200Response> businessPartnerAssetAccessGet(String businessId, String partnerId, { String partnerType, String assetType, int startIndex, AssetSortBy sortBy, bool sortAscending, AssetSearchBy searchBy, String searchValue, String bookmark, int pageSize }) async
    test('test businessPartnerAssetAccessGet', () async {
      // TODO
    });

    // Delete partner access to asset
    //
    // Terminate multiple partners' access to an asset. If - partner_type=INTERNAL: You will terminate a partner's asset access to your business assets. - partner_type=EXTERNAL: You will terminate your own access to your partner's business assets.
    //
    //Future<DeletePartnerAssetAccessResultsResponseArray> deletePartnerAssetAccessHandlerImpl(String businessId, DeletePartnerAssetAccessBody deletePartnerAssetAccessBody) async
    test('test deletePartnerAssetAccessHandlerImpl', () async {
      // TODO
    });

    // Assign/Update partner asset permissions
    //
    // Grant multiple partners access to assets and/or update multiple partner's exisiting permissions to an asset. If your partner already had permissions on the asset, they will be overriden with the new permissions you assign to them. To learn more about permission levels, visit https://help.pinterest.com/en/business/article/business-manager-overview  Note: Not all listed permissions are applicable to each asset type. For example, PROFILE_PUBLISHER would not be applicable to an asset of type AD_ACCOUNT. The permission level PROFILE_PUBLISHER is only available to an asset of the type PROFILE.
    //
    //Future<UpdatePartnerAssetsResultsResponseArray> updatePartnerAssetAccessHandlerImpl(String businessId, UpdatePartnerAssetAccessBody updatePartnerAssetAccessBody) async
    test('test updatePartnerAssetAccessHandlerImpl', () async {
      // TODO
    });

  });
}
