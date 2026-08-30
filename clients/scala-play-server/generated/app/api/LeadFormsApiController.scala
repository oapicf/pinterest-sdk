package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.Error
import model.LeadForm
import model.LeadFormBatchUpdate
import model.LeadFormCreate
import model.LeadFormTest
import model.LeadFormTestCreate
import model.LeadFormsCreate200Response
import model.LeadFormsList200Response
import model.PaginationOrder

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@Singleton
class LeadFormsApiController @Inject()(cc: ControllerComponents, api: LeadFormsApi) extends AbstractController(cc) {
  /**
    * GET /v5/ad_accounts/:adAccountId/lead_forms/:leadFormId
    * @param leadFormId The ID of this lead form
    * @param adAccountId Unique identifier of an ad account.
    */
  def leadFormGet(leadFormId: String, adAccountId: String): Action[AnyContent] = Action { request =>
    def executeApi(): LeadForm = {
      api.leadFormGet(leadFormId, adAccountId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /v5/ad_accounts/:adAccountId/lead_forms/:leadFormId/test
    * @param leadFormId Unique identifier of a lead form.
    */
  def leadFormTestCreate(adAccountId: String, leadFormId: String): Action[AnyContent] = Action { request =>
    def executeApi(): LeadFormTest = {
      val leadFormTestCreate = request.body.asJson.map(_.as[LeadFormTestCreate]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "leadFormTestCreate")
      }
      api.leadFormTestCreate(adAccountId, leadFormId, leadFormTestCreate)
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
    def executeApi(): LeadFormsCreate200Response = {
      val leadFormCreate = request.body.asJson.map(_.as[List[LeadFormCreate]]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "leadFormCreate")
      }
      api.leadFormsCreate(adAccountId, leadFormCreate)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v5/ad_accounts/:adAccountId/lead_forms?bookmark=[value]&pageSize=[value]&order=[value]
    * @param adAccountId Unique identifier of an ad account.
    */
  def leadFormsList(adAccountId: String): Action[AnyContent] = Action { request =>
    def executeApi(): LeadFormsList200Response = {
      val bookmark = request.getQueryString("bookmark")
        
      val pageSize = request.getQueryString("page_size")
        .map(value => value.toInt)
        
      val order = request.getQueryString("order")
        .map(value => )
        
      api.leadFormsList(adAccountId, bookmark, pageSize, order)
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
    def executeApi(): LeadFormsCreate200Response = {
      val leadFormBatchUpdate = request.body.asJson.map(_.as[List[LeadFormBatchUpdate]]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "leadFormBatchUpdate")
      }
      api.leadFormsUpdate(adAccountId, leadFormBatchUpdate)
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
