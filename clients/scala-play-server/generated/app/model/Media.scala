package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for Media.
  * @param mediaId Unique identifier for this media upload. Used to track status and for attaching during Pin creation.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:25:30.649114982Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class Media(
  mediaId: String,
  mediaType: MediaUploadType,
  status: Option[MediaUploadStatus]
)

object Media {
  implicit lazy val mediaJsonFormat: Format[Media] = Json.format[Media]
}

