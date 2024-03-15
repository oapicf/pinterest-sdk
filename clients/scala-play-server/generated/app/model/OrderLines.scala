package model

import play.api.libs.json._

/**
  * Order Line
  * @param id Order line ID.
  * @param `type` Always \"orderline\".
  * @param adAccountId Ad account ID.
  * @param purchaseOrderId Purchase order ID.
  * @param startTime Start time. Unix timestamp.
  * @param endTime End time. Unix timestamp.
  * @param budget Order line budget in micro currency.
  * @param paidBudget Order line paid budget in micro currency.
  * @param status Order line status.
  * @param name Order line name.
  * @param paidType Order line paid type.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class OrderLines(
  id: Option[String],
  `type`: Option[String],
  adAccountId: Option[String],
  purchaseOrderId: Option[String],
  startTime: Option[BigDecimal],
  endTime: Option[BigDecimal],
  budget: Option[BigDecimal],
  paidBudget: Option[BigDecimal],
  status: Option[OrderLineStatus],
  name: Option[String],
  paidType: Option[OrderLinePaidType]
)

object OrderLines {
  implicit lazy val orderLinesJsonFormat: Format[OrderLines] = Json.format[OrderLines]
}

