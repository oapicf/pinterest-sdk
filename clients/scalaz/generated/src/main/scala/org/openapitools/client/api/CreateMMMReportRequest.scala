package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CreateMMMReportRequest._

case class CreateMMMReportRequest (
  /* Name of the Marketing Mix Modeling (MMM) report */
  reportName: String,
/* Metric report start date (UTC). Format: YYYY-MM-DD */
  startDate: String,
/* Metric report end date (UTC). Format: YYYY-MM-DD */
  endDate: String,
/* DAY - metrics are broken down daily.<br> WEEK - metrics are broken down weekly. */
  granularity: Granularity,
/* Level of the report */
  level: Level,
/* List of targeting types */
  targetingTypes: List[MMMReportingTargetingType],
/* Metric and entity columns */
  columns: List[MMMReportingColumn],
/* A List of countries for filtering */
  countries: Option[List[TargetingAdvertiserCountry]])

object CreateMMMReportRequest {
  import DateTimeCodecs._
  sealed trait Granularity
  case object DAY extends Granularity
  case object WEEK extends Granularity

  object Granularity {
    def toGranularity(s: String): Option[Granularity] = s match {
      case "DAY" => Some(DAY)
      case "WEEK" => Some(WEEK)
      case _ => None
    }

    def fromGranularity(x: Granularity): String = x match {
      case DAY => "DAY"
      case WEEK => "WEEK"
    }
  }

  implicit val GranularityEnumEncoder: EncodeJson[Granularity] =
    EncodeJson[Granularity](is => StringEncodeJson(Granularity.fromGranularity(is)))

  implicit val GranularityEnumDecoder: DecodeJson[Granularity] =
    DecodeJson.optionDecoder[Granularity](n => n.string.flatMap(jStr => Granularity.toGranularity(jStr)), "Granularity failed to de-serialize")
  sealed trait Level
  case object CAMPAIGNTARGETING extends Level
  case object ADGROUPTARGETING extends Level

  object Level {
    def toLevel(s: String): Option[Level] = s match {
      case "CAMPAIGNTARGETING" => Some(CAMPAIGNTARGETING)
      case "ADGROUPTARGETING" => Some(ADGROUPTARGETING)
      case _ => None
    }

    def fromLevel(x: Level): String = x match {
      case CAMPAIGNTARGETING => "CAMPAIGNTARGETING"
      case ADGROUPTARGETING => "ADGROUPTARGETING"
    }
  }

  implicit val LevelEnumEncoder: EncodeJson[Level] =
    EncodeJson[Level](is => StringEncodeJson(Level.fromLevel(is)))

  implicit val LevelEnumDecoder: DecodeJson[Level] =
    DecodeJson.optionDecoder[Level](n => n.string.flatMap(jStr => Level.toLevel(jStr)), "Level failed to de-serialize")

  implicit val CreateMMMReportRequestCodecJson: CodecJson[CreateMMMReportRequest] = CodecJson.derive[CreateMMMReportRequest]
  implicit val CreateMMMReportRequestDecoder: EntityDecoder[CreateMMMReportRequest] = jsonOf[CreateMMMReportRequest]
  implicit val CreateMMMReportRequestEncoder: EntityEncoder[CreateMMMReportRequest] = jsonEncoderOf[CreateMMMReportRequest]
}
