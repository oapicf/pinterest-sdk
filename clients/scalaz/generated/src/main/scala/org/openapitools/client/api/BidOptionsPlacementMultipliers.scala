package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import BidOptionsPlacementMultipliers._

case class BidOptionsPlacementMultipliers (
  browse: Option[BigDecimal],
relatedPins: Option[BigDecimal],
search: Option[BigDecimal])

object BidOptionsPlacementMultipliers {
  import DateTimeCodecs._

  implicit val BidOptionsPlacementMultipliersCodecJson: CodecJson[BidOptionsPlacementMultipliers] = CodecJson.derive[BidOptionsPlacementMultipliers]
  implicit val BidOptionsPlacementMultipliersDecoder: EntityDecoder[BidOptionsPlacementMultipliers] = jsonOf[BidOptionsPlacementMultipliers]
  implicit val BidOptionsPlacementMultipliersEncoder: EntityEncoder[BidOptionsPlacementMultipliers] = jsonEncoderOf[BidOptionsPlacementMultipliers]
}
