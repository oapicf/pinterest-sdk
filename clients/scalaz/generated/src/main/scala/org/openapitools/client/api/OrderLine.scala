package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import OrderLine._

case class OrderLine (
  /* Order line ID. */
  id: Option[String],
/* Always \"orderline\". */
  `type`: Option[String],
/* Ad account ID. */
  adAccountId: Option[String],
/* Purchase order ID. */
  purchaseOrderId: Option[String],
/* Start time. Unix timestamp. */
  startTime: Option[BigDecimal],
/* End time. Unix timestamp. */
  endTime: Option[BigDecimal],
/* Order line budget in micro currency. */
  budget: Option[BigDecimal],
/* Order line paid budget in micro currency. */
  paidBudget: Option[BigDecimal],
/* Order line status. */
  status: Option[OrderLineStatus],
/* Order line name. */
  name: Option[String],
/* Order line paid type. */
  paidType: Option[OrderLinePaidType],
/* Associated List of campaign IDs. */
  campaignIds: List[String])

object OrderLine {
  import DateTimeCodecs._

  implicit val OrderLineCodecJson: CodecJson[OrderLine] = CodecJson.derive[OrderLine]
  implicit val OrderLineDecoder: EntityDecoder[OrderLine] = jsonOf[OrderLine]
  implicit val OrderLineEncoder: EntityEncoder[OrderLine] = jsonEncoderOf[OrderLine]
}
