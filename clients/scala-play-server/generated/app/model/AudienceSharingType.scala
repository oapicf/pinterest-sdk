package model

import play.api.libs.json._

/**
  * Audience sharing type: [\"CUSTOM\", \"SYNDICATED\"]
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T05:44:38.070631387Z[Etc/UTC]", comments = "Generator version: 7.12.0")
case class AudienceSharingType(
)

object AudienceSharingType {
  implicit lazy val audienceSharingTypeJsonFormat: Format[AudienceSharingType] = Json.format[AudienceSharingType]
}

