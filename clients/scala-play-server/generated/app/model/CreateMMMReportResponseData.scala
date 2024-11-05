package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CreateMMMReportResponseData.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class CreateMMMReportResponseData(
  reportStatus: Option[BulkReportingJobStatus],
  token: Option[String],
  message: Option[String],
  status: Option[String]
)

object CreateMMMReportResponseData {
  implicit lazy val createMMMReportResponseDataJsonFormat: Format[CreateMMMReportResponseData] = Json.format[CreateMMMReportResponseData]
}

