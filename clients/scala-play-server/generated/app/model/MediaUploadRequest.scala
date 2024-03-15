package model

import play.api.libs.json._

/**
  * Media upload request
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class MediaUploadRequest(
  mediaType: MediaUploadType
)

object MediaUploadRequest {
  implicit lazy val mediaUploadRequestJsonFormat: Format[MediaUploadRequest] = Json.format[MediaUploadRequest]
}

