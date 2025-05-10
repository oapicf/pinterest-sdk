package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AdPreviewCreateFromImage.
  * @param imageUrl Image URL.
  * @param title Title displayed below ad.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T05:44:38.070631387Z[Etc/UTC]", comments = "Generator version: 7.12.0")
case class AdPreviewCreateFromImage(
  imageUrl: String,
  title: String
)

object AdPreviewCreateFromImage {
  implicit lazy val adPreviewCreateFromImageJsonFormat: Format[AdPreviewCreateFromImage] = Json.format[AdPreviewCreateFromImage]
}

