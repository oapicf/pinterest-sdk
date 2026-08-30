package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AdsAnalyticsMetricsFilter.
  * @param values List of values for filtering
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class AdsAnalyticsMetricsFilter(
  field: AdsAnalyticsFilterColumn,
  operator: AdsAnalyticsFilterOperator,
  values: List[BigDecimal]
)

object AdsAnalyticsMetricsFilter {
  implicit lazy val adsAnalyticsMetricsFilterJsonFormat: Format[AdsAnalyticsMetricsFilter] = Json.format[AdsAnalyticsMetricsFilter]
}

