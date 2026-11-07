package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for PinMediaSourceImagesURLItem.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T02:59:47.831280460Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class PinMediaSourceImagesURLItem(
  description: Option[String],
  link: Option[String],
  title: Option[String],
  url: String
)

object PinMediaSourceImagesURLItem {
  implicit lazy val pinMediaSourceImagesURLItemJsonFormat: Format[PinMediaSourceImagesURLItem] = Json.format[PinMediaSourceImagesURLItem]
}

