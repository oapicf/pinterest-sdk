package model

import play.api.libs.json._

/**
  * Multiple Base64-based images media source
  * @param items Array with image objects.
  * @param sourceType The source type of the media.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class PinMediaSourceImagesBase64(
  index: Option[Int],
  items: List[PinMediaSourceImagesBase64Item],
  sourceType: PinMediaSourceImagesBase64.SourceType.Value
)

object PinMediaSourceImagesBase64 {
  implicit lazy val pinMediaSourceImagesBase64JsonFormat: Format[PinMediaSourceImagesBase64] = Json.format[PinMediaSourceImagesBase64]

  // noinspection TypeAnnotation
  object SourceType extends Enumeration {
    val MultipleImageBase64 = Value("multiple_image_base64")

    type SourceType = Value
    implicit lazy val SourceTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

