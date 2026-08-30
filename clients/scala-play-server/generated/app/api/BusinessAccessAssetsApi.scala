package api

import play.api.libs.json._
import model.AssetGroupDeletion
import model.AssetGroupDeletionDelete
import model.AssetGroupInput
import model.AssetGroupInputCreate
import model.AssetGroupModification
import model.AssetGroupModificationReadOrUpdate
import model.AssetPermissionType
import model.AssetSearchBy
import model.AssetSortBy
import model.BusinessAssetMembersGet200Response
import model.BusinessAssetsGet200Response
import model.BusinessMemberAssetsGetResponse
import model.BusinessMembersAssetAccessDeleteBody
import model.BusinessPartnerAssetAccessGet200Response
import model.DeleteMemberAccessResultsResponseArray
import model.DeletePartnerAssetAccessBody
import model.DeletePartnerAssetAccessResultsResponseArray
import model.Error
import model.NonDraftEntityStatus
import model.PermissionsWithOwner
import model.UpdateMemberAssetAccessBody
import model.UpdateMemberAssetsResultsResponseArray
import model.UpdatePartnerAssetAccessBody
import model.UpdatePartnerAssetsResultsResponseArray

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
trait BusinessAccessAssetsApi {
  /**
    * Create a new asset group.
    * Create a new asset group with the specified parameters. - An [asset group](https://help.pinterest.com/en/business/article/asset-groups) is a custom group of assets based on how you would like to manage your accounts.
    * @param businessId Unique identifier of the requesting business.
    */
  def assetGroupCreate(businessId: String, assetGroupInputCreate: AssetGroupInputCreate): AssetGroupInput

  /**
    * Delete asset groups.
    * Delete a batch of asset groups.
    * @param businessId Unique identifier of the requesting business.
    */
  def assetGroupDelete(businessId: String, assetGroupDeletionDelete: AssetGroupDeletionDelete): AssetGroupDeletion

  /**
    * Update asset groups.
    * Update a batch of asset groups with the specified parameters.
    * @param businessId Unique identifier of the requesting business.
    */
  def assetGroupUpdate(businessId: String, assetGroupModificationReadOrUpdate: AssetGroupModificationReadOrUpdate): AssetGroupModification

  /**
    * Get members with access to asset
    * Get all the members the requesting business has granted access to on the given asset.
    * @param businessId Unique identifier of the requesting business.
    * @param assetId Unique identifier of a business asset.
    * @param startIndex An index to start fetching the results from. Only the results starting from this index will be returned.
    * @param fetchSystemUsers Fetches system users if True. Fetches regular user employees if False.
    * @param bookmark Cursor used to fetch the next page of items
    * @param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
    */
  def businessAssetMembersGet(businessId: String, assetId: String, startIndex: Option[Int], fetchSystemUsers: Option[Boolean], bookmark: Option[String], pageSize: Option[Int]): BusinessAssetMembersGet200Response

  /**
    * Get partners with access to asset
    * Get all the partners the requesting business has granted access to on the given asset. Note: If the asset has been shared with you, an empty array will be returned. This is because an asset shared with you cannot be shared with a different partner.
    * @param businessId Unique identifier of the requesting business.
    * @param assetId Unique identifier of a business asset.
    * @param startIndex An index to start fetching the results from. Only the results starting from this index will be returned.
    * @param bookmark Cursor used to fetch the next page of items
    * @param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
    */
  def businessAssetPartnersGet(businessId: String, assetId: String, startIndex: Option[Int], bookmark: Option[String], pageSize: Option[Int]): BusinessAssetMembersGet200Response

  /**
    * List business assets
    * Get all the assets the requesting business has access to. This includes assets the business owns and assets the business has access to through partnerships.
    * @param businessId Unique identifier of the requesting business.
    * @param permissions A list of asset permissions used to filter the assets. Only assets where the requesting business has at least one of the specified permissions will be returned.
    * @param childAssetId A child asset unique identifier. Used to fetch asset groups that contain the asset id as a child.
    * @param assetGroupId An asset group unique identifier. Used to fetch assets contained within the specified asset group.
    * @param assetType A resource type to filter the assets by. Only assets of the specified type will be returned.
    * @param startIndex An index to start fetching the results from. Only the results starting from this index will be returned.
    * @param bookmark Cursor used to fetch the next page of items
    * @param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
    */
  def businessAssetsGet(businessId: String, permissions: Option[List[PermissionsWithOwner]], childAssetId: Option[String], assetGroupId: Option[String], assetType: Option[String], startIndex: Option[Int], bookmark: Option[String], pageSize: Option[Int]): BusinessAssetsGet200Response

  /**
    * Get assets assigned to a member
    * Get assets on which you assigned asset permissions to the given member. Can be used to: - get all assets, regardless of asset type or - get assets of one asset type by using the asset_type query. The return response will include the permissions the member has to that asset and the asset type.
    * @param businessId Unique identifier of the requesting business.
    * @param memberId The member id to fetch assets for.
    * @param assetType A resource type to filter the assets by. Only assets of the specified type will be returned.
    * @param startIndex An index to start fetching the results from. Only the results starting from this index will be returned.
    * @param sortBy The field to sort member assets by
    * @param sortAscending Sort assets in ascending order
    * @param searchBy The field to search member assets by
    * @param searchValue The value to search for
    * @param assetPermissionType The type of asset permission to filter by
    * @param adAccountStatuses A list of ad account statuses to filter the assets by. Only used when asset_type is AD_ACCOUNT.
    * @param bookmark Cursor used to fetch the next page of items
    * @param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
    */
  def businessMemberAssetsGet(businessId: String, memberId: String, assetType: Option[String], startIndex: Option[Int], sortBy: Option[AssetSortBy], sortAscending: Option[Boolean], searchBy: Option[AssetSearchBy], searchValue: Option[String], assetPermissionType: Option[AssetPermissionType], adAccountStatuses: Option[List[NonDraftEntityStatus]], bookmark: Option[String], pageSize: Option[Int]): BusinessMemberAssetsGetResponse

  /**
    * Delete member access to asset
    * Terminate multiple members&#39; access to an asset.
    * @param businessId Unique identifier of the requesting business.
    */
  def businessMembersAssetAccessDelete(businessId: String, businessMembersAssetAccessDeleteBody: BusinessMembersAssetAccessDeleteBody): DeleteMemberAccessResultsResponseArray

  /**
    * Assign/Update member asset permissions
    * Grant multiple members access to assets and/or update multiple member&#39;s exisiting permissions to an asset. Note: Not all listed permissions are applicable to each asset type. For example, PROFILE_PUBLISHER would not be applicable to an asset of type AD_ACCOUNT. The permission level PROFILE_PUBLISHER is only available to an asset of the type PROFILE.
    * @param businessId Unique identifier of the requesting business.
    */
  def businessMembersAssetAccessUpdate(businessId: String, updateMemberAssetAccessBody: UpdateMemberAssetAccessBody): UpdateMemberAssetsResultsResponseArray

  /**
    * Get assets assigned to a partner or assets assigned by a partner
    * Can be used to get the business assets your partner has granted you access to or the business assets you have granted your partner access to. If you specify: - partner_type&#x3D;INTERNAL, you will retrieve your business assets that the partner has access to. - partner_type&#x3D;EXTERNAL, you will retrieve the partner&#39;s business assets that the partner has granted you access to.
    * @param businessId Unique identifier of the requesting business.
    * @param partnerId The partner id to be bound to the Business
    * @param partnerType Specifies whether to fetch internal or external (shared) partners.  If partner_type&#x3D;INTERNAL, the asset being queried is for accesses the partner has to your business assets.  If partner_type&#x3D;EXTERNAL, the asset being queried is for the accesses you have to the partner&#39;s business asset.
    * @param assetType A resource type to filter the assets by. Only assets of the specified type will be returned.
    * @param startIndex An index to start fetching the results from. Only the results starting from this index will be returned.
    * @param sortBy The field to sort member assets by
    * @param sortAscending Sort assets in ascending order
    * @param searchBy The field to search member assets by
    * @param searchValue The value to search for
    * @param bookmark Cursor used to fetch the next page of items
    * @param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
    */
  def businessPartnerAssetAccessGet(businessId: String, partnerId: String, partnerType: Option[String], assetType: Option[String], startIndex: Option[Int], sortBy: Option[AssetSortBy], sortAscending: Option[Boolean], searchBy: Option[AssetSearchBy], searchValue: Option[String], bookmark: Option[String], pageSize: Option[Int]): BusinessPartnerAssetAccessGet200Response

  /**
    * Delete partner access to asset
    * Terminate multiple partners&#39; access to an asset. If - partner_type&#x3D;INTERNAL: You will terminate a partner&#39;s asset access to your business assets. - partner_type&#x3D;EXTERNAL: You will terminate your own access to your partner&#39;s business assets.
    * @param businessId Unique identifier of the requesting business.
    */
  def deletePartnerAssetAccessHandlerImpl(businessId: String, deletePartnerAssetAccessBody: DeletePartnerAssetAccessBody): DeletePartnerAssetAccessResultsResponseArray

  /**
    * Assign/Update partner asset permissions
    * Grant multiple partners access to assets and/or update multiple partner&#39;s exisiting permissions to an asset. If your partner already had permissions on the asset, they will be overriden with the new permissions you assign to them. To learn more about permission levels, visit https://help.pinterest.com/en/business/article/business-manager-overview  Note: Not all listed permissions are applicable to each asset type. For example, PROFILE_PUBLISHER would not be applicable to an asset of type AD_ACCOUNT. The permission level PROFILE_PUBLISHER is only available to an asset of the type PROFILE.
    * @param businessId Unique identifier of the requesting business.
    */
  def updatePartnerAssetAccessHandlerImpl(businessId: String, updatePartnerAssetAccessBody: UpdatePartnerAssetAccessBody): UpdatePartnerAssetsResultsResponseArray
}
