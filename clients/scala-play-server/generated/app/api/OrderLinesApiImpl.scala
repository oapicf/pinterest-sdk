package api

import model.Error
import model.OrderLine
import model.OrderLinesList200Response

/**
  * Provides a default implementation for [[OrderLinesApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
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

    OrderLinesList200Response(List.empty[OrderLine], None)
  }
}
