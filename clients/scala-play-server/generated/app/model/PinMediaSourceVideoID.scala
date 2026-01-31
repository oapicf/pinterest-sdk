package model

import play.api.libs.json._

/**
  * Video ID-based media source.
  * @param coverImageContentType Content type for cover image Base64.
  * @param coverImageData Cover image Base64.
  * @param coverImageKeyFrameTime Keyframe timestamp for cover image (seconds). If entered time exceeds video duration, the last frame is used.
  * @param coverImageUrl Cover image URL.
  * @param isStandard Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class PinMediaSourceVideoID(
  coverImageContentType: Option[ContentType],
  coverImageData: Option[String],
  coverImageKeyFrameTime: Option[Int],
  coverImageUrl: Option[String],
  isStandard: Option[Boolean],
  mediaId: String,
  sourceType: PinMediaSourceVideoID.SourceType.Value
)

object PinMediaSourceVideoID {
  implicit lazy val pinMediaSourceVideoIDJsonFormat: Format[PinMediaSourceVideoID] = Json.format[PinMediaSourceVideoID]

  // noinspection TypeAnnotation
  object SourceType extends Enumeration {
    val VideoId = Value("video_id")

    type SourceType = Value
    implicit lazy val SourceTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

