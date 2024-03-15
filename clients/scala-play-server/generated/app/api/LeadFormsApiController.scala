package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.Error
import model.LeadFormResponse
import model.LeadFormTestRequest
import model.LeadFormTestResponse
import model.LeadFormsList200Response

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@Singleton
class LeadFormsApiController @Inject()(cc: ControllerComponents, api: LeadFormsApi) extends AbstractController(cc) {
  /**
    * GET /v5/ad_accounts/:adAccountId/lead_forms/:leadFormId
    * @param adAccountId Unique identifier of an ad account.
    * @param leadFormId Unique identifier of a lead form.
    */
  def leadFormGet(adAccountId: String, leadFormId: String): Action[AnyContent] = Action { request =>
    def executeApi(): LeadFormResponse = {
      api.leadFormGet(adAccountId, leadFormId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /v5/ad_accounts/:adAccountId/lead_forms/:leadFormId/test
    * @param adAccountId Unique identifier of an ad account.
    * @param leadFormId Unique identifier of a lead form.
    */
  def leadFormTestCreate(adAccountId: String, leadFormId: String): Action[AnyContent] = Action { request =>
    def executeApi(): LeadFormTestResponse = {
      val leadFormTestRequest = request.body.asJson.map(_.as[LeadFormTestRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "leadFormTestRequest")
      }
      api.leadFormTestCreate(adAccountId, leadFormId, leadFormTestRequest)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v5/ad_accounts/:adAccountId/lead_forms?pageSize=[value]&order=[value]&bookmark=[value]
    * @param adAccountId Unique identifier of an ad account.
    */
  def leadFormsList(adAccountId: String): Action[AnyContent] = Action { request =>
    def executeApi(): LeadFormsList200Response = {
      val pageSize = request.getQueryString("page_size")
        .map(value => value.toInt)
        
      val order = request.getQueryString("order")
        
      val bookmark = request.getQueryString("bookmark")
        
      api.leadFormsList(adAccountId, pageSize, order, bookmark)
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
