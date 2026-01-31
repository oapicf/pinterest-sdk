package model

import play.api.libs.json._

/**
  * Batch of logs sent from an integration application.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-26T05:47:41.394513697Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class IntegrationLogsRequest(
  logs: List[IntegrationLog]
)

object IntegrationLogsRequest {
  implicit lazy val integrationLogsRequestJsonFormat: Format[IntegrationLogsRequest] = Json.format[IntegrationLogsRequest]
}

