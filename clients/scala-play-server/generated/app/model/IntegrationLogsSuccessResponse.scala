package model

import play.api.libs.json._

/**
  * Response when logs are successfully processed.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class IntegrationLogsSuccessResponse(
  message: Option[String]
)

object IntegrationLogsSuccessResponse {
  implicit lazy val integrationLogsSuccessResponseJsonFormat: Format[IntegrationLogsSuccessResponse] = Json.format[IntegrationLogsSuccessResponse]
}

