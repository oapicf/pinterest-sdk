package api

import play.api.libs.json._
import model.Error
import model.OrderLine
import model.OrderLinesList200Response

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
trait OrderLinesApi {
  /**
    * Get order line
    * Get a specific existing order line associated with an ad account.
    * @param adAccountId Unique identifier of an ad account.
    * @param orderLineId Unique identifier of an order line.
    */
  def orderLinesGet(adAccountId: String, orderLineId: String): OrderLine

  /**
    * Get order lines
    * List existing order lines associated with an ad account.
    * @param adAccountId Unique identifier of an ad account.
    * @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.
    * @param order The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
    * @param bookmark Cursor used to fetch the next page of items
    */
  def orderLinesList(adAccountId: String, pageSize: Option[Int], order: Option[String], bookmark: Option[String]): OrderLinesList200Response
}
