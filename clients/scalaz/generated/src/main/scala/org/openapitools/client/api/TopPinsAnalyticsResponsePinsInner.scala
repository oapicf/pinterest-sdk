package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import TopPinsAnalyticsResponsePinsInner._

case class TopPinsAnalyticsResponsePinsInner (
  /* The metric name and daily value for each requested metric */
  metrics: Option[Map[String, BigDecimal]],
dataStatus: Option[Map[String, DataStatus]],
/* The pin id */
  pinId: Option[String])

object TopPinsAnalyticsResponsePinsInner {
  import DateTimeCodecs._

  implicit val TopPinsAnalyticsResponsePinsInnerCodecJson: CodecJson[TopPinsAnalyticsResponsePinsInner] = CodecJson.derive[TopPinsAnalyticsResponsePinsInner]
  implicit val TopPinsAnalyticsResponsePinsInnerDecoder: EntityDecoder[TopPinsAnalyticsResponsePinsInner] = jsonOf[TopPinsAnalyticsResponsePinsInner]
  implicit val TopPinsAnalyticsResponsePinsInnerEncoder: EntityEncoder[TopPinsAnalyticsResponsePinsInner] = jsonEncoderOf[TopPinsAnalyticsResponsePinsInner]
}
