package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import SchedulePlacementMultipliers._

case class SchedulePlacementMultipliers (
  /* Browse (home-feed and related surfaces) */
  browse: Option[Double],
/* Related-Pins placement */
  relatedPins: Option[Double],
/* Search placement */
  search: Option[Double])

object SchedulePlacementMultipliers {
  import DateTimeCodecs._

  implicit val SchedulePlacementMultipliersCodecJson: CodecJson[SchedulePlacementMultipliers] = CodecJson.derive[SchedulePlacementMultipliers]
  implicit val SchedulePlacementMultipliersDecoder: EntityDecoder[SchedulePlacementMultipliers] = jsonOf[SchedulePlacementMultipliers]
  implicit val SchedulePlacementMultipliersEncoder: EntityEncoder[SchedulePlacementMultipliers] = jsonEncoderOf[SchedulePlacementMultipliers]
}
