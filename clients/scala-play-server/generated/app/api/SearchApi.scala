package api

import play.api.libs.json._
import model.BoardsList200Response
import model.Error
import model.PinsList200Response
import model.SearchPartnerPins200Response

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
trait SearchApi {
  /**
    * Search pins by a given search term
    * **This endpoint is currently in beta and not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**  Get the top 10 Pins by a given search term.
    * @param term Search term to look up pins.
    * @param countryCode Two letter country code (ISO 3166-1 alpha-2)
    * @param bookmark Cursor used to fetch the next page of items
    * @param locale Search locale.
    * @param limit Max search result size
    */
  def searchPartnerPins(term: String, countryCode: String, bookmark: Option[String], locale: Option[String], limit: Option[Int]): SearchPartnerPins200Response

  /**
    * Search user&#39;s boards
    * Search for boards for the \&quot;operation user_account\&quot;. This includes boards of all board types. - By default, the \&quot;operation user_account\&quot; is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. See [Understanding Business Access](/docs/getting-started/using-business-access/) for more information.
    * @param adAccountId Unique identifier of an ad account.
    * @param query Search query. Can contain pin description keywords or comma-separated pin IDs.
    * @param bookmark Cursor used to fetch the next page of items
    * @param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
    */
  def searchUserBoardsGet(adAccountId: Option[String], query: Option[String], bookmark: Option[String], pageSize: Option[Int]): BoardsList200Response

  /**
    * Search user&#39;s Pins
    * Search for pins for the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. See [Understanding Business Access](/docs/getting-started/using-business-access/) for more information.
    * @param query Search query. Can contain pin description keywords or comma-separated pin IDs.
    * @param adAccountId Unique identifier of an ad account.
    * @param bookmark Cursor used to fetch the next page of items
    */
  def searchUserPinsList(query: String, adAccountId: Option[String], bookmark: Option[String]): PinsList200Response
}
