package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import TrendingPin._

case class TrendingPin (
  /* Height of the pin image in pixels */
  height: Integer,
/* Unique identifier for the pin */
  id: String,
/* URL of the pin image */
  src: String,
/* Width of the pin image in pixels */
  width: Integer)

object TrendingPin {
  import DateTimeCodecs._

  implicit val TrendingPinCodecJson: CodecJson[TrendingPin] = CodecJson.derive[TrendingPin]
  implicit val TrendingPinDecoder: EntityDecoder[TrendingPin] = jsonOf[TrendingPin]
  implicit val TrendingPinEncoder: EntityEncoder[TrendingPin] = jsonEncoderOf[TrendingPin]
}
