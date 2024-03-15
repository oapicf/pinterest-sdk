package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PinMediaWithVideos._

case class PinMediaWithVideos (
  mediaType: Option[String],
items: Option[List[VideoMetadata]])

object PinMediaWithVideos {
  import DateTimeCodecs._

  implicit val PinMediaWithVideosCodecJson: CodecJson[PinMediaWithVideos] = CodecJson.derive[PinMediaWithVideos]
  implicit val PinMediaWithVideosDecoder: EntityDecoder[PinMediaWithVideos] = jsonOf[PinMediaWithVideos]
  implicit val PinMediaWithVideosEncoder: EntityEncoder[PinMediaWithVideos] = jsonEncoderOf[PinMediaWithVideos]
}
