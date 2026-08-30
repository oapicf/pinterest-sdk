package model

import play.api.libs.json._
import java.time.LocalDate

/**
  * Represents the Swagger definition for CampaignsAnalyticsMetrics.
  * @param CAMPAIGN_ID The ID of the campaing that this metrics belongs to. Returned as long as aggregate_report_rows is not true.
  * @param DATE Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`)
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class CampaignsAnalyticsMetrics(
  CAMPAIGN_ID: Option[String],
  DATE: Option[LocalDate]
)

object CampaignsAnalyticsMetrics {
  implicit lazy val campaignsAnalyticsMetricsJsonFormat: Format[CampaignsAnalyticsMetrics] = Json.format[CampaignsAnalyticsMetrics]
}

