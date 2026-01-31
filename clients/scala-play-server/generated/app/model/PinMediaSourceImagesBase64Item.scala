package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for PinMediaSourceImagesBase64Item.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class PinMediaSourceImagesBase64Item(
  contentType: ContentType,
  data: String,
  description: Option[String],
  link: Option[String],
  title: Option[String]
)

object PinMediaSourceImagesBase64Item {
  implicit lazy val pinMediaSourceImagesBase64ItemJsonFormat: Format[PinMediaSourceImagesBase64Item] = Json.format[PinMediaSourceImagesBase64Item]
}

