package api

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

/**
  * Provides a default implementation for [[BoardsApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
class BoardsApiImpl extends BoardsApi {
  /**
    * @inheritdoc
    */
  override def boardSectionsCreate(boardId: String, boardSectionCreate: BoardSectionCreate, adAccountId: Option[String]): BoardSection = {
    // TODO: Implement better logic

    BoardSection(None, "")
  }

  /**
    * @inheritdoc
    */
  override def boardSectionsDelete(boardId: String, sectionId: String, adAccountId: Option[String]): BoardSection = {
    // TODO: Implement better logic

    BoardSection(None, "")
  }

  /**
    * @inheritdoc
    */
  override def boardSectionsList(boardId: String, adAccountId: Option[String], bookmark: Option[String], pageSize: Option[Int]): BoardSectionsList200Response = {
    // TODO: Implement better logic

    BoardSectionsList200Response(None, List.empty[BoardSection])
  }

  /**
    * @inheritdoc
    */
  override def boardSectionsListPins(boardId: String, sectionId: String, adAccountId: Option[String], bookmark: Option[String], pageSize: Option[Int]): BoardsListPins200Response = {
    // TODO: Implement better logic

    BoardsListPins200Response(None, List.empty[PinRead])
  }

  /**
    * @inheritdoc
    */
  override def boardSectionsUpdate(boardId: String, sectionId: String, boardSectionUpdateWithRequiredBody: BoardSectionUpdateWithRequiredBody, adAccountId: Option[String]): BoardSection = {
    // TODO: Implement better logic

    BoardSection(None, "")
  }

  /**
    * @inheritdoc
    */
  override def boardsCreate(boardCreate: BoardCreate, adAccountId: Option[String]): Board = {
    // TODO: Implement better logic

    Board(None, None, None, None, None, "", None, None, "", None, None, None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def boardsDelete(boardId: String, adAccountId: Option[String]): Board = {
    // TODO: Implement better logic

    Board(None, None, None, None, None, "", None, None, "", None, None, None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def boardsGet(boardId: String, adAccountId: Option[String]): Board = {
    // TODO: Implement better logic

    Board(None, None, None, None, None, "", None, None, "", None, None, None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def boardsList(adAccountId: Option[String], privacy: Option[BoardPrivacyFilter], bookmark: Option[String], pageSize: Option[Int]): BoardsList200Response = {
    // TODO: Implement better logic

    BoardsList200Response(None, List.empty[Board])
  }

  /**
    * @inheritdoc
    */
  override def boardsListPins(boardId: String, creativeTypes: Option[List[CreativeType]], adAccountId: Option[String], pinMetrics: Option[Boolean], bookmark: Option[String], pageSize: Option[Int]): BoardsListPins200Response = {
    // TODO: Implement better logic

    BoardsListPins200Response(None, List.empty[PinRead])
  }

  /**
    * @inheritdoc
    */
  override def boardsUpdate(boardId: String, boardWithUpdatePrivacyUpdate: BoardWithUpdatePrivacyUpdate, adAccountId: Option[String]): BoardWithUpdatePrivacy = {
    // TODO: Implement better logic

    BoardWithUpdatePrivacy(None, None, None, None, None, "", None, None, "", None, None, None, Map.empty)
  }
}
