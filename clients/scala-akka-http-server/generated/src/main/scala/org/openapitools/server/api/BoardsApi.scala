package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.server.{PathMatcher, PathMatcher1}
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller
import akka.http.scaladsl.unmarshalling.FromStringUnmarshaller
import org.openapitools.server.AkkaHttpHelper._
import org.openapitools.server.model.Board
import org.openapitools.server.model.BoardCreate
import org.openapitools.server.model.BoardPrivacyFilter
import org.openapitools.server.model.BoardSection
import org.openapitools.server.model.BoardSectionCreate
import org.openapitools.server.model.BoardSectionUpdateWithRequiredBody
import org.openapitools.server.model.BoardSectionsList200Response
import org.openapitools.server.model.BoardWithUpdatePrivacy
import org.openapitools.server.model.BoardWithUpdatePrivacyUpdate
import org.openapitools.server.model.BoardsList200Response
import org.openapitools.server.model.BoardsListPins200Response
import org.openapitools.server.model.CreativeType
import org.openapitools.server.model.Error


class BoardsApi(
    boardsService: BoardsApiService,
    boardsMarshaller: BoardsApiMarshaller
) {

  import BoardsApiPatterns.boardIdPattern
import BoardsApiPatterns.sectionIdPattern

  import boardsMarshaller._

  lazy val route: Route =
    path("boards" / boardIdPattern / "sections") { (boardId) => 
      post { 
        parameters("ad_account_id".as[String].?) { (adAccountId) => 
            entity(as[BoardSectionCreate]){ boardSectionCreate =>
              boardsService.boardSectionsCreate(boardId = boardId, boardSectionCreate = boardSectionCreate, adAccountId = adAccountId)
            }
        }
      }
    } ~
    path("boards" / boardIdPattern / "sections" / sectionIdPattern) { (boardId, sectionId) => 
      delete { 
        parameters("ad_account_id".as[String].?) { (adAccountId) => 
            boardsService.boardSectionsDelete(boardId = boardId, sectionId = sectionId, adAccountId = adAccountId)
        }
      }
    } ~
    path("boards" / boardIdPattern / "sections") { (boardId) => 
      get { 
        parameters("ad_account_id".as[String].?, "bookmark".as[String].?, "page_size".as[Int].?(25)) { (adAccountId, bookmark, pageSize) => 
            boardsService.boardSectionsList(boardId = boardId, adAccountId = adAccountId, bookmark = bookmark, pageSize = pageSize)
        }
      }
    } ~
    path("boards" / boardIdPattern / "sections" / sectionIdPattern / "pins") { (boardId, sectionId) => 
      get { 
        parameters("ad_account_id".as[String].?, "bookmark".as[String].?, "page_size".as[Int].?(25)) { (adAccountId, bookmark, pageSize) => 
            boardsService.boardSectionsListPins(boardId = boardId, sectionId = sectionId, adAccountId = adAccountId, bookmark = bookmark, pageSize = pageSize)
        }
      }
    } ~
    path("boards" / boardIdPattern / "sections" / sectionIdPattern) { (boardId, sectionId) => 
      patch { 
        parameters("ad_account_id".as[String].?) { (adAccountId) => 
            entity(as[BoardSectionUpdateWithRequiredBody]){ boardSectionUpdateWithRequiredBody =>
              boardsService.boardSectionsUpdate(boardId = boardId, sectionId = sectionId, boardSectionUpdateWithRequiredBody = boardSectionUpdateWithRequiredBody, adAccountId = adAccountId)
            }
        }
      }
    } ~
    path("boards") { 
      post { 
        parameters("ad_account_id".as[String].?) { (adAccountId) => 
            entity(as[BoardCreate]){ boardCreate =>
              boardsService.boardsCreate(boardCreate = boardCreate, adAccountId = adAccountId)
            }
        }
      }
    } ~
    path("boards" / boardIdPattern) { (boardId) => 
      delete { 
        parameters("ad_account_id".as[String].?) { (adAccountId) => 
            boardsService.boardsDelete(boardId = boardId, adAccountId = adAccountId)
        }
      }
    } ~
    path("boards" / boardIdPattern) { (boardId) => 
      get { 
        parameters("ad_account_id".as[String].?) { (adAccountId) => 
            boardsService.boardsGet(boardId = boardId, adAccountId = adAccountId)
        }
      }
    } ~
    path("boards") { 
      get { 
        parameters("ad_account_id".as[String].?, "privacy".as[String].?, "bookmark".as[String].?, "page_size".as[Int].?(25)) { (adAccountId, privacy, bookmark, pageSize) => 
            boardsService.boardsList(adAccountId = adAccountId, privacy = privacy, bookmark = bookmark, pageSize = pageSize)
        }
      }
    } ~
    path("boards" / boardIdPattern / "pins") { (boardId) => 
      get { 
        parameters("creative_types".as[String].?, "ad_account_id".as[String].?, "pin_metrics".as[Boolean].?(false), "bookmark".as[String].?, "page_size".as[Int].?(25)) { (creativeTypes, adAccountId, pinMetrics, bookmark, pageSize) => 
            boardsService.boardsListPins(boardId = boardId, creativeTypes = creativeTypes, adAccountId = adAccountId, pinMetrics = pinMetrics, bookmark = bookmark, pageSize = pageSize)
        }
      }
    } ~
    path("boards" / boardIdPattern) { (boardId) => 
      patch { 
        parameters("ad_account_id".as[String].?) { (adAccountId) => 
            entity(as[BoardWithUpdatePrivacyUpdate]){ boardWithUpdatePrivacyUpdate =>
              boardsService.boardsUpdate(boardId = boardId, boardWithUpdatePrivacyUpdate = boardWithUpdatePrivacyUpdate, adAccountId = adAccountId)
            }
        }
      }
    }
}

object BoardsApiPatterns {

    val boardIdPattern: PathMatcher1[String] = PathMatcher("""^\\d+$""".r)
val sectionIdPattern: PathMatcher1[String] = PathMatcher("""^\\d+$""".r)
}

trait BoardsApiService {

  def boardSectionsCreate200(responseBoardSection: BoardSection)(implicit toEntityMarshallerBoardSection: ToEntityMarshaller[BoardSection]): Route =
    complete((200, responseBoardSection))
  def boardSectionsCreate201(responseBoardSection: BoardSection)(implicit toEntityMarshallerBoardSection: ToEntityMarshaller[BoardSection]): Route =
    complete((201, responseBoardSection))
  def boardSectionsCreate400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def boardSectionsCreate401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def boardSectionsCreate403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def boardSectionsCreate404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def boardSectionsCreate429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def boardSectionsCreateDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: BoardSection
   * Code: 201, Message: Resource create operation completed successfully., DataType: BoardSection
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def boardSectionsCreate(boardId: String, boardSectionCreate: BoardSectionCreate, adAccountId: Option[String])
      (implicit toEntityMarshallerBoardSection: ToEntityMarshaller[BoardSection], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def boardSectionsDelete200(responseBoardSection: BoardSection)(implicit toEntityMarshallerBoardSection: ToEntityMarshaller[BoardSection]): Route =
    complete((200, responseBoardSection))
  def boardSectionsDelete204: Route =
    complete((204, "Resource deleted successfully."))
  def boardSectionsDelete400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def boardSectionsDelete401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def boardSectionsDelete403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def boardSectionsDelete404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def boardSectionsDelete429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def boardSectionsDeleteDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: BoardSection
   * Code: 204, Message: Resource deleted successfully.
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def boardSectionsDelete(boardId: String, sectionId: String, adAccountId: Option[String])
      (implicit toEntityMarshallerBoardSection: ToEntityMarshaller[BoardSection], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def boardSectionsList200(responseBoardSectionsList200Response: BoardSectionsList200Response)(implicit toEntityMarshallerBoardSectionsList200Response: ToEntityMarshaller[BoardSectionsList200Response]): Route =
    complete((200, responseBoardSectionsList200Response))
  def boardSectionsList400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def boardSectionsList401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def boardSectionsList403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def boardSectionsList404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def boardSectionsList429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def boardSectionsListDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: BoardSectionsList200Response
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def boardSectionsList(boardId: String, adAccountId: Option[String], bookmark: Option[String], pageSize: Int)
      (implicit toEntityMarshallerBoardSectionsList200Response: ToEntityMarshaller[BoardSectionsList200Response], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def boardSectionsListPins200(responseBoardsListPins200Response: BoardsListPins200Response)(implicit toEntityMarshallerBoardsListPins200Response: ToEntityMarshaller[BoardsListPins200Response]): Route =
    complete((200, responseBoardsListPins200Response))
  def boardSectionsListPins400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def boardSectionsListPins401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def boardSectionsListPins403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def boardSectionsListPins404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def boardSectionsListPins429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def boardSectionsListPinsDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: BoardsListPins200Response
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def boardSectionsListPins(boardId: String, sectionId: String, adAccountId: Option[String], bookmark: Option[String], pageSize: Int)
      (implicit toEntityMarshallerBoardsListPins200Response: ToEntityMarshaller[BoardsListPins200Response], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def boardSectionsUpdate200(responseBoardSection: BoardSection)(implicit toEntityMarshallerBoardSection: ToEntityMarshaller[BoardSection]): Route =
    complete((200, responseBoardSection))
  def boardSectionsUpdate400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def boardSectionsUpdate401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def boardSectionsUpdate403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def boardSectionsUpdate404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def boardSectionsUpdate429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def boardSectionsUpdateDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: BoardSection
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def boardSectionsUpdate(boardId: String, sectionId: String, boardSectionUpdateWithRequiredBody: BoardSectionUpdateWithRequiredBody, adAccountId: Option[String])
      (implicit toEntityMarshallerBoardSection: ToEntityMarshaller[BoardSection], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def boardsCreate200(responseBoard: Board)(implicit toEntityMarshallerBoard: ToEntityMarshaller[Board]): Route =
    complete((200, responseBoard))
  def boardsCreate201(responseBoard: Board)(implicit toEntityMarshallerBoard: ToEntityMarshaller[Board]): Route =
    complete((201, responseBoard))
  def boardsCreate400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def boardsCreate401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def boardsCreate403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def boardsCreate404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def boardsCreate429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def boardsCreateDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: Board
   * Code: 201, Message: Resource create operation completed successfully., DataType: Board
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def boardsCreate(boardCreate: BoardCreate, adAccountId: Option[String])
      (implicit toEntityMarshallerError: ToEntityMarshaller[Error], toEntityMarshallerBoard: ToEntityMarshaller[Board]): Route

  def boardsDelete200(responseBoard: Board)(implicit toEntityMarshallerBoard: ToEntityMarshaller[Board]): Route =
    complete((200, responseBoard))
  def boardsDelete204: Route =
    complete((204, "Resource deleted successfully."))
  def boardsDelete400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def boardsDelete401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def boardsDelete403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def boardsDelete404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def boardsDelete429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def boardsDeleteDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: Board
   * Code: 204, Message: Resource deleted successfully.
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def boardsDelete(boardId: String, adAccountId: Option[String])
      (implicit toEntityMarshallerError: ToEntityMarshaller[Error], toEntityMarshallerBoard: ToEntityMarshaller[Board]): Route

  def boardsGet200(responseBoard: Board)(implicit toEntityMarshallerBoard: ToEntityMarshaller[Board]): Route =
    complete((200, responseBoard))
  def boardsGet400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def boardsGet401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def boardsGet403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def boardsGet404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def boardsGet429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def boardsGetDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: Board
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def boardsGet(boardId: String, adAccountId: Option[String])
      (implicit toEntityMarshallerError: ToEntityMarshaller[Error], toEntityMarshallerBoard: ToEntityMarshaller[Board]): Route

  def boardsList200(responseBoardsList200Response: BoardsList200Response)(implicit toEntityMarshallerBoardsList200Response: ToEntityMarshaller[BoardsList200Response]): Route =
    complete((200, responseBoardsList200Response))
  def boardsList400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def boardsList401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def boardsList403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def boardsList404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def boardsList429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def boardsListDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
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
  def boardsList(adAccountId: Option[String], privacy: Option[String], bookmark: Option[String], pageSize: Int)
      (implicit toEntityMarshallerBoardsList200Response: ToEntityMarshaller[BoardsList200Response], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def boardsListPins200(responseBoardsListPins200Response: BoardsListPins200Response)(implicit toEntityMarshallerBoardsListPins200Response: ToEntityMarshaller[BoardsListPins200Response]): Route =
    complete((200, responseBoardsListPins200Response))
  def boardsListPins400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def boardsListPins401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def boardsListPins403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def boardsListPins404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def boardsListPins429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def boardsListPinsDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: BoardsListPins200Response
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def boardsListPins(boardId: String, creativeTypes: Option[String], adAccountId: Option[String], pinMetrics: Boolean, bookmark: Option[String], pageSize: Int)
      (implicit toEntityMarshallerBoardsListPins200Response: ToEntityMarshaller[BoardsListPins200Response], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def boardsUpdate200(responseBoardWithUpdatePrivacy: BoardWithUpdatePrivacy)(implicit toEntityMarshallerBoardWithUpdatePrivacy: ToEntityMarshaller[BoardWithUpdatePrivacy]): Route =
    complete((200, responseBoardWithUpdatePrivacy))
  def boardsUpdate400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def boardsUpdate401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def boardsUpdate403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def boardsUpdate404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def boardsUpdate429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def boardsUpdateDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: BoardWithUpdatePrivacy
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def boardsUpdate(boardId: String, boardWithUpdatePrivacyUpdate: BoardWithUpdatePrivacyUpdate, adAccountId: Option[String])
      (implicit toEntityMarshallerBoardWithUpdatePrivacy: ToEntityMarshaller[BoardWithUpdatePrivacy], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

}

trait BoardsApiMarshaller {
  implicit def fromEntityUnmarshallerBoardWithUpdatePrivacyUpdate: FromEntityUnmarshaller[BoardWithUpdatePrivacyUpdate]

  implicit def fromEntityUnmarshallerBoardCreate: FromEntityUnmarshaller[BoardCreate]

  implicit def fromEntityUnmarshallerBoardSectionCreate: FromEntityUnmarshaller[BoardSectionCreate]

  implicit def fromEntityUnmarshallerBoardSectionUpdateWithRequiredBody: FromEntityUnmarshaller[BoardSectionUpdateWithRequiredBody]



  implicit def toEntityMarshallerBoardSection: ToEntityMarshaller[BoardSection]

  implicit def toEntityMarshallerBoardsListPins200Response: ToEntityMarshaller[BoardsListPins200Response]

  implicit def toEntityMarshallerBoardWithUpdatePrivacy: ToEntityMarshaller[BoardWithUpdatePrivacy]

  implicit def toEntityMarshallerBoardSectionsList200Response: ToEntityMarshaller[BoardSectionsList200Response]

  implicit def toEntityMarshallerBoardsList200Response: ToEntityMarshaller[BoardsList200Response]

  implicit def toEntityMarshallerError: ToEntityMarshaller[Error]

  implicit def toEntityMarshallerBoard: ToEntityMarshaller[Board]

}

