package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import OptimizationGoalMetadataFrequencyGoalMetadata._

case class OptimizationGoalMetadataFrequencyGoalMetadata (
  frequency: Option[Integer],
/* User entity counts time range */
  timerange: Option[Timerange])

object OptimizationGoalMetadataFrequencyGoalMetadata {
  import DateTimeCodecs._
  sealed trait Timerange
  case object THIRTYDAY extends Timerange
  case object DAY extends Timerange
  case object SEVENDAY extends Timerange
  case object TWENTYMINUTE extends Timerange
  case object TENMINUTE extends Timerange
  case object TWENTYFOURHOUR extends Timerange

  object Timerange {
    def toTimerange(s: String): Option[Timerange] = s match {
      case "THIRTYDAY" => Some(THIRTYDAY)
      case "DAY" => Some(DAY)
      case "SEVENDAY" => Some(SEVENDAY)
      case "TWENTYMINUTE" => Some(TWENTYMINUTE)
      case "TENMINUTE" => Some(TENMINUTE)
      case "TWENTYFOURHOUR" => Some(TWENTYFOURHOUR)
      case _ => None
    }

    def fromTimerange(x: Timerange): String = x match {
      case THIRTYDAY => "THIRTYDAY"
      case DAY => "DAY"
      case SEVENDAY => "SEVENDAY"
      case TWENTYMINUTE => "TWENTYMINUTE"
      case TENMINUTE => "TENMINUTE"
      case TWENTYFOURHOUR => "TWENTYFOURHOUR"
    }
  }

  implicit val TimerangeEnumEncoder: EncodeJson[Timerange] =
    EncodeJson[Timerange](is => StringEncodeJson(Timerange.fromTimerange(is)))

  implicit val TimerangeEnumDecoder: DecodeJson[Timerange] =
    DecodeJson.optionDecoder[Timerange](n => n.string.flatMap(jStr => Timerange.toTimerange(jStr)), "Timerange failed to de-serialize")

  implicit val OptimizationGoalMetadataFrequencyGoalMetadataCodecJson: CodecJson[OptimizationGoalMetadataFrequencyGoalMetadata] = CodecJson.derive[OptimizationGoalMetadataFrequencyGoalMetadata]
  implicit val OptimizationGoalMetadataFrequencyGoalMetadataDecoder: EntityDecoder[OptimizationGoalMetadataFrequencyGoalMetadata] = jsonOf[OptimizationGoalMetadataFrequencyGoalMetadata]
  implicit val OptimizationGoalMetadataFrequencyGoalMetadataEncoder: EntityEncoder[OptimizationGoalMetadataFrequencyGoalMetadata] = jsonEncoderOf[OptimizationGoalMetadataFrequencyGoalMetadata]
}
