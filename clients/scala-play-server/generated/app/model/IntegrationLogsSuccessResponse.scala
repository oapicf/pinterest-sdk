package model

import play.api.libs.json._

/**
  * Response when logs are successfully processed.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class IntegrationLogsSuccessResponse(
  message: Option[String]
)

object IntegrationLogsSuccessResponse {
  implicit lazy val integrationLogsSuccessResponseJsonFormat: Format[IntegrationLogsSuccessResponse] = Json.format[IntegrationLogsSuccessResponse]
}

