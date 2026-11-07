package model

import play.api.libs.json._

/**
  * Pin with a mix of images and videos.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T02:59:47.831280460Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class PinMediaWithImageAndVideo(
  items: Option[List[PinMediaMetadata]],
  mediaType: PinMediaWithImageAndVideo.MediaType.Value
)

object PinMediaWithImageAndVideo {
  implicit lazy val pinMediaWithImageAndVideoJsonFormat: Format[PinMediaWithImageAndVideo] = Json.format[PinMediaWithImageAndVideo]

  // noinspection TypeAnnotation
  object MediaType extends Enumeration {
    val MultipleMixed = Value("multiple_mixed")

    type MediaType = Value
    implicit lazy val MediaTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

