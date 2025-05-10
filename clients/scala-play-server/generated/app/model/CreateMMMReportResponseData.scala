package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CreateMMMReportResponseData.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T05:44:38.070631387Z[Etc/UTC]", comments = "Generator version: 7.12.0")
case class CreateMMMReportResponseData(
  reportStatus: Option[BulkReportingJobStatus],
  token: Option[String],
  message: Option[String],
  status: Option[String]
)

object CreateMMMReportResponseData {
  implicit lazy val createMMMReportResponseDataJsonFormat: Format[CreateMMMReportResponseData] = Json.format[CreateMMMReportResponseData]
}

