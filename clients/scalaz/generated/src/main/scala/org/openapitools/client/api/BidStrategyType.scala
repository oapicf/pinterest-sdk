package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import BidStrategyType._

case class BidStrategyType (
  
object BidStrategyType {
  import DateTimeCodecs._

  implicit val BidStrategyTypeCodecJson: CodecJson[BidStrategyType] = CodecJson.derive[BidStrategyType]
  implicit val BidStrategyTypeDecoder: EntityDecoder[BidStrategyType] = jsonOf[BidStrategyType]
  implicit val BidStrategyTypeEncoder: EntityEncoder[BidStrategyType] = jsonEncoderOf[BidStrategyType]
}
