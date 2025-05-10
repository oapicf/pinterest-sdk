package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CreateMMMReportResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T05:44:38.070631387Z[Etc/UTC]", comments = "Generator version: 7.12.0")
case class CreateMMMReportResponse(
  code: Option[BigDecimal],
  data: Option[CreateMMMReportResponseData]
)

object CreateMMMReportResponse {
  implicit lazy val createMMMReportResponseJsonFormat: Format[CreateMMMReportResponse] = Json.format[CreateMMMReportResponse]
}

