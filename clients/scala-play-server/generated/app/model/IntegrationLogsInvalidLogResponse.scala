package model

import play.api.libs.json._

/**
  * Schema describing the response when a log has invalid fields.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:25:30.649114982Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class IntegrationLogsInvalidLogResponse(
  rejectedLogs: Option[List[IntegrationLogsInvalidLogResponseRejectedLogsItems]]
)

object IntegrationLogsInvalidLogResponse {
  implicit lazy val integrationLogsInvalidLogResponseJsonFormat: Format[IntegrationLogsInvalidLogResponse] = Json.format[IntegrationLogsInvalidLogResponse]
}

