package model

import play.api.libs.json._

/**
  * Log level type for integration applications.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T02:59:47.831280460Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class IntegrationLogLevel(
)

object IntegrationLogLevel {
  implicit lazy val integrationLogLevelJsonFormat: Format[IntegrationLogLevel] = Json.format[IntegrationLogLevel]
}

