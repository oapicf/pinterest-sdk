package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsReportAllItemsFilter._

case class CatalogsReportAllItemsFilter (
  /* Unique identifier of a catalog. If not given, oldest catalog will be used */
  catalogId: Option[String],
reportType: ReportType)

object CatalogsReportAllItemsFilter {
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

  implicit val CatalogsReportAllItemsFilterCodecJson: CodecJson[CatalogsReportAllItemsFilter] = CodecJson.derive[CatalogsReportAllItemsFilter]
  implicit val CatalogsReportAllItemsFilterDecoder: EntityDecoder[CatalogsReportAllItemsFilter] = jsonOf[CatalogsReportAllItemsFilter]
  implicit val CatalogsReportAllItemsFilterEncoder: EntityEncoder[CatalogsReportAllItemsFilter] = jsonEncoderOf[CatalogsReportAllItemsFilter]
}
