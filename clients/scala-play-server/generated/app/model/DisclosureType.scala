package model

import play.api.libs.json._

/**
  * Type of information in the page referenced by `disclosure_url`, provided either by the Food and Drug Administration (FDA) or the manufacturer.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class DisclosureType(
)

object DisclosureType {
  implicit lazy val disclosureTypeJsonFormat: Format[DisclosureType] = Json.format[DisclosureType]
}

