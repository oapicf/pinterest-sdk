package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AdPreviewCreateFromImage.
  * @param imageUrl Image URL.
  * @param title Title displayed below ad.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-26T05:47:41.394513697Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class AdPreviewCreateFromImage(
  imageUrl: String,
  title: String
)

object AdPreviewCreateFromImage {
  implicit lazy val adPreviewCreateFromImageJsonFormat: Format[AdPreviewCreateFromImage] = Json.format[AdPreviewCreateFromImage]
}

