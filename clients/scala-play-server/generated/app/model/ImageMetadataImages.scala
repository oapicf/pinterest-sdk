package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ImageMetadata_images.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class ImageMetadataImages(
  `150x150`: Option[ImageDetails],
  `400x300`: Option[ImageDetails],
  `600x`: Option[ImageDetails],
  `1200x`: Option[ImageDetails]
)

object ImageMetadataImages {
  implicit lazy val imageMetadataImagesJsonFormat: Format[ImageMetadataImages] = Json.format[ImageMetadataImages]
}

