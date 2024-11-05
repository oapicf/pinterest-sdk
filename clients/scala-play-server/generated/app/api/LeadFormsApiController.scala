package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.Error
import model.LeadFormArrayResponse
import model.LeadFormCreateRequest
import model.LeadFormResponse
import model.LeadFormTestRequest
import model.LeadFormTestResponse
import model.LeadFormUpdateRequest
import model.LeadFormsList200Response

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
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
    * POST /v5/ad_accounts/:adAccountId/lead_forms
    * @param adAccountId Unique identifier of an ad account.
    */
  def leadFormsCreate(adAccountId: String): Action[AnyContent] = Action { request =>
    def executeApi(): LeadFormArrayResponse = {
      val leadFormCreateRequest = request.body.asJson.map(_.as[List[LeadFormCreateRequest]]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "leadFormCreateRequest")
      }
      api.leadFormsCreate(adAccountId, leadFormCreateRequest)
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

  /**
    * PATCH /v5/ad_accounts/:adAccountId/lead_forms
    * @param adAccountId Unique identifier of an ad account.
    */
  def leadFormsUpdate(adAccountId: String): Action[AnyContent] = Action { request =>
    def executeApi(): LeadFormArrayResponse = {
      val leadFormUpdateRequest = request.body.asJson.map(_.as[List[LeadFormUpdateRequest]]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "leadFormUpdateRequest")
      }
      api.leadFormsUpdate(adAccountId, leadFormUpdateRequest)
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
