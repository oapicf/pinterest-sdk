package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.Board
import model.BoardCreate
import model.BoardPrivacyFilter
import model.BoardSection
import model.BoardSectionCreate
import model.BoardSectionUpdateWithRequiredBody
import model.BoardSectionsList200Response
import model.BoardWithUpdatePrivacy
import model.BoardWithUpdatePrivacyUpdate
import model.BoardsList200Response
import model.BoardsListPins200Response
import model.CreativeType
import model.Error

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@Singleton
class BoardsApiController @Inject()(cc: ControllerComponents, api: BoardsApi) extends AbstractController(cc) {
  /**
    * POST /v5/boards/:boardId/sections?adAccountId=[value]
    * @param boardId Unique identifier of a board.
    */
  def boardSectionsCreate(boardId: String): Action[AnyContent] = Action { request =>
    def executeApi(): BoardSection = {
      val boardSectionCreate = request.body.asJson.map(_.as[BoardSectionCreate]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "boardSectionCreate")
      }
      val adAccountId = request.getQueryString("ad_account_id")
        
      api.boardSectionsCreate(boardId, boardSectionCreate, adAccountId)
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
    def executeApi(): BoardSection = {
      val adAccountId = request.getQueryString("ad_account_id")
        
      api.boardSectionsDelete(boardId, sectionId, adAccountId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
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
      val boardSectionUpdateWithRequiredBody = request.body.asJson.map(_.as[BoardSectionUpdateWithRequiredBody]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "boardSectionUpdateWithRequiredBody")
      }
      val adAccountId = request.getQueryString("ad_account_id")
        
      api.boardSectionsUpdate(boardId, sectionId, boardSectionUpdateWithRequiredBody, adAccountId)
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
      val boardCreate = request.body.asJson.map(_.as[BoardCreate]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "boardCreate")
      }
      val adAccountId = request.getQueryString("ad_account_id")
        
      api.boardsCreate(boardCreate, adAccountId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * DELETE /v5/boards/:boardId?adAccountId=[value]
    */
  def boardsDelete(boardId: String): Action[AnyContent] = Action { request =>
    def executeApi(): Board = {
      val adAccountId = request.getQueryString("ad_account_id")
        
      api.boardsDelete(boardId, adAccountId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v5/boards/:boardId?adAccountId=[value]
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
    * GET /v5/boards?adAccountId=[value]&privacy=[value]&bookmark=[value]&pageSize=[value]
    */
  def boardsList(): Action[AnyContent] = Action { request =>
    def executeApi(): BoardsList200Response = {
      val adAccountId = request.getQueryString("ad_account_id")
        
      val privacy = request.getQueryString("privacy")
        .map(value => )
        
      val bookmark = request.getQueryString("bookmark")
        
      val pageSize = request.getQueryString("page_size")
        .map(value => value.toInt)
        
      api.boardsList(adAccountId, privacy, bookmark, pageSize)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v5/boards/:boardId/pins?creativeTypes=[value]&adAccountId=[value]&pinMetrics=[value]&bookmark=[value]&pageSize=[value]
    * @param boardId Unique identifier of a board.
    */
  def boardsListPins(boardId: String): Action[AnyContent] = Action { request =>
    def executeApi(): BoardsListPins200Response = {
      val creativeTypes = request.queryString.get("creative_types")
        .map(_.toList)
        .map(_.map(value => )
        
      val adAccountId = request.getQueryString("ad_account_id")
        
      val pinMetrics = request.getQueryString("pin_metrics")
        .map(value => value.toBoolean)
        
      val bookmark = request.getQueryString("bookmark")
        
      val pageSize = request.getQueryString("page_size")
        .map(value => value.toInt)
        
      api.boardsListPins(boardId, creativeTypes, adAccountId, pinMetrics, bookmark, pageSize)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * PATCH /v5/boards/:boardId?adAccountId=[value]
    */
  def boardsUpdate(boardId: String): Action[AnyContent] = Action { request =>
    def executeApi(): BoardWithUpdatePrivacy = {
      val boardWithUpdatePrivacyUpdate = request.body.asJson.map(_.as[BoardWithUpdatePrivacyUpdate]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "boardWithUpdatePrivacyUpdate")
      }
      val adAccountId = request.getQueryString("ad_account_id")
        
      api.boardsUpdate(boardId, boardWithUpdatePrivacyUpdate, adAccountId)
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
