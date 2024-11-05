package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.DeletePartnersRequest
import model.DeletePartnersResponse
import model.DeletedMembersResponse
import model.Error
import model.GetBusinessEmployers200Response
import model.GetBusinessMembers200Response
import model.GetBusinessPartners200Response
import model.MemberBusinessRole
import model.MembersToDeleteBody
import model.PartnerType
import model.UpdateMemberBusinessRoleBody
import model.UpdateMemberResultsResponseArray

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@Singleton
class BusinessAccessRelationshipsApiController @Inject()(cc: ControllerComponents, api: BusinessAccessRelationshipsApi) extends AbstractController(cc) {
  /**
    * DELETE /v5/businesses/:businessId/members
    * @param businessId Business id
    */
  def deleteBusinessMembership(businessId: String): Action[AnyContent] = Action { request =>
    def executeApi(): DeletedMembersResponse = {
      val membersToDeleteBody = request.body.asJson.map(_.as[MembersToDeleteBody]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "membersToDeleteBody")
      }
      api.deleteBusinessMembership(businessId, membersToDeleteBody)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * DELETE /v5/businesses/:businessId/partners
    * @param businessId Unique identifier of the requesting business.
    */
  def deleteBusinessPartners(businessId: String): Action[AnyContent] = Action { request =>
    def executeApi(): DeletePartnersResponse = {
      val deletePartnersRequest = request.body.asJson.map(_.as[DeletePartnersRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "deletePartnersRequest")
      }
      api.deleteBusinessPartners(businessId, deletePartnersRequest)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v5/businesses/employers?pageSize=[value]&bookmark=[value]
    */
  def getBusinessEmployers(): Action[AnyContent] = Action { request =>
    def executeApi(): GetBusinessEmployers200Response = {
      val pageSize = request.getQueryString("page_size")
        .map(value => value.toInt)
        
      val bookmark = request.getQueryString("bookmark")
        
      api.getBusinessEmployers(pageSize, bookmark)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v5/businesses/:businessId/members?assetsSummary=[value]&businessRoles=[value]&memberIds=[value]&startIndex=[value]&bookmark=[value]&pageSize=[value]
    * @param businessId Unique identifier of the requesting business.
    */
  def getBusinessMembers(businessId: String): Action[AnyContent] = Action { request =>
    def executeApi(): GetBusinessMembers200Response = {
      val assetsSummary = request.getQueryString("assets_summary")
        .map(value => value.toBoolean)
        
      val businessRoles = request.queryString.get("business_roles")
        .map(_.toList)
        .map(_.map(value => )
        
      val memberIds = request.getQueryString("member_ids")
        
      val startIndex = request.getQueryString("start_index")
        .map(value => value.toInt)
        
      val bookmark = request.getQueryString("bookmark")
        
      val pageSize = request.getQueryString("page_size")
        .map(value => value.toInt)
        
      api.getBusinessMembers(businessId, assetsSummary, businessRoles, memberIds, startIndex, bookmark, pageSize)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v5/businesses/:businessId/partners?assetsSummary=[value]&partnerType=[value]&partnerIds=[value]&startIndex=[value]&pageSize=[value]&bookmark=[value]
    * @param businessId Unique identifier of the requesting business.
    */
  def getBusinessPartners(businessId: String): Action[AnyContent] = Action { request =>
    def executeApi(): GetBusinessPartners200Response = {
      val assetsSummary = request.getQueryString("assets_summary")
        .map(value => value.toBoolean)
        
      val partnerType = request.getQueryString("partner_type")
        .map(value => )
        
      val partnerIds = request.getQueryString("partner_ids")
        
      val startIndex = request.getQueryString("start_index")
        .map(value => value.toInt)
        
      val pageSize = request.getQueryString("page_size")
        .map(value => value.toInt)
        
      val bookmark = request.getQueryString("bookmark")
        
      api.getBusinessPartners(businessId, assetsSummary, partnerType, partnerIds, startIndex, pageSize, bookmark)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * PATCH /v5/businesses/:businessId/members
    * @param businessId Business id
    */
  def updateBusinessMemberships(businessId: String): Action[AnyContent] = Action { request =>
    def executeApi(): UpdateMemberResultsResponseArray = {
      val updateMemberBusinessRoleBody = request.body.asJson.map(_.as[List[UpdateMemberBusinessRoleBody]]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "updateMemberBusinessRoleBody")
      }
      api.updateBusinessMemberships(businessId, updateMemberBusinessRoleBody)
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
