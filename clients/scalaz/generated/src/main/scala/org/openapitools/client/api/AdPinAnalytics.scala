package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.time.LocalDate
import java.util.HashMap

import AdPinAnalytics._

case class AdPinAnalytics (
  /* Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`) */
  DATE: Option[LocalDate],
/* The ID of the pin that the metric belongs to. */
  PIN_ID: String)

object AdPinAnalytics {
  import DateTimeCodecs._

  implicit val AdPinAnalyticsCodecJson: CodecJson[AdPinAnalytics] = CodecJson.derive[AdPinAnalytics]
  implicit val AdPinAnalyticsDecoder: EntityDecoder[AdPinAnalytics] = jsonOf[AdPinAnalytics]
  implicit val AdPinAnalyticsEncoder: EntityEncoder[AdPinAnalytics] = jsonEncoderOf[AdPinAnalytics]
}
