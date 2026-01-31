package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.BrandAccountsCreate200Response
import model.BrandAccountsCreateRequest
import model.BrandAccountsUpdateRequest
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
import model.SystemUserUpdateRequest
import model.UpdateMemberBusinessRoleBody
import model.UpdateMemberResultsResponseArray

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@Singleton
class BusinessAccessRelationshipsApiController @Inject()(cc: ControllerComponents, api: BusinessAccessRelationshipsApi) extends AbstractController(cc) {
  /**
    * POST /v5/business_access/business_hierarchy/:businessHierarchyId/brand_accounts
    * @param businessHierarchyId business hierarchy node id
    */
  def brandAccountsCreate(businessHierarchyId: String): Action[AnyContent] = Action { request =>
    def executeApi(): BrandAccountsCreate200Response = {
      val brandAccountsCreateRequest = request.body.asJson.map(_.as[BrandAccountsCreateRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "brandAccountsCreateRequest")
      }
      api.brandAccountsCreate(businessHierarchyId, brandAccountsCreateRequest)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * PATCH /v5/business_access/business_hierarchy/:businessHierarchyId/brand_accounts/:brandAccountId
    * @param businessHierarchyId business hierarchy node id
    * @param brandAccountId Unique identifier of a brand account.
    */
  def brandAccountsUpdate(businessHierarchyId: String, brandAccountId: String): Action[AnyContent] = Action { request =>
    def executeApi(): BrandAccountsCreate200Response = {
      val brandAccountsUpdateRequest = request.body.asJson.map(_.as[BrandAccountsUpdateRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "brandAccountsUpdateRequest")
      }
      api.brandAccountsUpdate(businessHierarchyId, brandAccountId, brandAccountsUpdateRequest)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

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
    * GET /v5/businesses/:businessId/members?fetchSystemUsers=[value]&assetsSummary=[value]&businessRoles=[value]&memberIds=[value]&startIndex=[value]&bookmark=[value]&pageSize=[value]
    * @param businessId Unique identifier of the requesting business.
    */
  def getBusinessMembers(businessId: String): Action[AnyContent] = Action { request =>
    def executeApi(): GetBusinessMembers200Response = {
      val fetchSystemUsers = request.getQueryString("fetch_system_users")
        .map(value => value.toBoolean)
        
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
        
      api.getBusinessMembers(businessId, fetchSystemUsers, assetsSummary, businessRoles, memberIds, startIndex, bookmark, pageSize)
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
    * PATCH /v5/businesses/:businessId/system_users/:systemUserId
    * @param businessId Unique identifier of the requesting business.
    * @param systemUserId Unique identifier of a system user.
    */
  def systemUserUpdate(businessId: String, systemUserId: String): Action[AnyContent] = Action { request =>
    def executeApi(): Unit = {
      val systemUserUpdateRequest = request.body.asJson.map(_.as[SystemUserUpdateRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "systemUserUpdateRequest")
      }
      api.systemUserUpdate(businessId, systemUserId, systemUserUpdateRequest)
    }

    executeApi()
    Ok
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
