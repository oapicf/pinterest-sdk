package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.util.HashMap

import ScheduleGenderMultipliers._

case class ScheduleGenderMultipliers (
  GENDER: Option[TargetingSpecGender])

object ScheduleGenderMultipliers {
  import DateTimeCodecs._

  implicit val ScheduleGenderMultipliersCodecJson: CodecJson[ScheduleGenderMultipliers] = CodecJson.derive[ScheduleGenderMultipliers]
  implicit val ScheduleGenderMultipliersDecoder: EntityDecoder[ScheduleGenderMultipliers] = jsonOf[ScheduleGenderMultipliers]
  implicit val ScheduleGenderMultipliersEncoder: EntityEncoder[ScheduleGenderMultipliers] = jsonEncoderOf[ScheduleGenderMultipliers]
}
