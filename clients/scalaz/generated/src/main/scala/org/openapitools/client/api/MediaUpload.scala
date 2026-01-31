package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import MediaUpload._

case class MediaUpload (
  /* Unique identifier for this media upload. Used to track status and for attaching during Pin creation. */
  mediaId: String,
mediaType: MediaUploadType,
/* The list of parameter key/value pairs you will need to send with your POST request to upload your media file. */
  uploadParameters: Option[MediaUploadParameters],
/* The URL where you will POST your media file. */
  uploadUrl: Option[String])

object MediaUpload {
  import DateTimeCodecs._

  implicit val MediaUploadCodecJson: CodecJson[MediaUpload] = CodecJson.derive[MediaUpload]
  implicit val MediaUploadDecoder: EntityDecoder[MediaUpload] = jsonOf[MediaUpload]
  implicit val MediaUploadEncoder: EntityEncoder[MediaUpload] = jsonEncoderOf[MediaUpload]
}
