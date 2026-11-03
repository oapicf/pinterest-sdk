package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ImageSize.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:25:30.649114982Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class ImageSize(
  `1200x`: Option[ImageDetails],
  `150x150`: Option[ImageDetails],
  `400x300`: Option[ImageDetails],
  `600x`: Option[ImageDetails]
)

object ImageSize {
  implicit lazy val imageSizeJsonFormat: Format[ImageSize] = Json.format[ImageSize]
}

