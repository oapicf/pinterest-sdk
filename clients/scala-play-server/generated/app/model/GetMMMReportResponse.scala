package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for GetMMMReportResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class GetMMMReportResponse(
  code: Option[BigDecimal],
  data: Option[GetMMMReportResponseData],
  message: Option[String],
  status: Option[String]
)

object GetMMMReportResponse {
  implicit lazy val getMMMReportResponseJsonFormat: Format[GetMMMReportResponse] = Json.format[GetMMMReportResponse]
}

