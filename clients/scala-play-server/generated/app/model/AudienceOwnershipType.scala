package model

import play.api.libs.json._

/**
  * Filter audiences by ownership type.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:25:30.649114982Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class AudienceOwnershipType(
)

object AudienceOwnershipType {
  implicit lazy val audienceOwnershipTypeJsonFormat: Format[AudienceOwnershipType] = Json.format[AudienceOwnershipType]
}

