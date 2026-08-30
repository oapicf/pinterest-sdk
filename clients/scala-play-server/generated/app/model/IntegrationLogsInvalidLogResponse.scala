package model

import play.api.libs.json._

/**
  * Schema describing the response when a log has invalid fields.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class IntegrationLogsInvalidLogResponse(
  rejectedLogs: Option[List[IntegrationLogsInvalidLogResponseRejectedLogsItems]]
)

object IntegrationLogsInvalidLogResponse {
  implicit lazy val integrationLogsInvalidLogResponseJsonFormat: Format[IntegrationLogsInvalidLogResponse] = Json.format[IntegrationLogsInvalidLogResponse]
}

