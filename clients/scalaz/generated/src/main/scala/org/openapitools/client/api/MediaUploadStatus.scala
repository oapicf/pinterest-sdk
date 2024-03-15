package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import MediaUploadStatus._

case class MediaUploadStatus (
  
object MediaUploadStatus {
  import DateTimeCodecs._

  implicit val MediaUploadStatusCodecJson: CodecJson[MediaUploadStatus] = CodecJson.derive[MediaUploadStatus]
  implicit val MediaUploadStatusDecoder: EntityDecoder[MediaUploadStatus] = jsonOf[MediaUploadStatus]
  implicit val MediaUploadStatusEncoder: EntityEncoder[MediaUploadStatus] = jsonEncoderOf[MediaUploadStatus]
}
