package model

import play.api.libs.json._

/**
  * Schema describing the response when a log has invalid fields.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class IntegrationLogsInvalidLogResponse(
  rejectedLogs: Option[List[IntegrationLogsInvalidLogResponseRejectedLogsInner]]
)

object IntegrationLogsInvalidLogResponse {
  implicit lazy val integrationLogsInvalidLogResponseJsonFormat: Format[IntegrationLogsInvalidLogResponse] = Json.format[IntegrationLogsInvalidLogResponse]
}

