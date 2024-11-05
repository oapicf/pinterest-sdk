package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ImageMetadata_images.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class ImageMetadataImages(
  `150x150`: Option[ImageDetails],
  `400x300`: Option[ImageDetails],
  `600x`: Option[ImageDetails],
  `1200x`: Option[ImageDetails]
)

object ImageMetadataImages {
  implicit lazy val imageMetadataImagesJsonFormat: Format[ImageMetadataImages] = Json.format[ImageMetadataImages]
}

