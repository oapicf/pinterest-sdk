package model

import play.api.libs.json._

/**
  * Media upload details
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class MediaUploadDetails(
  mediaId: Option[String],
  mediaType: Option[MediaUploadType],
  status: Option[MediaUploadStatus]
)

object MediaUploadDetails {
  implicit lazy val mediaUploadDetailsJsonFormat: Format[MediaUploadDetails] = Json.format[MediaUploadDetails]
}

