package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.util.HashMap

import PlacementMultipliers._

case class PlacementMultipliers (
  PLACEMENT: Option[PLACEMENT])

object PlacementMultipliers {
  import DateTimeCodecs._
  sealed trait PLACEMENT
  case object SEARCH extends PLACEMENT
  case object BROWSE extends PLACEMENT

  object PLACEMENT {
    def toPLACEMENT(s: String): Option[PLACEMENT] = s match {
      case "SEARCH" => Some(SEARCH)
      case "BROWSE" => Some(BROWSE)
      case _ => None
    }

    def fromPLACEMENT(x: PLACEMENT): String = x match {
      case SEARCH => "SEARCH"
      case BROWSE => "BROWSE"
    }
  }

  implicit val PLACEMENTEnumEncoder: EncodeJson[PLACEMENT] =
    EncodeJson[PLACEMENT](is => StringEncodeJson(PLACEMENT.fromPLACEMENT(is)))

  implicit val PLACEMENTEnumDecoder: DecodeJson[PLACEMENT] =
    DecodeJson.optionDecoder[PLACEMENT](n => n.string.flatMap(jStr => PLACEMENT.toPLACEMENT(jStr)), "PLACEMENT failed to de-serialize")

  implicit val PlacementMultipliersCodecJson: CodecJson[PlacementMultipliers] = CodecJson.derive[PlacementMultipliers]
  implicit val PlacementMultipliersDecoder: EntityDecoder[PlacementMultipliers] = jsonOf[PlacementMultipliers]
  implicit val PlacementMultipliersEncoder: EntityEncoder[PlacementMultipliers] = jsonEncoderOf[PlacementMultipliers]
}
