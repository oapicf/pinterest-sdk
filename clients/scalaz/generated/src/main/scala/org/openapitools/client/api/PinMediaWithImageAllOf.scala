package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PinMediaWithImageAllOf._

case class PinMediaWithImageAllOf (
  images: Option[Map[String, ImageDetails]])

object PinMediaWithImageAllOf {
  import DateTimeCodecs._

  implicit val PinMediaWithImageAllOfCodecJson: CodecJson[PinMediaWithImageAllOf] = CodecJson.derive[PinMediaWithImageAllOf]
  implicit val PinMediaWithImageAllOfDecoder: EntityDecoder[PinMediaWithImageAllOf] = jsonOf[PinMediaWithImageAllOf]
  implicit val PinMediaWithImageAllOfEncoder: EntityEncoder[PinMediaWithImageAllOf] = jsonEncoderOf[PinMediaWithImageAllOf]
}
