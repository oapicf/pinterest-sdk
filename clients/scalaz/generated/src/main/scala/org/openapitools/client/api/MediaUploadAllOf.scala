package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import MediaUploadAllOf._

case class MediaUploadAllOf (
  /* Unique identifier for this media upload. Used to track status and for attaching during Pin creation. */
  mediaId: Option[String],
mediaType: Option[MediaUploadType],
/* The URL where you will POST your media file. */
  uploadUrl: Option[String],
uploadParameters: Option[MediaUploadAllOfUploadParameters])

object MediaUploadAllOf {
  import DateTimeCodecs._

  implicit val MediaUploadAllOfCodecJson: CodecJson[MediaUploadAllOf] = CodecJson.derive[MediaUploadAllOf]
  implicit val MediaUploadAllOfDecoder: EntityDecoder[MediaUploadAllOf] = jsonOf[MediaUploadAllOf]
  implicit val MediaUploadAllOfEncoder: EntityEncoder[MediaUploadAllOf] = jsonEncoderOf[MediaUploadAllOf]
}
