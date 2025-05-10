package model

import play.api.libs.json._

/**
  * Media upload request
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T05:44:38.070631387Z[Etc/UTC]", comments = "Generator version: 7.12.0")
case class MediaUploadRequest(
  mediaType: MediaUploadType
)

object MediaUploadRequest {
  implicit lazy val mediaUploadRequestJsonFormat: Format[MediaUploadRequest] = Json.format[MediaUploadRequest]
}

