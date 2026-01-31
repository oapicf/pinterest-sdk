package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AnalyticsMetricsResponse.
  * @param summaryMetrics The metric name and value over the requested period for each requested metric
  * @param dailyMetrics Array with the requested daily metric records
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-26T05:47:41.394513697Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class AnalyticsMetricsResponse(
  summaryMetrics: Option[Map[String, BigDecimal]],
  dailyMetrics: Option[List[AnalyticsDailyMetrics]]
)

object AnalyticsMetricsResponse {
  implicit lazy val analyticsMetricsResponseJsonFormat: Format[AnalyticsMetricsResponse] = Json.format[AnalyticsMetricsResponse]
}

