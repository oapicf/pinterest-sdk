package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AnalyticsDailyMetrics.
  * @param date Metrics date (UTC): YYYY-MM-DD.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:25:30.649114982Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class AnalyticsDailyMetrics(
  dataStatus: Option[DataStatus],
  date: Option[String],
  metrics: Option[Map[String, BigDecimal]],
)

object AnalyticsDailyMetrics {
  implicit lazy val analyticsDailyMetricsJsonFormat: Format[AnalyticsDailyMetrics] = Json.format[AnalyticsDailyMetrics]
}

