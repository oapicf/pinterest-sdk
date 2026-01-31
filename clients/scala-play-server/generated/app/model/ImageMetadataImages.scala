package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ImageMetadata_images.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-26T05:47:41.394513697Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class ImageMetadataImages(
  `150x150`: Option[ImageDetails],
  `400x300`: Option[ImageDetails],
  `600x`: Option[ImageDetails],
  `1200x`: Option[ImageDetails]
)

object ImageMetadataImages {
  implicit lazy val imageMetadataImagesJsonFormat: Format[ImageMetadataImages] = Json.format[ImageMetadataImages]
}

