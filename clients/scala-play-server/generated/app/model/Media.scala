package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for Media.
  * @param mediaId Unique identifier for this media upload. Used to track status and for attaching during Pin creation.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class Media(
  mediaId: String,
  mediaType: MediaUploadType,
  status: Option[MediaUploadStatus]
)

object Media {
  implicit lazy val mediaJsonFormat: Format[Media] = Json.format[Media]
}

