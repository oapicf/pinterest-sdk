package api

import model.Board
import model.BoardSection
import model.BoardSectionsList200Response
import model.BoardUpdate
import model.BoardsList200Response
import model.BoardsListPins200Response
import model.Error

/**
  * Provides a default implementation for [[BoardsApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
class BoardsApiImpl extends BoardsApi {
  /**
    * @inheritdoc
    */
  override def boardSectionsCreate(boardId: String, boardSection: BoardSection, adAccountId: Option[String]): BoardSection = {
    // TODO: Implement better logic

    BoardSection(None, "")
  }

  /**
    * @inheritdoc
    */
  override def boardSectionsDelete(boardId: String, sectionId: String, adAccountId: Option[String]): Unit = {
    // TODO: Implement better logic

    
  }

  /**
    * @inheritdoc
    */
  override def boardSectionsList(boardId: String, adAccountId: Option[String], bookmark: Option[String], pageSize: Option[Int]): BoardSectionsList200Response = {
    // TODO: Implement better logic

    BoardSectionsList200Response(List.empty[BoardSection], None)
  }

  /**
    * @inheritdoc
    */
  override def boardSectionsListPins(boardId: String, sectionId: String, adAccountId: Option[String], bookmark: Option[String], pageSize: Option[Int]): BoardsListPins200Response = {
    // TODO: Implement better logic

    BoardsListPins200Response(List.empty[Pin], None)
  }

  /**
    * @inheritdoc
    */
  override def boardSectionsUpdate(boardId: String, sectionId: String, boardSection: BoardSection, adAccountId: Option[String]): BoardSection = {
    // TODO: Implement better logic

    BoardSection(None, "")
  }

  /**
    * @inheritdoc
    */
  override def boardsCreate(board: Board, adAccountId: Option[String]): Board = {
    // TODO: Implement better logic

    Board(None, None, None, "", None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def boardsDelete(boardId: String, adAccountId: Option[String]): Unit = {
    // TODO: Implement better logic

    
  }

  /**
    * @inheritdoc
    */
  override def boardsGet(boardId: String, adAccountId: Option[String]): Board = {
    // TODO: Implement better logic

    Board(None, None, None, "", None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def boardsList(adAccountId: Option[String], bookmark: Option[String], pageSize: Option[Int], privacy: Option[String]): BoardsList200Response = {
    // TODO: Implement better logic

    BoardsList200Response(List.empty[Board], None)
  }

  /**
    * @inheritdoc
    */
  override def boardsListPins(boardId: String, bookmark: Option[String], pageSize: Option[Int], creativeTypes: Option[List[String]], adAccountId: Option[String], pinMetrics: Option[Boolean]): BoardsListPins200Response = {
    // TODO: Implement better logic

    BoardsListPins200Response(List.empty[Pin], None)
  }

  /**
    * @inheritdoc
    */
  override def boardsUpdate(boardId: String, boardUpdate: BoardUpdate, adAccountId: Option[String]): Board = {
    // TODO: Implement better logic

    Board(None, None, None, "", None, None, None, None, None, None, None)
  }
}
