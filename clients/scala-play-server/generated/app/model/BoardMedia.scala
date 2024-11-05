package model

import play.api.libs.json._

/**
  * Board media.
  * @param imageCoverUrl Board cover image.
  * @param pinThumbnailUrls Board pin thumbnail urls.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class BoardMedia(
  imageCoverUrl: Option[String],
  pinThumbnailUrls: Option[List[String]]
)

object BoardMedia {
  implicit lazy val boardMediaJsonFormat: Format[BoardMedia] = Json.format[BoardMedia]
}

