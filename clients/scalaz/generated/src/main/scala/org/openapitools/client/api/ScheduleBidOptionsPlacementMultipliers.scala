package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ScheduleBidOptionsPlacementMultipliers._

case class ScheduleBidOptionsPlacementMultipliers (
  /* Browse (home-feed and related surfaces) */
  browse: Option[Double],
/* Related-Pins placement */
  relatedPins: Option[Double],
/* Search placement */
  search: Option[Double])

object ScheduleBidOptionsPlacementMultipliers {
  import DateTimeCodecs._

  implicit val ScheduleBidOptionsPlacementMultipliersCodecJson: CodecJson[ScheduleBidOptionsPlacementMultipliers] = CodecJson.derive[ScheduleBidOptionsPlacementMultipliers]
  implicit val ScheduleBidOptionsPlacementMultipliersDecoder: EntityDecoder[ScheduleBidOptionsPlacementMultipliers] = jsonOf[ScheduleBidOptionsPlacementMultipliers]
  implicit val ScheduleBidOptionsPlacementMultipliersEncoder: EntityEncoder[ScheduleBidOptionsPlacementMultipliers] = jsonEncoderOf[ScheduleBidOptionsPlacementMultipliers]
}
