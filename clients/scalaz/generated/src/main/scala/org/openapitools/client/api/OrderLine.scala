package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import OrderLine._

case class OrderLine (
  /* Ad account ID. */
  adAccountId: String,
/* Order line budget in micro currency. */
  budget: Option[BigDecimal],
/* Associated List of campaign IDs. */
  campaignIds: List[String],
/* End time. Unix timestamp. */
  endTime: Option[BigDecimal],
/* Order line ID. */
  id: String,
/* Order line name. */
  name: Option[String],
/* Order line paid budget in micro currency. */
  paidBudget: Option[BigDecimal],
/* Order line paid type. */
  paidType: Option[OrderLinePaidType],
/* Purchase order ID. */
  purchaseOrderId: Option[String],
/* Start time. Unix timestamp. */
  startTime: Option[BigDecimal],
/* Order line status. */
  status: OrderLineStatus,
/* Always \"orderline\". */
  `type`: String)

object OrderLine {
  import DateTimeCodecs._

  implicit val OrderLineCodecJson: CodecJson[OrderLine] = CodecJson.derive[OrderLine]
  implicit val OrderLineDecoder: EntityDecoder[OrderLine] = jsonOf[OrderLine]
  implicit val OrderLineEncoder: EntityEncoder[OrderLine] = jsonEncoderOf[OrderLine]
}
