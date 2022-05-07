package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PinMedia._

case class PinMedia (
  mediaType: Option[String])

object PinMedia {
  import DateTimeCodecs._

  implicit val PinMediaCodecJson: CodecJson[PinMedia] = CodecJson.derive[PinMedia]
  implicit val PinMediaDecoder: EntityDecoder[PinMedia] = jsonOf[PinMedia]
  implicit val PinMediaEncoder: EntityEncoder[PinMedia] = jsonEncoderOf[PinMedia]
}
