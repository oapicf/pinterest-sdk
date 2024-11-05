package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsReportDistributionIssueFilter._

case class CatalogsReportDistributionIssueFilter (
  reportType: ReportType,
/* Unique identifier of a catalog. If not given, oldest catalog will be used */
  catalogId: Option[String])

object CatalogsReportDistributionIssueFilter {
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

  implicit val CatalogsReportDistributionIssueFilterCodecJson: CodecJson[CatalogsReportDistributionIssueFilter] = CodecJson.derive[CatalogsReportDistributionIssueFilter]
  implicit val CatalogsReportDistributionIssueFilterDecoder: EntityDecoder[CatalogsReportDistributionIssueFilter] = jsonOf[CatalogsReportDistributionIssueFilter]
  implicit val CatalogsReportDistributionIssueFilterEncoder: EntityEncoder[CatalogsReportDistributionIssueFilter] = jsonEncoderOf[CatalogsReportDistributionIssueFilter]
}
