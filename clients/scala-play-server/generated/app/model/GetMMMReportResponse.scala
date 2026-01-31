package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for GetMMMReportResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-26T05:47:41.394513697Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class GetMMMReportResponse(
  code: Option[BigDecimal],
  data: Option[GetMMMReportResponseData],
  message: Option[String],
  status: Option[String]
)

object GetMMMReportResponse {
  implicit lazy val getMMMReportResponseJsonFormat: Format[GetMMMReportResponse] = Json.format[GetMMMReportResponse]
}

