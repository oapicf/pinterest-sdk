package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsHotelReportParametersReport._

case class CatalogsHotelReportParametersReport (
  reportType: Option[ReportType],
/* ID of the feed entity. */
  feedId: String,
/* Unique identifier of a feed processing result. It can be acquired from the \"id\" field of the \"items\" array within the response of the [List processing results for a given feed](/docs/api/v5/#operation/feed_processing_results/list). If not provided, default to most recent completed processing result. */
  processingResultId: Option[String],
/* Unique identifier of a catalog. If not given, oldest catalog will be used */
  catalogId: Option[String])

object CatalogsHotelReportParametersReport {
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

  implicit val CatalogsHotelReportParametersReportCodecJson: CodecJson[CatalogsHotelReportParametersReport] = CodecJson.derive[CatalogsHotelReportParametersReport]
  implicit val CatalogsHotelReportParametersReportDecoder: EntityDecoder[CatalogsHotelReportParametersReport] = jsonOf[CatalogsHotelReportParametersReport]
  implicit val CatalogsHotelReportParametersReportEncoder: EntityEncoder[CatalogsHotelReportParametersReport] = jsonEncoderOf[CatalogsHotelReportParametersReport]
}
