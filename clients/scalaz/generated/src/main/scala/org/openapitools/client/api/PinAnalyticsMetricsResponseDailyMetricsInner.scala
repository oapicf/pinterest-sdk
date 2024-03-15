package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PinAnalyticsMetricsResponseDailyMetricsInner._

case class PinAnalyticsMetricsResponseDailyMetricsInner (
  dataStatus: Option[DataStatus],
/* Metrics date (UTC): YYYY-MM-DD. */
  date: Option[String],
/* The metric name and daily value for each requested metric */
  metrics: Option[Map[String, BigDecimal]])

object PinAnalyticsMetricsResponseDailyMetricsInner {
  import DateTimeCodecs._

  implicit val PinAnalyticsMetricsResponseDailyMetricsInnerCodecJson: CodecJson[PinAnalyticsMetricsResponseDailyMetricsInner] = CodecJson.derive[PinAnalyticsMetricsResponseDailyMetricsInner]
  implicit val PinAnalyticsMetricsResponseDailyMetricsInnerDecoder: EntityDecoder[PinAnalyticsMetricsResponseDailyMetricsInner] = jsonOf[PinAnalyticsMetricsResponseDailyMetricsInner]
  implicit val PinAnalyticsMetricsResponseDailyMetricsInnerEncoder: EntityEncoder[PinAnalyticsMetricsResponseDailyMetricsInner] = jsonEncoderOf[PinAnalyticsMetricsResponseDailyMetricsInner]
}
