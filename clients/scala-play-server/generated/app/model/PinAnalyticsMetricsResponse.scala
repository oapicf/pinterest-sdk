package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for PinAnalyticsMetricsResponse.
  * @param lifetimeMetrics The lifetime metric name and value.
  * @param dailyMetrics Array with the requested daily metric records
  * @param summaryMetrics The metric name and value over the requested period for each requested metric
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-26T05:47:41.394513697Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class PinAnalyticsMetricsResponse(
  lifetimeMetrics: Option[Map[String, Int]],
  dailyMetrics: Option[List[PinAnalyticsMetricsResponseDailyMetricsInner]],
  summaryMetrics: Option[Map[String, BigDecimal]],
)

object PinAnalyticsMetricsResponse {
  implicit lazy val pinAnalyticsMetricsResponseJsonFormat: Format[PinAnalyticsMetricsResponse] = Json.format[PinAnalyticsMetricsResponse]
}

