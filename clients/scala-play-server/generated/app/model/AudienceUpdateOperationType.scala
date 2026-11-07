package model

import play.api.libs.json._

/**
  * Audience operation type (update or remove).
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T04:12:42.952922086Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class AudienceUpdateOperationType(
)

object AudienceUpdateOperationType {
  implicit lazy val audienceUpdateOperationTypeJsonFormat: Format[AudienceUpdateOperationType] = Json.format[AudienceUpdateOperationType]
}

