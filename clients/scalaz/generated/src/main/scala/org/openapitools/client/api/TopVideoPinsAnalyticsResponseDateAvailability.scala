package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import TopVideoPinsAnalyticsResponseDateAvailability._

case class TopVideoPinsAnalyticsResponseDateAvailability (
  isRealtime: Option[Boolean],
latestAvailableTimestamp: Option[BigDecimal])

object TopVideoPinsAnalyticsResponseDateAvailability {
  import DateTimeCodecs._

  implicit val TopVideoPinsAnalyticsResponseDateAvailabilityCodecJson: CodecJson[TopVideoPinsAnalyticsResponseDateAvailability] = CodecJson.derive[TopVideoPinsAnalyticsResponseDateAvailability]
  implicit val TopVideoPinsAnalyticsResponseDateAvailabilityDecoder: EntityDecoder[TopVideoPinsAnalyticsResponseDateAvailability] = jsonOf[TopVideoPinsAnalyticsResponseDateAvailability]
  implicit val TopVideoPinsAnalyticsResponseDateAvailabilityEncoder: EntityEncoder[TopVideoPinsAnalyticsResponseDateAvailability] = jsonEncoderOf[TopVideoPinsAnalyticsResponseDateAvailability]
}
