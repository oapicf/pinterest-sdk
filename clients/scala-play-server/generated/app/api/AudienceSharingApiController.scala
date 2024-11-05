package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.AdAccountsAudiencesSharedAccountsList200Response
import model.AudienceAccountType
import model.AudiencesList200Response
import model.BusinessSharedAudience
import model.BusinessSharedAudienceResponse
import model.Error
import model.SharedAudience
import model.SharedAudienceResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@Singleton
class AudienceSharingApiController @Inject()(cc: ControllerComponents, api: AudienceSharingApi) extends AbstractController(cc) {
  /**
    * GET /v5/ad_accounts/:adAccountId/audiences/shared/accounts?audienceId=[value]&accountType=[value]&pageSize=[value]&bookmark=[value]
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
        
      val pageSize = request.getQueryString("page_size")
        .map(value => value.toInt)
        
      val bookmark = request.getQueryString("bookmark")
        
      api.adAccountsAudiencesSharedAccountsList(adAccountId, audienceId, accountType, pageSize, bookmark)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v5/businesses/:businessId/audiences/shared/accounts?audienceId=[value]&accountType=[value]&pageSize=[value]&bookmark=[value]
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
        
      val pageSize = request.getQueryString("page_size")
        .map(value => value.toInt)
        
      val bookmark = request.getQueryString("bookmark")
        
      api.businessAccountAudiencesSharedAccountsList(businessId, audienceId, accountType, pageSize, bookmark)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v5/businesses/:businessId/audiences?bookmark=[value]&order=[value]&pageSize=[value]
    * @param businessId Unique identifier of the requesting business.
    */
  def sharedAudiencesForBusinessList(businessId: String): Action[AnyContent] = Action { request =>
    def executeApi(): AudiencesList200Response = {
      val bookmark = request.getQueryString("bookmark")
        
      val order = request.getQueryString("order")
        
      val pageSize = request.getQueryString("page_size")
        .map(value => value.toInt)
        
      api.sharedAudiencesForBusinessList(businessId, bookmark, order, pageSize)
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
    def executeApi(): SharedAudienceResponse = {
      val sharedAudience = request.body.asJson.map(_.as[SharedAudience]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "sharedAudience")
      }
      api.updateAdAccountToAdAccountSharedAudience(adAccountId, sharedAudience)
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
    def executeApi(): BusinessSharedAudienceResponse = {
      val businessSharedAudience = request.body.asJson.map(_.as[BusinessSharedAudience]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "businessSharedAudience")
      }
      api.updateAdAccountToBusinessSharedAudience(adAccountId, businessSharedAudience)
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
    def executeApi(): SharedAudienceResponse = {
      val sharedAudience = request.body.asJson.map(_.as[SharedAudience]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "sharedAudience")
      }
      api.updateBusinessToAdAccountSharedAudience(businessId, sharedAudience)
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
    def executeApi(): BusinessSharedAudienceResponse = {
      val businessSharedAudience = request.body.asJson.map(_.as[BusinessSharedAudience]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "businessSharedAudience")
      }
      api.updateBusinessToBusinessSharedAudience(businessId, businessSharedAudience)
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
