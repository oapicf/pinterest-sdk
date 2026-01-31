package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.server.{PathMatcher, PathMatcher1}
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller
import akka.http.scaladsl.unmarshalling.FromStringUnmarshaller
import org.openapitools.server.AkkaHttpHelper._
import org.openapitools.server.model.CustomerListUploadCreateRequest
import org.openapitools.server.model.CustomerListUploadCreateResponse
import org.openapitools.server.model.CustomerListUploadResponse
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

    val customerListIdPattern: PathMatcher1[String] = PathMatcher("^\\d+$".r)
val adAccountIdPattern: PathMatcher1[String] = PathMatcher("^\\d+$".r)
val customerListUploadIdPattern: PathMatcher1[String] = PathMatcher("^\\d+$".r)
}

trait CustomerListUploadsApiService {

  def customerListUploadsCreate200(responseCustomerListUploadCreateResponse: CustomerListUploadCreateResponse)(implicit toEntityMarshallerCustomerListUploadCreateResponse: ToEntityMarshaller[CustomerListUploadCreateResponse]): Route =
    complete((200, responseCustomerListUploadCreateResponse))
  def customerListUploadsCreateDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: CustomerListUploadCreateResponse
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def customerListUploadsCreate(adAccountId: String, customerListId: String, customerListUploadCreateRequest: CustomerListUploadCreateRequest)
      (implicit toEntityMarshallerError: ToEntityMarshaller[Error], toEntityMarshallerCustomerListUploadCreateResponse: ToEntityMarshaller[CustomerListUploadCreateResponse]): Route

  def customerListUploadsGet200(responseCustomerListUploadResponse: CustomerListUploadResponse)(implicit toEntityMarshallerCustomerListUploadResponse: ToEntityMarshaller[CustomerListUploadResponse]): Route =
    complete((200, responseCustomerListUploadResponse))
  def customerListUploadsGetDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: CustomerListUploadResponse
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def customerListUploadsGet(adAccountId: String, customerListId: String, customerListUploadId: String)
      (implicit toEntityMarshallerCustomerListUploadResponse: ToEntityMarshaller[CustomerListUploadResponse], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def customerListUploadsRun200(responseCustomerListUploadResponse: CustomerListUploadResponse)(implicit toEntityMarshallerCustomerListUploadResponse: ToEntityMarshaller[CustomerListUploadResponse]): Route =
    complete((200, responseCustomerListUploadResponse))
  def customerListUploadsRunDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: CustomerListUploadResponse
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def customerListUploadsRun(adAccountId: String, customerListId: String, customerListUploadId: String)
      (implicit toEntityMarshallerCustomerListUploadResponse: ToEntityMarshaller[CustomerListUploadResponse], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

}

trait CustomerListUploadsApiMarshaller {
  implicit def fromEntityUnmarshallerCustomerListUploadCreateRequest: FromEntityUnmarshaller[CustomerListUploadCreateRequest]



  implicit def toEntityMarshallerError: ToEntityMarshaller[Error]

  implicit def toEntityMarshallerCustomerListUploadResponse: ToEntityMarshaller[CustomerListUploadResponse]

  implicit def toEntityMarshallerCustomerListUploadCreateResponse: ToEntityMarshaller[CustomerListUploadCreateResponse]

}

