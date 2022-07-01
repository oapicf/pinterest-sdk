package model

import play.api.libs.json._

/**
  * Pin media objects.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2022-07-01T12:06:32.599878Z[Etc/UTC]")
case class PinMedia(
  mediaType: Option[String]
)

object PinMedia {
  implicit lazy val pinMediaJsonFormat: Format[PinMedia] = Json.format[PinMedia]
}

