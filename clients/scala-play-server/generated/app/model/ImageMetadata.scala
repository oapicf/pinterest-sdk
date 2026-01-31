package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ImageMetadata.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class ImageMetadata(
  description: Option[String],
  images: Option[ImageSize],
  itemType: Option[String],
  link: Option[String],
  title: Option[String]
)

object ImageMetadata {
  implicit lazy val imageMetadataJsonFormat: Format[ImageMetadata] = Json.format[ImageMetadata]
}

