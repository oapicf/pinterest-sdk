package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import TopPinsAnalyticsResponseDateAvailability._

case class TopPinsAnalyticsResponseDateAvailability (
  latestAvailableTimestamp: Option[BigDecimal],
isRealtime: Option[Boolean])

object TopPinsAnalyticsResponseDateAvailability {
  import DateTimeCodecs._

  implicit val TopPinsAnalyticsResponseDateAvailabilityCodecJson: CodecJson[TopPinsAnalyticsResponseDateAvailability] = CodecJson.derive[TopPinsAnalyticsResponseDateAvailability]
  implicit val TopPinsAnalyticsResponseDateAvailabilityDecoder: EntityDecoder[TopPinsAnalyticsResponseDateAvailability] = jsonOf[TopPinsAnalyticsResponseDateAvailability]
  implicit val TopPinsAnalyticsResponseDateAvailabilityEncoder: EntityEncoder[TopPinsAnalyticsResponseDateAvailability] = jsonEncoderOf[TopPinsAnalyticsResponseDateAvailability]
}
