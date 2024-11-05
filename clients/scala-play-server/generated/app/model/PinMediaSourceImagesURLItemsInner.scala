package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for PinMediaSourceImagesURL_items_inner.
  * @param link Destination link for the image.
  * @param url URL of image to upload.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class PinMediaSourceImagesURLItemsInner(
  title: Option[String],
  description: Option[String],
  link: Option[String],
  url: String
)

object PinMediaSourceImagesURLItemsInner {
  implicit lazy val pinMediaSourceImagesURLItemsInnerJsonFormat: Format[PinMediaSourceImagesURLItemsInner] = Json.format[PinMediaSourceImagesURLItemsInner]
}

