package api

import play.api.libs.json._
import model.Board
import model.BoardSection
import model.BoardSectionsList200Response
import model.BoardUpdate
import model.BoardsList200Response
import model.BoardsListPins200Response
import model.Error

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
trait BoardsApi {
  /**
    * Create board section
    * Create a board section on a board owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.
    * @param boardId Unique identifier of a board.
    * @param boardSection Create a board section.
    * @param adAccountId Unique identifier of an ad account.
    */
  def boardSectionsCreate(boardId: String, boardSection: BoardSection, adAccountId: Option[String]): BoardSection

  /**
    * Delete board section
    * Delete a board section on a board owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.
    * @param boardId Unique identifier of a board.
    * @param sectionId Unique identifier of a board section.
    * @param adAccountId Unique identifier of an ad account.
    */
  def boardSectionsDelete(boardId: String, sectionId: String, adAccountId: Option[String]): Unit

  /**
    * List board sections
    * Get a list of all board sections from a board owned by the \&quot;operation user_account\&quot; - or a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.
    * @param boardId Unique identifier of a board.
    * @param adAccountId Unique identifier of an ad account.
    * @param bookmark Cursor used to fetch the next page of items
    * @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.
    */
  def boardSectionsList(boardId: String, adAccountId: Option[String], bookmark: Option[String], pageSize: Option[Int]): BoardSectionsList200Response

  /**
    * List Pins on board section
    * Get a list of the Pins on a board section of a board owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.
    * @param boardId Unique identifier of a board.
    * @param sectionId Unique identifier of a board section.
    * @param adAccountId Unique identifier of an ad account.
    * @param bookmark Cursor used to fetch the next page of items
    * @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.
    */
  def boardSectionsListPins(boardId: String, sectionId: String, adAccountId: Option[String], bookmark: Option[String], pageSize: Option[Int]): BoardsListPins200Response

  /**
    * Update board section
    * Update a board section on a board owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.
    * @param boardId Unique identifier of a board.
    * @param sectionId Unique identifier of a board section.
    * @param boardSection Update a board section.
    * @param adAccountId Unique identifier of an ad account.
    */
  def boardSectionsUpdate(boardId: String, sectionId: String, boardSection: BoardSection, adAccountId: Option[String]): BoardSection

  /**
    * Create board
    * Create a board owned by the \&quot;operation user_account\&quot;. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.
    * @param board Create a board using a single board json object.
    * @param adAccountId Unique identifier of an ad account.
    */
  def boardsCreate(board: Board, adAccountId: Option[String]): Board

  /**
    * Delete board
    * Delete a board owned by the \&quot;operation user_account\&quot;. - Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.
    * @param boardId Unique identifier of a board.
    * @param adAccountId Unique identifier of an ad account.
    */
  def boardsDelete(boardId: String, adAccountId: Option[String]): Unit

  /**
    * Get board
    * Get a board owned by the operation user_account - or a group board that has been shared with this account. - Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.
    * @param boardId Unique identifier of a board.
    * @param adAccountId Unique identifier of an ad account.
    */
  def boardsGet(boardId: String, adAccountId: Option[String]): Board

  /**
    * List boards
    * Get a list of the boards owned by the \&quot;operation user_account\&quot; + group boards where this account is a collaborator Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. Optional: Specify a privacy type (public, protected, or secret) to indicate which boards to return. - If no privacy is specified, all boards that can be returned (based on the scopes of the token and ad_account role if applicable) will be returned.
    * @param adAccountId Unique identifier of an ad account.
    * @param bookmark Cursor used to fetch the next page of items
    * @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.
    * @param privacy Privacy setting for a board.
    */
  def boardsList(adAccountId: Option[String], bookmark: Option[String], pageSize: Option[Int], privacy: Option[String]): BoardsList200Response

  /**
    * List Pins on board
    * Get a list of the Pins on a board owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. - Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.
    * @param boardId Unique identifier of a board.
    * @param bookmark Cursor used to fetch the next page of items
    * @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.
    * @param creativeTypes Pin creative types filter. &lt;/p&gt;&lt;strong&gt;Note:&lt;/strong&gt; SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.
    * @param adAccountId Unique identifier of an ad account.
    * @param pinMetrics Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &lt;code&gt;2023-03-20&lt;/code&gt; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.
    */
  def boardsListPins(boardId: String, bookmark: Option[String], pageSize: Option[Int], creativeTypes: Option[List[String]], adAccountId: Option[String], pinMetrics: Option[Boolean]): BoardsListPins200Response

  /**
    * Update board
    * Update a board owned by the \&quot;operating user_account\&quot;. - Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.
    * @param boardId Unique identifier of a board.
    * @param boardUpdate Update a board.
    * @param adAccountId Unique identifier of an ad account.
    */
  def boardsUpdate(boardId: String, boardUpdate: BoardUpdate, adAccountId: Option[String]): Board
}
