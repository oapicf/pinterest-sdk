package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PinAnalyticsMetricsResponse._

case class PinAnalyticsMetricsResponse (
  /* The lifetime metric name and value. */
  lifetimeMetrics: Option[Map[String, Integer]],
/* Array with the requested daily metric records */
  dailyMetrics: Option[List[PinAnalyticsMetricsResponseDailyMetricsInner]],
/* The metric name and value over the requested period for each requested metric */
  summaryMetrics: Option[Map[String, BigDecimal]])

object PinAnalyticsMetricsResponse {
  import DateTimeCodecs._

  implicit val PinAnalyticsMetricsResponseCodecJson: CodecJson[PinAnalyticsMetricsResponse] = CodecJson.derive[PinAnalyticsMetricsResponse]
  implicit val PinAnalyticsMetricsResponseDecoder: EntityDecoder[PinAnalyticsMetricsResponse] = jsonOf[PinAnalyticsMetricsResponse]
  implicit val PinAnalyticsMetricsResponseEncoder: EntityEncoder[PinAnalyticsMetricsResponse] = jsonEncoderOf[PinAnalyticsMetricsResponse]
}
