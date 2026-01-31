package api

import model.Error
import model.OrderLine
import model.OrderLinesList200Response

/**
  * Provides a default implementation for [[OrderLinesApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
class OrderLinesApiImpl extends OrderLinesApi {
  /**
    * @inheritdoc
    */
  override def orderLinesGet(adAccountId: String, orderLineId: String): OrderLine = {
    // TODO: Implement better logic

    OrderLine(None, None, None, None, None, None, None, None, None, None, None, List.empty[String], Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def orderLinesList(adAccountId: String, pageSize: Option[Int], order: Option[String], bookmark: Option[String]): OrderLinesList200Response = {
    // TODO: Implement better logic

    OrderLinesList200Response(None, List.empty[OrderLine])
  }
}
