package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import OrderLines._

case class OrderLines (
  /* Ad account ID. */
  adAccountId: Option[String],
/* Order line budget in micro currency. */
  budget: Option[BigDecimal],
/* End time. Unix timestamp. */
  endTime: Option[BigDecimal],
/* Order line ID. */
  id: Option[String],
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
  status: Option[OrderLineStatus],
/* Always \"orderline\". */
  `type`: Option[String])

object OrderLines {
  import DateTimeCodecs._

  implicit val OrderLinesCodecJson: CodecJson[OrderLines] = CodecJson.derive[OrderLines]
  implicit val OrderLinesDecoder: EntityDecoder[OrderLines] = jsonOf[OrderLines]
  implicit val OrderLinesEncoder: EntityEncoder[OrderLines] = jsonEncoderOf[OrderLines]
}
