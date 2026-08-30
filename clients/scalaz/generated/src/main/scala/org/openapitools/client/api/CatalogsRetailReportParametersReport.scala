package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsRetailReportParametersReport._

case class CatalogsRetailReportParametersReport (
  /* ID of the feed entity. */
  feedId: String,
/* Unique identifier of a feed processing result. It can be acquired from the \"id\" field of the \"items\" array within the response of the [List processing results for a given feed](/docs/api/v5/#operation/feed_processing_results/list). If not provided, default to most recent completed processing result. */
  processingResultId: Option[String],
reportType: ReportType,
/* Unique identifier of a catalog. If not given, oldest catalog will be used */
  catalogId: Option[String],
/* Optional product group ID. If omitted, all items are included. This feature is only available for allowlisted merchants. Please contact your account manager to enable this feature. */
  productGroupId: Option[String])

object CatalogsRetailReportParametersReport {
  import DateTimeCodecs._
  sealed trait ReportType
  case object ALLITEMS extends ReportType

  object ReportType {
    def toReportType(s: String): Option[ReportType] = s match {
      case "ALLITEMS" => Some(ALLITEMS)
      case _ => None
    }

    def fromReportType(x: ReportType): String = x match {
      case ALLITEMS => "ALLITEMS"
    }
  }

  implicit val ReportTypeEnumEncoder: EncodeJson[ReportType] =
    EncodeJson[ReportType](is => StringEncodeJson(ReportType.fromReportType(is)))

  implicit val ReportTypeEnumDecoder: DecodeJson[ReportType] =
    DecodeJson.optionDecoder[ReportType](n => n.string.flatMap(jStr => ReportType.toReportType(jStr)), "ReportType failed to de-serialize")

  implicit val CatalogsRetailReportParametersReportCodecJson: CodecJson[CatalogsRetailReportParametersReport] = CodecJson.derive[CatalogsRetailReportParametersReport]
  implicit val CatalogsRetailReportParametersReportDecoder: EntityDecoder[CatalogsRetailReportParametersReport] = jsonOf[CatalogsRetailReportParametersReport]
  implicit val CatalogsRetailReportParametersReportEncoder: EntityEncoder[CatalogsRetailReportParametersReport] = jsonEncoderOf[CatalogsRetailReportParametersReport]
}
