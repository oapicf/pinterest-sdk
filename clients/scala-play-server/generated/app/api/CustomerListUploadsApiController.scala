package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.CustomerListUpload
import model.CustomerListUploadCreateRequest
import model.CustomerListUploadCreateResponse
import model.Error

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@Singleton
class CustomerListUploadsApiController @Inject()(cc: ControllerComponents, api: CustomerListUploadsApi) extends AbstractController(cc) {
  /**
    * POST /v5/ad_accounts/:adAccountId/customer_lists/:customerListId/uploads
    * @param customerListId Customer list ID.
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
    * @param customerListId Customer list ID.
    * @param customerListUploadId Customer List Upload ID.
    */
  def customerListUploadsGet(adAccountId: String, customerListId: String, customerListUploadId: String): Action[AnyContent] = Action { request =>
    def executeApi(): CustomerListUpload = {
      api.customerListUploadsGet(adAccountId, customerListId, customerListUploadId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /v5/ad_accounts/:adAccountId/customer_lists/:customerListId/uploads/:customerListUploadId/run
    * @param customerListId Customer list ID.
    * @param customerListUploadId Customer List Upload ID.
    */
  def customerListUploadsRun(adAccountId: String, customerListId: String, customerListUploadId: String): Action[AnyContent] = Action { request =>
    def executeApi(): CustomerListUpload = {
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
