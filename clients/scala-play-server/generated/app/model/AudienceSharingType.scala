package model

import play.api.libs.json._

/**
  * Audience sharing type: [\"CUSTOM\", \"SYNDICATED\"]
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class AudienceSharingType(
)

object AudienceSharingType {
  implicit lazy val audienceSharingTypeJsonFormat: Format[AudienceSharingType] = Json.format[AudienceSharingType]
}

