package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ScheduleBidMultipliers._

case class ScheduleBidMultipliers (
  ageBucketMultipliers: Option[BidOptionsAgeBucketMultipliers],
appTypeMultipliers: Option[BidOptionsAppTypeMultipliers],
audienceMultipliers: Option[List[BidOptionsAudienceMultipliers]],
genderMultipliers: Option[BidOptionsGenderMultipliers],
placementMultipliers: Option[BidOptionsPlacementMultipliers])

object ScheduleBidMultipliers {
  import DateTimeCodecs._

  implicit val ScheduleBidMultipliersCodecJson: CodecJson[ScheduleBidMultipliers] = CodecJson.derive[ScheduleBidMultipliers]
  implicit val ScheduleBidMultipliersDecoder: EntityDecoder[ScheduleBidMultipliers] = jsonOf[ScheduleBidMultipliers]
  implicit val ScheduleBidMultipliersEncoder: EntityEncoder[ScheduleBidMultipliers] = jsonEncoderOf[ScheduleBidMultipliers]
}
