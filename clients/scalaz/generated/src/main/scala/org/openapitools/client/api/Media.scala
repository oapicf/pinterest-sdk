package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import Media._

case class Media (
  /* Unique identifier for this media upload. Used to track status and for attaching during Pin creation. */
  mediaId: String,
mediaType: MediaUploadType,
status: Option[MediaUploadStatus])

object Media {
  import DateTimeCodecs._

  implicit val MediaCodecJson: CodecJson[Media] = CodecJson.derive[Media]
  implicit val MediaDecoder: EntityDecoder[Media] = jsonOf[Media]
  implicit val MediaEncoder: EntityEncoder[Media] = jsonEncoderOf[Media]
}
