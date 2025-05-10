package model

import play.api.libs.json._

/**
  * Report parameters
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T05:44:38.070631387Z[Etc/UTC]", comments = "Generator version: 7.12.0")
case class CatalogsReportParameters(
  catalogType: CatalogsType,
  report: CatalogsHotelReportParametersReport
)

object CatalogsReportParameters {
  implicit lazy val catalogsReportParametersJsonFormat: Format[CatalogsReportParameters] = Json.format[CatalogsReportParameters]
}

