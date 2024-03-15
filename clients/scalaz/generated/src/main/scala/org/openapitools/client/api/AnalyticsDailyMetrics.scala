package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AnalyticsDailyMetrics._

case class AnalyticsDailyMetrics (
  dataStatus: Option[DataStatus],
/* Metrics date (UTC): YYYY-MM-DD. */
  date: Option[String],
/* The metric name and daily value for each requested metric */
  metrics: Option[Map[String, BigDecimal]])

object AnalyticsDailyMetrics {
  import DateTimeCodecs._

  implicit val AnalyticsDailyMetricsCodecJson: CodecJson[AnalyticsDailyMetrics] = CodecJson.derive[AnalyticsDailyMetrics]
  implicit val AnalyticsDailyMetricsDecoder: EntityDecoder[AnalyticsDailyMetrics] = jsonOf[AnalyticsDailyMetrics]
  implicit val AnalyticsDailyMetricsEncoder: EntityEncoder[AnalyticsDailyMetrics] = jsonEncoderOf[AnalyticsDailyMetrics]
}
