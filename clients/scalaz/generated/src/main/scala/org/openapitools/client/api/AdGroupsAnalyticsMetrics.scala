package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.time.LocalDate

import AdGroupsAnalyticsMetrics._

case class AdGroupsAnalyticsMetrics (
  /* The ID of the ad group that this metrics belongs to. Returned as long as aggregate_report_rows is not true. */
  AD_GROUP_ID: Option[String],
/* Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`) */
  DATE: Option[LocalDate])

object AdGroupsAnalyticsMetrics {
  import DateTimeCodecs._

  implicit val AdGroupsAnalyticsMetricsCodecJson: CodecJson[AdGroupsAnalyticsMetrics] = CodecJson.derive[AdGroupsAnalyticsMetrics]
  implicit val AdGroupsAnalyticsMetricsDecoder: EntityDecoder[AdGroupsAnalyticsMetrics] = jsonOf[AdGroupsAnalyticsMetrics]
  implicit val AdGroupsAnalyticsMetricsEncoder: EntityEncoder[AdGroupsAnalyticsMetrics] = jsonEncoderOf[AdGroupsAnalyticsMetrics]
}
