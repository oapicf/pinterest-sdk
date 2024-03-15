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
import org.openapitools.server.model.BoardSection
import org.openapitools.server.model.BoardSectionsList200Response
import org.openapitools.server.model.BoardUpdate
import org.openapitools.server.model.BoardsList200Response
import org.openapitools.server.model.BoardsListPins200Response
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
            entity(as[Board]){ board =>
              boardsService.boardsCreate(board = board, adAccountId = adAccountId)
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
        parameters("ad_account_id".as[String].?, "bookmark".as[String].?, "page_size".as[Int].?(25), "privacy".as[String].?) { (adAccountId, bookmark, pageSize, privacy) => 
            boardsService.boardsList(adAccountId = adAccountId, bookmark = bookmark, pageSize = pageSize, privacy = privacy)
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
            entity(as[BoardUpdate]){ boardUpdate =>
              boardsService.boardsUpdate(boardId = boardId, boardUpdate = boardUpdate, adAccountId = adAccountId)
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

  def boardsCreate201(responseBoard: Board)(implicit toEntityMarshallerBoard: ToEntityMarshaller[Board]): Route =
    complete((201, responseBoard))
  def boardsCreate400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def boardsCreateDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 201, Message: response, DataType: Board
   * Code: 400, Message: The board name is invalid or duplicated., DataType: Error
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def boardsCreate(board: Board, adAccountId: Option[String])
      (implicit toEntityMarshallerError: ToEntityMarshaller[Error], toEntityMarshallerBoard: ToEntityMarshaller[Board]): Route

  def boardsDelete204: Route =
    complete((204, "Board deleted successfully"))
  def boardsDelete403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def boardsDelete404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def boardsDelete409(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((409, responseError))
  def boardsDelete429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def boardsDeleteDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 204, Message: Board deleted successfully
   * Code: 403, Message: Not authorized to delete the board., DataType: Error
   * Code: 404, Message: Board not found., DataType: Error
   * Code: 409, Message: Could not get exclusive access to delete the board., DataType: Error
   * Code: 429, Message: This request exceeded a rate limit. This can happen if the client exceeds one of the published rate limits or if multiple write operations are applied to an object within a short time window., DataType: Error
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def boardsDelete(boardId: String, adAccountId: Option[String])
      (implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def boardsGet200(responseBoard: Board)(implicit toEntityMarshallerBoard: ToEntityMarshaller[Board]): Route =
    complete((200, responseBoard))
  def boardsGet404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def boardsGetDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: response, DataType: Board
   * Code: 404, Message: Board not found., DataType: Error
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def boardsGet(boardId: String, adAccountId: Option[String])
      (implicit toEntityMarshallerError: ToEntityMarshaller[Error], toEntityMarshallerBoard: ToEntityMarshaller[Board]): Route

  def boardsList200(responseBoardsList200Response: BoardsList200Response)(implicit toEntityMarshallerBoardsList200Response: ToEntityMarshaller[BoardsList200Response]): Route =
    complete((200, responseBoardsList200Response))
  def boardsListDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: response, DataType: BoardsList200Response
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def boardsList(adAccountId: Option[String], bookmark: Option[String], pageSize: Int, privacy: Option[String])
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

  def boardsUpdate200(responseBoard: Board)(implicit toEntityMarshallerBoard: ToEntityMarshaller[Board]): Route =
    complete((200, responseBoard))
  def boardsUpdate400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def boardsUpdate403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def boardsUpdate429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def boardsUpdateDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: response, DataType: Board
   * Code: 400, Message: Invalid board parameters., DataType: Error
   * Code: 403, Message: Not authorized to update the board., DataType: Error
   * Code: 429, Message: This request exceeded a rate limit. This can happen if the client exceeds one of the published rate limits or if multiple write operations are applied to an object within a short time window., DataType: Error
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def boardsUpdate(boardId: String, boardUpdate: BoardUpdate, adAccountId: Option[String])
      (implicit toEntityMarshallerError: ToEntityMarshaller[Error], toEntityMarshallerBoard: ToEntityMarshaller[Board]): Route

}

trait BoardsApiMarshaller {
  implicit def fromEntityUnmarshallerBoardSection: FromEntityUnmarshaller[BoardSection]

  implicit def fromEntityUnmarshallerBoard: FromEntityUnmarshaller[Board]

  implicit def fromEntityUnmarshallerBoardUpdate: FromEntityUnmarshaller[BoardUpdate]



  implicit def toEntityMarshallerBoardSection: ToEntityMarshaller[BoardSection]

  implicit def toEntityMarshallerBoardsListPins200Response: ToEntityMarshaller[BoardsListPins200Response]

  implicit def toEntityMarshallerBoardSectionsList200Response: ToEntityMarshaller[BoardSectionsList200Response]

  implicit def toEntityMarshallerBoardsList200Response: ToEntityMarshaller[BoardsList200Response]

  implicit def toEntityMarshallerError: ToEntityMarshaller[Error]

  implicit def toEntityMarshallerBoard: ToEntityMarshaller[Board]

}

