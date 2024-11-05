package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsReportStats._

case class CatalogsReportStats (
  reportType: ReportType,
/* ID of the catalog entity. */
  catalogId: Option[String],
/* The event code that a diagnostics aggregated number references */
  code: Option[Integer],
/* A human-friendly label for the event code (e.g, 'SPAM') */
  codeLabel: Option[String],
/* Title message describing the diagnostic issue */
  message: Option[String],
/* Number of occurrences of the issue */
  occurrences: Option[Integer],
/* An ERROR means that items have been dropped, while a WARN denotes that items have been ingested despite an issue */
  severity: Option[Severity],
/* Indicates if issue makes items ineligible for ads distribution */
  ineligibleForAds: Option[Boolean],
/* Indicates if issue makes items ineligible for organic distribution */
  ineligibleForOrganic: Option[Boolean])

object CatalogsReportStats {
  import DateTimeCodecs._
  sealed trait ReportType
  case object FEEDINGESTIONISSUES extends ReportType
  case object DISTRIBUTIONISSUES extends ReportType

  object ReportType {
    def toReportType(s: String): Option[ReportType] = s match {
      case "FEEDINGESTIONISSUES" => Some(FEEDINGESTIONISSUES)
      case "DISTRIBUTIONISSUES" => Some(DISTRIBUTIONISSUES)
      case _ => None
    }

    def fromReportType(x: ReportType): String = x match {
      case FEEDINGESTIONISSUES => "FEEDINGESTIONISSUES"
      case DISTRIBUTIONISSUES => "DISTRIBUTIONISSUES"
    }
  }

  implicit val ReportTypeEnumEncoder: EncodeJson[ReportType] =
    EncodeJson[ReportType](is => StringEncodeJson(ReportType.fromReportType(is)))

  implicit val ReportTypeEnumDecoder: DecodeJson[ReportType] =
    DecodeJson.optionDecoder[ReportType](n => n.string.flatMap(jStr => ReportType.toReportType(jStr)), "ReportType failed to de-serialize")
  sealed trait Severity
  case object WARN extends Severity
  case object ERROR extends Severity

  object Severity {
    def toSeverity(s: String): Option[Severity] = s match {
      case "WARN" => Some(WARN)
      case "ERROR" => Some(ERROR)
      case _ => None
    }

    def fromSeverity(x: Severity): String = x match {
      case WARN => "WARN"
      case ERROR => "ERROR"
    }
  }

  implicit val SeverityEnumEncoder: EncodeJson[Severity] =
    EncodeJson[Severity](is => StringEncodeJson(Severity.fromSeverity(is)))

  implicit val SeverityEnumDecoder: DecodeJson[Severity] =
    DecodeJson.optionDecoder[Severity](n => n.string.flatMap(jStr => Severity.toSeverity(jStr)), "Severity failed to de-serialize")

  implicit val CatalogsReportStatsCodecJson: CodecJson[CatalogsReportStats] = CodecJson.derive[CatalogsReportStats]
  implicit val CatalogsReportStatsDecoder: EntityDecoder[CatalogsReportStats] = jsonOf[CatalogsReportStats]
  implicit val CatalogsReportStatsEncoder: EntityEncoder[CatalogsReportStats] = jsonEncoderOf[CatalogsReportStats]
}
