package api

import play.api.libs.json._
import model.Error
import model.PinsList200Response
import model.SearchPartnerPins200Response
import model.SearchUserBoardsGet200Response

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
trait SearchApi {
  /**
    * Search pins by a given search term
    * &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/new/about-beta-access/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Get the top 10 Pins by a given search term.
    * @param term Search term to look up pins.
    * @param countryCode Two letter country code (ISO 3166-1 alpha-2)
    * @param bookmark Cursor used to fetch the next page of items
    * @param locale Search locale.
    * @param limit Max search result size
    */
  def searchPartnerPins(term: String, countryCode: String, bookmark: Option[String], locale: Option[String], limit: Option[Int]): SearchPartnerPins200Response

  /**
    * Search user&#39;s boards
    * Search for boards for the \&quot;operation user_account\&quot;. This includes boards of all board types. - By default, the \&quot;operation user_account\&quot; is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. See &lt;a href&#x3D;&#39;/docs/reference/business-access/&#39;&gt;Understanding Business Access&lt;/a&gt; for more information.
    * @param adAccountId Unique identifier of an ad account.
    * @param bookmark Cursor used to fetch the next page of items
    * @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.
    * @param query Search query. Can contain pin description keywords or comma-separated pin IDs.
    */
  def searchUserBoardsGet(adAccountId: Option[String], bookmark: Option[String], pageSize: Option[Int], query: Option[String]): SearchUserBoardsGet200Response

  /**
    * Search user&#39;s Pins
    * Search for pins for the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. See &lt;a href&#x3D;&#39;/docs/reference/business-access/&#39;&gt;Understanding Business Access&lt;/a&gt; for more information.
    * @param query Search query. Can contain pin description keywords or comma-separated pin IDs.
    * @param adAccountId Unique identifier of an ad account.
    * @param bookmark Cursor used to fetch the next page of items
    */
  def searchUserPinsList(query: String, adAccountId: Option[String], bookmark: Option[String]): PinsList200Response
}
