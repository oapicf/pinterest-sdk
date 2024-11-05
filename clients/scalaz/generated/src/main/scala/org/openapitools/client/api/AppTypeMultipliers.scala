package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.util.HashMap

import AppTypeMultipliers._

case class AppTypeMultipliers (
  APP_TYPE: Option[TargetingSpecAppType])

object AppTypeMultipliers {
  import DateTimeCodecs._

  implicit val AppTypeMultipliersCodecJson: CodecJson[AppTypeMultipliers] = CodecJson.derive[AppTypeMultipliers]
  implicit val AppTypeMultipliersDecoder: EntityDecoder[AppTypeMultipliers] = jsonOf[AppTypeMultipliers]
  implicit val AppTypeMultipliersEncoder: EntityEncoder[AppTypeMultipliers] = jsonEncoderOf[AppTypeMultipliers]
}
