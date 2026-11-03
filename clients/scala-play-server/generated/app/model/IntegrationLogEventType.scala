package model

import play.api.libs.json._

/**
  * Log event type for integration applications.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:25:30.649114982Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class IntegrationLogEventType(
)

object IntegrationLogEventType {
  implicit lazy val integrationLogEventTypeJsonFormat: Format[IntegrationLogEventType] = Json.format[IntegrationLogEventType]
}

