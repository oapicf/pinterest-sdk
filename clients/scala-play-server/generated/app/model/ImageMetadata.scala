package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ImageMetadata.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T05:44:38.070631387Z[Etc/UTC]", comments = "Generator version: 7.12.0")
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

