package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller
import akka.http.scaladsl.unmarshalling.FromStringUnmarshaller
import org.openapitools.server.AkkaHttpHelper._
import org.openapitools.server.model.Error
import org.openapitools.server.model.PinsList200Response
import org.openapitools.server.model.SearchPartnerPins200Response
import org.openapitools.server.model.SearchUserBoardsGet200Response


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
        parameters("ad_account_id".as[String].?, "bookmark".as[String].?, "page_size".as[Int].?(25), "query".as[String].?) { (adAccountId, bookmark, pageSize, query) => 
            searchService.searchUserBoardsGet(adAccountId = adAccountId, bookmark = bookmark, pageSize = pageSize, query = query)
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
  def searchPartnerPinsDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: SearchPartnerPins200Response
   * Code: 400, Message: Invalid pins, DataType: Error
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def searchPartnerPins(term: String, countryCode: String, bookmark: Option[String], locale: Option[String], limit: Int)
      (implicit toEntityMarshallerSearchPartnerPins200Response: ToEntityMarshaller[SearchPartnerPins200Response], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def searchUserBoardsGet200(responseSearchUserBoardsGet200Response: SearchUserBoardsGet200Response)(implicit toEntityMarshallerSearchUserBoardsGet200Response: ToEntityMarshaller[SearchUserBoardsGet200Response]): Route =
    complete((200, responseSearchUserBoardsGet200Response))
  def searchUserBoardsGetDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: response, DataType: SearchUserBoardsGet200Response
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def searchUserBoardsGet(adAccountId: Option[String], bookmark: Option[String], pageSize: Int, query: Option[String])
      (implicit toEntityMarshallerSearchUserBoardsGet200Response: ToEntityMarshaller[SearchUserBoardsGet200Response], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def searchUserPinsList200(responsePinsList200Response: PinsList200Response)(implicit toEntityMarshallerPinsList200Response: ToEntityMarshaller[PinsList200Response]): Route =
    complete((200, responsePinsList200Response))
  def searchUserPinsList404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def searchUserPinsListDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: PinsList200Response
   * Code: 404, Message: User not found, DataType: Error
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def searchUserPinsList(query: String, adAccountId: Option[String], bookmark: Option[String])
      (implicit toEntityMarshallerPinsList200Response: ToEntityMarshaller[PinsList200Response], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

}

trait SearchApiMarshaller {


  implicit def toEntityMarshallerSearchUserBoardsGet200Response: ToEntityMarshaller[SearchUserBoardsGet200Response]

  implicit def toEntityMarshallerPinsList200Response: ToEntityMarshaller[PinsList200Response]

  implicit def toEntityMarshallerSearchPartnerPins200Response: ToEntityMarshaller[SearchPartnerPins200Response]

  implicit def toEntityMarshallerError: ToEntityMarshaller[Error]

}

