package model

import play.api.libs.json._

/**
  * Pin with multiple videos.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
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

