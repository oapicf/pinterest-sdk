package model

import play.api.libs.json._

/**
  * Media upload details
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-26T05:47:41.394513697Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class MediaUploadDetails(
  mediaId: Option[String],
  mediaType: Option[MediaUploadType],
  status: Option[MediaUploadStatus]
)

object MediaUploadDetails {
  implicit lazy val mediaUploadDetailsJsonFormat: Format[MediaUploadDetails] = Json.format[MediaUploadDetails]
}

