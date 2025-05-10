package model

import play.api.libs.json._

/**
  * Board media.
  * @param imageCoverUrl Board cover image.
  * @param pinThumbnailUrls Board pin thumbnail urls.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T05:44:38.070631387Z[Etc/UTC]", comments = "Generator version: 7.12.0")
case class BoardMedia(
  imageCoverUrl: Option[String],
  pinThumbnailUrls: Option[List[String]]
)

object BoardMedia {
  implicit lazy val boardMediaJsonFormat: Format[BoardMedia] = Json.format[BoardMedia]
}

