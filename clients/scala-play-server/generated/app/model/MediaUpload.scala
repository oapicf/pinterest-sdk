package model

import play.api.libs.json._

/**
  * Media upload that has been registered but not uploaded/processed yet.
  * @param mediaId Unique identifier for this media upload. Used to track status and for attaching during Pin creation.
  * @param uploadParameters The list of parameter key/value pairs you will need to send with your POST request to upload your media file.
  * @param uploadUrl The URL where you will POST your media file.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class MediaUpload(
  mediaId: String,
  mediaType: MediaUploadType,
  uploadParameters: Option[MediaUploadParameters],
  uploadUrl: Option[String]
)

object MediaUpload {
  implicit lazy val mediaUploadJsonFormat: Format[MediaUpload] = Json.format[MediaUpload]
}

