package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CreateMMMReportResponseData.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class CreateMMMReportResponseData(
  reportStatus: Option[BulkReportingJobStatus],
  token: Option[String],
  message: Option[String],
  status: Option[String]
)

object CreateMMMReportResponseData {
  implicit lazy val createMMMReportResponseDataJsonFormat: Format[CreateMMMReportResponseData] = Json.format[CreateMMMReportResponseData]
}

