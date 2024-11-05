package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.Error
import model.TargetingTemplateCreate
import model.TargetingTemplateGetResponseData
import model.TargetingTemplateList200Response
import model.TargetingTemplateUpdateRequest

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@Singleton
class TargetingTemplateApiController @Inject()(cc: ControllerComponents, api: TargetingTemplateApi) extends AbstractController(cc) {
  /**
    * POST /v5/ad_accounts/:adAccountId/targeting_templates
    * @param adAccountId Unique identifier of an ad account.
    */
  def targetingTemplateCreate(adAccountId: String): Action[AnyContent] = Action { request =>
    def executeApi(): TargetingTemplateGetResponseData = {
      val targetingTemplateCreate = request.body.asJson.map(_.as[TargetingTemplateCreate]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "targetingTemplateCreate")
      }
      api.targetingTemplateCreate(adAccountId, targetingTemplateCreate)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v5/ad_accounts/:adAccountId/targeting_templates?order=[value]&includeSizing=[value]&searchQuery=[value]&pageSize=[value]&bookmark=[value]
    * @param adAccountId Unique identifier of an ad account.
    */
  def targetingTemplateList(adAccountId: String): Action[AnyContent] = Action { request =>
    def executeApi(): TargetingTemplateList200Response = {
      val order = request.getQueryString("order")
        
      val includeSizing = request.getQueryString("include_sizing")
        .map(value => value.toBoolean)
        
      val searchQuery = request.getQueryString("search_query")
        
      val pageSize = request.getQueryString("page_size")
        .map(value => value.toInt)
        
      val bookmark = request.getQueryString("bookmark")
        
      api.targetingTemplateList(adAccountId, order, includeSizing, searchQuery, pageSize, bookmark)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * PATCH /v5/ad_accounts/:adAccountId/targeting_templates
    * @param adAccountId Unique identifier of an ad account.
    */
  def targetingTemplateUpdate(adAccountId: String): Action[AnyContent] = Action { request =>
    def executeApi(): Unit = {
      val targetingTemplateUpdateRequest = request.body.asJson.map(_.as[TargetingTemplateUpdateRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "targetingTemplateUpdateRequest")
      }
      api.targetingTemplateUpdate(adAccountId, targetingTemplateUpdateRequest)
    }

    executeApi()
    Ok
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
