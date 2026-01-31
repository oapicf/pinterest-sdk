package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CreateMMMReportResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CreateMMMReportResponse(
  code: Option[BigDecimal],
  data: Option[CreateMMMReportResponseData]
)

object CreateMMMReportResponse {
  implicit lazy val createMMMReportResponseJsonFormat: Format[CreateMMMReportResponse] = Json.format[CreateMMMReportResponse]
}

