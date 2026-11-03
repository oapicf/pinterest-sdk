package model

import play.api.libs.json._

/**
  * Report granularity for time-based aggregation: - TOTAL: Metrics are aggregated over the specified date range - WEEK: Metrics are broken down weekly - MONTH: Metrics are broken down monthly
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:25:30.649114982Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class ConversionProductReportGranularity(
)

object ConversionProductReportGranularity {
  implicit lazy val conversionProductReportGranularityJsonFormat: Format[ConversionProductReportGranularity] = Json.format[ConversionProductReportGranularity]
}

