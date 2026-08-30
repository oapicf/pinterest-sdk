package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.server.{PathMatcher, PathMatcher1}
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller
import akka.http.scaladsl.unmarshalling.FromStringUnmarshaller
import org.openapitools.server.AkkaHttpHelper._
import org.openapitools.server.model.CustomerListUpload
import org.openapitools.server.model.CustomerListUploadCreateRequest
import org.openapitools.server.model.CustomerListUploadCreateResponse
import org.openapitools.server.model.Error


class CustomerListUploadsApi(
    customerListUploadsService: CustomerListUploadsApiService,
    customerListUploadsMarshaller: CustomerListUploadsApiMarshaller
) {

  import CustomerListUploadsApiPatterns.customerListIdPattern
import CustomerListUploadsApiPatterns.adAccountIdPattern
import CustomerListUploadsApiPatterns.customerListUploadIdPattern

  import customerListUploadsMarshaller._

  lazy val route: Route =
    path("ad_accounts" / adAccountIdPattern / "customer_lists" / customerListIdPattern / "uploads") { (adAccountId, customerListId) => 
      post {  
            entity(as[CustomerListUploadCreateRequest]){ customerListUploadCreateRequest =>
              customerListUploadsService.customerListUploadsCreate(adAccountId = adAccountId, customerListId = customerListId, customerListUploadCreateRequest = customerListUploadCreateRequest)
            }
      }
    } ~
    path("ad_accounts" / adAccountIdPattern / "customer_lists" / customerListIdPattern / "uploads" / customerListUploadIdPattern) { (adAccountId, customerListId, customerListUploadId) => 
      get {  
            customerListUploadsService.customerListUploadsGet(adAccountId = adAccountId, customerListId = customerListId, customerListUploadId = customerListUploadId)
      }
    } ~
    path("ad_accounts" / adAccountIdPattern / "customer_lists" / customerListIdPattern / "uploads" / customerListUploadIdPattern / "run") { (adAccountId, customerListId, customerListUploadId) => 
      post {  
            customerListUploadsService.customerListUploadsRun(adAccountId = adAccountId, customerListId = customerListId, customerListUploadId = customerListUploadId)
      }
    }
}

object CustomerListUploadsApiPatterns {

    val customerListIdPattern: PathMatcher1[String] = PathMatcher("""^\\d+$""".r)
val adAccountIdPattern: PathMatcher1[String] = PathMatcher("""^\\d+$""".r)
val customerListUploadIdPattern: PathMatcher1[String] = PathMatcher("""^\\d+$""".r)
}

trait CustomerListUploadsApiService {

  def customerListUploadsCreate200(responseCustomerListUploadCreateResponse: CustomerListUploadCreateResponse)(implicit toEntityMarshallerCustomerListUploadCreateResponse: ToEntityMarshaller[CustomerListUploadCreateResponse]): Route =
    complete((200, responseCustomerListUploadCreateResponse))
  def customerListUploadsCreate400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def customerListUploadsCreate401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def customerListUploadsCreate403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def customerListUploadsCreate404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def customerListUploadsCreate429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def customerListUploadsCreateDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: CustomerListUploadCreateResponse
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def customerListUploadsCreate(adAccountId: String, customerListId: String, customerListUploadCreateRequest: CustomerListUploadCreateRequest)
      (implicit toEntityMarshallerError: ToEntityMarshaller[Error], toEntityMarshallerCustomerListUploadCreateResponse: ToEntityMarshaller[CustomerListUploadCreateResponse]): Route

  def customerListUploadsGet200(responseCustomerListUpload: CustomerListUpload)(implicit toEntityMarshallerCustomerListUpload: ToEntityMarshaller[CustomerListUpload]): Route =
    complete((200, responseCustomerListUpload))
  def customerListUploadsGet400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def customerListUploadsGet401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def customerListUploadsGet403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def customerListUploadsGet404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def customerListUploadsGet429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def customerListUploadsGetDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: CustomerListUpload
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def customerListUploadsGet(adAccountId: String, customerListId: String, customerListUploadId: String)
      (implicit toEntityMarshallerCustomerListUpload: ToEntityMarshaller[CustomerListUpload], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def customerListUploadsRun200(responseCustomerListUpload: CustomerListUpload)(implicit toEntityMarshallerCustomerListUpload: ToEntityMarshaller[CustomerListUpload]): Route =
    complete((200, responseCustomerListUpload))
  def customerListUploadsRun400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def customerListUploadsRun401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def customerListUploadsRun403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def customerListUploadsRun404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def customerListUploadsRun429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def customerListUploadsRunDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: CustomerListUpload
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def customerListUploadsRun(adAccountId: String, customerListId: String, customerListUploadId: String)
      (implicit toEntityMarshallerCustomerListUpload: ToEntityMarshaller[CustomerListUpload], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

}

trait CustomerListUploadsApiMarshaller {
  implicit def fromEntityUnmarshallerCustomerListUploadCreateRequest: FromEntityUnmarshaller[CustomerListUploadCreateRequest]



  implicit def toEntityMarshallerCustomerListUpload: ToEntityMarshaller[CustomerListUpload]

  implicit def toEntityMarshallerError: ToEntityMarshaller[Error]

  implicit def toEntityMarshallerCustomerListUploadCreateResponse: ToEntityMarshaller[CustomerListUploadCreateResponse]

}

