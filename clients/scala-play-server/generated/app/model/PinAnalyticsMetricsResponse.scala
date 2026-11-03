package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for PinAnalyticsMetricsResponse.
  * @param dailyMetrics Array with the requested daily metric records
  * @param lifetimeMetrics The lifetime metric name and value.
  * @param summaryMetrics The metric name and value over the requested period for each requested metric
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:25:30.649114982Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class PinAnalyticsMetricsResponse(
  dailyMetrics: Option[List[PinAnalyticsDailyMetrics]],
  lifetimeMetrics: Option[Map[String, Int]],
  summaryMetrics: Option[Map[String, BigDecimal]],
)

object PinAnalyticsMetricsResponse {
  implicit lazy val pinAnalyticsMetricsResponseJsonFormat: Format[PinAnalyticsMetricsResponse] = Json.format[PinAnalyticsMetricsResponse]
}

