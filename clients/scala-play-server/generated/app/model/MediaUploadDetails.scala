package model

import play.api.libs.json._

/**
  * Media upload details
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T05:44:38.070631387Z[Etc/UTC]", comments = "Generator version: 7.12.0")
case class MediaUploadDetails(
  mediaId: Option[String],
  mediaType: Option[MediaUploadType],
  status: Option[MediaUploadStatus]
)

object MediaUploadDetails {
  implicit lazy val mediaUploadDetailsJsonFormat: Format[MediaUploadDetails] = Json.format[MediaUploadDetails]
}

