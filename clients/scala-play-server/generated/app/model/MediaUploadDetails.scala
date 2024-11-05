package model

import play.api.libs.json._

/**
  * Media upload details
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class MediaUploadDetails(
  mediaId: Option[String],
  mediaType: Option[MediaUploadType],
  status: Option[MediaUploadStatus]
)

object MediaUploadDetails {
  implicit lazy val mediaUploadDetailsJsonFormat: Format[MediaUploadDetails] = Json.format[MediaUploadDetails]
}

