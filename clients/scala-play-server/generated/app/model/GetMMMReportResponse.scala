package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for GetMMMReportResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class GetMMMReportResponse(
  code: Option[BigDecimal],
  data: Option[GetMMMReportResponseData],
  message: Option[String],
  status: Option[String]
)

object GetMMMReportResponse {
  implicit lazy val getMMMReportResponseJsonFormat: Format[GetMMMReportResponse] = Json.format[GetMMMReportResponse]
}

