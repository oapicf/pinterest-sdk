package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AdPreviewCreateFromImage.
  * @param imageUrl Image URL.
  * @param title Title displayed below ad.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class AdPreviewCreateFromImage(
  imageUrl: String,
  title: String
)

object AdPreviewCreateFromImage {
  implicit lazy val adPreviewCreateFromImageJsonFormat: Format[AdPreviewCreateFromImage] = Json.format[AdPreviewCreateFromImage]
}

