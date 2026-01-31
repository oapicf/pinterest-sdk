package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CreateMMMReportResponseData.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-26T05:47:41.394513697Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CreateMMMReportResponseData(
  reportStatus: Option[BulkReportingJobStatus],
  token: Option[String],
  message: Option[String],
  status: Option[String]
)

object CreateMMMReportResponseData {
  implicit lazy val createMMMReportResponseDataJsonFormat: Format[CreateMMMReportResponseData] = Json.format[CreateMMMReportResponseData]
}

