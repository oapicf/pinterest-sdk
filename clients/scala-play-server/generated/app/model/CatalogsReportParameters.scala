package model

import play.api.libs.json._

/**
  * Report parameters
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class CatalogsReportParameters(
  catalogType: CatalogsType,
  report: CatalogsHotelReportParametersReport
)

object CatalogsReportParameters {
  implicit lazy val catalogsReportParametersJsonFormat: Format[CatalogsReportParameters] = Json.format[CatalogsReportParameters]
}

