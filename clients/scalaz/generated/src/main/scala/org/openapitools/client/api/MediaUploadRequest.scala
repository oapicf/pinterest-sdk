package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import MediaUploadRequest._

case class MediaUploadRequest (
  mediaType: MediaUploadType)

object MediaUploadRequest {
  import DateTimeCodecs._

  implicit val MediaUploadRequestCodecJson: CodecJson[MediaUploadRequest] = CodecJson.derive[MediaUploadRequest]
  implicit val MediaUploadRequestDecoder: EntityDecoder[MediaUploadRequest] = jsonOf[MediaUploadRequest]
  implicit val MediaUploadRequestEncoder: EntityEncoder[MediaUploadRequest] = jsonEncoderOf[MediaUploadRequest]
}
