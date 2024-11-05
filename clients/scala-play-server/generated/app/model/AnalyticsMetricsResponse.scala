package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AnalyticsMetricsResponse.
  * @param summaryMetrics The metric name and value over the requested period for each requested metric
  * @param dailyMetrics Array with the requested daily metric records
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class AnalyticsMetricsResponse(
  summaryMetrics: Option[Map[String, BigDecimal]],
  dailyMetrics: Option[List[AnalyticsDailyMetrics]]
)

object AnalyticsMetricsResponse {
  implicit lazy val analyticsMetricsResponseJsonFormat: Format[AnalyticsMetricsResponse] = Json.format[AnalyticsMetricsResponse]
}

