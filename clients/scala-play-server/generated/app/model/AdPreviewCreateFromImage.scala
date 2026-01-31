package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AdPreviewCreateFromImage.
  * @param imageUrl Image URL.
  * @param title Title displayed below ad.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class AdPreviewCreateFromImage(
  imageUrl: String,
  title: String
)

object AdPreviewCreateFromImage {
  implicit lazy val adPreviewCreateFromImageJsonFormat: Format[AdPreviewCreateFromImage] = Json.format[AdPreviewCreateFromImage]
}

