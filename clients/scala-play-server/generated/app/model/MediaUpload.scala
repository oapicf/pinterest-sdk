package model

import play.api.libs.json._

/**
  * Media upload that has been registered but not uploaded/processed yet.
  * @param mediaId Unique identifier for this media upload. Used to track status and for attaching during Pin creation.
  * @param uploadUrl The URL where you will POST your media file.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class MediaUpload(
  mediaId: Option[String],
  mediaType: Option[MediaUploadType],
  uploadUrl: Option[String],
  uploadParameters: Option[MediaUploadAllOfUploadParameters]
)

object MediaUpload {
  implicit lazy val mediaUploadJsonFormat: Format[MediaUpload] = Json.format[MediaUpload]
}

