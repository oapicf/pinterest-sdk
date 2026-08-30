package model

import play.api.libs.json._

/**
  * Filter audiences by ownership type.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class AudienceOwnershipType(
)

object AudienceOwnershipType {
  implicit lazy val audienceOwnershipTypeJsonFormat: Format[AudienceOwnershipType] = Json.format[AudienceOwnershipType]
}

