package model

import play.api.libs.json._

/**
  * Media upload request
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class MediaUploadRequest(
  mediaType: MediaUploadType
)

object MediaUploadRequest {
  implicit lazy val mediaUploadRequestJsonFormat: Format[MediaUploadRequest] = Json.format[MediaUploadRequest]
}

