package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for PinMediaWithImage_allOf_images.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class PinMediaWithImageAllOfImages(
  `150x150`: Option[JsObject],
  `400x300`: Option[JsObject],
  `600x`: Option[JsObject],
  `1200x`: Option[JsObject]
)

object PinMediaWithImageAllOfImages {
  implicit lazy val pinMediaWithImageAllOfImagesJsonFormat: Format[PinMediaWithImageAllOfImages] = Json.format[PinMediaWithImageAllOfImages]
}

