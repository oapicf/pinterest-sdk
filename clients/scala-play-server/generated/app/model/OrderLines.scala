package model

import play.api.libs.json._

/**
  * Order Line
  * @param adAccountId Ad account ID.
  * @param budget Order line budget in micro currency.
  * @param endTime End time. Unix timestamp.
  * @param id Order line ID.
  * @param name Order line name.
  * @param paidBudget Order line paid budget in micro currency.
  * @param paidType Order line paid type.
  * @param purchaseOrderId Purchase order ID.
  * @param startTime Start time. Unix timestamp.
  * @param status Order line status.
  * @param `type` Always \"orderline\".
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class OrderLines(
  adAccountId: Option[String],
  budget: Option[BigDecimal],
  endTime: Option[BigDecimal],
  id: Option[String],
  name: Option[String],
  paidBudget: Option[BigDecimal],
  paidType: Option[OrderLinePaidType],
  purchaseOrderId: Option[String],
  startTime: Option[BigDecimal],
  status: Option[OrderLineStatus],
  `type`: Option[String]
)

object OrderLines {
  implicit lazy val orderLinesJsonFormat: Format[OrderLines] = Json.format[OrderLines]
}

