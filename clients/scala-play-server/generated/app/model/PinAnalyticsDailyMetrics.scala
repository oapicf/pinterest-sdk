package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for PinAnalyticsDailyMetrics.
  * @param date Metrics date (UTC): YYYY-MM-DD.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T04:12:42.952922086Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class PinAnalyticsDailyMetrics(
  dataStatus: Option[DataStatus],
  date: Option[String],
  metrics: Option[Map[String, BigDecimal]],
)

object PinAnalyticsDailyMetrics {
  implicit lazy val pinAnalyticsDailyMetricsJsonFormat: Format[PinAnalyticsDailyMetrics] = Json.format[PinAnalyticsDailyMetrics]
}

