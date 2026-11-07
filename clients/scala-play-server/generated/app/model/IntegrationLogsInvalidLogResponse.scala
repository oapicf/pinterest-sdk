package model

import play.api.libs.json._

/**
  * Schema describing the response when a log has invalid fields.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T04:12:42.952922086Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class IntegrationLogsInvalidLogResponse(
  rejectedLogs: Option[List[IntegrationLogsInvalidLogResponseRejectedLogsItems]]
)

object IntegrationLogsInvalidLogResponse {
  implicit lazy val integrationLogsInvalidLogResponseJsonFormat: Format[IntegrationLogsInvalidLogResponse] = Json.format[IntegrationLogsInvalidLogResponse]
}

