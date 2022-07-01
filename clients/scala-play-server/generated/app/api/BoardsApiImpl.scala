package api

import model.Board
import model.BoardSection
import model.BoardUpdate
import model.Error
import model.JsObject
import model.Paginated

/**
  * Provides a default implementation for [[BoardsApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2022-07-01T12:06:32.599878Z[Etc/UTC]")
class BoardsApiImpl extends BoardsApi {
  /**
    * @inheritdoc
    */
  override def boardSectionsCreate(boardId: String, boardSection: BoardSection): BoardSection = {
    // TODO: Implement better logic

    BoardSection(None, None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def boardSectionsDelete(boardId: String, sectionId: String): Unit = {
    // TODO: Implement better logic

    
  }

  /**
    * @inheritdoc
    */
  override def boardSectionsList(boardId: String, bookmark: Option[String], pageSize: Option[Int]): Paginated = {
    // TODO: Implement better logic

    Paginated(List.empty[JsObject], None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def boardSectionsListPins(boardId: String, sectionId: String, bookmark: Option[String], pageSize: Option[Int]): Paginated = {
    // TODO: Implement better logic

    Paginated(List.empty[JsObject], None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def boardSectionsUpdate(boardId: String, sectionId: String, boardSection: BoardSection): BoardSection = {
    // TODO: Implement better logic

    BoardSection(None, None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def boardsCreate(board: Board): Board = {
    // TODO: Implement better logic

    Board(None, "", None, None, None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def boardsDelete(boardId: String): Unit = {
    // TODO: Implement better logic

    
  }

  /**
    * @inheritdoc
    */
  override def boardsGet(boardId: String): Board = {
    // TODO: Implement better logic

    Board(None, "", None, None, None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def boardsList(bookmark: Option[String], pageSize: Option[Int], privacy: Option[String]): Paginated = {
    // TODO: Implement better logic

    Paginated(List.empty[JsObject], None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def boardsListPins(boardId: String, bookmark: Option[String], pageSize: Option[Int]): Paginated = {
    // TODO: Implement better logic

    Paginated(List.empty[JsObject], None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def boardsUpdate(boardId: String, boardUpdate: BoardUpdate): Board = {
    // TODO: Implement better logic

    Board(None, "", None, None, None, Map.empty)
  }
}
