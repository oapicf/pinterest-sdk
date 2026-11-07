package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for OrderLine.
  * @param adAccountId Ad account ID.
  * @param budget Order line budget in micro currency.
  * @param campaignIds Associated List of campaign IDs.
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
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T04:12:42.952922086Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class OrderLine(
  adAccountId: String,
  budget: Option[BigDecimal],
  campaignIds: List[String],
  endTime: Option[BigDecimal],
  id: String,
  name: Option[String],
  paidBudget: Option[BigDecimal],
  paidType: Option[OrderLinePaidType],
  purchaseOrderId: Option[String],
  startTime: Option[BigDecimal],
  status: OrderLineStatus,
  `type`: String
)

object OrderLine {
  implicit lazy val orderLineJsonFormat: Format[OrderLine] = Json.format[OrderLine]
}

