package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import MediaUploadDetails._

case class MediaUploadDetails (
  mediaId: Option[String],
mediaType: Option[MediaUploadType],
status: Option[MediaUploadStatus])

object MediaUploadDetails {
  import DateTimeCodecs._

  implicit val MediaUploadDetailsCodecJson: CodecJson[MediaUploadDetails] = CodecJson.derive[MediaUploadDetails]
  implicit val MediaUploadDetailsDecoder: EntityDecoder[MediaUploadDetails] = jsonOf[MediaUploadDetails]
  implicit val MediaUploadDetailsEncoder: EntityEncoder[MediaUploadDetails] = jsonEncoderOf[MediaUploadDetails]
}
