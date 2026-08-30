package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ScheduleDeltaValue._

case class ScheduleDeltaValue (
  ageBucketMultipliers: Option[BidOptionsAgeBucketMultipliers],
appTypeMultipliers: Option[BidOptionsAppTypeMultipliers],
audienceMultipliers: Option[List[BidOptionsAudienceMultipliers]],
genderMultipliers: Option[BidOptionsGenderMultipliers],
placementMultipliers: Option[BidOptionsPlacementMultipliers])

object ScheduleDeltaValue {
  import DateTimeCodecs._

  implicit val ScheduleDeltaValueCodecJson: CodecJson[ScheduleDeltaValue] = CodecJson.derive[ScheduleDeltaValue]
  implicit val ScheduleDeltaValueDecoder: EntityDecoder[ScheduleDeltaValue] = jsonOf[ScheduleDeltaValue]
  implicit val ScheduleDeltaValueEncoder: EntityEncoder[ScheduleDeltaValue] = jsonEncoderOf[ScheduleDeltaValue]
}
