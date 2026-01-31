package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CreateMMMReportResponseData.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CreateMMMReportResponseData(
  message: Option[String],
  reportStatus: Option[BulkReportingJobStatus],
  status: Option[String],
  token: Option[String]
)

object CreateMMMReportResponseData {
  implicit lazy val createMMMReportResponseDataJsonFormat: Format[CreateMMMReportResponseData] = Json.format[CreateMMMReportResponseData]
}

