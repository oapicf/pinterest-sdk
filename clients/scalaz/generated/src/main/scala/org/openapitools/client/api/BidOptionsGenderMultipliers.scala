package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import BidOptionsGenderMultipliers._

case class BidOptionsGenderMultipliers (
  female: Option[BigDecimal],
male: Option[BigDecimal])

object BidOptionsGenderMultipliers {
  import DateTimeCodecs._

  implicit val BidOptionsGenderMultipliersCodecJson: CodecJson[BidOptionsGenderMultipliers] = CodecJson.derive[BidOptionsGenderMultipliers]
  implicit val BidOptionsGenderMultipliersDecoder: EntityDecoder[BidOptionsGenderMultipliers] = jsonOf[BidOptionsGenderMultipliers]
  implicit val BidOptionsGenderMultipliersEncoder: EntityEncoder[BidOptionsGenderMultipliers] = jsonEncoderOf[BidOptionsGenderMultipliers]
}
