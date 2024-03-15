package model

import play.api.libs.json._

/**
  * Video ID-based media source
  * @param coverImageUrl Cover image url.
  * @param coverImageContentType Content type for cover image Base64.
  * @param coverImageData Cover image Base64.
  * @param isStandard Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class PinMediaSourceVideoID(
  sourceType: PinMediaSourceVideoID.SourceType.Value,
  coverImageUrl: Option[String],
  coverImageContentType: Option[PinMediaSourceVideoID.CoverImageContentType.Value],
  coverImageData: Option[String],
  mediaId: String,
  isStandard: Option[Boolean]
)

object PinMediaSourceVideoID {
  implicit lazy val pinMediaSourceVideoIDJsonFormat: Format[PinMediaSourceVideoID] = Json.format[PinMediaSourceVideoID]

  // noinspection TypeAnnotation
  object SourceType extends Enumeration {
    val VideoId = Value("video_id")

    type SourceType = Value
    implicit lazy val SourceTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }

  // noinspection TypeAnnotation
  object CoverImageContentType extends Enumeration {
    val Jpeg = Value("image/jpeg")
    val Png = Value("image/png")

    type CoverImageContentType = Value
    implicit lazy val CoverImageContentTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

