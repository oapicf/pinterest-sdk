package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.util.HashMap

import ScheduleAgeBucketMultipliers._

case class ScheduleAgeBucketMultipliers (
  AGE_BUCKET: Option[AGEBUCKET])

object ScheduleAgeBucketMultipliers {
  import DateTimeCodecs._
  sealed trait AGEBUCKET
  case object `1824` extends AGEBUCKET
  case object `2534` extends AGEBUCKET
  case object `3544` extends AGEBUCKET
  case object `4549` extends AGEBUCKET
  case object `5054` extends AGEBUCKET
  case object `5564` extends AGEBUCKET
  case object `65` extends AGEBUCKET

  object AGEBUCKET {
    def toAGEBUCKET(s: String): Option[AGEBUCKET] = s match {
      case "`1824`" => Some(`1824`)
      case "`2534`" => Some(`2534`)
      case "`3544`" => Some(`3544`)
      case "`4549`" => Some(`4549`)
      case "`5054`" => Some(`5054`)
      case "`5564`" => Some(`5564`)
      case "`65`" => Some(`65`)
      case _ => None
    }

    def fromAGEBUCKET(x: AGEBUCKET): String = x match {
      case `1824` => "`1824`"
      case `2534` => "`2534`"
      case `3544` => "`3544`"
      case `4549` => "`4549`"
      case `5054` => "`5054`"
      case `5564` => "`5564`"
      case `65` => "`65`"
    }
  }

  implicit val AGEBUCKETEnumEncoder: EncodeJson[AGEBUCKET] =
    EncodeJson[AGEBUCKET](is => StringEncodeJson(AGEBUCKET.fromAGEBUCKET(is)))

  implicit val AGEBUCKETEnumDecoder: DecodeJson[AGEBUCKET] =
    DecodeJson.optionDecoder[AGEBUCKET](n => n.string.flatMap(jStr => AGEBUCKET.toAGEBUCKET(jStr)), "AGEBUCKET failed to de-serialize")

  implicit val ScheduleAgeBucketMultipliersCodecJson: CodecJson[ScheduleAgeBucketMultipliers] = CodecJson.derive[ScheduleAgeBucketMultipliers]
  implicit val ScheduleAgeBucketMultipliersDecoder: EntityDecoder[ScheduleAgeBucketMultipliers] = jsonOf[ScheduleAgeBucketMultipliers]
  implicit val ScheduleAgeBucketMultipliersEncoder: EntityEncoder[ScheduleAgeBucketMultipliers] = jsonEncoderOf[ScheduleAgeBucketMultipliers]
}
