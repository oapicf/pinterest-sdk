package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ImageMetadata.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
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

