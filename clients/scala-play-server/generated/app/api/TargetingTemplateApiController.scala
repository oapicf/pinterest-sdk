package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.Error
import model.PaginationOrder
import model.TargetingTemplate
import model.TargetingTemplateCreate
import model.TargetingTemplateList200Response
import model.TargetingTemplateUpdateRequestReadOrUpdate

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@Singleton
class TargetingTemplateApiController @Inject()(cc: ControllerComponents, api: TargetingTemplateApi) extends AbstractController(cc) {
  /**
    * POST /v5/ad_accounts/:adAccountId/targeting_templates
    * @param adAccountId Unique identifier of an ad account.
    */
  def targetingTemplateCreate(adAccountId: String): Action[AnyContent] = Action { request =>
    def executeApi(): TargetingTemplate = {
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
    * GET /v5/ad_accounts/:adAccountId/targeting_templates?bookmark=[value]&pageSize=[value]&order=[value]&includeSizing=[value]&searchQuery=[value]
    * @param adAccountId Unique identifier of an ad account.
    */
  def targetingTemplateList(adAccountId: String): Action[AnyContent] = Action { request =>
    def executeApi(): TargetingTemplateList200Response = {
      val bookmark = request.getQueryString("bookmark")
        
      val pageSize = request.getQueryString("page_size")
        .map(value => value.toInt)
        
      val order = request.getQueryString("order")
        .map(value => )
        
      val includeSizing = request.getQueryString("include_sizing")
        .map(value => value.toBoolean)
        
      val searchQuery = request.getQueryString("search_query")
        
      api.targetingTemplateList(adAccountId, bookmark, pageSize, order, includeSizing, searchQuery)
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
      val targetingTemplateUpdateRequestReadOrUpdate = request.body.asJson.map(_.as[TargetingTemplateUpdateRequestReadOrUpdate]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "targetingTemplateUpdateRequestReadOrUpdate")
      }
      api.targetingTemplateUpdate(adAccountId, targetingTemplateUpdateRequestReadOrUpdate)
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
