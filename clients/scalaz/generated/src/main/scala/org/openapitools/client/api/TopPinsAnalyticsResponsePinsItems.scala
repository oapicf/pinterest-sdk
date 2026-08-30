package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import TopPinsAnalyticsResponsePinsItems._

case class TopPinsAnalyticsResponsePinsItems (
  dataStatus: Option[Map[String, DataStatus]],
metrics: Option[Map[String, BigDecimal]],
/* The pin id */
  pinId: Option[String])

object TopPinsAnalyticsResponsePinsItems {
  import DateTimeCodecs._

  implicit val TopPinsAnalyticsResponsePinsItemsCodecJson: CodecJson[TopPinsAnalyticsResponsePinsItems] = CodecJson.derive[TopPinsAnalyticsResponsePinsItems]
  implicit val TopPinsAnalyticsResponsePinsItemsDecoder: EntityDecoder[TopPinsAnalyticsResponsePinsItems] = jsonOf[TopPinsAnalyticsResponsePinsItems]
  implicit val TopPinsAnalyticsResponsePinsItemsEncoder: EntityEncoder[TopPinsAnalyticsResponsePinsItems] = jsonEncoderOf[TopPinsAnalyticsResponsePinsItems]
}
