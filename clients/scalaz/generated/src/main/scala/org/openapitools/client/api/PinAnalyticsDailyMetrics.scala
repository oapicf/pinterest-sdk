package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PinAnalyticsDailyMetrics._

case class PinAnalyticsDailyMetrics (
  dataStatus: Option[DataStatus],
/* Metrics date (UTC): YYYY-MM-DD. */
  date: Option[String],
metrics: Option[Map[String, BigDecimal]])

object PinAnalyticsDailyMetrics {
  import DateTimeCodecs._

  implicit val PinAnalyticsDailyMetricsCodecJson: CodecJson[PinAnalyticsDailyMetrics] = CodecJson.derive[PinAnalyticsDailyMetrics]
  implicit val PinAnalyticsDailyMetricsDecoder: EntityDecoder[PinAnalyticsDailyMetrics] = jsonOf[PinAnalyticsDailyMetrics]
  implicit val PinAnalyticsDailyMetricsEncoder: EntityEncoder[PinAnalyticsDailyMetrics] = jsonEncoderOf[PinAnalyticsDailyMetrics]
}
