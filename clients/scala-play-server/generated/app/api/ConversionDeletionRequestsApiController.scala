package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.ConversionDeletionRequest
import model.ConversionDeletionRequestCreate
import model.ConversionDeletionRequestList200Response
import model.Error
import model.PaginationOrder

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@Singleton
class ConversionDeletionRequestsApiController @Inject()(cc: ControllerComponents, api: ConversionDeletionRequestsApi) extends AbstractController(cc) {
  /**
    * POST /v5/ad_accounts/:adAccountId/conversion_deletion_requests
    * @param adAccountId Unique identifier of an ad account.
    */
  def conversionDeletionRequestCreate(adAccountId: String): Action[AnyContent] = Action { request =>
    def executeApi(): ConversionDeletionRequest = {
      val conversionDeletionRequestCreate = request.body.asJson.map(_.as[ConversionDeletionRequestCreate]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "conversionDeletionRequestCreate")
      }
      api.conversionDeletionRequestCreate(adAccountId, conversionDeletionRequestCreate)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * DELETE /v5/ad_accounts/:adAccountId/conversion_deletion_requests/:requestId
    * @param requestId Unique identifier of the conversion deletion request
    * @param adAccountId Unique identifier of an ad account.
    */
  def conversionDeletionRequestDelete(requestId: String, adAccountId: String): Action[AnyContent] = Action { request =>
    def executeApi(): ConversionDeletionRequest = {
      api.conversionDeletionRequestDelete(requestId, adAccountId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v5/ad_accounts/:adAccountId/conversion_deletion_requests/:requestId
    * @param requestId Unique identifier of the conversion deletion request
    * @param adAccountId Unique identifier of an ad account.
    */
  def conversionDeletionRequestGet(requestId: String, adAccountId: String): Action[AnyContent] = Action { request =>
    def executeApi(): ConversionDeletionRequest = {
      api.conversionDeletionRequestGet(requestId, adAccountId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v5/ad_accounts/:adAccountId/conversion_deletion_requests?bookmark=[value]&pageSize=[value]&order=[value]
    * @param adAccountId Unique identifier of an ad account.
    */
  def conversionDeletionRequestList(adAccountId: String): Action[AnyContent] = Action { request =>
    def executeApi(): ConversionDeletionRequestList200Response = {
      val bookmark = request.getQueryString("bookmark")
        
      val pageSize = request.getQueryString("page_size")
        .map(value => value.toInt)
        
      val order = request.getQueryString("order")
        .map(value => )
        
      api.conversionDeletionRequestList(adAccountId, bookmark, pageSize, order)
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
