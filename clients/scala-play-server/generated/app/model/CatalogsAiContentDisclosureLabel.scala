package model

import play.api.libs.json._

/**
  * Disclosure label for AI-generated or AI-modified content in a catalog item asset.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class CatalogsAiContentDisclosureLabel(
)

object CatalogsAiContentDisclosureLabel {
  implicit lazy val catalogsAiContentDisclosureLabelJsonFormat: Format[CatalogsAiContentDisclosureLabel] = Json.format[CatalogsAiContentDisclosureLabel]
}

