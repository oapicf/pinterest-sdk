package model

import play.api.libs.json._

/**
  * Pin media objects.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2022-05-08T00:41:34.847921Z[Etc/UTC]")
case class PinMedia(
  mediaType: Option[String]
)

object PinMedia {
  implicit lazy val pinMediaJsonFormat: Format[PinMedia] = Json.format[PinMedia]
}

