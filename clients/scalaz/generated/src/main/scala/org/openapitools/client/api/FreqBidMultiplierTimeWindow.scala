package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import FreqBidMultiplierTimeWindow._

case class FreqBidMultiplierTimeWindow (
  
object FreqBidMultiplierTimeWindow {
  import DateTimeCodecs._

  implicit val FreqBidMultiplierTimeWindowCodecJson: CodecJson[FreqBidMultiplierTimeWindow] = CodecJson.derive[FreqBidMultiplierTimeWindow]
  implicit val FreqBidMultiplierTimeWindowDecoder: EntityDecoder[FreqBidMultiplierTimeWindow] = jsonOf[FreqBidMultiplierTimeWindow]
  implicit val FreqBidMultiplierTimeWindowEncoder: EntityEncoder[FreqBidMultiplierTimeWindow] = jsonEncoderOf[FreqBidMultiplierTimeWindow]
}
