package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for GetMMMReportResponseData.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class GetMMMReportResponseData(
  reportStatus: Option[GetMMMReportResponseData.ReportStatus.Value],
  size: Option[BigDecimal],
  url: Option[String]
)

object GetMMMReportResponseData {
  implicit lazy val getMMMReportResponseDataJsonFormat: Format[GetMMMReportResponseData] = Json.format[GetMMMReportResponseData]

  // noinspection TypeAnnotation
  object ReportStatus extends Enumeration {
    val DOESNOTEXIST = Value("DOES_NOT_EXIST")
    val FINISHED = Value("FINISHED")
    val INPROGRESS = Value("IN_PROGRESS")
    val EXPIRED = Value("EXPIRED")
    val FAILED = Value("FAILED")
    val CANCELLED = Value("CANCELLED")

    type ReportStatus = Value
    implicit lazy val ReportStatusJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

