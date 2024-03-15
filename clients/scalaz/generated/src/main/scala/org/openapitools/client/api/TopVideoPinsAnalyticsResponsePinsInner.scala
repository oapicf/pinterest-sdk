package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import TopVideoPinsAnalyticsResponsePinsInner._

case class TopVideoPinsAnalyticsResponsePinsInner (
  /* The metric name and daily value for each requested metric */
  metrics: Option[Map[String, BigDecimal]],
dataStatus: Option[Map[String, DataStatus]],
/* The pin id */
  pinId: Option[String])

object TopVideoPinsAnalyticsResponsePinsInner {
  import DateTimeCodecs._

  implicit val TopVideoPinsAnalyticsResponsePinsInnerCodecJson: CodecJson[TopVideoPinsAnalyticsResponsePinsInner] = CodecJson.derive[TopVideoPinsAnalyticsResponsePinsInner]
  implicit val TopVideoPinsAnalyticsResponsePinsInnerDecoder: EntityDecoder[TopVideoPinsAnalyticsResponsePinsInner] = jsonOf[TopVideoPinsAnalyticsResponsePinsInner]
  implicit val TopVideoPinsAnalyticsResponsePinsInnerEncoder: EntityEncoder[TopVideoPinsAnalyticsResponsePinsInner] = jsonEncoderOf[TopVideoPinsAnalyticsResponsePinsInner]
}
