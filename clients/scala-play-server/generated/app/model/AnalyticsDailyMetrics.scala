package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AnalyticsDailyMetrics.
  * @param date Metrics date (UTC): YYYY-MM-DD.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class AnalyticsDailyMetrics(
  dataStatus: Option[DataStatus],
  date: Option[String],
  metrics: Option[Map[String, BigDecimal]],
)

object AnalyticsDailyMetrics {
  implicit lazy val analyticsDailyMetricsJsonFormat: Format[AnalyticsDailyMetrics] = Json.format[AnalyticsDailyMetrics]
}

