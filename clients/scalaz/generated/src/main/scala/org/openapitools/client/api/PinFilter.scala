package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PinFilter._

case class PinFilter (
  
object PinFilter {
  import DateTimeCodecs._

  implicit val PinFilterCodecJson: CodecJson[PinFilter] = CodecJson.derive[PinFilter]
  implicit val PinFilterDecoder: EntityDecoder[PinFilter] = jsonOf[PinFilter]
  implicit val PinFilterEncoder: EntityEncoder[PinFilter] = jsonEncoderOf[PinFilter]
}
