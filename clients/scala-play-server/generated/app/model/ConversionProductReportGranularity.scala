package model

import play.api.libs.json._

/**
  * Report granularity for time-based aggregation: - TOTAL: Metrics are aggregated over the specified date range - WEEK: Metrics are broken down weekly - MONTH: Metrics are broken down monthly
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T04:12:42.952922086Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class ConversionProductReportGranularity(
)

object ConversionProductReportGranularity {
  implicit lazy val conversionProductReportGranularityJsonFormat: Format[ConversionProductReportGranularity] = Json.format[ConversionProductReportGranularity]
}

