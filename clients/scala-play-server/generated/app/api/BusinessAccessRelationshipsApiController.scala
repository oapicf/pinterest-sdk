package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.BrandAccount
import model.BrandAccountCreate
import model.BrandAccountUpdate
import model.BusinessMembershipMember
import model.DeleteBusinessMembership200Response
import model.DeleteBusinessMembershipBody
import model.DeleteBusinessPartners
import model.DeleteBusinessPartnersDelete
import model.Error
import model.GetBusinessEmployers200Response
import model.MemberBusinessRole
import model.PartnerType
import model.SystemUserUpdateWithRequiredBody
import model.UpdateBusinessMembershipsResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@Singleton
class BusinessAccessRelationshipsApiController @Inject()(cc: ControllerComponents, api: BusinessAccessRelationshipsApi) extends AbstractController(cc) {
  /**
    * POST /v5/business_access/business_hierarchy/:businessHierarchyId/brand_accounts
    * @param businessHierarchyId business hierarchy node id
    */
  def brandAccountsCreate(businessHierarchyId: String): Action[AnyContent] = Action { request =>
    def executeApi(): BrandAccount = {
      val brandAccountCreate = request.body.asJson.map(_.as[BrandAccountCreate]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "brandAccountCreate")
      }
      api.brandAccountsCreate(businessHierarchyId, brandAccountCreate)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * PATCH /v5/business_access/business_hierarchy/:businessHierarchyId/brand_accounts/:brandAccountId
    * @param businessHierarchyId business hierarchy node id
    */
  def brandAccountsUpdate(brandAccountId: String, businessHierarchyId: String): Action[AnyContent] = Action { request =>
    def executeApi(): BrandAccount = {
      val brandAccountUpdate = request.body.asJson.map(_.as[BrandAccountUpdate]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "brandAccountUpdate")
      }
      api.brandAccountsUpdate(brandAccountId, businessHierarchyId, brandAccountUpdate)
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
    def executeApi(): DeleteBusinessMembership200Response = {
      val deleteBusinessMembershipBody = request.body.asJson.map(_.as[DeleteBusinessMembershipBody]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "deleteBusinessMembershipBody")
      }
      api.deleteBusinessMembership(businessId, deleteBusinessMembershipBody)
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
    def executeApi(): DeleteBusinessPartners = {
      val deleteBusinessPartnersDelete = request.body.asJson.map(_.as[DeleteBusinessPartnersDelete]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "deleteBusinessPartnersDelete")
      }
      api.deleteBusinessPartners(businessId, deleteBusinessPartnersDelete)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v5/businesses/employers?assetsSummary=[value]&bookmark=[value]&pageSize=[value]
    */
  def getBusinessEmployers(): Action[AnyContent] = Action { request =>
    def executeApi(): GetBusinessEmployers200Response = {
      val assetsSummary = request.getQueryString("assets_summary")
        .map(value => value.toBoolean)
        
      val bookmark = request.getQueryString("bookmark")
        
      val pageSize = request.getQueryString("page_size")
        .map(value => value.toInt)
        
      api.getBusinessEmployers(assetsSummary, bookmark, pageSize)
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
    def executeApi(): GetBusinessEmployers200Response = {
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
    * GET /v5/businesses/:businessId/partners?assetsSummary=[value]&partnerType=[value]&partnerIds=[value]&startIndex=[value]&sortAscending=[value]&bookmark=[value]&pageSize=[value]
    * @param businessId Unique identifier of the requesting business.
    */
  def getBusinessPartners(businessId: String): Action[AnyContent] = Action { request =>
    def executeApi(): GetBusinessEmployers200Response = {
      val assetsSummary = request.getQueryString("assets_summary")
        .map(value => value.toBoolean)
        
      val partnerType = request.getQueryString("partner_type")
        .map(value => )
        
      val partnerIds = request.getQueryString("partner_ids")
        
      val startIndex = request.getQueryString("start_index")
        .map(value => value.toInt)
        
      val sortAscending = request.getQueryString("sort_ascending")
        .map(value => value.toBoolean)
        
      val bookmark = request.getQueryString("bookmark")
        
      val pageSize = request.getQueryString("page_size")
        .map(value => value.toInt)
        
      api.getBusinessPartners(businessId, assetsSummary, partnerType, partnerIds, startIndex, sortAscending, bookmark, pageSize)
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
      val systemUserUpdateWithRequiredBody = request.body.asJson.map(_.as[SystemUserUpdateWithRequiredBody]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "systemUserUpdateWithRequiredBody")
      }
      api.systemUserUpdate(businessId, systemUserId, systemUserUpdateWithRequiredBody)
    }

    executeApi()
    Ok
  }

  /**
    * PATCH /v5/businesses/:businessId/members
    * @param businessId Business id
    */
  def updateBusinessMemberships(businessId: String): Action[AnyContent] = Action { request =>
    def executeApi(): UpdateBusinessMembershipsResponse = {
      val businessMembershipMember = request.body.asJson.map(_.as[List[BusinessMembershipMember]]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "businessMembershipMember")
      }
      api.updateBusinessMemberships(businessId, businessMembershipMember)
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
