package model

import play.api.libs.json._

/**
  * Parameters for hotel report
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class CatalogsHotelReportParameters(
  catalogType: CatalogsHotelReportParameters.CatalogType.Value,
  report: CatalogsHotelReportParametersReport
)

object CatalogsHotelReportParameters {
  implicit lazy val catalogsHotelReportParametersJsonFormat: Format[CatalogsHotelReportParameters] = Json.format[CatalogsHotelReportParameters]

  // noinspection TypeAnnotation
  object CatalogType extends Enumeration {
    val HOTEL = Value("HOTEL")

    type CatalogType = Value
    implicit lazy val CatalogTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

