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
            entity(as[BoardSection]){ boardSection =>
              boardsService.boardSectionsCreate(boardId = boardId, boardSection = boardSection, adAccountId = adAccountId)
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
            entity(as[BoardSection]){ boardSection =>
              boardsService.boardSectionsUpdate(boardId = boardId, sectionId = sectionId, boardSection = boardSection, adAccountId = adAccountId)
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
        parameters("bookmark".as[String].?, "page_size".as[Int].?(25), "creative_types".as[String].?, "ad_account_id".as[String].?, "pin_metrics".as[Boolean].?(false)) { (bookmark, pageSize, creativeTypes, adAccountId, pinMetrics) => 
            boardsService.boardsListPins(boardId = boardId, bookmark = bookmark, pageSize = pageSize, creativeTypes = creativeTypes, adAccountId = adAccountId, pinMetrics = pinMetrics)
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

    val boardIdPattern: PathMatcher1[String] = PathMatcher("^\\d+$".r)
val sectionIdPattern: PathMatcher1[String] = PathMatcher("^\\d+$".r)
}

trait BoardsApiService {

  def boardSectionsCreate201(responseBoardSection: BoardSection)(implicit toEntityMarshallerBoardSection: ToEntityMarshaller[BoardSection]): Route =
    complete((201, responseBoardSection))
  def boardSectionsCreate400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def boardSectionsCreate403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def boardSectionsCreate409(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((409, responseError))
  def boardSectionsCreate500(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((500, responseError))
  def boardSectionsCreateDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 201, Message: response, DataType: BoardSection
   * Code: 400, Message: Invalid board section parameters., DataType: Error
   * Code: 403, Message: Not authorized to create board sections., DataType: Error
   * Code: 409, Message: Could not get exclusive access to the board to create a new section., DataType: Error
   * Code: 500, Message: Could not create a new board section., DataType: Error
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def boardSectionsCreate(boardId: String, boardSection: BoardSection, adAccountId: Option[String])
      (implicit toEntityMarshallerBoardSection: ToEntityMarshaller[BoardSection], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def boardSectionsDelete204: Route =
    complete((204, "Board section deleted successfully"))
  def boardSectionsDelete403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def boardSectionsDelete404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def boardSectionsDelete409(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((409, responseError))
  def boardSectionsDeleteDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 204, Message: Board section deleted successfully
   * Code: 403, Message: Not authorized to delete board section., DataType: Error
   * Code: 404, Message: Board section not found., DataType: Error
   * Code: 409, Message: Board section conflict., DataType: Error
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def boardSectionsDelete(boardId: String, sectionId: String, adAccountId: Option[String])
      (implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def boardSectionsList200(responseBoardSectionsList200Response: BoardSectionsList200Response)(implicit toEntityMarshallerBoardSectionsList200Response: ToEntityMarshaller[BoardSectionsList200Response]): Route =
    complete((200, responseBoardSectionsList200Response))
  def boardSectionsListDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: response, DataType: BoardSectionsList200Response
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def boardSectionsList(boardId: String, adAccountId: Option[String], bookmark: Option[String], pageSize: Int)
      (implicit toEntityMarshallerBoardSectionsList200Response: ToEntityMarshaller[BoardSectionsList200Response], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def boardSectionsListPins200(responseBoardsListPins200Response: BoardsListPins200Response)(implicit toEntityMarshallerBoardsListPins200Response: ToEntityMarshaller[BoardsListPins200Response]): Route =
    complete((200, responseBoardsListPins200Response))
  def boardSectionsListPins403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def boardSectionsListPins404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def boardSectionsListPins409(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((409, responseError))
  def boardSectionsListPinsDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: response, DataType: BoardsListPins200Response
   * Code: 403, Message: Not authorized to access Pins on board section., DataType: Error
   * Code: 404, Message: Board or section not found., DataType: Error
   * Code: 409, Message: Board section conflict., DataType: Error
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def boardSectionsListPins(boardId: String, sectionId: String, adAccountId: Option[String], bookmark: Option[String], pageSize: Int)
      (implicit toEntityMarshallerBoardsListPins200Response: ToEntityMarshaller[BoardsListPins200Response], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def boardSectionsUpdate200(responseBoardSection: BoardSection)(implicit toEntityMarshallerBoardSection: ToEntityMarshaller[BoardSection]): Route =
    complete((200, responseBoardSection))
  def boardSectionsUpdate400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def boardSectionsUpdate403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def boardSectionsUpdate409(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((409, responseError))
  def boardSectionsUpdateDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: response, DataType: BoardSection
   * Code: 400, Message: Invalid board section parameters., DataType: Error
   * Code: 403, Message: Not authorized to update board section., DataType: Error
   * Code: 409, Message: Board section conflict., DataType: Error
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def boardSectionsUpdate(boardId: String, sectionId: String, boardSection: BoardSection, adAccountId: Option[String])
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
   * Code: 204, Message: Resource deleted successfully.
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def boardsDelete(boardId: String, adAccountId: Option[String])
      (implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route

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
  def boardsListPins404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def boardsListPinsDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: response, DataType: BoardsListPins200Response
   * Code: 404, Message: Board not found., DataType: Error
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def boardsListPins(boardId: String, bookmark: Option[String], pageSize: Int, creativeTypes: Option[String], adAccountId: Option[String], pinMetrics: Boolean)
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
  implicit def fromEntityUnmarshallerBoardSection: FromEntityUnmarshaller[BoardSection]

  implicit def fromEntityUnmarshallerBoardWithUpdatePrivacyUpdate: FromEntityUnmarshaller[BoardWithUpdatePrivacyUpdate]

  implicit def fromEntityUnmarshallerBoardCreate: FromEntityUnmarshaller[BoardCreate]



  implicit def toEntityMarshallerBoardSection: ToEntityMarshaller[BoardSection]

  implicit def toEntityMarshallerBoardsListPins200Response: ToEntityMarshaller[BoardsListPins200Response]

  implicit def toEntityMarshallerBoardWithUpdatePrivacy: ToEntityMarshaller[BoardWithUpdatePrivacy]

  implicit def toEntityMarshallerBoardSectionsList200Response: ToEntityMarshaller[BoardSectionsList200Response]

  implicit def toEntityMarshallerBoardsList200Response: ToEntityMarshaller[BoardsList200Response]

  implicit def toEntityMarshallerError: ToEntityMarshaller[Error]

  implicit def toEntityMarshallerBoard: ToEntityMarshaller[Board]

}

