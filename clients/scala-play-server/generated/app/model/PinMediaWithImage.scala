package model

import play.api.libs.json._

/**
  * Pin with image.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class PinMediaWithImage(
  images: Option[ImageSize],
  mediaType: PinMediaWithImage.MediaType.Value
)

object PinMediaWithImage {
  implicit lazy val pinMediaWithImageJsonFormat: Format[PinMediaWithImage] = Json.format[PinMediaWithImage]

  // noinspection TypeAnnotation
  object MediaType extends Enumeration {
    val Image = Value("image")

    type MediaType = Value
    implicit lazy val MediaTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

