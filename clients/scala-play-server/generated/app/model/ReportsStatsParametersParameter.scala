package model

import play.api.libs.json._

/**
  * Report stats parameters
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class ReportsStatsParametersParameter(
  catalogType: CatalogsType,
  report: CatalogsHotelReportStatsParametersReport
)

object ReportsStatsParametersParameter {
  implicit lazy val reportsStatsParametersParameterJsonFormat: Format[ReportsStatsParametersParameter] = Json.format[ReportsStatsParametersParameter]
}

