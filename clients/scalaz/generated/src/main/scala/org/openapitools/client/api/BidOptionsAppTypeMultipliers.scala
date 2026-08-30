package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import BidOptionsAppTypeMultipliers._

case class BidOptionsAppTypeMultipliers (
  androidMobile: Option[BigDecimal],
androidTablet: Option[BigDecimal],
ipad: Option[BigDecimal],
iphone: Option[BigDecimal],
web: Option[BigDecimal],
webMobile: Option[BigDecimal])

object BidOptionsAppTypeMultipliers {
  import DateTimeCodecs._

  implicit val BidOptionsAppTypeMultipliersCodecJson: CodecJson[BidOptionsAppTypeMultipliers] = CodecJson.derive[BidOptionsAppTypeMultipliers]
  implicit val BidOptionsAppTypeMultipliersDecoder: EntityDecoder[BidOptionsAppTypeMultipliers] = jsonOf[BidOptionsAppTypeMultipliers]
  implicit val BidOptionsAppTypeMultipliersEncoder: EntityEncoder[BidOptionsAppTypeMultipliers] = jsonEncoderOf[BidOptionsAppTypeMultipliers]
}
