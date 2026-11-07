package model

import play.api.libs.json._

/**
  * Resource create operation model.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T02:59:47.831280460Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class IntegrationLogsRequestCreate(
  logs: List[IntegrationLog]
)

object IntegrationLogsRequestCreate {
  implicit lazy val integrationLogsRequestCreateJsonFormat: Format[IntegrationLogsRequestCreate] = Json.format[IntegrationLogsRequestCreate]
}

