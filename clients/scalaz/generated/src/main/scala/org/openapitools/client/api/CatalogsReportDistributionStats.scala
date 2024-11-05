package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsReportDistributionStats._

case class CatalogsReportDistributionStats (
  reportType: Option[ReportType],
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
/* Indicates if issue makes items ineligible for ads distribution */
  ineligibleForAds: Option[Boolean],
/* Indicates if issue makes items ineligible for organic distribution */
  ineligibleForOrganic: Option[Boolean])

object CatalogsReportDistributionStats {
  import DateTimeCodecs._
  sealed trait ReportType
  case object DISTRIBUTIONISSUES extends ReportType

  object ReportType {
    def toReportType(s: String): Option[ReportType] = s match {
      case "DISTRIBUTIONISSUES" => Some(DISTRIBUTIONISSUES)
      case _ => None
    }

    def fromReportType(x: ReportType): String = x match {
      case DISTRIBUTIONISSUES => "DISTRIBUTIONISSUES"
    }
  }

  implicit val ReportTypeEnumEncoder: EncodeJson[ReportType] =
    EncodeJson[ReportType](is => StringEncodeJson(ReportType.fromReportType(is)))

  implicit val ReportTypeEnumDecoder: DecodeJson[ReportType] =
    DecodeJson.optionDecoder[ReportType](n => n.string.flatMap(jStr => ReportType.toReportType(jStr)), "ReportType failed to de-serialize")

  implicit val CatalogsReportDistributionStatsCodecJson: CodecJson[CatalogsReportDistributionStats] = CodecJson.derive[CatalogsReportDistributionStats]
  implicit val CatalogsReportDistributionStatsDecoder: EntityDecoder[CatalogsReportDistributionStats] = jsonOf[CatalogsReportDistributionStats]
  implicit val CatalogsReportDistributionStatsEncoder: EntityEncoder[CatalogsReportDistributionStats] = jsonEncoderOf[CatalogsReportDistributionStats]
}
