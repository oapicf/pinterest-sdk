package model

import play.api.libs.json._

/**
  * Ad group billable event type. For update, only draft ad groups may update billable event.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ActionType(
)

object ActionType {
  implicit lazy val actionTypeJsonFormat: Format[ActionType] = Json.format[ActionType]
}

