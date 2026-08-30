package api

import model.Error
import model.OrderLine
import model.OrderLinesList200Response
import model.PaginationOrder

/**
  * Provides a default implementation for [[OrderLinesApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
class OrderLinesApiImpl extends OrderLinesApi {
  /**
    * @inheritdoc
    */
  override def orderLinesGet(orderLineId: String, adAccountId: String): OrderLine = {
    // TODO: Implement better logic

    OrderLine("", None, List.empty[String], None, "", None, None, None, None, None, OrderLineStatus(), "")
  }

  /**
    * @inheritdoc
    */
  override def orderLinesList(adAccountId: String, bookmark: Option[String], pageSize: Option[Int], order: Option[PaginationOrder]): OrderLinesList200Response = {
    // TODO: Implement better logic

    OrderLinesList200Response(None, List.empty[OrderLine])
  }
}
