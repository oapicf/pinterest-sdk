package model

import play.api.libs.json._

/**
  * Pin with multiple videos.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class PinMediaWithVideos(
  mediaType: Option[String],
  items: Option[List[VideoMetadata]]
)

object PinMediaWithVideos {
  implicit lazy val pinMediaWithVideosJsonFormat: Format[PinMediaWithVideos] = Json.format[PinMediaWithVideos]
}

