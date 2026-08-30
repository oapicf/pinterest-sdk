package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller
import akka.http.scaladsl.unmarshalling.FromStringUnmarshaller
import org.openapitools.server.AkkaHttpHelper._
import org.openapitools.server.model.BoardsList200Response
import org.openapitools.server.model.Error
import org.openapitools.server.model.PinsList200Response
import org.openapitools.server.model.SearchPartnerPins200Response


class SearchApi(
    searchService: SearchApiService,
    searchMarshaller: SearchApiMarshaller
) {

  
  import searchMarshaller._

  lazy val route: Route =
    path("search" / "partner" / "pins") { 
      get { 
        parameters("term".as[String], "country_code".as[String], "bookmark".as[String].?, "locale".as[String].?, "limit".as[Int].?(10)) { (term, countryCode, bookmark, locale, limit) => 
            searchService.searchPartnerPins(term = term, countryCode = countryCode, bookmark = bookmark, locale = locale, limit = limit)
        }
      }
    } ~
    path("search" / "boards") { 
      get { 
        parameters("ad_account_id".as[String].?, "query".as[String].?, "bookmark".as[String].?, "page_size".as[Int].?(25)) { (adAccountId, query, bookmark, pageSize) => 
            searchService.searchUserBoardsGet(adAccountId = adAccountId, query = query, bookmark = bookmark, pageSize = pageSize)
        }
      }
    } ~
    path("search" / "pins") { 
      get { 
        parameters("ad_account_id".as[String].?, "query".as[String], "bookmark".as[String].?) { (adAccountId, query, bookmark) => 
            searchService.searchUserPinsList(query = query, adAccountId = adAccountId, bookmark = bookmark)
        }
      }
    }
}


trait SearchApiService {

  def searchPartnerPins200(responseSearchPartnerPins200Response: SearchPartnerPins200Response)(implicit toEntityMarshallerSearchPartnerPins200Response: ToEntityMarshaller[SearchPartnerPins200Response]): Route =
    complete((200, responseSearchPartnerPins200Response))
  def searchPartnerPins400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def searchPartnerPins401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def searchPartnerPins403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def searchPartnerPins404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def searchPartnerPins429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def searchPartnerPinsDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: SearchPartnerPins200Response
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def searchPartnerPins(term: String, countryCode: String, bookmark: Option[String], locale: Option[String], limit: Int)
      (implicit toEntityMarshallerSearchPartnerPins200Response: ToEntityMarshaller[SearchPartnerPins200Response], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def searchUserBoardsGet200(responseBoardsList200Response: BoardsList200Response)(implicit toEntityMarshallerBoardsList200Response: ToEntityMarshaller[BoardsList200Response]): Route =
    complete((200, responseBoardsList200Response))
  def searchUserBoardsGet400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def searchUserBoardsGet401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def searchUserBoardsGet403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def searchUserBoardsGet404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def searchUserBoardsGet429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def searchUserBoardsGetDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: BoardsList200Response
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def searchUserBoardsGet(adAccountId: Option[String], query: Option[String], bookmark: Option[String], pageSize: Int)
      (implicit toEntityMarshallerBoardsList200Response: ToEntityMarshaller[BoardsList200Response], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def searchUserPinsList200(responsePinsList200Response: PinsList200Response)(implicit toEntityMarshallerPinsList200Response: ToEntityMarshaller[PinsList200Response]): Route =
    complete((200, responsePinsList200Response))
  def searchUserPinsList400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def searchUserPinsList401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def searchUserPinsList403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def searchUserPinsList404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def searchUserPinsList429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def searchUserPinsListDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: PinsList200Response
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def searchUserPinsList(query: String, adAccountId: Option[String], bookmark: Option[String])
      (implicit toEntityMarshallerPinsList200Response: ToEntityMarshaller[PinsList200Response], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

}

trait SearchApiMarshaller {


  implicit def toEntityMarshallerBoardsList200Response: ToEntityMarshaller[BoardsList200Response]

  implicit def toEntityMarshallerPinsList200Response: ToEntityMarshaller[PinsList200Response]

  implicit def toEntityMarshallerSearchPartnerPins200Response: ToEntityMarshaller[SearchPartnerPins200Response]

  implicit def toEntityMarshallerError: ToEntityMarshaller[Error]

}

