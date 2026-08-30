package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.server.{PathMatcher, PathMatcher1}
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller
import akka.http.scaladsl.unmarshalling.FromStringUnmarshaller
import org.openapitools.server.AkkaHttpHelper._
import org.openapitools.server.model.CustomerSegment
import org.openapitools.server.model.CustomerSegmentCreate
import org.openapitools.server.model.CustomerSegmentList200Response
import org.openapitools.server.model.CustomerSegmentUpdateRequestUpdateWithRequiredBody
import org.openapitools.server.model.Error
import org.openapitools.server.model.PaginationOrder


class CustomerSegmentApi(
    customerSegmentService: CustomerSegmentApiService,
    customerSegmentMarshaller: CustomerSegmentApiMarshaller
) {

  import CustomerSegmentApiPatterns.adAccountIdPattern

  import customerSegmentMarshaller._

  lazy val route: Route =
    path("ad_accounts" / adAccountIdPattern / "customer_segments") { (adAccountId) => 
      post {  
            entity(as[CustomerSegmentCreate]){ customerSegmentCreate =>
              customerSegmentService.customerSegmentCreate(adAccountId = adAccountId, customerSegmentCreate = customerSegmentCreate)
            }
      }
    } ~
    path("ad_accounts" / adAccountIdPattern / "customer_segments") { (adAccountId) => 
      get { 
        parameters("bookmark".as[String].?, "page_size".as[Int].?(25), "order".as[String].?, "include_sizing".as[Boolean].?(false), "search_query".as[String].?) { (bookmark, pageSize, order, includeSizing, searchQuery) => 
            customerSegmentService.customerSegmentList(adAccountId = adAccountId, bookmark = bookmark, pageSize = pageSize, order = order, includeSizing = includeSizing, searchQuery = searchQuery)
        }
      }
    } ~
    path("ad_accounts" / adAccountIdPattern / "customer_segments") { (adAccountId) => 
      patch {  
            entity(as[CustomerSegmentUpdateRequestUpdateWithRequiredBody]){ customerSegmentUpdateRequestUpdateWithRequiredBody =>
              customerSegmentService.customerSegmentUpdate(adAccountId = adAccountId, customerSegmentUpdateRequestUpdateWithRequiredBody = customerSegmentUpdateRequestUpdateWithRequiredBody)
            }
      }
    }
}

object CustomerSegmentApiPatterns {

    val adAccountIdPattern: PathMatcher1[String] = PathMatcher("""^\\d+$""".r)
}

trait CustomerSegmentApiService {

  def customerSegmentCreate200(responseCustomerSegment: CustomerSegment)(implicit toEntityMarshallerCustomerSegment: ToEntityMarshaller[CustomerSegment]): Route =
    complete((200, responseCustomerSegment))
  def customerSegmentCreate201(responseCustomerSegment: CustomerSegment)(implicit toEntityMarshallerCustomerSegment: ToEntityMarshaller[CustomerSegment]): Route =
    complete((201, responseCustomerSegment))
  def customerSegmentCreate400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def customerSegmentCreate401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def customerSegmentCreate403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def customerSegmentCreate404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def customerSegmentCreate429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def customerSegmentCreateDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: CustomerSegment
   * Code: 201, Message: Resource create operation completed successfully., DataType: CustomerSegment
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def customerSegmentCreate(adAccountId: String, customerSegmentCreate: CustomerSegmentCreate)
      (implicit toEntityMarshallerError: ToEntityMarshaller[Error], toEntityMarshallerCustomerSegment: ToEntityMarshaller[CustomerSegment]): Route

  def customerSegmentList200(responseCustomerSegmentList200Response: CustomerSegmentList200Response)(implicit toEntityMarshallerCustomerSegmentList200Response: ToEntityMarshaller[CustomerSegmentList200Response]): Route =
    complete((200, responseCustomerSegmentList200Response))
  def customerSegmentList400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def customerSegmentList401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def customerSegmentList403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def customerSegmentList404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def customerSegmentList429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def customerSegmentListDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: CustomerSegmentList200Response
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def customerSegmentList(adAccountId: String, bookmark: Option[String], pageSize: Int, order: Option[String], includeSizing: Boolean, searchQuery: Option[String])
      (implicit toEntityMarshallerCustomerSegmentList200Response: ToEntityMarshaller[CustomerSegmentList200Response], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def customerSegmentUpdate200: Route =
    complete((200, "The request has succeeded."))
  def customerSegmentUpdate400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def customerSegmentUpdate401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def customerSegmentUpdate403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def customerSegmentUpdate404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def customerSegmentUpdate429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def customerSegmentUpdateDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded.
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def customerSegmentUpdate(adAccountId: String, customerSegmentUpdateRequestUpdateWithRequiredBody: CustomerSegmentUpdateRequestUpdateWithRequiredBody)
      (implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route

}

trait CustomerSegmentApiMarshaller {
  implicit def fromEntityUnmarshallerCustomerSegmentUpdateRequestUpdateWithRequiredBody: FromEntityUnmarshaller[CustomerSegmentUpdateRequestUpdateWithRequiredBody]

  implicit def fromEntityUnmarshallerCustomerSegmentCreate: FromEntityUnmarshaller[CustomerSegmentCreate]



  implicit def toEntityMarshallerCustomerSegmentList200Response: ToEntityMarshaller[CustomerSegmentList200Response]

  implicit def toEntityMarshallerError: ToEntityMarshaller[Error]

  implicit def toEntityMarshallerCustomerSegment: ToEntityMarshaller[CustomerSegment]

}

