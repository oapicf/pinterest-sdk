package model

import play.api.libs.json._

/**
  * Pin with video.
  * @param duration Duration (in miliseconds). Field maybe null after creation due to video processing time.
  * @param height Height (in pixels). Field maybe null after creation due to video processing time.
  * @param videoUrl Video url (720p).  **Note:** This field is limited and not available to all apps.
  * @param videoUrlHls Video url (HLS).  **Note:** This field is limited and not available to all apps.
  * @param width Width (in pixels). Field maybe null after creation due to video processing time.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class PinMediaWithVideo(
  coverImageUrl: Option[String],
  duration: Option[BigDecimal],
  height: Option[Int],
  images: Option[ImageSize],
  mediaType: PinMediaWithVideo.MediaType.Value,
  videoUrl: Option[String],
  videoUrlHls: Option[String],
  width: Option[Int]
)

object PinMediaWithVideo {
  implicit lazy val pinMediaWithVideoJsonFormat: Format[PinMediaWithVideo] = Json.format[PinMediaWithVideo]

  // noinspection TypeAnnotation
  object MediaType extends Enumeration {
    val Video = Value("video")

    type MediaType = Value
    implicit lazy val MediaTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

