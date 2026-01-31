package model

import play.api.libs.json._

/**
  * Resource create operation model.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class MediaUploadCreate(
  mediaType: MediaUploadType
)

object MediaUploadCreate {
  implicit lazy val mediaUploadCreateJsonFormat: Format[MediaUploadCreate] = Json.format[MediaUploadCreate]
}

