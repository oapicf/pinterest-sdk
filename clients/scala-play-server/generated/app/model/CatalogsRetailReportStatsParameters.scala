package model

import play.api.libs.json._

/**
  * Parameters for retail report
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class CatalogsRetailReportStatsParameters(
  catalogType: CatalogsRetailReportStatsParameters.CatalogType.Value,
  report: CatalogsRetailReportStatsParametersReport
)

object CatalogsRetailReportStatsParameters {
  implicit lazy val catalogsRetailReportStatsParametersJsonFormat: Format[CatalogsRetailReportStatsParameters] = Json.format[CatalogsRetailReportStatsParameters]

  // noinspection TypeAnnotation
  object CatalogType extends Enumeration {
    val RETAIL = Value("RETAIL")

    type CatalogType = Value
    implicit lazy val CatalogTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

