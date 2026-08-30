package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.server.{PathMatcher, PathMatcher1}
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller
import akka.http.scaladsl.unmarshalling.FromStringUnmarshaller
import org.openapitools.server.AkkaHttpHelper._
import org.openapitools.server.model.Error
import org.openapitools.server.model.OrderLine
import org.openapitools.server.model.OrderLinesList200Response
import org.openapitools.server.model.PaginationOrder


class OrderLinesApi(
    orderLinesService: OrderLinesApiService,
    orderLinesMarshaller: OrderLinesApiMarshaller
) {

  import OrderLinesApiPatterns.orderLineIdPattern
import OrderLinesApiPatterns.adAccountIdPattern

  import orderLinesMarshaller._

  lazy val route: Route =
    path("ad_accounts" / adAccountIdPattern / "order_lines" / orderLineIdPattern) { (orderLineId, adAccountId) => 
      get {  
            orderLinesService.orderLinesGet(orderLineId = orderLineId, adAccountId = adAccountId)
      }
    } ~
    path("ad_accounts" / adAccountIdPattern / "order_lines") { (adAccountId) => 
      get { 
        parameters("bookmark".as[String].?, "page_size".as[Int].?(25), "order".as[String].?) { (bookmark, pageSize, order) => 
            orderLinesService.orderLinesList(adAccountId = adAccountId, bookmark = bookmark, pageSize = pageSize, order = order)
        }
      }
    }
}

object OrderLinesApiPatterns {

    val orderLineIdPattern: PathMatcher1[String] = PathMatcher("""^\\d+$""".r)
val adAccountIdPattern: PathMatcher1[String] = PathMatcher("""^\\d+$""".r)
}

trait OrderLinesApiService {

  def orderLinesGet200(responseOrderLine: OrderLine)(implicit toEntityMarshallerOrderLine: ToEntityMarshaller[OrderLine]): Route =
    complete((200, responseOrderLine))
  def orderLinesGet400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def orderLinesGet401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def orderLinesGet403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def orderLinesGet404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def orderLinesGet429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def orderLinesGetDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: OrderLine
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def orderLinesGet(orderLineId: String, adAccountId: String)
      (implicit toEntityMarshallerError: ToEntityMarshaller[Error], toEntityMarshallerOrderLine: ToEntityMarshaller[OrderLine]): Route

  def orderLinesList200(responseOrderLinesList200Response: OrderLinesList200Response)(implicit toEntityMarshallerOrderLinesList200Response: ToEntityMarshaller[OrderLinesList200Response]): Route =
    complete((200, responseOrderLinesList200Response))
  def orderLinesList400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def orderLinesList401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def orderLinesList403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def orderLinesList404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def orderLinesList429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def orderLinesListDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: OrderLinesList200Response
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def orderLinesList(adAccountId: String, bookmark: Option[String], pageSize: Int, order: Option[String])
      (implicit toEntityMarshallerOrderLinesList200Response: ToEntityMarshaller[OrderLinesList200Response], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

}

trait OrderLinesApiMarshaller {


  implicit def toEntityMarshallerOrderLinesList200Response: ToEntityMarshaller[OrderLinesList200Response]

  implicit def toEntityMarshallerError: ToEntityMarshaller[Error]

  implicit def toEntityMarshallerOrderLine: ToEntityMarshaller[OrderLine]

}

