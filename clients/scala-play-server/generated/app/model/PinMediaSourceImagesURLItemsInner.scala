package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for PinMediaSourceImagesURL_items_inner.
  * @param link Destination link for the image.
  * @param url URL of image to upload.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-26T05:47:41.394513697Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class PinMediaSourceImagesURLItemsInner(
  title: Option[String],
  description: Option[String],
  link: Option[String],
  url: String
)

object PinMediaSourceImagesURLItemsInner {
  implicit lazy val pinMediaSourceImagesURLItemsInnerJsonFormat: Format[PinMediaSourceImagesURLItemsInner] = Json.format[PinMediaSourceImagesURLItemsInner]
}

