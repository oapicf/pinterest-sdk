package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.Error
import model.OrderLine
import model.OrderLinesList200Response

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@Singleton
class OrderLinesApiController @Inject()(cc: ControllerComponents, api: OrderLinesApi) extends AbstractController(cc) {
  /**
    * GET /v5/ad_accounts/:adAccountId/order_lines/:orderLineId
    * @param adAccountId Unique identifier of an ad account.
    * @param orderLineId Unique identifier of an order line.
    */
  def orderLinesGet(adAccountId: String, orderLineId: String): Action[AnyContent] = Action { request =>
    def executeApi(): OrderLine = {
      api.orderLinesGet(adAccountId, orderLineId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v5/ad_accounts/:adAccountId/order_lines?pageSize=[value]&order=[value]&bookmark=[value]
    * @param adAccountId Unique identifier of an ad account.
    */
  def orderLinesList(adAccountId: String): Action[AnyContent] = Action { request =>
    def executeApi(): OrderLinesList200Response = {
      val pageSize = request.getQueryString("page_size")
        .map(value => value.toInt)
        
      val order = request.getQueryString("order")
        
      val bookmark = request.getQueryString("bookmark")
        
      api.orderLinesList(adAccountId, pageSize, order, bookmark)
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
