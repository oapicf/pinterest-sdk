package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.CustomerListUploadCreateRequest
import model.CustomerListUploadCreateResponse
import model.CustomerListUploadResponse
import model.Error

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@Singleton
class CustomerListUploadsApiController @Inject()(cc: ControllerComponents, api: CustomerListUploadsApi) extends AbstractController(cc) {
  /**
    * POST /v5/ad_accounts/:adAccountId/customer_lists/:customerListId/uploads
    * @param adAccountId Unique identifier of an ad account.
    * @param customerListId Unique identifier of a customer list
    */
  def customerListUploadsCreate(adAccountId: String, customerListId: String): Action[AnyContent] = Action { request =>
    def executeApi(): CustomerListUploadCreateResponse = {
      val customerListUploadCreateRequest = request.body.asJson.map(_.as[CustomerListUploadCreateRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "customerListUploadCreateRequest")
      }
      api.customerListUploadsCreate(adAccountId, customerListId, customerListUploadCreateRequest)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v5/ad_accounts/:adAccountId/customer_lists/:customerListId/uploads/:customerListUploadId
    * @param adAccountId Unique identifier of an ad account.
    * @param customerListId Unique identifier of a customer list
    * @param customerListUploadId Unique identifier of a customer list upload
    */
  def customerListUploadsGet(adAccountId: String, customerListId: String, customerListUploadId: String): Action[AnyContent] = Action { request =>
    def executeApi(): CustomerListUploadResponse = {
      api.customerListUploadsGet(adAccountId, customerListId, customerListUploadId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /v5/ad_accounts/:adAccountId/customer_lists/:customerListId/uploads/:customerListUploadId/run
    * @param adAccountId Unique identifier of an ad account.
    * @param customerListId Unique identifier of a customer list
    * @param customerListUploadId Unique identifier of a customer list upload
    */
  def customerListUploadsRun(adAccountId: String, customerListId: String, customerListUploadId: String): Action[AnyContent] = Action { request =>
    def executeApi(): CustomerListUploadResponse = {
      api.customerListUploadsRun(adAccountId, customerListId, customerListUploadId)
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
