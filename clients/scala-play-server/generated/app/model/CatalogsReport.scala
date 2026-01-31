package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CatalogsReport.
  * @param size Size of the report in bytes
  * @param url URL to download the report
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CatalogsReport(
  reportStatus: Option[CatalogsReport.ReportStatus.Value],
  size: Option[BigDecimal],
  url: Option[String]
)

object CatalogsReport {
  implicit lazy val catalogsReportJsonFormat: Format[CatalogsReport] = Json.format[CatalogsReport]

  // noinspection TypeAnnotation
  object ReportStatus extends Enumeration {
    val FINISHED = Value("FINISHED")
    val INPROGRESS = Value("IN_PROGRESS")

    type ReportStatus = Value
    implicit lazy val ReportStatusJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

