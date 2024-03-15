package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import OrderLines._

case class OrderLines (
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
  paidType: Option[OrderLinePaidType])

object OrderLines {
  import DateTimeCodecs._

  implicit val OrderLinesCodecJson: CodecJson[OrderLines] = CodecJson.derive[OrderLines]
  implicit val OrderLinesDecoder: EntityDecoder[OrderLines] = jsonOf[OrderLines]
  implicit val OrderLinesEncoder: EntityEncoder[OrderLines] = jsonEncoderOf[OrderLines]
}
