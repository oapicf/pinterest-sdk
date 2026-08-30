package model

import play.api.libs.json._

/**
  * Base64-encoded image media source
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
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

