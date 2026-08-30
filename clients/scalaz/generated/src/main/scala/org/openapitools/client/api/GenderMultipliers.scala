package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.util.HashMap

import GenderMultipliers._

case class GenderMultipliers (
  /* Gender identifier. */
  GENDER: Option[TargetingSpecGender])

object GenderMultipliers {
  import DateTimeCodecs._

  implicit val GenderMultipliersCodecJson: CodecJson[GenderMultipliers] = CodecJson.derive[GenderMultipliers]
  implicit val GenderMultipliersDecoder: EntityDecoder[GenderMultipliers] = jsonOf[GenderMultipliers]
  implicit val GenderMultipliersEncoder: EntityEncoder[GenderMultipliers] = jsonEncoderOf[GenderMultipliers]
}
