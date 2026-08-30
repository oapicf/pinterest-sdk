package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import BidOptionsAudienceMultipliers._

case class BidOptionsAudienceMultipliers (
  audienceId: String,
multiplier: BigDecimal)

object BidOptionsAudienceMultipliers {
  import DateTimeCodecs._

  implicit val BidOptionsAudienceMultipliersCodecJson: CodecJson[BidOptionsAudienceMultipliers] = CodecJson.derive[BidOptionsAudienceMultipliers]
  implicit val BidOptionsAudienceMultipliersDecoder: EntityDecoder[BidOptionsAudienceMultipliers] = jsonOf[BidOptionsAudienceMultipliers]
  implicit val BidOptionsAudienceMultipliersEncoder: EntityEncoder[BidOptionsAudienceMultipliers] = jsonEncoderOf[BidOptionsAudienceMultipliers]
}
