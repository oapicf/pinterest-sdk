package model

import play.api.libs.json._

/**
  * Pin with image.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class PinMediaWithImage(
  mediaType: Option[String],
  images: Option[ImageMetadataImages]
)

object PinMediaWithImage {
  implicit lazy val pinMediaWithImageJsonFormat: Format[PinMediaWithImage] = Json.format[PinMediaWithImage]
}

