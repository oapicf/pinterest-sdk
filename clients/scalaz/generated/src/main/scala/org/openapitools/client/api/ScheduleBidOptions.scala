package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ScheduleBidOptions._

case class ScheduleBidOptions (
  ageBucketMultipliers: Option[ScheduleAgeBucketMultipliers],
appTypeMultipliers: Option[ScheduleAppTypeMultipliers],
audienceMultipliers: Option[ScheduleAudienceMultipliers],
genderMultipliers: Option[ScheduleBidOptionsGenderMultipliers],
placementMultipliers: Option[ScheduleBidOptionsPlacementMultipliers])

object ScheduleBidOptions {
  import DateTimeCodecs._

  implicit val ScheduleBidOptionsCodecJson: CodecJson[ScheduleBidOptions] = CodecJson.derive[ScheduleBidOptions]
  implicit val ScheduleBidOptionsDecoder: EntityDecoder[ScheduleBidOptions] = jsonOf[ScheduleBidOptions]
  implicit val ScheduleBidOptionsEncoder: EntityEncoder[ScheduleBidOptions] = jsonEncoderOf[ScheduleBidOptions]
}
