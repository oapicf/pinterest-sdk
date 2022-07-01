package model

import play.api.libs.json._

/**
  * Pin media source.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2022-07-01T12:06:32.599878Z[Etc/UTC]")
case class PinMediaSource(
  sourceType: PinMediaSource.SourceType.Value,
  contentType: PinMediaSource.ContentType.Value,
  data: String,
  url: String,
  coverImageUrl: String,
  mediaId: String
)

object PinMediaSource {
  implicit lazy val pinMediaSourceJsonFormat: Format[PinMediaSource] = Json.format[PinMediaSource]

  // noinspection TypeAnnotation
  object SourceType extends Enumeration {
    val VideoId = Value("video_id")

    type SourceType = Value
    implicit lazy val SourceTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }

  // noinspection TypeAnnotation
  object ContentType extends Enumeration {
    val Jpeg = Value("image/jpeg")
    val Png = Value("image/png")

    type ContentType = Value
    implicit lazy val ContentTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

