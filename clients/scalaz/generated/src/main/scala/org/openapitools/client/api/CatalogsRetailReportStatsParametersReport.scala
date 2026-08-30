package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsRetailReportStatsParametersReport._

case class CatalogsRetailReportStatsParametersReport (
  /* ID of the feed entity. */
  feedId: String,
/* Unique identifier of a feed processing result. It can be acquired from the \"id\" field of the \"items\" array within the response of the [List processing results for a given feed](/docs/api/v5/#operation/feed_processing_results/list). If not provided, default to most recent completed processing result. */
  processingResultId: Option[String],
reportType: ReportType,
/* Unique identifier of a catalog. If not given, oldest catalog will be used */
  catalogId: Option[String])

object CatalogsRetailReportStatsParametersReport {
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

  implicit val CatalogsRetailReportStatsParametersReportCodecJson: CodecJson[CatalogsRetailReportStatsParametersReport] = CodecJson.derive[CatalogsRetailReportStatsParametersReport]
  implicit val CatalogsRetailReportStatsParametersReportDecoder: EntityDecoder[CatalogsRetailReportStatsParametersReport] = jsonOf[CatalogsRetailReportStatsParametersReport]
  implicit val CatalogsRetailReportStatsParametersReportEncoder: EntityEncoder[CatalogsRetailReportStatsParametersReport] = jsonEncoderOf[CatalogsRetailReportStatsParametersReport]
}
