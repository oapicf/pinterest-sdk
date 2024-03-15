package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AnalyticsMetricsResponse._

case class AnalyticsMetricsResponse (
  /* The metric name and value over the requested period for each requested metric */
  summaryMetrics: Option[Map[String, BigDecimal]],
/* Array with the requested daily metric records */
  dailyMetrics: Option[List[AnalyticsDailyMetrics]])

object AnalyticsMetricsResponse {
  import DateTimeCodecs._

  implicit val AnalyticsMetricsResponseCodecJson: CodecJson[AnalyticsMetricsResponse] = CodecJson.derive[AnalyticsMetricsResponse]
  implicit val AnalyticsMetricsResponseDecoder: EntityDecoder[AnalyticsMetricsResponse] = jsonOf[AnalyticsMetricsResponse]
  implicit val AnalyticsMetricsResponseEncoder: EntityEncoder[AnalyticsMetricsResponse] = jsonEncoderOf[AnalyticsMetricsResponse]
}
