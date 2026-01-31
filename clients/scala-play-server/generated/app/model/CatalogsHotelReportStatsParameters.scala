package model

import play.api.libs.json._

/**
  * Parameters for hotel report
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CatalogsHotelReportStatsParameters(
  catalogType: CatalogsHotelReportStatsParameters.CatalogType.Value,
  report: CatalogsHotelReportStatsParametersReport
)

object CatalogsHotelReportStatsParameters {
  implicit lazy val catalogsHotelReportStatsParametersJsonFormat: Format[CatalogsHotelReportStatsParameters] = Json.format[CatalogsHotelReportStatsParameters]

  // noinspection TypeAnnotation
  object CatalogType extends Enumeration {
    val HOTEL = Value("HOTEL")

    type CatalogType = Value
    implicit lazy val CatalogTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

