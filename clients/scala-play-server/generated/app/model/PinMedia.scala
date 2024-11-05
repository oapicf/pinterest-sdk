package model

import play.api.libs.json._

/**
  * Pin media objects.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class PinMedia(
  mediaType: Option[String]
)

object PinMedia {
  implicit lazy val pinMediaJsonFormat: Format[PinMedia] = Json.format[PinMedia]
}

