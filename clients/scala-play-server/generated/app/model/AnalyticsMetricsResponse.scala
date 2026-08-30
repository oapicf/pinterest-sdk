package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AnalyticsMetricsResponse.
  * @param dailyMetrics Array with the requested daily metric records
  * @param summaryMetrics The metric name and value over the requested period for each requested metric
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class AnalyticsMetricsResponse(
  dailyMetrics: Option[List[AnalyticsDailyMetrics]],
  summaryMetrics: Option[Map[String, BigDecimal]],
)

object AnalyticsMetricsResponse {
  implicit lazy val analyticsMetricsResponseJsonFormat: Format[AnalyticsMetricsResponse] = Json.format[AnalyticsMetricsResponse]
}

