package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.time.LocalDate

import CampaignsAnalyticsMetrics._

case class CampaignsAnalyticsMetrics (
  /* The ID of the campaing that this metrics belongs to. Returned as long as aggregate_report_rows is not true. */
  CAMPAIGN_ID: Option[String],
/* Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`) */
  DATE: Option[LocalDate])

object CampaignsAnalyticsMetrics {
  import DateTimeCodecs._

  implicit val CampaignsAnalyticsMetricsCodecJson: CodecJson[CampaignsAnalyticsMetrics] = CodecJson.derive[CampaignsAnalyticsMetrics]
  implicit val CampaignsAnalyticsMetricsDecoder: EntityDecoder[CampaignsAnalyticsMetrics] = jsonOf[CampaignsAnalyticsMetrics]
  implicit val CampaignsAnalyticsMetricsEncoder: EntityEncoder[CampaignsAnalyticsMetrics] = jsonEncoderOf[CampaignsAnalyticsMetrics]
}
