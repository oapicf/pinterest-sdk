package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.AdAccountsAudience
import model.AdAccountsAudienceCreate
import model.AdAccountsAudienceUpdate
import model.AudienceOwnershipType
import model.AudiencesList200Response
import model.Error
import model.PaginationOrder

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@Singleton
class AudiencesApiController @Inject()(cc: ControllerComponents, api: AudiencesApi) extends AbstractController(cc) {
  /**
    * POST /v5/ad_accounts/:adAccountId/audiences
    * @param adAccountId Unique identifier of an ad account.
    */
  def audiencesCreate(adAccountId: String): Action[AnyContent] = Action { request =>
    def executeApi(): AdAccountsAudience = {
      val adAccountsAudienceCreate = request.body.asJson.map(_.as[AdAccountsAudienceCreate]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "adAccountsAudienceCreate")
      }
      api.audiencesCreate(adAccountId, adAccountsAudienceCreate)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v5/ad_accounts/:adAccountId/audiences/:audienceId
    * @param audienceId Audience ID.
    * @param adAccountId Unique identifier of an ad account.
    */
  def audiencesGet(audienceId: String, adAccountId: String): Action[AnyContent] = Action { request =>
    def executeApi(): AdAccountsAudience = {
      api.audiencesGet(audienceId, adAccountId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v5/ad_accounts/:adAccountId/audiences?bookmark=[value]&pageSize=[value]&order=[value]&ownershipType=[value]&excludeNca=[value]
    * @param adAccountId Unique identifier of an ad account.
    */
  def audiencesList(adAccountId: String): Action[AnyContent] = Action { request =>
    def executeApi(): AudiencesList200Response = {
      val bookmark = request.getQueryString("bookmark")
        
      val pageSize = request.getQueryString("page_size")
        .map(value => value.toInt)
        
      val order = request.getQueryString("order")
        .map(value => )
        
      val ownershipType = request.getQueryString("ownership_type")
        .map(value => )
        
      val excludeNca = request.getQueryString("exclude_nca")
        .map(value => value.toBoolean)
        
      api.audiencesList(adAccountId, bookmark, pageSize, order, ownershipType, excludeNca)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * PATCH /v5/ad_accounts/:adAccountId/audiences/:audienceId
    * @param audienceId Audience ID.
    * @param adAccountId Unique identifier of an ad account.
    */
  def audiencesUpdate(audienceId: String, adAccountId: String): Action[AnyContent] = Action { request =>
    def executeApi(): AdAccountsAudience = {
      val adAccountsAudienceUpdate = request.body.asJson.map(_.as[AdAccountsAudienceUpdate]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "adAccountsAudienceUpdate")
      }
      api.audiencesUpdate(audienceId, adAccountId, adAccountsAudienceUpdate)
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
