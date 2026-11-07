package model

import play.api.libs.json._

/**
  * Base64-encoded image media source
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T04:12:42.952922086Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class BrandAccountProfileImage(
  contentType: BrandAccountProfileImage.ContentType.Value,
  data: String
)

object BrandAccountProfileImage {
  implicit lazy val brandAccountProfileImageJsonFormat: Format[BrandAccountProfileImage] = Json.format[BrandAccountProfileImage]

  // noinspection TypeAnnotation
  object ContentType extends Enumeration {
    val ImageJpeg = Value("image/jpeg")
    val ImagePng = Value("image/png")

    type ContentType = Value
    implicit lazy val ContentTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

