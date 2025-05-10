package model

import play.api.libs.json._

/**
  * Batch of logs sent from an integration application.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T05:44:38.070631387Z[Etc/UTC]", comments = "Generator version: 7.12.0")
case class IntegrationLogsRequest(
  logs: List[IntegrationLog]
)

object IntegrationLogsRequest {
  implicit lazy val integrationLogsRequestJsonFormat: Format[IntegrationLogsRequest] = Json.format[IntegrationLogsRequest]
}

