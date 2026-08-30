package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import TopVideoPinsAnalyticsResponsePinsItems._

case class TopVideoPinsAnalyticsResponsePinsItems (
  dataStatus: Option[Map[String, DataStatus]],
metrics: Option[Map[String, BigDecimal]],
/* The pin id */
  pinId: Option[String])

object TopVideoPinsAnalyticsResponsePinsItems {
  import DateTimeCodecs._

  implicit val TopVideoPinsAnalyticsResponsePinsItemsCodecJson: CodecJson[TopVideoPinsAnalyticsResponsePinsItems] = CodecJson.derive[TopVideoPinsAnalyticsResponsePinsItems]
  implicit val TopVideoPinsAnalyticsResponsePinsItemsDecoder: EntityDecoder[TopVideoPinsAnalyticsResponsePinsItems] = jsonOf[TopVideoPinsAnalyticsResponsePinsItems]
  implicit val TopVideoPinsAnalyticsResponsePinsItemsEncoder: EntityEncoder[TopVideoPinsAnalyticsResponsePinsItems] = jsonEncoderOf[TopVideoPinsAnalyticsResponsePinsItems]
}
