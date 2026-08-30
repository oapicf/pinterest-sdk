package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ScheduleCommonDeltaValue._

case class ScheduleCommonDeltaValue (
  ageBucketMultipliers: Option[ScheduleAgeBucketMultipliers],
appTypeMultipliers: Option[ScheduleAppTypeMultipliers],
audienceMultipliers: Option[ScheduleAudienceMultipliers],
genderMultipliers: Option[ScheduleBidOptionsGenderMultipliers],
placementMultipliers: Option[ScheduleBidOptionsPlacementMultipliers])

object ScheduleCommonDeltaValue {
  import DateTimeCodecs._

  implicit val ScheduleCommonDeltaValueCodecJson: CodecJson[ScheduleCommonDeltaValue] = CodecJson.derive[ScheduleCommonDeltaValue]
  implicit val ScheduleCommonDeltaValueDecoder: EntityDecoder[ScheduleCommonDeltaValue] = jsonOf[ScheduleCommonDeltaValue]
  implicit val ScheduleCommonDeltaValueEncoder: EntityEncoder[ScheduleCommonDeltaValue] = jsonEncoderOf[ScheduleCommonDeltaValue]
}
