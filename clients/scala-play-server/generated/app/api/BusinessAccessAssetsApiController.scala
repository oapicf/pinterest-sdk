package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
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
@Singleton
class BusinessAccessAssetsApiController @Inject()(cc: ControllerComponents, api: BusinessAccessAssetsApi) extends AbstractController(cc) {
  /**
    * POST /v5/businesses/:businessId/asset_groups
    * @param businessId Unique identifier of the requesting business.
    */
  def assetGroupCreate(businessId: String): Action[AnyContent] = Action { request =>
    def executeApi(): AssetGroupInput = {
      val assetGroupInputCreate = request.body.asJson.map(_.as[AssetGroupInputCreate]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "assetGroupInputCreate")
      }
      api.assetGroupCreate(businessId, assetGroupInputCreate)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * DELETE /v5/businesses/:businessId/asset_groups
    * @param businessId Unique identifier of the requesting business.
    */
  def assetGroupDelete(businessId: String): Action[AnyContent] = Action { request =>
    def executeApi(): AssetGroupDeletion = {
      val assetGroupDeletionDelete = request.body.asJson.map(_.as[AssetGroupDeletionDelete]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "assetGroupDeletionDelete")
      }
      api.assetGroupDelete(businessId, assetGroupDeletionDelete)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * PATCH /v5/businesses/:businessId/asset_groups
    * @param businessId Unique identifier of the requesting business.
    */
  def assetGroupUpdate(businessId: String): Action[AnyContent] = Action { request =>
    def executeApi(): AssetGroupModification = {
      val assetGroupModificationReadOrUpdate = request.body.asJson.map(_.as[AssetGroupModificationReadOrUpdate]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "assetGroupModificationReadOrUpdate")
      }
      api.assetGroupUpdate(businessId, assetGroupModificationReadOrUpdate)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v5/businesses/:businessId/assets/:assetId/members?startIndex=[value]&fetchSystemUsers=[value]&bookmark=[value]&pageSize=[value]
    * @param businessId Unique identifier of the requesting business.
    * @param assetId Unique identifier of a business asset.
    */
  def businessAssetMembersGet(businessId: String, assetId: String): Action[AnyContent] = Action { request =>
    def executeApi(): BusinessAssetMembersGet200Response = {
      val startIndex = request.getQueryString("start_index")
        .map(value => value.toInt)
        
      val fetchSystemUsers = request.getQueryString("fetch_system_users")
        .map(value => value.toBoolean)
        
      val bookmark = request.getQueryString("bookmark")
        
      val pageSize = request.getQueryString("page_size")
        .map(value => value.toInt)
        
      api.businessAssetMembersGet(businessId, assetId, startIndex, fetchSystemUsers, bookmark, pageSize)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v5/businesses/:businessId/assets/:assetId/partners?startIndex=[value]&bookmark=[value]&pageSize=[value]
    * @param businessId Unique identifier of the requesting business.
    * @param assetId Unique identifier of a business asset.
    */
  def businessAssetPartnersGet(businessId: String, assetId: String): Action[AnyContent] = Action { request =>
    def executeApi(): BusinessAssetMembersGet200Response = {
      val startIndex = request.getQueryString("start_index")
        .map(value => value.toInt)
        
      val bookmark = request.getQueryString("bookmark")
        
      val pageSize = request.getQueryString("page_size")
        .map(value => value.toInt)
        
      api.businessAssetPartnersGet(businessId, assetId, startIndex, bookmark, pageSize)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v5/businesses/:businessId/assets?permissions=[value]&childAssetId=[value]&assetGroupId=[value]&assetType=[value]&startIndex=[value]&bookmark=[value]&pageSize=[value]
    * @param businessId Unique identifier of the requesting business.
    */
  def businessAssetsGet(businessId: String): Action[AnyContent] = Action { request =>
    def executeApi(): BusinessAssetsGet200Response = {
      val permissions = request.queryString.get("permissions")
        .map(_.toList)
        .map(_.map(value => )
        
      val childAssetId = request.getQueryString("child_asset_id")
        
      val assetGroupId = request.getQueryString("asset_group_id")
        
      val assetType = request.getQueryString("asset_type")
        
      val startIndex = request.getQueryString("start_index")
        .map(value => value.toInt)
        
      val bookmark = request.getQueryString("bookmark")
        
      val pageSize = request.getQueryString("page_size")
        .map(value => value.toInt)
        
      api.businessAssetsGet(businessId, permissions, childAssetId, assetGroupId, assetType, startIndex, bookmark, pageSize)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v5/businesses/:businessId/members/:memberId/assets?assetType=[value]&startIndex=[value]&sortBy=[value]&sortAscending=[value]&searchBy=[value]&searchValue=[value]&assetPermissionType=[value]&adAccountStatuses=[value]&bookmark=[value]&pageSize=[value]
    * @param businessId Unique identifier of the requesting business.
    * @param memberId The member id to fetch assets for.
    */
  def businessMemberAssetsGet(businessId: String, memberId: String): Action[AnyContent] = Action { request =>
    def executeApi(): BusinessMemberAssetsGetResponse = {
      val assetType = request.getQueryString("asset_type")
        
      val startIndex = request.getQueryString("start_index")
        .map(value => value.toInt)
        
      val sortBy = request.getQueryString("sort_by")
        .map(value => )
        
      val sortAscending = request.getQueryString("sort_ascending")
        .map(value => value.toBoolean)
        
      val searchBy = request.getQueryString("search_by")
        .map(value => )
        
      val searchValue = request.getQueryString("search_value")
        
      val assetPermissionType = request.getQueryString("asset_permission_type")
        .map(value => )
        
      val adAccountStatuses = request.queryString.get("ad_account_statuses")
        .map(_.toList)
        .map(_.map(value => )
        
      val bookmark = request.getQueryString("bookmark")
        
      val pageSize = request.getQueryString("page_size")
        .map(value => value.toInt)
        
      api.businessMemberAssetsGet(businessId, memberId, assetType, startIndex, sortBy, sortAscending, searchBy, searchValue, assetPermissionType, adAccountStatuses, bookmark, pageSize)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * DELETE /v5/businesses/:businessId/members/assets/access
    * @param businessId Unique identifier of the requesting business.
    */
  def businessMembersAssetAccessDelete(businessId: String): Action[AnyContent] = Action { request =>
    def executeApi(): DeleteMemberAccessResultsResponseArray = {
      val businessMembersAssetAccessDeleteBody = request.body.asJson.map(_.as[BusinessMembersAssetAccessDeleteBody]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "businessMembersAssetAccessDeleteBody")
      }
      api.businessMembersAssetAccessDelete(businessId, businessMembersAssetAccessDeleteBody)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * PATCH /v5/businesses/:businessId/members/assets/access
    * @param businessId Unique identifier of the requesting business.
    */
  def businessMembersAssetAccessUpdate(businessId: String): Action[AnyContent] = Action { request =>
    def executeApi(): UpdateMemberAssetsResultsResponseArray = {
      val updateMemberAssetAccessBody = request.body.asJson.map(_.as[UpdateMemberAssetAccessBody]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "updateMemberAssetAccessBody")
      }
      api.businessMembersAssetAccessUpdate(businessId, updateMemberAssetAccessBody)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v5/businesses/:businessId/partners/:partnerId/assets?partnerType=[value]&assetType=[value]&startIndex=[value]&sortBy=[value]&sortAscending=[value]&searchBy=[value]&searchValue=[value]&bookmark=[value]&pageSize=[value]
    * @param businessId Unique identifier of the requesting business.
    * @param partnerId The partner id to be bound to the Business
    */
  def businessPartnerAssetAccessGet(businessId: String, partnerId: String): Action[AnyContent] = Action { request =>
    def executeApi(): BusinessPartnerAssetAccessGet200Response = {
      val partnerType = request.getQueryString("partner_type")
        
      val assetType = request.getQueryString("asset_type")
        
      val startIndex = request.getQueryString("start_index")
        .map(value => value.toInt)
        
      val sortBy = request.getQueryString("sort_by")
        .map(value => )
        
      val sortAscending = request.getQueryString("sort_ascending")
        .map(value => value.toBoolean)
        
      val searchBy = request.getQueryString("search_by")
        .map(value => )
        
      val searchValue = request.getQueryString("search_value")
        
      val bookmark = request.getQueryString("bookmark")
        
      val pageSize = request.getQueryString("page_size")
        .map(value => value.toInt)
        
      api.businessPartnerAssetAccessGet(businessId, partnerId, partnerType, assetType, startIndex, sortBy, sortAscending, searchBy, searchValue, bookmark, pageSize)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * DELETE /v5/businesses/:businessId/partners/assets
    * @param businessId Unique identifier of the requesting business.
    */
  def deletePartnerAssetAccessHandlerImpl(businessId: String): Action[AnyContent] = Action { request =>
    def executeApi(): DeletePartnerAssetAccessResultsResponseArray = {
      val deletePartnerAssetAccessBody = request.body.asJson.map(_.as[DeletePartnerAssetAccessBody]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "deletePartnerAssetAccessBody")
      }
      api.deletePartnerAssetAccessHandlerImpl(businessId, deletePartnerAssetAccessBody)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * PATCH /v5/businesses/:businessId/partners/assets
    * @param businessId Unique identifier of the requesting business.
    */
  def updatePartnerAssetAccessHandlerImpl(businessId: String): Action[AnyContent] = Action { request =>
    def executeApi(): UpdatePartnerAssetsResultsResponseArray = {
      val updatePartnerAssetAccessBody = request.body.asJson.map(_.as[UpdatePartnerAssetAccessBody]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "updatePartnerAssetAccessBody")
      }
      api.updatePartnerAssetAccessHandlerImpl(businessId, updatePartnerAssetAccessBody)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  private def splitCollectionParam(paramValues: String, collectionFormat: String): List[String] = {
    val splitBy =
      collectionFormat match {
        case "csv" => ",+"
        case "tsv" => "\t+"
        case "ssv" => " +"
        case "pipes" => "|+"
      }

    paramValues.split(splitBy).toList
  }
}
