package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for PinAnalyticsMetricsResponse.
  * @param lifetimeMetrics The lifetime metric name and value.
  * @param dailyMetrics Array with the requested daily metric records
  * @param summaryMetrics The metric name and value over the requested period for each requested metric
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T05:44:38.070631387Z[Etc/UTC]", comments = "Generator version: 7.12.0")
case class PinAnalyticsMetricsResponse(
  lifetimeMetrics: Option[Map[String, Int]],
  dailyMetrics: Option[List[PinAnalyticsMetricsResponseDailyMetricsInner]],
  summaryMetrics: Option[Map[String, BigDecimal]],
)

object PinAnalyticsMetricsResponse {
  implicit lazy val pinAnalyticsMetricsResponseJsonFormat: Format[PinAnalyticsMetricsResponse] = Json.format[PinAnalyticsMetricsResponse]
}

