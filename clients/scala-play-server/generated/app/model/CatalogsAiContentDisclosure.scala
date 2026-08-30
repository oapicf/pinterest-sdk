package model

import play.api.libs.json._

/**
  * AI content disclosure for a single asset of a catalog item.
  * @param disclosure Disclosure labels that apply to this asset.
  * @param url URL of the asset. Must match one of image_link, additional_image_link, or video_link.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class CatalogsAiContentDisclosure(
  disclosure: List[CatalogsAiContentDisclosureLabel],
  url: String
)

object CatalogsAiContentDisclosure {
  implicit lazy val catalogsAiContentDisclosureJsonFormat: Format[CatalogsAiContentDisclosure] = Json.format[CatalogsAiContentDisclosure]
}

