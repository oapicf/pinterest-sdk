package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ImageMetadata.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-26T05:47:41.394513697Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class ImageMetadata(
  itemType: Option[String],
  title: Option[String],
  description: Option[String],
  link: Option[String],
  images: Option[ImageMetadataImages]
)

object ImageMetadata {
  implicit lazy val imageMetadataJsonFormat: Format[ImageMetadata] = Json.format[ImageMetadata]
}

