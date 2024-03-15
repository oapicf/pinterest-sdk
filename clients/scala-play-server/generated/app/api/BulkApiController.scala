package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.BulkDownloadRequest
import model.BulkDownloadResponse
import model.BulkUpsertRequest
import model.BulkUpsertResponse
import model.BulkUpsertStatusResponse
import model.Error

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@Singleton
class BulkApiController @Inject()(cc: ControllerComponents, api: BulkApi) extends AbstractController(cc) {
  /**
    * POST /v5/ad_accounts/:adAccountId/bulk/download
    * @param adAccountId Unique identifier of an ad account.
    */
  def bulkDownloadCreate(adAccountId: String): Action[AnyContent] = Action { request =>
    def executeApi(): BulkDownloadResponse = {
      val bulkDownloadRequest = request.body.asJson.map(_.as[BulkDownloadRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "bulkDownloadRequest")
      }
      api.bulkDownloadCreate(adAccountId, bulkDownloadRequest)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v5/ad_accounts/:adAccountId/bulk/:bulkRequestId?includeDetails=[value]
    * @param adAccountId Unique identifier of an ad account.
    * @param bulkRequestId Unique identifier of a bulk upsert request.
    */
  def bulkRequestGet(adAccountId: String, bulkRequestId: String): Action[AnyContent] = Action { request =>
    def executeApi(): BulkUpsertStatusResponse = {
      val includeDetails = request.getQueryString("include_details")
        .map(value => value.toBoolean)
        
      api.bulkRequestGet(adAccountId, bulkRequestId, includeDetails)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /v5/ad_accounts/:adAccountId/bulk/upsert
    * @param adAccountId Unique identifier of an ad account.
    */
  def bulkUpsertCreate(adAccountId: String): Action[AnyContent] = Action { request =>
    def executeApi(): BulkUpsertResponse = {
      val bulkUpsertRequest = request.body.asJson.map(_.as[BulkUpsertRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "bulkUpsertRequest")
      }
      api.bulkUpsertCreate(adAccountId, bulkUpsertRequest)
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
