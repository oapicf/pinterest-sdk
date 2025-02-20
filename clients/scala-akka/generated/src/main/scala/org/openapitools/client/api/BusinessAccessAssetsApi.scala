/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.client.api

import org.openapitools.client.model.BusinessAssetMembersGet200Response
import org.openapitools.client.model.BusinessAssetPartnersGet200Response
import org.openapitools.client.model.BusinessAssetsGet200Response
import org.openapitools.client.model.BusinessMemberAssetsGet200Response
import org.openapitools.client.model.BusinessMembersAssetAccessDeleteRequest
import org.openapitools.client.model.BusinessPartnerAssetAccessGet200Response
import org.openapitools.client.model.CreateAssetGroupBody
import org.openapitools.client.model.CreateAssetGroupResponse
import org.openapitools.client.model.DeleteAssetGroupBody
import org.openapitools.client.model.DeleteAssetGroupResponse
import org.openapitools.client.model.DeleteMemberAccessResultsResponseArray
import org.openapitools.client.model.DeletePartnerAssetAccessBody
import org.openapitools.client.model.DeletePartnerAssetsResultsResponseArray
import org.openapitools.client.model.Error
import org.openapitools.client.model.PartnerType
import org.openapitools.client.model.PermissionsWithOwner
import org.openapitools.client.model.UpdateAssetGroupBody
import org.openapitools.client.model.UpdateAssetGroupResponse
import org.openapitools.client.model.UpdateMemberAssetAccessBody
import org.openapitools.client.model.UpdateMemberAssetsResultsResponseArray
import org.openapitools.client.model.UpdatePartnerAssetAccessBody
import org.openapitools.client.model.UpdatePartnerAssetsResultsResponseArray
import org.openapitools.client.core._
import org.openapitools.client.core.CollectionFormats._
import org.openapitools.client.core.ApiKeyLocations._

object BusinessAccessAssetsApi {

  def apply(baseUrl: String = "https://api.pinterest.com/v5") = new BusinessAccessAssetsApi(baseUrl)
}

class BusinessAccessAssetsApi(baseUrl: String) {

  /**
   * Create a new asset group with the specified parameters. - An <a href=\"https://help.pinterest.com/en/business/article/asset-groups\">asset group</a> is a custom group of assets based on how you’d like to manage your accounts.
   * 
   * Expected answers:
   *   code 200 : CreateAssetGroupResponse (Success)
   *   code 400 : Error (Invalid parameters.)
   *   code 0 : Error (Unexpected error)
   * 
   * @param businessId Unique identifier of the requesting business.
   * @param createAssetGroupBody 
   */
  def assetGroupCreate(businessId: String, createAssetGroupBody: CreateAssetGroupBody): ApiRequest[CreateAssetGroupResponse] =
    ApiRequest[CreateAssetGroupResponse](ApiMethods.POST, baseUrl, "/businesses/{business_id}/asset_groups", "application/json")
      .withBody(createAssetGroupBody)
      .withPathParam("business_id", businessId)
      .withSuccessResponse[CreateAssetGroupResponse](200)
      .withErrorResponse[Error](400)
      .withDefaultErrorResponse[Error]
      

  /**
   * Delete a batch of asset groups.
   * 
   * Expected answers:
   *   code 200 : DeleteAssetGroupResponse (Success)
   *   code 400 : Error (Invalid parameters.)
   *   code 0 : Error (Unexpected error)
   * 
   * @param businessId Unique identifier of the requesting business.
   * @param deleteAssetGroupBody 
   */
  def assetGroupDelete(businessId: String, deleteAssetGroupBody: DeleteAssetGroupBody): ApiRequest[DeleteAssetGroupResponse] =
    ApiRequest[DeleteAssetGroupResponse](ApiMethods.DELETE, baseUrl, "/businesses/{business_id}/asset_groups", "application/json")
      .withBody(deleteAssetGroupBody)
      .withPathParam("business_id", businessId)
      .withSuccessResponse[DeleteAssetGroupResponse](200)
      .withErrorResponse[Error](400)
      .withDefaultErrorResponse[Error]
      

  /**
   * Update a batch of asset groups with the specified parameters.
   * 
   * Expected answers:
   *   code 200 : UpdateAssetGroupResponse (Success)
   *   code 400 : Error (Invalid parameters.)
   *   code 0 : Error (Unexpected error)
   * 
   * @param businessId Unique identifier of the requesting business.
   * @param updateAssetGroupBody 
   */
  def assetGroupUpdate(businessId: String, updateAssetGroupBody: UpdateAssetGroupBody): ApiRequest[UpdateAssetGroupResponse] =
    ApiRequest[UpdateAssetGroupResponse](ApiMethods.PATCH, baseUrl, "/businesses/{business_id}/asset_groups", "application/json")
      .withBody(updateAssetGroupBody)
      .withPathParam("business_id", businessId)
      .withSuccessResponse[UpdateAssetGroupResponse](200)
      .withErrorResponse[Error](400)
      .withDefaultErrorResponse[Error]
      

  /**
   * Get all the members the requesting business has granted access to on the given asset.
   * 
   * Expected answers:
   *   code 200 : BusinessAssetMembersGet200Response (Sucess)
   *   code 0 : Error (Unexpected error)
   * 
   * @param businessId Unique identifier of the requesting business.
   * @param assetId Unique identifier of a business asset.
   * @param bookmark Cursor used to fetch the next page of items
   * @param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
   * @param startIndex An index to start fetching the results from. Only the results starting from this index will be returned.
   */
  def businessAssetMembersGet(businessId: String, assetId: String, bookmark: Option[String] = None, pageSize: Option[Int] = None, startIndex: Option[Int] = None): ApiRequest[BusinessAssetMembersGet200Response] =
    ApiRequest[BusinessAssetMembersGet200Response](ApiMethods.GET, baseUrl, "/businesses/{business_id}/assets/{asset_id}/members", "application/json")
      .withQueryParam("bookmark", bookmark)
      .withQueryParam("page_size", pageSize)
      .withQueryParam("start_index", startIndex)
      .withPathParam("business_id", businessId)
      .withPathParam("asset_id", assetId)
      .withSuccessResponse[BusinessAssetMembersGet200Response](200)
      .withDefaultErrorResponse[Error]
      

  /**
   * Get all the partners the requesting business has granted access to on the given asset. Note: If the asset has been shared with you, an empty array will be returned. This is because an asset shared with you cannot be shared with a different partner.
   * 
   * Expected answers:
   *   code 200 : BusinessAssetPartnersGet200Response (Sucess)
   *   code 0 : Error (Unexpected error)
   * 
   * @param businessId Unique identifier of the requesting business.
   * @param assetId Unique identifier of a business asset.
   * @param startIndex An index to start fetching the results from. Only the results starting from this index will be returned.
   * @param bookmark Cursor used to fetch the next page of items
   * @param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
   */
  def businessAssetPartnersGet(businessId: String, assetId: String, startIndex: Option[Int] = None, bookmark: Option[String] = None, pageSize: Option[Int] = None): ApiRequest[BusinessAssetPartnersGet200Response] =
    ApiRequest[BusinessAssetPartnersGet200Response](ApiMethods.GET, baseUrl, "/businesses/{business_id}/assets/{asset_id}/partners", "application/json")
      .withQueryParam("start_index", startIndex)
      .withQueryParam("bookmark", bookmark)
      .withQueryParam("page_size", pageSize)
      .withPathParam("business_id", businessId)
      .withPathParam("asset_id", assetId)
      .withSuccessResponse[BusinessAssetPartnersGet200Response](200)
      .withDefaultErrorResponse[Error]
      

  /**
   * Get all the assets the requesting business has access to. This includes assets the business owns and assets the business has access to through partnerships.
   * 
   * Expected answers:
   *   code 200 : BusinessAssetsGet200Response (Success)
   *   code 0 : Error (Unexpected error)
   * 
   * @param businessId Unique identifier of the requesting business.
   * @param permissions A list of asset permissions used to filter the assets. Only assets where the requesting business has at least one of the specified permissions will be returned.
   * @param childAssetId A child asset unique identifier. Used to fetch asset groups that contain the asset id as a child.
   * @param assetGroupId An asset group unique identifier. Used to fetch assets contained within the specified asset group.
   * @param assetType A resource type to filter the assets by. Only assets of the specified type will be returned.
   * @param startIndex An index to start fetching the results from. Only the results starting from this index will be returned.
   * @param bookmark Cursor used to fetch the next page of items
   * @param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
   */
  def businessAssetsGet(businessId: String, permissions: Seq[PermissionsWithOwner], childAssetId: Option[String] = None, assetGroupId: Option[String] = None, assetType: Option[String] = None, startIndex: Option[Int] = None, bookmark: Option[String] = None, pageSize: Option[Int] = None): ApiRequest[BusinessAssetsGet200Response] =
    ApiRequest[BusinessAssetsGet200Response](ApiMethods.GET, baseUrl, "/businesses/{business_id}/assets", "application/json")
      .withQueryParam("permissions", ArrayValues(permissions, MULTI))
      .withQueryParam("child_asset_id", childAssetId)
      .withQueryParam("asset_group_id", assetGroupId)
      .withQueryParam("asset_type", assetType)
      .withQueryParam("start_index", startIndex)
      .withQueryParam("bookmark", bookmark)
      .withQueryParam("page_size", pageSize)
      .withPathParam("business_id", businessId)
      .withSuccessResponse[BusinessAssetsGet200Response](200)
      .withDefaultErrorResponse[Error]
      

  /**
   * Get assets on which you assigned asset permissions to the given member. Can be used to: - get all assets, regardless of asset type or - get assets of one asset type by using the asset_type query. The return response will include the permissions the member has to that asset and the asset type.
   * 
   * Expected answers:
   *   code 200 : BusinessMemberAssetsGet200Response (Success)
   *   code 0 : Error (Unexpected error)
   * 
   * @param businessId Unique identifier of the requesting business.
   * @param memberId The member id to fetch assets for.
   * @param assetType A resource type to filter the assets by. Only assets of the specified type will be returned.
   * @param startIndex An index to start fetching the results from. Only the results starting from this index will be returned.
   * @param bookmark Cursor used to fetch the next page of items
   * @param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
   */
  def businessMemberAssetsGet(businessId: String, memberId: String, assetType: Option[String] = None, startIndex: Option[Int] = None, bookmark: Option[String] = None, pageSize: Option[Int] = None): ApiRequest[BusinessMemberAssetsGet200Response] =
    ApiRequest[BusinessMemberAssetsGet200Response](ApiMethods.GET, baseUrl, "/businesses/{business_id}/members/{member_id}/assets", "application/json")
      .withQueryParam("asset_type", assetType)
      .withQueryParam("start_index", startIndex)
      .withQueryParam("bookmark", bookmark)
      .withQueryParam("page_size", pageSize)
      .withPathParam("business_id", businessId)
      .withPathParam("member_id", memberId)
      .withSuccessResponse[BusinessMemberAssetsGet200Response](200)
      .withDefaultErrorResponse[Error]
      

  /**
   * Terminate multiple members' access to an asset.
   * 
   * Expected answers:
   *   code 200 : DeleteMemberAccessResultsResponseArray (response)
   *   code 0 : Error (Unexpected error)
   * 
   * @param businessId Unique identifier of the requesting business.
   * @param businessMembersAssetAccessDeleteRequest List member assset permissions to delete.
   */
  def businessMembersAssetAccessDelete(businessId: String, businessMembersAssetAccessDeleteRequest: BusinessMembersAssetAccessDeleteRequest): ApiRequest[DeleteMemberAccessResultsResponseArray] =
    ApiRequest[DeleteMemberAccessResultsResponseArray](ApiMethods.DELETE, baseUrl, "/businesses/{business_id}/members/assets/access", "application/json")
      .withBody(businessMembersAssetAccessDeleteRequest)
      .withPathParam("business_id", businessId)
      .withSuccessResponse[DeleteMemberAccessResultsResponseArray](200)
      .withDefaultErrorResponse[Error]
      

  /**
   * Grant multiple members access to assets and/or update multiple member's exisiting permissions to an asset. Note: Not all listed permissions are applicable to each asset type. For example, PROFILE_PUBLISHER would not be applicable to an asset of type AD_ACCOUNT. The permission level PROFILE_PUBLISHER is only available to an asset of the type PROFILE. 
   * 
   * Expected answers:
   *   code 200 : UpdateMemberAssetsResultsResponseArray (response)
   *   code 0 : Error (Unexpected error)
   * 
   * @param businessId Unique identifier of the requesting business.
   * @param updateMemberAssetAccessBody List of member asset permissions to create or update.
   */
  def businessMembersAssetAccessUpdate(businessId: String, updateMemberAssetAccessBody: UpdateMemberAssetAccessBody): ApiRequest[UpdateMemberAssetsResultsResponseArray] =
    ApiRequest[UpdateMemberAssetsResultsResponseArray](ApiMethods.PATCH, baseUrl, "/businesses/{business_id}/members/assets/access", "application/json")
      .withBody(updateMemberAssetAccessBody)
      .withPathParam("business_id", businessId)
      .withSuccessResponse[UpdateMemberAssetsResultsResponseArray](200)
      .withDefaultErrorResponse[Error]
      

  /**
   * Can be used to get the business assets your partner has granted you access to or the business assets you have granted your partner access to. If you specify: - partner_type=INTERNAL, you will retrieve your business assets that the partner has access to. - partner_type=EXTERNAL, you will retrieve the partner's business assets that the partner has granted you access to.
   * 
   * Expected answers:
   *   code 200 : BusinessPartnerAssetAccessGet200Response (Success)
   *   code 0 : Error (Unexpected error)
   * 
   * @param businessId Unique identifier of the requesting business.
   * @param partnerId The partner id to be bound to the Business
   * @param partnerType Specifies whether to fetch internal or external (shared) partners. If partner_type=INTERNAL, the asset being queried is for accesses the partner has to your business assets.<br> If partner_type=EXTERNAL, the asset being queried is for the accesses you have to the partner's business asset.
   * @param assetType A resource type to filter the assets by. Only assets of the specified type will be returned.
   * @param startIndex An index to start fetching the results from. Only the results starting from this index will be returned.
   * @param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
   * @param bookmark Cursor used to fetch the next page of items
   */
  def businessPartnerAssetAccessGet(businessId: String, partnerId: String, partnerType: Option[PartnerType] = None, assetType: Option[String] = None, startIndex: Option[Int] = None, pageSize: Option[Int] = None, bookmark: Option[String] = None): ApiRequest[BusinessPartnerAssetAccessGet200Response] =
    ApiRequest[BusinessPartnerAssetAccessGet200Response](ApiMethods.GET, baseUrl, "/businesses/{business_id}/partners/{partner_id}/assets", "application/json")
      .withQueryParam("partner_type", partnerType)
      .withQueryParam("asset_type", assetType)
      .withQueryParam("start_index", startIndex)
      .withQueryParam("page_size", pageSize)
      .withQueryParam("bookmark", bookmark)
      .withPathParam("business_id", businessId)
      .withPathParam("partner_id", partnerId)
      .withSuccessResponse[BusinessPartnerAssetAccessGet200Response](200)
      .withDefaultErrorResponse[Error]
      

  /**
   * Terminate multiple partners' access to an asset. If - partner_type=INTERNAL: You will terminate a partner's asset access to your business assets. - partner_type=EXTERNAL: You will terminate your own access to your partner's business assets.
   * 
   * Expected answers:
   *   code 200 : DeletePartnerAssetsResultsResponseArray (Success)
   *   code 0 : Error (Unexpected error)
   * 
   * @param businessId Unique identifier of the requesting business.
   * @param deletePartnerAssetAccessBody 
   */
  def deletePartnerAssetAccessHandlerImpl(businessId: String, deletePartnerAssetAccessBody: DeletePartnerAssetAccessBody): ApiRequest[DeletePartnerAssetsResultsResponseArray] =
    ApiRequest[DeletePartnerAssetsResultsResponseArray](ApiMethods.DELETE, baseUrl, "/businesses/{business_id}/partners/assets", "application/json")
      .withBody(deletePartnerAssetAccessBody)
      .withPathParam("business_id", businessId)
      .withSuccessResponse[DeletePartnerAssetsResultsResponseArray](200)
      .withDefaultErrorResponse[Error]
      

  /**
   * Grant multiple partners access to assets and/or update multiple partner's exisiting permissions to an asset. If your partner already had permissions on the asset, they will be overriden with the new permissions you assign to them. To learn more about permission levels, visit https://help.pinterest.com/en/business/article/business-manager-overview  Note: Not all listed permissions are applicable to each asset type. For example, PROFILE_PUBLISHER would not be applicable to an asset of type AD_ACCOUNT. The permission level PROFILE_PUBLISHER is only available to an asset of the type PROFILE.
   * 
   * Expected answers:
   *   code 200 : UpdatePartnerAssetsResultsResponseArray (Success)
   *   code 0 : Error (Unexpected error)
   * 
   * @param businessId Unique identifier of the requesting business.
   * @param updatePartnerAssetAccessBody A list of assets and permissions to assign to your partners.
   */
  def updatePartnerAssetAccessHandlerImpl(businessId: String, updatePartnerAssetAccessBody: UpdatePartnerAssetAccessBody): ApiRequest[UpdatePartnerAssetsResultsResponseArray] =
    ApiRequest[UpdatePartnerAssetsResultsResponseArray](ApiMethods.PATCH, baseUrl, "/businesses/{business_id}/partners/assets", "application/json")
      .withBody(updatePartnerAssetAccessBody)
      .withPathParam("business_id", businessId)
      .withSuccessResponse[UpdatePartnerAssetsResultsResponseArray](200)
      .withDefaultErrorResponse[Error]
      



}

