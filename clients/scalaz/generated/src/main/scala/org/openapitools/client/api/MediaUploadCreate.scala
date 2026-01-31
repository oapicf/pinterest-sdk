package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import MediaUploadCreate._

case class MediaUploadCreate (
  mediaType: MediaUploadType)

object MediaUploadCreate {
  import DateTimeCodecs._

  implicit val MediaUploadCreateCodecJson: CodecJson[MediaUploadCreate] = CodecJson.derive[MediaUploadCreate]
  implicit val MediaUploadCreateDecoder: EntityDecoder[MediaUploadCreate] = jsonOf[MediaUploadCreate]
  implicit val MediaUploadCreateEncoder: EntityEncoder[MediaUploadCreate] = jsonEncoderOf[MediaUploadCreate]
}
