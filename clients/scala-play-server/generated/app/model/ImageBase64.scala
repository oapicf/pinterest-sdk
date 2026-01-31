package model

import play.api.libs.json._

/**
  * Base64-encoded image media source
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class ImageBase64(
  contentType: ImageBase64.ContentType.Value,
  data: String
)

object ImageBase64 {
  implicit lazy val imageBase64JsonFormat: Format[ImageBase64] = Json.format[ImageBase64]

  // noinspection TypeAnnotation
  object ContentType extends Enumeration {
    val ImageJpeg = Value("image/jpeg")
    val ImagePng = Value("image/png")

    type ContentType = Value
    implicit lazy val ContentTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

