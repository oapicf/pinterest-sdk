package api

import play.api.libs.json._
import model.Board
import model.BoardSection
import model.BoardUpdate
import model.Error
import model.JsObject
import model.Paginated

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2022-05-07T10:47:31.836531Z[Etc/UTC]")
trait BoardsApi {
  /**
    * Create board section
    * Create a board section on a board owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. - By default, the \&quot;operation user_account\&quot; is the token user_account.
    * @param boardId Unique identifier of a board.
    * @param boardSection Create a board section.
    */
  def boardSectionsCreate(boardId: String, boardSection: BoardSection): BoardSection

  /**
    * Delete board section
    * Delete a board section on a board owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. - By default, the \&quot;operation user_account\&quot; is the token user_account.
    * @param boardId Unique identifier of a board.
    * @param sectionId Unique identifier of a board section.
    */
  def boardSectionsDelete(boardId: String, sectionId: String): Unit

  /**
    * List board sections
    * Get a list of all board sections from a board owned by the \&quot;operation user_account\&quot; - or a group board that has been shared with this account. - By default, the \&quot;operation user_account\&quot; is the token user_account.
    * @param boardId Unique identifier of a board.
    * @param bookmark Cursor used to fetch the next page of items
    * @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information.
    */
  def boardSectionsList(boardId: String, bookmark: Option[String], pageSize: Option[Int]): Paginated

  /**
    * List Pins on board section
    * Get a list of the Pins on a board section of a board owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. - By default, the \&quot;operation user_account\&quot; is the token user_account.
    * @param boardId Unique identifier of a board.
    * @param sectionId Unique identifier of a board section.
    * @param bookmark Cursor used to fetch the next page of items
    * @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information.
    */
  def boardSectionsListPins(boardId: String, sectionId: String, bookmark: Option[String], pageSize: Option[Int]): Paginated

  /**
    * Update board section
    * Update a board section on a board owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. - By default, the \&quot;operation user_account\&quot; is the token user_account.
    * @param boardId Unique identifier of a board.
    * @param sectionId Unique identifier of a board section.
    * @param boardSection Update a board section.
    */
  def boardSectionsUpdate(boardId: String, sectionId: String, boardSection: BoardSection): BoardSection

  /**
    * Create board
    * Create a board owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.
    * @param board Create a board using a single board json object.
    */
  def boardsCreate(board: Board): Board

  /**
    * Delete board
    * Delete a board owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.
    * @param boardId Unique identifier of a board.
    */
  def boardsDelete(boardId: String): Unit

  /**
    * Get board
    * Get a board owned by the operation user_account - or a group board that has been shared with this account. - By default, the \&quot;operation user_account\&quot; is the token user_account.
    * @param boardId Unique identifier of a board.
    */
  def boardsGet(boardId: String): Board

  /**
    * List boards
    * Get a list of the boards owned by the \&quot;operation user_account\&quot; + group boards where this account is a collaborator  Optional: Specify a privacy type (public, protected, or secret) to indicate which boards to return. - If no privacy is specified, all boards that can be returned (based on the scopes of the token and ad_account role if applicable) will be returned.
    * @param bookmark Cursor used to fetch the next page of items
    * @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information.
    * @param privacy Privacy setting for a board.
    */
  def boardsList(bookmark: Option[String], pageSize: Option[Int], privacy: Option[String]): Paginated

  /**
    * List Pins on board
    * Get a list of the Pins on a board owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. - By default, the \&quot;operation user_account\&quot; is the token user_account.
    * @param boardId Unique identifier of a board.
    * @param bookmark Cursor used to fetch the next page of items
    * @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information.
    */
  def boardsListPins(boardId: String, bookmark: Option[String], pageSize: Option[Int]): Paginated

  /**
    * Update board
    * Update a board owned by the \&quot;operating user_account\&quot;.
    * @param boardId Unique identifier of a board.
    * @param boardUpdate Update a board.
    */
  def boardsUpdate(boardId: String, boardUpdate: BoardUpdate): Board
}
