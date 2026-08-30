package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for BoardMedia.
  * @param imageCoverUrl Board cover image
  * @param pinThumbnailUrls Board pin thumbnail urls.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class BoardMedia(
  imageCoverUrl: Option[String],
  pinThumbnailUrls: Option[List[String]]
)

object BoardMedia {
  implicit lazy val boardMediaJsonFormat: Format[BoardMedia] = Json.format[BoardMedia]
}

