package model

import play.api.libs.json._

/**
  * Audience sharing type: [\"CUSTOM\", \"SYNDICATED\"]
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class AudienceSharingType(
)

object AudienceSharingType {
  implicit lazy val audienceSharingTypeJsonFormat: Format[AudienceSharingType] = Json.format[AudienceSharingType]
}

