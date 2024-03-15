package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ImageMetadata.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
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

