package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.Board
import model.BoardSection
import model.BoardSectionsList200Response
import model.BoardUpdate
import model.BoardsList200Response
import model.BoardsListPins200Response
import model.Error

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@Singleton
class BoardsApiController @Inject()(cc: ControllerComponents, api: BoardsApi) extends AbstractController(cc) {
  /**
    * POST /v5/boards/:boardId/sections?adAccountId=[value]
    * @param boardId Unique identifier of a board.
    */
  def boardSectionsCreate(boardId: String): Action[AnyContent] = Action { request =>
    def executeApi(): BoardSection = {
      val boardSection = request.body.asJson.map(_.as[BoardSection]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "boardSection")
      }
      val adAccountId = request.getQueryString("ad_account_id")
        
      api.boardSectionsCreate(boardId, boardSection, adAccountId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * DELETE /v5/boards/:boardId/sections/:sectionId?adAccountId=[value]
    * @param boardId Unique identifier of a board.
    * @param sectionId Unique identifier of a board section.
    */
  def boardSectionsDelete(boardId: String, sectionId: String): Action[AnyContent] = Action { request =>
    def executeApi(): Unit = {
      val adAccountId = request.getQueryString("ad_account_id")
        
      api.boardSectionsDelete(boardId, sectionId, adAccountId)
    }

    executeApi()
    Ok
  }

  /**
    * GET /v5/boards/:boardId/sections?adAccountId=[value]&bookmark=[value]&pageSize=[value]
    * @param boardId Unique identifier of a board.
    */
  def boardSectionsList(boardId: String): Action[AnyContent] = Action { request =>
    def executeApi(): BoardSectionsList200Response = {
      val adAccountId = request.getQueryString("ad_account_id")
        
      val bookmark = request.getQueryString("bookmark")
        
      val pageSize = request.getQueryString("page_size")
        .map(value => value.toInt)
        
      api.boardSectionsList(boardId, adAccountId, bookmark, pageSize)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v5/boards/:boardId/sections/:sectionId/pins?adAccountId=[value]&bookmark=[value]&pageSize=[value]
    * @param boardId Unique identifier of a board.
    * @param sectionId Unique identifier of a board section.
    */
  def boardSectionsListPins(boardId: String, sectionId: String): Action[AnyContent] = Action { request =>
    def executeApi(): BoardsListPins200Response = {
      val adAccountId = request.getQueryString("ad_account_id")
        
      val bookmark = request.getQueryString("bookmark")
        
      val pageSize = request.getQueryString("page_size")
        .map(value => value.toInt)
        
      api.boardSectionsListPins(boardId, sectionId, adAccountId, bookmark, pageSize)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * PATCH /v5/boards/:boardId/sections/:sectionId?adAccountId=[value]
    * @param boardId Unique identifier of a board.
    * @param sectionId Unique identifier of a board section.
    */
  def boardSectionsUpdate(boardId: String, sectionId: String): Action[AnyContent] = Action { request =>
    def executeApi(): BoardSection = {
      val boardSection = request.body.asJson.map(_.as[BoardSection]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "boardSection")
      }
      val adAccountId = request.getQueryString("ad_account_id")
        
      api.boardSectionsUpdate(boardId, sectionId, boardSection, adAccountId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /v5/boards?adAccountId=[value]
    */
  def boardsCreate(): Action[AnyContent] = Action { request =>
    def executeApi(): Board = {
      val board = request.body.asJson.map(_.as[Board]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "board")
      }
      val adAccountId = request.getQueryString("ad_account_id")
        
      api.boardsCreate(board, adAccountId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * DELETE /v5/boards/:boardId?adAccountId=[value]
    * @param boardId Unique identifier of a board.
    */
  def boardsDelete(boardId: String): Action[AnyContent] = Action { request =>
    def executeApi(): Unit = {
      val adAccountId = request.getQueryString("ad_account_id")
        
      api.boardsDelete(boardId, adAccountId)
    }

    executeApi()
    Ok
  }

  /**
    * GET /v5/boards/:boardId?adAccountId=[value]
    * @param boardId Unique identifier of a board.
    */
  def boardsGet(boardId: String): Action[AnyContent] = Action { request =>
    def executeApi(): Board = {
      val adAccountId = request.getQueryString("ad_account_id")
        
      api.boardsGet(boardId, adAccountId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v5/boards?adAccountId=[value]&bookmark=[value]&pageSize=[value]&privacy=[value]
    */
  def boardsList(): Action[AnyContent] = Action { request =>
    def executeApi(): BoardsList200Response = {
      val adAccountId = request.getQueryString("ad_account_id")
        
      val bookmark = request.getQueryString("bookmark")
        
      val pageSize = request.getQueryString("page_size")
        .map(value => value.toInt)
        
      val privacy = request.getQueryString("privacy")
        
      api.boardsList(adAccountId, bookmark, pageSize, privacy)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v5/boards/:boardId/pins?bookmark=[value]&pageSize=[value]&creativeTypes=[value]&adAccountId=[value]&pinMetrics=[value]
    * @param boardId Unique identifier of a board.
    */
  def boardsListPins(boardId: String): Action[AnyContent] = Action { request =>
    def executeApi(): BoardsListPins200Response = {
      val bookmark = request.getQueryString("bookmark")
        
      val pageSize = request.getQueryString("page_size")
        .map(value => value.toInt)
        
      val creativeTypes = request.queryString.get("creative_types")
        .map(_.toList)
        
      val adAccountId = request.getQueryString("ad_account_id")
        
      val pinMetrics = request.getQueryString("pin_metrics")
        .map(value => value.toBoolean)
        
      api.boardsListPins(boardId, bookmark, pageSize, creativeTypes, adAccountId, pinMetrics)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * PATCH /v5/boards/:boardId?adAccountId=[value]
    * @param boardId Unique identifier of a board.
    */
  def boardsUpdate(boardId: String): Action[AnyContent] = Action { request =>
    def executeApi(): Board = {
      val boardUpdate = request.body.asJson.map(_.as[BoardUpdate]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "boardUpdate")
      }
      val adAccountId = request.getQueryString("ad_account_id")
        
      api.boardsUpdate(boardId, boardUpdate, adAccountId)
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
