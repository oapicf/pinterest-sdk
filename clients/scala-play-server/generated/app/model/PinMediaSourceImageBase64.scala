package model

import play.api.libs.json._

/**
  * Base64-encoded image media source
  * @param isStandard Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class PinMediaSourceImageBase64(
  sourceType: PinMediaSourceImageBase64.SourceType.Value,
  contentType: PinMediaSourceImageBase64.ContentType.Value,
  data: String,
  isStandard: Option[Boolean]
)

object PinMediaSourceImageBase64 {
  implicit lazy val pinMediaSourceImageBase64JsonFormat: Format[PinMediaSourceImageBase64] = Json.format[PinMediaSourceImageBase64]

  // noinspection TypeAnnotation
  object SourceType extends Enumeration {
    val ImageBase64 = Value("image_base64")

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

