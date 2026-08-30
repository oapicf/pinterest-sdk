package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.CustomerList
import model.CustomerListCreate
import model.CustomerListUpdateWithRequiredBody
import model.CustomerListsList200Response
import model.Error
import model.PaginationOrder

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@Singleton
class CustomerListsApiController @Inject()(cc: ControllerComponents, api: CustomerListsApi) extends AbstractController(cc) {
  /**
    * POST /v5/ad_accounts/:adAccountId/customer_lists
    */
  def customerListsCreate(adAccountId: String): Action[AnyContent] = Action { request =>
    def executeApi(): CustomerList = {
      val customerListCreate = request.body.asJson.map(_.as[CustomerListCreate]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "customerListCreate")
      }
      api.customerListsCreate(adAccountId, customerListCreate)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v5/ad_accounts/:adAccountId/customer_lists/:customerListId
    * @param customerListId Customer list ID.
    */
  def customerListsGet(adAccountId: String, customerListId: String): Action[AnyContent] = Action { request =>
    def executeApi(): CustomerList = {
      api.customerListsGet(adAccountId, customerListId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v5/ad_accounts/:adAccountId/customer_lists?bookmark=[value]&pageSize=[value]&order=[value]&excludeNca=[value]
    */
  def customerListsList(adAccountId: String): Action[AnyContent] = Action { request =>
    def executeApi(): CustomerListsList200Response = {
      val bookmark = request.getQueryString("bookmark")
        
      val pageSize = request.getQueryString("page_size")
        .map(value => value.toInt)
        
      val order = request.getQueryString("order")
        .map(value => )
        
      val excludeNca = request.getQueryString("exclude_nca")
        .map(value => value.toBoolean)
        
      api.customerListsList(adAccountId, bookmark, pageSize, order, excludeNca)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * PATCH /v5/ad_accounts/:adAccountId/customer_lists/:customerListId
    * @param customerListId Customer list ID.
    */
  def customerListsUpdate(adAccountId: String, customerListId: String): Action[AnyContent] = Action { request =>
    def executeApi(): CustomerList = {
      val customerListUpdateWithRequiredBody = request.body.asJson.map(_.as[CustomerListUpdateWithRequiredBody]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "customerListUpdateWithRequiredBody")
      }
      api.customerListsUpdate(adAccountId, customerListId, customerListUpdateWithRequiredBody)
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
