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


class OrderLinesApi(
    orderLinesService: OrderLinesApiService,
    orderLinesMarshaller: OrderLinesApiMarshaller
) {

  import OrderLinesApiPatterns.orderLineIdPattern
import OrderLinesApiPatterns.adAccountIdPattern

  import orderLinesMarshaller._

  lazy val route: Route =
    path("ad_accounts" / adAccountIdPattern / "order_lines" / orderLineIdPattern) { (adAccountId, orderLineId) => 
      get {  
            orderLinesService.orderLinesGet(adAccountId = adAccountId, orderLineId = orderLineId)
      }
    } ~
    path("ad_accounts" / adAccountIdPattern / "order_lines") { (adAccountId) => 
      get { 
        parameters("page_size".as[Int].?(25), "order".as[String].?, "bookmark".as[String].?) { (pageSize, order, bookmark) => 
            orderLinesService.orderLinesList(adAccountId = adAccountId, pageSize = pageSize, order = order, bookmark = bookmark)
        }
      }
    }
}

object OrderLinesApiPatterns {

    val orderLineIdPattern: PathMatcher1[String] = PathMatcher("^\\d+$".r)
val adAccountIdPattern: PathMatcher1[String] = PathMatcher("^\\d+$".r)
}

trait OrderLinesApiService {

  def orderLinesGet200(responseOrderLine: OrderLine)(implicit toEntityMarshallerOrderLine: ToEntityMarshaller[OrderLine]): Route =
    complete((200, responseOrderLine))
  def orderLinesGetDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: OrderLine
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def orderLinesGet(adAccountId: String, orderLineId: String)
      (implicit toEntityMarshallerError: ToEntityMarshaller[Error], toEntityMarshallerOrderLine: ToEntityMarshaller[OrderLine]): Route

  def orderLinesList200(responseOrderLinesList200Response: OrderLinesList200Response)(implicit toEntityMarshallerOrderLinesList200Response: ToEntityMarshaller[OrderLinesList200Response]): Route =
    complete((200, responseOrderLinesList200Response))
  def orderLinesListDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: OrderLinesList200Response
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def orderLinesList(adAccountId: String, pageSize: Int, order: Option[String], bookmark: Option[String])
      (implicit toEntityMarshallerOrderLinesList200Response: ToEntityMarshaller[OrderLinesList200Response], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

}

trait OrderLinesApiMarshaller {


  implicit def toEntityMarshallerOrderLinesList200Response: ToEntityMarshaller[OrderLinesList200Response]

  implicit def toEntityMarshallerError: ToEntityMarshaller[Error]

  implicit def toEntityMarshallerOrderLine: ToEntityMarshaller[OrderLine]

}

