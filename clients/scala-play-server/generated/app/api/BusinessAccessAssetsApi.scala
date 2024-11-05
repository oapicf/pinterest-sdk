package api

import play.api.libs.json._
import model.BusinessAssetMembersGet200Response
import model.BusinessAssetPartnersGet200Response
import model.BusinessAssetsGet200Response
import model.BusinessMemberAssetsGet200Response
import model.BusinessMembersAssetAccessDeleteRequest
import model.BusinessPartnerAssetAccessGet200Response
import model.CreateAssetGroupBody
import model.CreateAssetGroupResponse
import model.DeleteAssetGroupBody
import model.DeleteAssetGroupResponse
import model.DeleteMemberAccessResultsResponseArray
import model.DeletePartnerAssetAccessBody
import model.DeletePartnerAssetsResultsResponseArray
import model.Error
import model.PartnerType
import model.PermissionsWithOwner
import model.UpdateAssetGroupBody
import model.UpdateAssetGroupResponse
import model.UpdateMemberAssetAccessBody
import model.UpdateMemberAssetsResultsResponseArray
import model.UpdatePartnerAssetAccessBody
import model.UpdatePartnerAssetsResultsResponseArray

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
trait BusinessAccessAssetsApi {
  /**
    * Create a new asset group.
    * Create a new asset group with the specified parameters. - An &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/asset-groups\&quot;&gt;asset group&lt;/a&gt; is a custom group of assets based on how you’d like to manage your accounts.
    * @param businessId Unique identifier of the requesting business.
    */
  def assetGroupCreate(businessId: String, createAssetGroupBody: CreateAssetGroupBody): CreateAssetGroupResponse

  /**
    * Delete asset groups.
    * Delete a batch of asset groups.
    * @param businessId Unique identifier of the requesting business.
    */
  def assetGroupDelete(businessId: String, deleteAssetGroupBody: DeleteAssetGroupBody): DeleteAssetGroupResponse

  /**
    * Update asset groups.
    * Update a batch of asset groups with the specified parameters.
    * @param businessId Unique identifier of the requesting business.
    */
  def assetGroupUpdate(businessId: String, updateAssetGroupBody: UpdateAssetGroupBody): UpdateAssetGroupResponse

  /**
    * Get members with access to asset
    * Get all the members the requesting business has granted access to on the given asset.
    * @param businessId Unique identifier of the requesting business.
    * @param assetId Unique identifier of a business asset.
    * @param bookmark Cursor used to fetch the next page of items
    * @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.
    * @param startIndex An index to start fetching the results from. Only the results starting from this index will be returned.
    */
  def businessAssetMembersGet(businessId: String, assetId: String, bookmark: Option[String], pageSize: Option[Int], startIndex: Option[Int]): BusinessAssetMembersGet200Response

  /**
    * Get partners with access to asset
    * Get all the partners the requesting business has granted access to on the given asset. Note: If the asset has been shared with you, an empty array will be returned. This is because an asset shared with you cannot be shared with a different partner.
    * @param businessId Unique identifier of the requesting business.
    * @param assetId Unique identifier of a business asset.
    * @param startIndex An index to start fetching the results from. Only the results starting from this index will be returned.
    * @param bookmark Cursor used to fetch the next page of items
    * @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.
    */
  def businessAssetPartnersGet(businessId: String, assetId: String, startIndex: Option[Int], bookmark: Option[String], pageSize: Option[Int]): BusinessAssetPartnersGet200Response

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
    * @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.
    */
  def businessAssetsGet(businessId: String, permissions: Option[List[PermissionsWithOwner]], childAssetId: Option[String], assetGroupId: Option[String], assetType: Option[String], startIndex: Option[Int], bookmark: Option[String], pageSize: Option[Int]): BusinessAssetsGet200Response

  /**
    * Get assets assigned to a member
    * Get assets on which you assigned asset permissions to the given member. Can be used to: - get all assets, regardless of asset type or - get assets of one asset type by using the asset_type query. The return response will include the permissions the member has to that asset and the asset type.
    * @param businessId Unique identifier of the requesting business.
    * @param memberId The member id to fetch assets for.
    * @param assetType A resource type to filter the assets by. Only assets of the specified type will be returned.
    * @param startIndex An index to start fetching the results from. Only the results starting from this index will be returned.
    * @param bookmark Cursor used to fetch the next page of items
    * @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.
    */
  def businessMemberAssetsGet(businessId: String, memberId: String, assetType: Option[String], startIndex: Option[Int], bookmark: Option[String], pageSize: Option[Int]): BusinessMemberAssetsGet200Response

  /**
    * Delete member access to asset
    * Terminate multiple members&#39; access to an asset.
    * @param businessId Unique identifier of the requesting business.
    * @param businessMembersAssetAccessDeleteRequest List member assset permissions to delete.
    */
  def businessMembersAssetAccessDelete(businessId: String, businessMembersAssetAccessDeleteRequest: BusinessMembersAssetAccessDeleteRequest): DeleteMemberAccessResultsResponseArray

  /**
    * Assign/Update member asset permissions
    * Grant multiple members access to assets and/or update multiple member&#39;s exisiting permissions to an asset. Note: Not all listed permissions are applicable to each asset type. For example, PROFILE_PUBLISHER would not be applicable to an asset of type AD_ACCOUNT. The permission level PROFILE_PUBLISHER is only available to an asset of the type PROFILE. 
    * @param businessId Unique identifier of the requesting business.
    * @param updateMemberAssetAccessBody List of member asset permissions to create or update.
    */
  def businessMembersAssetAccessUpdate(businessId: String, updateMemberAssetAccessBody: UpdateMemberAssetAccessBody): UpdateMemberAssetsResultsResponseArray

  /**
    * Get assets assigned to a partner or assets assigned by a partner
    * Can be used to get the business assets your partner has granted you access to or the business assets you have granted your partner access to. If you specify: - partner_type&#x3D;INTERNAL, you will retrieve your business assets that the partner has access to. - partner_type&#x3D;EXTERNAL, you will retrieve the partner&#39;s business assets that the partner has granted you access to.
    * @param businessId Unique identifier of the requesting business.
    * @param partnerId The partner id to be bound to the Business
    * @param partnerType Specifies whether to fetch internal or external (shared) partners. If partner_type&#x3D;INTERNAL, the asset being queried is for accesses the partner has to your business assets.&lt;br&gt; If partner_type&#x3D;EXTERNAL, the asset being queried is for the accesses you have to the partner&#39;s business asset.
    * @param assetType A resource type to filter the assets by. Only assets of the specified type will be returned.
    * @param startIndex An index to start fetching the results from. Only the results starting from this index will be returned.
    * @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.
    * @param bookmark Cursor used to fetch the next page of items
    */
  def businessPartnerAssetAccessGet(businessId: String, partnerId: String, partnerType: Option[PartnerType], assetType: Option[String], startIndex: Option[Int], pageSize: Option[Int], bookmark: Option[String]): BusinessPartnerAssetAccessGet200Response

  /**
    * Delete partner access to asset
    * Terminate multiple partners&#39; access to an asset. If - partner_type&#x3D;INTERNAL: You will terminate a partner&#39;s asset access to your business assets. - partner_type&#x3D;EXTERNAL: You will terminate your own access to your partner&#39;s business assets.
    * @param businessId Unique identifier of the requesting business.
    */
  def deletePartnerAssetAccessHandlerImpl(businessId: String, deletePartnerAssetAccessBody: DeletePartnerAssetAccessBody): DeletePartnerAssetsResultsResponseArray

  /**
    * Assign/Update partner asset permissions
    * Grant multiple partners access to assets and/or update multiple partner&#39;s exisiting permissions to an asset. If your partner already had permissions on the asset, they will be overriden with the new permissions you assign to them. To learn more about permission levels, visit https://help.pinterest.com/en/business/article/business-manager-overview  Note: Not all listed permissions are applicable to each asset type. For example, PROFILE_PUBLISHER would not be applicable to an asset of type AD_ACCOUNT. The permission level PROFILE_PUBLISHER is only available to an asset of the type PROFILE.
    * @param businessId Unique identifier of the requesting business.
    * @param updatePartnerAssetAccessBody A list of assets and permissions to assign to your partners.
    */
  def updatePartnerAssetAccessHandlerImpl(businessId: String, updatePartnerAssetAccessBody: UpdatePartnerAssetAccessBody): UpdatePartnerAssetsResultsResponseArray
}
