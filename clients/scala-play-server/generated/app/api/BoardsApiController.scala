package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.Board
import model.BoardSection
import model.BoardUpdate
import model.Error
import model.JsObject
import model.Paginated

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2022-05-07T10:47:31.836531Z[Etc/UTC]")
@Singleton
class BoardsApiController @Inject()(cc: ControllerComponents, api: BoardsApi) extends AbstractController(cc) {
  /**
    * POST /v5/boards/:boardId/sections
    * @param boardId Unique identifier of a board.
    */
  def boardSectionsCreate(boardId: String): Action[AnyContent] = Action { request =>
    def executeApi(): BoardSection = {
      val boardSection = request.body.asJson.map(_.as[BoardSection]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "boardSection")
      }
      api.boardSectionsCreate(boardId, boardSection)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * DELETE /v5/boards/:boardId/sections/:sectionId
    * @param boardId Unique identifier of a board.
    * @param sectionId Unique identifier of a board section.
    */
  def boardSectionsDelete(boardId: String, sectionId: String): Action[AnyContent] = Action { request =>
    def executeApi(): Unit = {
      api.boardSectionsDelete(boardId, sectionId)
    }

    executeApi()
    Ok
  }

  /**
    * GET /v5/boards/:boardId/sections?bookmark=[value]&pageSize=[value]
    * @param boardId Unique identifier of a board.
    */
  def boardSectionsList(boardId: String): Action[AnyContent] = Action { request =>
    def executeApi(): Paginated = {
      val bookmark = request.getQueryString("bookmark")
        
      val pageSize = request.getQueryString("page_size")
        .map(value => value.toInt)
      api.boardSectionsList(boardId, bookmark, pageSize)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v5/boards/:boardId/sections/:sectionId/pins?bookmark=[value]&pageSize=[value]
    * @param boardId Unique identifier of a board.
    * @param sectionId Unique identifier of a board section.
    */
  def boardSectionsListPins(boardId: String, sectionId: String): Action[AnyContent] = Action { request =>
    def executeApi(): Paginated = {
      val bookmark = request.getQueryString("bookmark")
        
      val pageSize = request.getQueryString("page_size")
        .map(value => value.toInt)
      api.boardSectionsListPins(boardId, sectionId, bookmark, pageSize)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * PATCH /v5/boards/:boardId/sections/:sectionId
    * @param boardId Unique identifier of a board.
    * @param sectionId Unique identifier of a board section.
    */
  def boardSectionsUpdate(boardId: String, sectionId: String): Action[AnyContent] = Action { request =>
    def executeApi(): BoardSection = {
      val boardSection = request.body.asJson.map(_.as[BoardSection]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "boardSection")
      }
      api.boardSectionsUpdate(boardId, sectionId, boardSection)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /v5/boards
    */
  def boardsCreate(): Action[AnyContent] = Action { request =>
    def executeApi(): Board = {
      val board = request.body.asJson.map(_.as[Board]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "board")
      }
      api.boardsCreate(board)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * DELETE /v5/boards/:boardId
    * @param boardId Unique identifier of a board.
    */
  def boardsDelete(boardId: String): Action[AnyContent] = Action { request =>
    def executeApi(): Unit = {
      api.boardsDelete(boardId)
    }

    executeApi()
    Ok
  }

  /**
    * GET /v5/boards/:boardId
    * @param boardId Unique identifier of a board.
    */
  def boardsGet(boardId: String): Action[AnyContent] = Action { request =>
    def executeApi(): Board = {
      api.boardsGet(boardId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v5/boards?bookmark=[value]&pageSize=[value]&privacy=[value]
    */
  def boardsList(): Action[AnyContent] = Action { request =>
    def executeApi(): Paginated = {
      val bookmark = request.getQueryString("bookmark")
        
      val pageSize = request.getQueryString("page_size")
        .map(value => value.toInt)
      val privacy = request.getQueryString("privacy")
        
      api.boardsList(bookmark, pageSize, privacy)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v5/boards/:boardId/pins?bookmark=[value]&pageSize=[value]
    * @param boardId Unique identifier of a board.
    */
  def boardsListPins(boardId: String): Action[AnyContent] = Action { request =>
    def executeApi(): Paginated = {
      val bookmark = request.getQueryString("bookmark")
        
      val pageSize = request.getQueryString("page_size")
        .map(value => value.toInt)
      api.boardsListPins(boardId, bookmark, pageSize)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * PATCH /v5/boards/:boardId
    * @param boardId Unique identifier of a board.
    */
  def boardsUpdate(boardId: String): Action[AnyContent] = Action { request =>
    def executeApi(): Board = {
      val boardUpdate = request.body.asJson.map(_.as[BoardUpdate]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "boardUpdate")
      }
      api.boardsUpdate(boardId, boardUpdate)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  private def splitCollectionParam(paramValues: String, collectionFormat: String): List[String] = {
    val splitBy =
      collectionFormat match {
        case "csv" => ",+"
        case "tsv" => "\t+"
        case "ssv" => " +"
        case "pipes" => "|+"
      }

    paramValues.split(splitBy).toList
  }
}
