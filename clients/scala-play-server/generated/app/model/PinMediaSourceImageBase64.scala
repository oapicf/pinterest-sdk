package model

import play.api.libs.json._

/**
  * Image Base64-based media source.
  * @param isStandard Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users.
  * @param sourceType The source type of the media.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class PinMediaSourceImageBase64(
  contentType: ContentType,
  data: String,
  isStandard: Option[Boolean],
  sourceType: PinMediaSourceImageBase64.SourceType.Value
)

object PinMediaSourceImageBase64 {
  implicit lazy val pinMediaSourceImageBase64JsonFormat: Format[PinMediaSourceImageBase64] = Json.format[PinMediaSourceImageBase64]

  // noinspection TypeAnnotation
  object SourceType extends Enumeration {
    val ImageBase64 = Value("image_base64")

    type SourceType = Value
    implicit lazy val SourceTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

