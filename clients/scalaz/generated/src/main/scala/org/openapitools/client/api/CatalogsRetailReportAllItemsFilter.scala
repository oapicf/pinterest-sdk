package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsRetailReportAllItemsFilter._

case class CatalogsRetailReportAllItemsFilter (
  /* Unique identifier of a catalog. If not given, oldest catalog will be used */
  catalogId: Option[String],
/* Optional product group ID. If omitted, all items are included. This feature is only available for allowlisted merchants. Please contact your account manager to enable this feature. */
  productGroupId: Option[String],
reportType: ReportType)

object CatalogsRetailReportAllItemsFilter {
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

  implicit val CatalogsRetailReportAllItemsFilterCodecJson: CodecJson[CatalogsRetailReportAllItemsFilter] = CodecJson.derive[CatalogsRetailReportAllItemsFilter]
  implicit val CatalogsRetailReportAllItemsFilterDecoder: EntityDecoder[CatalogsRetailReportAllItemsFilter] = jsonOf[CatalogsRetailReportAllItemsFilter]
  implicit val CatalogsRetailReportAllItemsFilterEncoder: EntityEncoder[CatalogsRetailReportAllItemsFilter] = jsonEncoderOf[CatalogsRetailReportAllItemsFilter]
}
