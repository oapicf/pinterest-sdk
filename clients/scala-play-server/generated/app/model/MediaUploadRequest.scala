package model

import play.api.libs.json._

/**
  * Media upload request
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-26T05:47:41.394513697Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class MediaUploadRequest(
  mediaType: MediaUploadType
)

object MediaUploadRequest {
  implicit lazy val mediaUploadRequestJsonFormat: Format[MediaUploadRequest] = Json.format[MediaUploadRequest]
}

