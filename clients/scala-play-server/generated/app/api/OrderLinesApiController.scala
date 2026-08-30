package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.Error
import model.OrderLine
import model.OrderLinesList200Response
import model.PaginationOrder

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@Singleton
class OrderLinesApiController @Inject()(cc: ControllerComponents, api: OrderLinesApi) extends AbstractController(cc) {
  /**
    * GET /v5/ad_accounts/:adAccountId/order_lines/:orderLineId
    * @param orderLineId Order line ID.
    * @param adAccountId Unique identifier of an ad account.
    */
  def orderLinesGet(orderLineId: String, adAccountId: String): Action[AnyContent] = Action { request =>
    def executeApi(): OrderLine = {
      api.orderLinesGet(orderLineId, adAccountId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v5/ad_accounts/:adAccountId/order_lines?bookmark=[value]&pageSize=[value]&order=[value]
    * @param adAccountId Unique identifier of an ad account.
    */
  def orderLinesList(adAccountId: String): Action[AnyContent] = Action { request =>
    def executeApi(): OrderLinesList200Response = {
      val bookmark = request.getQueryString("bookmark")
        
      val pageSize = request.getQueryString("page_size")
        .map(value => value.toInt)
        
      val order = request.getQueryString("order")
        .map(value => )
        
      api.orderLinesList(adAccountId, bookmark, pageSize, order)
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
