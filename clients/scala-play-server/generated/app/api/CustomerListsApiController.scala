package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.CustomerList
import model.CustomerListRequest
import model.CustomerListUpdateRequest
import model.CustomerListsList200Response
import model.Error

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@Singleton
class CustomerListsApiController @Inject()(cc: ControllerComponents, api: CustomerListsApi) extends AbstractController(cc) {
  /**
    * POST /v5/ad_accounts/:adAccountId/customer_lists
    * @param adAccountId Unique identifier of an ad account.
    */
  def customerListsCreate(adAccountId: String): Action[AnyContent] = Action { request =>
    def executeApi(): CustomerList = {
      val customerListRequest = request.body.asJson.map(_.as[CustomerListRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "customerListRequest")
      }
      api.customerListsCreate(adAccountId, customerListRequest)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v5/ad_accounts/:adAccountId/customer_lists/:customerListId
    * @param adAccountId Unique identifier of an ad account.
    * @param customerListId Unique identifier of a customer list
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
    * GET /v5/ad_accounts/:adAccountId/customer_lists?pageSize=[value]&order=[value]&bookmark=[value]
    * @param adAccountId Unique identifier of an ad account.
    */
  def customerListsList(adAccountId: String): Action[AnyContent] = Action { request =>
    def executeApi(): CustomerListsList200Response = {
      val pageSize = request.getQueryString("page_size")
        .map(value => value.toInt)
        
      val order = request.getQueryString("order")
        
      val bookmark = request.getQueryString("bookmark")
        
      api.customerListsList(adAccountId, pageSize, order, bookmark)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * PATCH /v5/ad_accounts/:adAccountId/customer_lists/:customerListId
    * @param adAccountId Unique identifier of an ad account.
    * @param customerListId Unique identifier of a customer list
    */
  def customerListsUpdate(adAccountId: String, customerListId: String): Action[AnyContent] = Action { request =>
    def executeApi(): CustomerList = {
      val customerListUpdateRequest = request.body.asJson.map(_.as[CustomerListUpdateRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "customerListUpdateRequest")
      }
      api.customerListsUpdate(adAccountId, customerListId, customerListUpdateRequest)
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
