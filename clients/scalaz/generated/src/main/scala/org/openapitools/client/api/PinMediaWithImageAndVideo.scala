package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PinMediaWithImageAndVideo._

case class PinMediaWithImageAndVideo (
  mediaType: Option[String],
items: Option[List[PinMediaMetadata]])

object PinMediaWithImageAndVideo {
  import DateTimeCodecs._

  implicit val PinMediaWithImageAndVideoCodecJson: CodecJson[PinMediaWithImageAndVideo] = CodecJson.derive[PinMediaWithImageAndVideo]
  implicit val PinMediaWithImageAndVideoDecoder: EntityDecoder[PinMediaWithImageAndVideo] = jsonOf[PinMediaWithImageAndVideo]
  implicit val PinMediaWithImageAndVideoEncoder: EntityEncoder[PinMediaWithImageAndVideo] = jsonEncoderOf[PinMediaWithImageAndVideo]
}
