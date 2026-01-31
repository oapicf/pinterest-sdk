package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CatalogsReport.
  * @param url URL to download the report
  * @param size Size of the report in bytes
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-26T05:47:41.394513697Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CatalogsReport(
  reportStatus: Option[CatalogsReport.ReportStatus.Value],
  url: Option[String],
  size: Option[BigDecimal]
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

