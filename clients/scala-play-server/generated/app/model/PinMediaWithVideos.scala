package model

import play.api.libs.json._

/**
  * Pin with multiple videos.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class PinMediaWithVideos(
  items: Option[List[VideoMetadataWithItemType]],
  mediaType: PinMediaWithVideos.MediaType.Value
)

object PinMediaWithVideos {
  implicit lazy val pinMediaWithVideosJsonFormat: Format[PinMediaWithVideos] = Json.format[PinMediaWithVideos]

  // noinspection TypeAnnotation
  object MediaType extends Enumeration {
    val MultipleVideos = Value("multiple_videos")

    type MediaType = Value
    implicit lazy val MediaTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

