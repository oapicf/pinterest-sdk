package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.util.HashMap

import ScheduleBidOptionsGenderMultipliers._

case class ScheduleBidOptionsGenderMultipliers (
  GENDER: Option[TargetingSpecGender])

object ScheduleBidOptionsGenderMultipliers {
  import DateTimeCodecs._

  implicit val ScheduleBidOptionsGenderMultipliersCodecJson: CodecJson[ScheduleBidOptionsGenderMultipliers] = CodecJson.derive[ScheduleBidOptionsGenderMultipliers]
  implicit val ScheduleBidOptionsGenderMultipliersDecoder: EntityDecoder[ScheduleBidOptionsGenderMultipliers] = jsonOf[ScheduleBidOptionsGenderMultipliers]
  implicit val ScheduleBidOptionsGenderMultipliersEncoder: EntityEncoder[ScheduleBidOptionsGenderMultipliers] = jsonEncoderOf[ScheduleBidOptionsGenderMultipliers]
}
