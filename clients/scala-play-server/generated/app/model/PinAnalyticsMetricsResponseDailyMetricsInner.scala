package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for PinAnalyticsMetricsResponse_daily_metrics_inner.
  * @param date Metrics date (UTC): YYYY-MM-DD.
  * @param metrics The metric name and daily value for each requested metric
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class PinAnalyticsMetricsResponseDailyMetricsInner(
  dataStatus: Option[DataStatus],
  date: Option[String],
  metrics: Option[Map[String, BigDecimal]],
)

object PinAnalyticsMetricsResponseDailyMetricsInner {
  implicit lazy val pinAnalyticsMetricsResponseDailyMetricsInnerJsonFormat: Format[PinAnalyticsMetricsResponseDailyMetricsInner] = Json.format[PinAnalyticsMetricsResponseDailyMetricsInner]
}

