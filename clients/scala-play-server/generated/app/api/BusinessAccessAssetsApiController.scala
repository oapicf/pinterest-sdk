package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
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
@Singleton
class BusinessAccessAssetsApiController @Inject()(cc: ControllerComponents, api: BusinessAccessAssetsApi) extends AbstractController(cc) {
  /**
    * POST /v5/businesses/:businessId/asset_groups
    * @param businessId Unique identifier of the requesting business.
    */
  def assetGroupCreate(businessId: String): Action[AnyContent] = Action { request =>
    def executeApi(): CreateAssetGroupResponse = {
      val createAssetGroupBody = request.body.asJson.map(_.as[CreateAssetGroupBody]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "createAssetGroupBody")
      }
      api.assetGroupCreate(businessId, createAssetGroupBody)
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
    def executeApi(): DeleteAssetGroupResponse = {
      val deleteAssetGroupBody = request.body.asJson.map(_.as[DeleteAssetGroupBody]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "deleteAssetGroupBody")
      }
      api.assetGroupDelete(businessId, deleteAssetGroupBody)
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
    def executeApi(): UpdateAssetGroupResponse = {
      val updateAssetGroupBody = request.body.asJson.map(_.as[UpdateAssetGroupBody]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "updateAssetGroupBody")
      }
      api.assetGroupUpdate(businessId, updateAssetGroupBody)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v5/businesses/:businessId/assets/:assetId/members?bookmark=[value]&pageSize=[value]&startIndex=[value]
    * @param businessId Unique identifier of the requesting business.
    * @param assetId Unique identifier of a business asset.
    */
  def businessAssetMembersGet(businessId: String, assetId: String): Action[AnyContent] = Action { request =>
    def executeApi(): BusinessAssetMembersGet200Response = {
      val bookmark = request.getQueryString("bookmark")
        
      val pageSize = request.getQueryString("page_size")
        .map(value => value.toInt)
        
      val startIndex = request.getQueryString("start_index")
        .map(value => value.toInt)
        
      api.businessAssetMembersGet(businessId, assetId, bookmark, pageSize, startIndex)
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
    def executeApi(): BusinessAssetPartnersGet200Response = {
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
    * GET /v5/businesses/:businessId/members/:memberId/assets?assetType=[value]&startIndex=[value]&bookmark=[value]&pageSize=[value]
    * @param businessId Unique identifier of the requesting business.
    * @param memberId The member id to fetch assets for.
    */
  def businessMemberAssetsGet(businessId: String, memberId: String): Action[AnyContent] = Action { request =>
    def executeApi(): BusinessMemberAssetsGet200Response = {
      val assetType = request.getQueryString("asset_type")
        
      val startIndex = request.getQueryString("start_index")
        .map(value => value.toInt)
        
      val bookmark = request.getQueryString("bookmark")
        
      val pageSize = request.getQueryString("page_size")
        .map(value => value.toInt)
        
      api.businessMemberAssetsGet(businessId, memberId, assetType, startIndex, bookmark, pageSize)
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
      val businessMembersAssetAccessDeleteRequest = request.body.asJson.map(_.as[BusinessMembersAssetAccessDeleteRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "businessMembersAssetAccessDeleteRequest")
      }
      api.businessMembersAssetAccessDelete(businessId, businessMembersAssetAccessDeleteRequest)
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
    * GET /v5/businesses/:businessId/partners/:partnerId/assets?partnerType=[value]&assetType=[value]&startIndex=[value]&pageSize=[value]&bookmark=[value]
    * @param businessId Unique identifier of the requesting business.
    * @param partnerId The partner id to be bound to the Business
    */
  def businessPartnerAssetAccessGet(businessId: String, partnerId: String): Action[AnyContent] = Action { request =>
    def executeApi(): BusinessPartnerAssetAccessGet200Response = {
      val partnerType = request.getQueryString("partner_type")
        .map(value => )
        
      val assetType = request.getQueryString("asset_type")
        
      val startIndex = request.getQueryString("start_index")
        .map(value => value.toInt)
        
      val pageSize = request.getQueryString("page_size")
        .map(value => value.toInt)
        
      val bookmark = request.getQueryString("bookmark")
        
      api.businessPartnerAssetAccessGet(businessId, partnerId, partnerType, assetType, startIndex, pageSize, bookmark)
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
    def executeApi(): DeletePartnerAssetsResultsResponseArray = {
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
