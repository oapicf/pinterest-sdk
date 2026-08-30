package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.AdAccountToAdAccountSharedAudience
import model.AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody
import model.AdAccountToBusinessSharedAudience
import model.AdAccountToBusinessSharedAudienceUpdateWithRequiredBody
import model.AdAccountsAudiencesSharedAccountsList200Response
import model.AudienceAccountType
import model.BusinessToAdAccountSharedAudience
import model.BusinessToAdAccountSharedAudienceUpdateWithRequiredBody
import model.BusinessToBusinessSharedAudience
import model.BusinessToBusinessSharedAudienceUpdateWithRequiredBody
import model.Error
import model.Order
import model.SharedAudiencesForBusinessList200Response

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@Singleton
class AudienceSharingApiController @Inject()(cc: ControllerComponents, api: AudienceSharingApi) extends AbstractController(cc) {
  /**
    * GET /v5/ad_accounts/:adAccountId/audiences/shared/accounts?audienceId=[value]&accountType=[value]&bookmark=[value]&pageSize=[value]
    * @param adAccountId Unique identifier of an ad account.
    */
  def adAccountsAudiencesSharedAccountsList(adAccountId: String): Action[AnyContent] = Action { request =>
    def executeApi(): AdAccountsAudiencesSharedAccountsList200Response = {
      val audienceId = request.getQueryString("audience_id")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("audience_id", "query string")
        }
        
      val accountType = request.getQueryString("account_type")
        .map(value => )
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("account_type", "query string")
        }
        
      val bookmark = request.getQueryString("bookmark")
        
      val pageSize = request.getQueryString("page_size")
        .map(value => value.toInt)
        
      api.adAccountsAudiencesSharedAccountsList(audienceId, accountType, adAccountId, bookmark, pageSize)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v5/businesses/:businessId/audiences/shared/accounts?audienceId=[value]&accountType=[value]&bookmark=[value]&pageSize=[value]
    * @param businessId Unique identifier of the requesting business.
    */
  def businessAccountAudiencesSharedAccountsList(businessId: String): Action[AnyContent] = Action { request =>
    def executeApi(): AdAccountsAudiencesSharedAccountsList200Response = {
      val audienceId = request.getQueryString("audience_id")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("audience_id", "query string")
        }
        
      val accountType = request.getQueryString("account_type")
        .map(value => )
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("account_type", "query string")
        }
        
      val bookmark = request.getQueryString("bookmark")
        
      val pageSize = request.getQueryString("page_size")
        .map(value => value.toInt)
        
      api.businessAccountAudiencesSharedAccountsList(businessId, audienceId, accountType, bookmark, pageSize)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v5/businesses/:businessId/audiences?order=[value]&bookmark=[value]&pageSize=[value]
    * @param businessId Unique identifier of the requesting business.
    */
  def sharedAudiencesForBusinessList(businessId: String): Action[AnyContent] = Action { request =>
    def executeApi(): SharedAudiencesForBusinessList200Response = {
      val order = request.getQueryString("order")
        .map(value => )
        
      val bookmark = request.getQueryString("bookmark")
        
      val pageSize = request.getQueryString("page_size")
        .map(value => value.toInt)
        
      api.sharedAudiencesForBusinessList(businessId, order, bookmark, pageSize)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * PATCH /v5/ad_accounts/:adAccountId/audiences/ad_accounts/shared
    * @param adAccountId Unique identifier of an ad account.
    */
  def updateAdAccountToAdAccountSharedAudience(adAccountId: String): Action[AnyContent] = Action { request =>
    def executeApi(): AdAccountToAdAccountSharedAudience = {
      val adAccountToAdAccountSharedAudienceUpdateWithRequiredBody = request.body.asJson.map(_.as[AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "adAccountToAdAccountSharedAudienceUpdateWithRequiredBody")
      }
      api.updateAdAccountToAdAccountSharedAudience(adAccountId, adAccountToAdAccountSharedAudienceUpdateWithRequiredBody)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * PATCH /v5/ad_accounts/:adAccountId/audiences/businesses/shared
    * @param adAccountId Unique identifier of an ad account.
    */
  def updateAdAccountToBusinessSharedAudience(adAccountId: String): Action[AnyContent] = Action { request =>
    def executeApi(): AdAccountToBusinessSharedAudience = {
      val adAccountToBusinessSharedAudienceUpdateWithRequiredBody = request.body.asJson.map(_.as[AdAccountToBusinessSharedAudienceUpdateWithRequiredBody]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "adAccountToBusinessSharedAudienceUpdateWithRequiredBody")
      }
      api.updateAdAccountToBusinessSharedAudience(adAccountId, adAccountToBusinessSharedAudienceUpdateWithRequiredBody)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * PATCH /v5/businesses/:businessId/audiences/ad_accounts/shared
    * @param businessId Unique identifier of the requesting business.
    */
  def updateBusinessToAdAccountSharedAudience(businessId: String): Action[AnyContent] = Action { request =>
    def executeApi(): BusinessToAdAccountSharedAudience = {
      val businessToAdAccountSharedAudienceUpdateWithRequiredBody = request.body.asJson.map(_.as[BusinessToAdAccountSharedAudienceUpdateWithRequiredBody]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "businessToAdAccountSharedAudienceUpdateWithRequiredBody")
      }
      api.updateBusinessToAdAccountSharedAudience(businessId, businessToAdAccountSharedAudienceUpdateWithRequiredBody)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * PATCH /v5/businesses/:businessId/audiences/businesses/shared
    * @param businessId Unique identifier of the requesting business.
    */
  def updateBusinessToBusinessSharedAudience(businessId: String): Action[AnyContent] = Action { request =>
    def executeApi(): BusinessToBusinessSharedAudience = {
      val businessToBusinessSharedAudienceUpdateWithRequiredBody = request.body.asJson.map(_.as[BusinessToBusinessSharedAudienceUpdateWithRequiredBody]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "businessToBusinessSharedAudienceUpdateWithRequiredBody")
      }
      api.updateBusinessToBusinessSharedAudience(businessId, businessToBusinessSharedAudienceUpdateWithRequiredBody)
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
