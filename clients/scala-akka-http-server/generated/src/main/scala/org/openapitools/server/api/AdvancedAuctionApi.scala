package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller
import akka.http.scaladsl.unmarshalling.FromStringUnmarshaller
import org.openapitools.server.AkkaHttpHelper._
import org.openapitools.server.model.AdvancedAuctionItems
import org.openapitools.server.model.AdvancedAuctionItemsGetRequest
import org.openapitools.server.model.AdvancedAuctionItemsSubmitRequest
import org.openapitools.server.model.AdvancedAuctionProcessedItems
import org.openapitools.server.model.Error


class AdvancedAuctionApi(
    advancedAuctionService: AdvancedAuctionApiService,
    advancedAuctionMarshaller: AdvancedAuctionApiMarshaller
) {

  
  import advancedAuctionMarshaller._

  lazy val route: Route =
    path("advanced_auction" / "items" / "get") { 
      post { 
        parameters("ad_account_id".as[String].?) { (adAccountId) => 
            entity(as[AdvancedAuctionItemsGetRequest]){ advancedAuctionItemsGetRequest =>
              advancedAuctionService.advancedAuctionItemsGetPost(advancedAuctionItemsGetRequest = advancedAuctionItemsGetRequest, adAccountId = adAccountId)
            }
        }
      }
    } ~
    path("advanced_auction" / "items" / "submit") { 
      post { 
        parameters("ad_account_id".as[String].?) { (adAccountId) => 
            entity(as[AdvancedAuctionItemsSubmitRequest]){ advancedAuctionItemsSubmitRequest =>
              advancedAuctionService.advancedAuctionItemsSubmitPost(advancedAuctionItemsSubmitRequest = advancedAuctionItemsSubmitRequest, adAccountId = adAccountId)
            }
        }
      }
    }
}


trait AdvancedAuctionApiService {

  def advancedAuctionItemsGetPost200(responseAdvancedAuctionItems: AdvancedAuctionItems)(implicit toEntityMarshallerAdvancedAuctionItems: ToEntityMarshaller[AdvancedAuctionItems]): Route =
    complete((200, responseAdvancedAuctionItems))
  def advancedAuctionItemsGetPost400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def advancedAuctionItemsGetPost401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def advancedAuctionItemsGetPost403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def advancedAuctionItemsGetPost404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def advancedAuctionItemsGetPost429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def advancedAuctionItemsGetPost500(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((500, responseError))
  def advancedAuctionItemsGetPostDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: AdvancedAuctionItems
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 500, Message: The server encountered an unexpected condition that prevented it from fulfilling the request., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def advancedAuctionItemsGetPost(advancedAuctionItemsGetRequest: AdvancedAuctionItemsGetRequest, adAccountId: Option[String])
      (implicit toEntityMarshallerAdvancedAuctionItems: ToEntityMarshaller[AdvancedAuctionItems], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def advancedAuctionItemsSubmitPost200(responseAdvancedAuctionProcessedItems: AdvancedAuctionProcessedItems)(implicit toEntityMarshallerAdvancedAuctionProcessedItems: ToEntityMarshaller[AdvancedAuctionProcessedItems]): Route =
    complete((200, responseAdvancedAuctionProcessedItems))
  def advancedAuctionItemsSubmitPost206(responseAdvancedAuctionProcessedItems: AdvancedAuctionProcessedItems)(implicit toEntityMarshallerAdvancedAuctionProcessedItems: ToEntityMarshaller[AdvancedAuctionProcessedItems]): Route =
    complete((206, responseAdvancedAuctionProcessedItems))
  def advancedAuctionItemsSubmitPost400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def advancedAuctionItemsSubmitPost401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def advancedAuctionItemsSubmitPost403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def advancedAuctionItemsSubmitPost404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def advancedAuctionItemsSubmitPost429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def advancedAuctionItemsSubmitPost500(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((500, responseError))
  def advancedAuctionItemsSubmitPostDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: AdvancedAuctionProcessedItems
   * Code: 206, Message: Successful, DataType: AdvancedAuctionProcessedItems
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 500, Message: The server encountered an unexpected condition that prevented it from fulfilling the request., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def advancedAuctionItemsSubmitPost(advancedAuctionItemsSubmitRequest: AdvancedAuctionItemsSubmitRequest, adAccountId: Option[String])
      (implicit toEntityMarshallerAdvancedAuctionProcessedItems: ToEntityMarshaller[AdvancedAuctionProcessedItems], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

}

trait AdvancedAuctionApiMarshaller {
  implicit def fromEntityUnmarshallerAdvancedAuctionItemsSubmitRequest: FromEntityUnmarshaller[AdvancedAuctionItemsSubmitRequest]

  implicit def fromEntityUnmarshallerAdvancedAuctionItemsGetRequest: FromEntityUnmarshaller[AdvancedAuctionItemsGetRequest]



  implicit def toEntityMarshallerAdvancedAuctionProcessedItems: ToEntityMarshaller[AdvancedAuctionProcessedItems]

  implicit def toEntityMarshallerAdvancedAuctionItems: ToEntityMarshaller[AdvancedAuctionItems]

  implicit def toEntityMarshallerError: ToEntityMarshaller[Error]

}

