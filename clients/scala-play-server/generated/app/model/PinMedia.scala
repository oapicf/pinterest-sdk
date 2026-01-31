package model

import play.api.libs.json._

/**
  * Pin media objects.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-26T05:47:41.394513697Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class PinMedia(
  mediaType: Option[String]
)

object PinMedia {
  implicit lazy val pinMediaJsonFormat: Format[PinMedia] = Json.format[PinMedia]
}

