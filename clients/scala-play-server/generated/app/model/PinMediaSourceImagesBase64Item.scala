package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for PinMediaSourceImagesBase64Item.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
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

