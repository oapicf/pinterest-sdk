package api

import play.api.libs.json._
import model.CustomerSegment
import model.CustomerSegmentCreate
import model.CustomerSegmentList200Response
import model.CustomerSegmentUpdateRequestUpdateWithRequiredBody
import model.Error
import model.PaginationOrder

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
trait CustomerSegmentApi {
  /**
    * Create customer segments
    * Customer segments allow advertisers to define existing customers for Pinterest Performance+ campaigns. Customer segments are made up of audience lists.
    * @param adAccountId Unique identifier of an ad account.
    */
  def customerSegmentCreate(adAccountId: String, customerSegmentCreate: CustomerSegmentCreate): CustomerSegment

  /**
    * List customer segments
    * Get a list of the customer segments in the specified &#x60;ad_account_id&#x60;.
    * @param adAccountId Unique identifier of an ad account.
    * @param bookmark Cursor used to fetch the next page of items
    * @param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
    * @param order The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items.
    * @param includeSizing Include audience sizing in result or not
    * @param searchQuery Search query. Can contain pin description keywords or comma-separated pin IDs.
    */
  def customerSegmentList(adAccountId: String, bookmark: Option[String], pageSize: Option[Int], order: Option[PaginationOrder], includeSizing: Option[Boolean], searchQuery: Option[String]): CustomerSegmentList200Response

  /**
    * Update customer segments
    * Update the customer segment given advertiser ID and customer segment ID
    * @param adAccountId Unique identifier of an ad account.
    */
  def customerSegmentUpdate(adAccountId: String, customerSegmentUpdateRequestUpdateWithRequiredBody: CustomerSegmentUpdateRequestUpdateWithRequiredBody): Unit
}
