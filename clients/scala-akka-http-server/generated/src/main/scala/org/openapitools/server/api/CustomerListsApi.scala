package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.server.{PathMatcher, PathMatcher1}
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller
import akka.http.scaladsl.unmarshalling.FromStringUnmarshaller
import org.openapitools.server.AkkaHttpHelper._
import org.openapitools.server.model.CustomerList
import org.openapitools.server.model.CustomerListRequest
import org.openapitools.server.model.CustomerListUpdateRequest
import org.openapitools.server.model.CustomerListsList200Response
import org.openapitools.server.model.Error


class CustomerListsApi(
    customerListsService: CustomerListsApiService,
    customerListsMarshaller: CustomerListsApiMarshaller
) {

  import CustomerListsApiPatterns.customerListIdPattern
import CustomerListsApiPatterns.adAccountIdPattern

  import customerListsMarshaller._

  lazy val route: Route =
    path("ad_accounts" / adAccountIdPattern / "customer_lists") { (adAccountId) => 
      post {  
            entity(as[CustomerListRequest]){ customerListRequest =>
              customerListsService.customerListsCreate(adAccountId = adAccountId, customerListRequest = customerListRequest)
            }
      }
    } ~
    path("ad_accounts" / adAccountIdPattern / "customer_lists" / customerListIdPattern) { (adAccountId, customerListId) => 
      get {  
            customerListsService.customerListsGet(adAccountId = adAccountId, customerListId = customerListId)
      }
    } ~
    path("ad_accounts" / adAccountIdPattern / "customer_lists") { (adAccountId) => 
      get { 
        parameters("page_size".as[Int].?(25), "order".as[String].?, "bookmark".as[String].?) { (pageSize, order, bookmark) => 
            customerListsService.customerListsList(adAccountId = adAccountId, pageSize = pageSize, order = order, bookmark = bookmark)
        }
      }
    } ~
    path("ad_accounts" / adAccountIdPattern / "customer_lists" / customerListIdPattern) { (adAccountId, customerListId) => 
      patch {  
            entity(as[CustomerListUpdateRequest]){ customerListUpdateRequest =>
              customerListsService.customerListsUpdate(adAccountId = adAccountId, customerListId = customerListId, customerListUpdateRequest = customerListUpdateRequest)
            }
      }
    }
}

object CustomerListsApiPatterns {

    val customerListIdPattern: PathMatcher1[String] = PathMatcher("^\\d+$".r)
val adAccountIdPattern: PathMatcher1[String] = PathMatcher("^\\d+$".r)
}

trait CustomerListsApiService {

  def customerListsCreate200(responseCustomerList: CustomerList)(implicit toEntityMarshallerCustomerList: ToEntityMarshaller[CustomerList]): Route =
    complete((200, responseCustomerList))
  def customerListsCreateDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: CustomerList
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def customerListsCreate(adAccountId: String, customerListRequest: CustomerListRequest)
      (implicit toEntityMarshallerCustomerList: ToEntityMarshaller[CustomerList], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def customerListsGet200(responseCustomerList: CustomerList)(implicit toEntityMarshallerCustomerList: ToEntityMarshaller[CustomerList]): Route =
    complete((200, responseCustomerList))
  def customerListsGetDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: CustomerList
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def customerListsGet(adAccountId: String, customerListId: String)
      (implicit toEntityMarshallerCustomerList: ToEntityMarshaller[CustomerList], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def customerListsList200(responseCustomerListsList200Response: CustomerListsList200Response)(implicit toEntityMarshallerCustomerListsList200Response: ToEntityMarshaller[CustomerListsList200Response]): Route =
    complete((200, responseCustomerListsList200Response))
  def customerListsListDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: CustomerListsList200Response
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def customerListsList(adAccountId: String, pageSize: Int, order: Option[String], bookmark: Option[String])
      (implicit toEntityMarshallerCustomerListsList200Response: ToEntityMarshaller[CustomerListsList200Response], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def customerListsUpdate200(responseCustomerList: CustomerList)(implicit toEntityMarshallerCustomerList: ToEntityMarshaller[CustomerList]): Route =
    complete((200, responseCustomerList))
  def customerListsUpdateDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: CustomerList
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def customerListsUpdate(adAccountId: String, customerListId: String, customerListUpdateRequest: CustomerListUpdateRequest)
      (implicit toEntityMarshallerCustomerList: ToEntityMarshaller[CustomerList], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

}

trait CustomerListsApiMarshaller {
  implicit def fromEntityUnmarshallerCustomerListRequest: FromEntityUnmarshaller[CustomerListRequest]

  implicit def fromEntityUnmarshallerCustomerListUpdateRequest: FromEntityUnmarshaller[CustomerListUpdateRequest]



  implicit def toEntityMarshallerCustomerListsList200Response: ToEntityMarshaller[CustomerListsList200Response]

  implicit def toEntityMarshallerCustomerList: ToEntityMarshaller[CustomerList]

  implicit def toEntityMarshallerError: ToEntityMarshaller[Error]

}

