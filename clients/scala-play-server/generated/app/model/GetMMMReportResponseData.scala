package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for GetMMMReportResponseData.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class GetMMMReportResponseData(
  reportStatus: Option[GetMMMReportResponseData.ReportStatus.Value],
  url: Option[String],
  size: Option[BigDecimal]
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

