package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AdsAnalyticsMetricsFilter.
  * @param values List of values for filtering
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class AdsAnalyticsMetricsFilter(
  field: AdsAnalyticsFilterColumn,
  operator: AdsAnalyticsFilterOperator,
  values: List[BigDecimal]
)

object AdsAnalyticsMetricsFilter {
  implicit lazy val adsAnalyticsMetricsFilterJsonFormat: Format[AdsAnalyticsMetricsFilter] = Json.format[AdsAnalyticsMetricsFilter]
}

