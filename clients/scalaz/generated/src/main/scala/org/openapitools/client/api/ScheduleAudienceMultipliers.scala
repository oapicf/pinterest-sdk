package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.util.HashMap

import ScheduleAudienceMultipliers._

case class ScheduleAudienceMultipliers (
  AUDIENCE_ID: Option[String])

object ScheduleAudienceMultipliers {
  import DateTimeCodecs._

  implicit val ScheduleAudienceMultipliersCodecJson: CodecJson[ScheduleAudienceMultipliers] = CodecJson.derive[ScheduleAudienceMultipliers]
  implicit val ScheduleAudienceMultipliersDecoder: EntityDecoder[ScheduleAudienceMultipliers] = jsonOf[ScheduleAudienceMultipliers]
  implicit val ScheduleAudienceMultipliersEncoder: EntityEncoder[ScheduleAudienceMultipliers] = jsonEncoderOf[ScheduleAudienceMultipliers]
}
