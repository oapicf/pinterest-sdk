package model

import play.api.libs.json._

/**
  * Parameters for retail report
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
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

