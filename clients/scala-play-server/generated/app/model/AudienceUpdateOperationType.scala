package model

import play.api.libs.json._

/**
  * Audience operation type (update or remove).
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class AudienceUpdateOperationType(
)

object AudienceUpdateOperationType {
  implicit lazy val audienceUpdateOperationTypeJsonFormat: Format[AudienceUpdateOperationType] = Json.format[AudienceUpdateOperationType]
}

