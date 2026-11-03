package model

import play.api.libs.json._

/**
  * Type of information in the page referenced by `disclosure_url`, provided either by the Food and Drug Administration (FDA) or the manufacturer.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:25:30.649114982Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class DisclosureType(
)

object DisclosureType {
  implicit lazy val disclosureTypeJsonFormat: Format[DisclosureType] = Json.format[DisclosureType]
}

