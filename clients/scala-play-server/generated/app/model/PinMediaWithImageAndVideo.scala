package model

import play.api.libs.json._

/**
  * Pin with a mix of images and videos.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class PinMediaWithImageAndVideo(
  mediaType: Option[String],
  items: Option[List[PinMediaMetadata]]
)

object PinMediaWithImageAndVideo {
  implicit lazy val pinMediaWithImageAndVideoJsonFormat: Format[PinMediaWithImageAndVideo] = Json.format[PinMediaWithImageAndVideo]
}

