package model

import play.api.libs.json._

/**
  * Log event type for integration applications.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class IntegrationLogEventType(
)

object IntegrationLogEventType {
  implicit lazy val integrationLogEventTypeJsonFormat: Format[IntegrationLogEventType] = Json.format[IntegrationLogEventType]
}

