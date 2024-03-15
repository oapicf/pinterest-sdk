package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for GetMMMReportResponseData.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
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

