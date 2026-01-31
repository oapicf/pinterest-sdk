package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for integrations_logs_post_400_response.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class IntegrationsLogsPost400Response(
  code: Int,
  message: String,
  details: JsObject
)

object IntegrationsLogsPost400Response {
  implicit lazy val integrationsLogsPost400ResponseJsonFormat: Format[IntegrationsLogsPost400Response] = Json.format[IntegrationsLogsPost400Response]
}

