package model

import play.api.libs.json._

/**
  * Pin with image.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2022-07-01T12:06:32.599878Z[Etc/UTC]")
case class PinMediaWithImage(
  images: Option[Map[String, ImageDetails]],
  mediaType: Option[String]
)

object PinMediaWithImage {
  implicit lazy val pinMediaWithImageJsonFormat: Format[PinMediaWithImage] = Json.format[PinMediaWithImage]
}

