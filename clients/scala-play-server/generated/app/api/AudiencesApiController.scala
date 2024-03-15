package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.Audience
import model.AudienceCreateCustomRequest
import model.AudienceCreateRequest
import model.AudienceUpdateRequest
import model.AudiencesList200Response
import model.Error

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@Singleton
class AudiencesApiController @Inject()(cc: ControllerComponents, api: AudiencesApi) extends AbstractController(cc) {
  /**
    * POST /v5/ad_accounts/:adAccountId/audiences
    * @param adAccountId Unique identifier of an ad account.
    */
  def audiencesCreate(adAccountId: String): Action[AnyContent] = Action { request =>
    def executeApi(): Audience = {
      val audienceCreateRequest = request.body.asJson.map(_.as[AudienceCreateRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "audienceCreateRequest")
      }
      api.audiencesCreate(adAccountId, audienceCreateRequest)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /v5/ad_accounts/:adAccountId/audiences/custom
    * @param adAccountId Unique identifier of an ad account.
    */
  def audiencesCreateCustom(adAccountId: String): Action[AnyContent] = Action { request =>
    def executeApi(): Audience = {
      val audienceCreateCustomRequest = request.body.asJson.map(_.as[AudienceCreateCustomRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "audienceCreateCustomRequest")
      }
      api.audiencesCreateCustom(adAccountId, audienceCreateCustomRequest)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v5/ad_accounts/:adAccountId/audiences/:audienceId
    * @param adAccountId Unique identifier of an ad account.
    * @param audienceId Unique identifier of an audience
    */
  def audiencesGet(adAccountId: String, audienceId: String): Action[AnyContent] = Action { request =>
    def executeApi(): Audience = {
      api.audiencesGet(adAccountId, audienceId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v5/ad_accounts/:adAccountId/audiences?bookmark=[value]&order=[value]&pageSize=[value]&ownershipType=[value]
    * @param adAccountId Unique identifier of an ad account.
    */
  def audiencesList(adAccountId: String): Action[AnyContent] = Action { request =>
    def executeApi(): AudiencesList200Response = {
      val bookmark = request.getQueryString("bookmark")
        
      val order = request.getQueryString("order")
        
      val pageSize = request.getQueryString("page_size")
        .map(value => value.toInt)
        
      val ownershipType = request.getQueryString("ownership_type")
        
      api.audiencesList(adAccountId, bookmark, order, pageSize, ownershipType)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * PATCH /v5/ad_accounts/:adAccountId/audiences/:audienceId
    * @param adAccountId Unique identifier of an ad account.
    * @param audienceId Unique identifier of an audience
    */
  def audiencesUpdate(adAccountId: String, audienceId: String): Action[AnyContent] = Action { request =>
    def executeApi(): Audience = {
      val audienceUpdateRequest = request.body.asJson.map(_.as[AudienceUpdateRequest])
      api.audiencesUpdate(adAccountId, audienceId, audienceUpdateRequest)
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
