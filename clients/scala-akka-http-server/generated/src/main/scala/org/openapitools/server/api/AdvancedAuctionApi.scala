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
  def advancedAuctionItemsGetPost500(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((500, responseError))
  def advancedAuctionItemsGetPostDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Response containing the bid option values for the requested retail catalog items. Items that don&#39;t exist or do not have bid options set won&#39;t be present in the response., DataType: AdvancedAuctionItems
   * Code: 400, Message: Invalid request parameters., DataType: Error
   * Code: 401, Message: Not authenticated to get item bid options, DataType: Error
   * Code: 403, Message: Not authorized to get item bid options, DataType: Error
   * Code: 500, Message: Internal error, DataType: Error
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def advancedAuctionItemsGetPost(advancedAuctionItemsGetRequest: AdvancedAuctionItemsGetRequest, adAccountId: Option[String])
      (implicit toEntityMarshallerAdvancedAuctionItems: ToEntityMarshaller[AdvancedAuctionItems], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def advancedAuctionItemsSubmitPost200(responseAdvancedAuctionProcessedItems: AdvancedAuctionProcessedItems)(implicit toEntityMarshallerAdvancedAuctionProcessedItems: ToEntityMarshaller[AdvancedAuctionProcessedItems]): Route =
    complete((200, responseAdvancedAuctionProcessedItems))
  def advancedAuctionItemsSubmitPost400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def advancedAuctionItemsSubmitPost401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def advancedAuctionItemsSubmitPost403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def advancedAuctionItemsSubmitPost500(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((500, responseError))
  def advancedAuctionItemsSubmitPostDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Response containing the results of the item bid options operations, DataType: AdvancedAuctionProcessedItems
   * Code: 400, Message: Invalid request parameters., DataType: Error
   * Code: 401, Message: Not authenticated to post item bid options, DataType: Error
   * Code: 403, Message: Not authorized to post item bid options, DataType: Error
   * Code: 500, Message: Internal error, DataType: Error
   * Code: 0, Message: Unexpected error, DataType: Error
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

