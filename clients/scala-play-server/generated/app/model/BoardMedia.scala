package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for BoardMedia.
  * @param imageCoverUrl Board cover image
  * @param pinThumbnailUrls Board pin thumbnail urls.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:25:30.649114982Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class BoardMedia(
  imageCoverUrl: Option[String],
  pinThumbnailUrls: Option[List[String]]
)

object BoardMedia {
  implicit lazy val boardMediaJsonFormat: Format[BoardMedia] = Json.format[BoardMedia]
}

