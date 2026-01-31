package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for PinMediaSourceImagesBase64_items_inner.
  * @param link Destination link for the image.
  * @param data Image to upload as base64 string.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-26T05:47:41.394513697Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class PinMediaSourceImagesBase64ItemsInner(
  title: Option[String],
  description: Option[String],
  link: Option[String],
  contentType: PinMediaSourceImagesBase64ItemsInner.ContentType.Value,
  data: String
)

object PinMediaSourceImagesBase64ItemsInner {
  implicit lazy val pinMediaSourceImagesBase64ItemsInnerJsonFormat: Format[PinMediaSourceImagesBase64ItemsInner] = Json.format[PinMediaSourceImagesBase64ItemsInner]

  // noinspection TypeAnnotation
  object ContentType extends Enumeration {
    val ImageJpeg = Value("image/jpeg")
    val ImagePng = Value("image/png")

    type ContentType = Value
    implicit lazy val ContentTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

