package model

import play.api.libs.json._

/**
  * Pin media objects.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T05:44:38.070631387Z[Etc/UTC]", comments = "Generator version: 7.12.0")
case class PinMedia(
  mediaType: Option[String]
)

object PinMedia {
  implicit lazy val pinMediaJsonFormat: Format[PinMedia] = Json.format[PinMedia]
}

