package model

import play.api.libs.json._

/**
  * Parameters for retail report
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CatalogsRetailReportParameters(
  catalogType: CatalogsRetailReportParameters.CatalogType.Value,
  report: CatalogsHotelReportParametersReport
)

object CatalogsRetailReportParameters {
  implicit lazy val catalogsRetailReportParametersJsonFormat: Format[CatalogsRetailReportParameters] = Json.format[CatalogsRetailReportParameters]

  // noinspection TypeAnnotation
  object CatalogType extends Enumeration {
    val RETAIL = Value("RETAIL")

    type CatalogType = Value
    implicit lazy val CatalogTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

