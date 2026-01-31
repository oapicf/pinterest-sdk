package model

import play.api.libs.json._

/**
  * Pin with multiple images.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class PinMediaWithImages(
  items: Option[List[ImageMetadata]],
  mediaType: PinMediaWithImages.MediaType.Value
)

object PinMediaWithImages {
  implicit lazy val pinMediaWithImagesJsonFormat: Format[PinMediaWithImages] = Json.format[PinMediaWithImages]

  // noinspection TypeAnnotation
  object MediaType extends Enumeration {
    val MultipleImages = Value("multiple_images")

    type MediaType = Value
    implicit lazy val MediaTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

