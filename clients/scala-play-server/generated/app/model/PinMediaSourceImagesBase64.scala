package model

import play.api.libs.json._

/**
  * Multiple Base64-encoded images media source
  * @param items Array with image objects.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-26T05:47:41.394513697Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class PinMediaSourceImagesBase64(
  sourceType: Option[PinMediaSourceImagesBase64.SourceType.Value],
  items: List[PinMediaSourceImagesBase64ItemsInner],
  index: Option[Int]
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

