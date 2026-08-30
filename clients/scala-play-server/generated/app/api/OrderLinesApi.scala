package api

import play.api.libs.json._
import model.Error
import model.OrderLine
import model.OrderLinesList200Response
import model.PaginationOrder

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
trait OrderLinesApi {
  /**
    * Get order line
    * Get a specific existing order line associated with an ad account.
    * @param orderLineId Order line ID.
    * @param adAccountId Unique identifier of an ad account.
    */
  def orderLinesGet(orderLineId: String, adAccountId: String): OrderLine

  /**
    * Get order lines.
    * List existing order lines associated with an ad account.
    * @param adAccountId Unique identifier of an ad account.
    * @param bookmark Cursor used to fetch the next page of items
    * @param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
    * @param order The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items.
    */
  def orderLinesList(adAccountId: String, bookmark: Option[String], pageSize: Option[Int], order: Option[PaginationOrder]): OrderLinesList200Response
}
