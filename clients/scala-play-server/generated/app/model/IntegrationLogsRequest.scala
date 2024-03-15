package model

import play.api.libs.json._

/**
  * Batch of logs sent from an integration application.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class IntegrationLogsRequest(
  logs: List[IntegrationLog]
)

object IntegrationLogsRequest {
  implicit lazy val integrationLogsRequestJsonFormat: Format[IntegrationLogsRequest] = Json.format[IntegrationLogsRequest]
}

