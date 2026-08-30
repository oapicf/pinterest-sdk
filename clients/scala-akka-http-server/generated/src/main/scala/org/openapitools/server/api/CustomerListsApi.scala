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
import org.openapitools.server.model.CustomerListCreate
import org.openapitools.server.model.CustomerListUpdateWithRequiredBody
import org.openapitools.server.model.CustomerListsList200Response
import org.openapitools.server.model.Error
import org.openapitools.server.model.PaginationOrder


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
            entity(as[CustomerListCreate]){ customerListCreate =>
              customerListsService.customerListsCreate(adAccountId = adAccountId, customerListCreate = customerListCreate)
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
        parameters("bookmark".as[String].?, "page_size".as[Int].?(25), "order".as[String].?, "exclude_nca".as[Boolean].?(false)) { (bookmark, pageSize, order, excludeNca) => 
            customerListsService.customerListsList(adAccountId = adAccountId, bookmark = bookmark, pageSize = pageSize, order = order, excludeNca = excludeNca)
        }
      }
    } ~
    path("ad_accounts" / adAccountIdPattern / "customer_lists" / customerListIdPattern) { (adAccountId, customerListId) => 
      patch {  
            entity(as[CustomerListUpdateWithRequiredBody]){ customerListUpdateWithRequiredBody =>
              customerListsService.customerListsUpdate(adAccountId = adAccountId, customerListId = customerListId, customerListUpdateWithRequiredBody = customerListUpdateWithRequiredBody)
            }
      }
    }
}

object CustomerListsApiPatterns {

    val customerListIdPattern: PathMatcher1[String] = PathMatcher("""^\\d+$""".r)
val adAccountIdPattern: PathMatcher1[String] = PathMatcher("""^\\d+$""".r)
}

trait CustomerListsApiService {

  def customerListsCreate200(responseCustomerList: CustomerList)(implicit toEntityMarshallerCustomerList: ToEntityMarshaller[CustomerList]): Route =
    complete((200, responseCustomerList))
  def customerListsCreate201(responseCustomerList: CustomerList)(implicit toEntityMarshallerCustomerList: ToEntityMarshaller[CustomerList]): Route =
    complete((201, responseCustomerList))
  def customerListsCreate400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def customerListsCreate401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def customerListsCreate403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def customerListsCreate404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def customerListsCreate429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def customerListsCreateDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: CustomerList
   * Code: 201, Message: Resource create operation completed successfully., DataType: CustomerList
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def customerListsCreate(adAccountId: String, customerListCreate: CustomerListCreate)
      (implicit toEntityMarshallerCustomerList: ToEntityMarshaller[CustomerList], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def customerListsGet200(responseCustomerList: CustomerList)(implicit toEntityMarshallerCustomerList: ToEntityMarshaller[CustomerList]): Route =
    complete((200, responseCustomerList))
  def customerListsGet400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def customerListsGet401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def customerListsGet403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def customerListsGet404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def customerListsGet429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def customerListsGetDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: CustomerList
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def customerListsGet(adAccountId: String, customerListId: String)
      (implicit toEntityMarshallerCustomerList: ToEntityMarshaller[CustomerList], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def customerListsList200(responseCustomerListsList200Response: CustomerListsList200Response)(implicit toEntityMarshallerCustomerListsList200Response: ToEntityMarshaller[CustomerListsList200Response]): Route =
    complete((200, responseCustomerListsList200Response))
  def customerListsList400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def customerListsList401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def customerListsList403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def customerListsList404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def customerListsList429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def customerListsListDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: CustomerListsList200Response
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def customerListsList(adAccountId: String, bookmark: Option[String], pageSize: Int, order: Option[String], excludeNca: Boolean)
      (implicit toEntityMarshallerCustomerListsList200Response: ToEntityMarshaller[CustomerListsList200Response], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def customerListsUpdate200(responseCustomerList: CustomerList)(implicit toEntityMarshallerCustomerList: ToEntityMarshaller[CustomerList]): Route =
    complete((200, responseCustomerList))
  def customerListsUpdate400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def customerListsUpdate401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def customerListsUpdate403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def customerListsUpdate404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def customerListsUpdate429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def customerListsUpdateDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: CustomerList
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def customerListsUpdate(adAccountId: String, customerListId: String, customerListUpdateWithRequiredBody: CustomerListUpdateWithRequiredBody)
      (implicit toEntityMarshallerCustomerList: ToEntityMarshaller[CustomerList], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

}

trait CustomerListsApiMarshaller {
  implicit def fromEntityUnmarshallerCustomerListUpdateWithRequiredBody: FromEntityUnmarshaller[CustomerListUpdateWithRequiredBody]

  implicit def fromEntityUnmarshallerCustomerListCreate: FromEntityUnmarshaller[CustomerListCreate]



  implicit def toEntityMarshallerCustomerListsList200Response: ToEntityMarshaller[CustomerListsList200Response]

  implicit def toEntityMarshallerCustomerList: ToEntityMarshaller[CustomerList]

  implicit def toEntityMarshallerError: ToEntityMarshaller[Error]

}

