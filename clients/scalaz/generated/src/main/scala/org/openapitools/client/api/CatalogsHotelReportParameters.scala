package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsHotelReportParameters._

case class CatalogsHotelReportParameters (
  catalogType: CatalogType,
report: CatalogsHotelReportParametersReport)

object CatalogsHotelReportParameters {
  import DateTimeCodecs._
  sealed trait CatalogType
  case object HOTEL extends CatalogType

  object CatalogType {
    def toCatalogType(s: String): Option[CatalogType] = s match {
      case "HOTEL" => Some(HOTEL)
      case _ => None
    }

    def fromCatalogType(x: CatalogType): String = x match {
      case HOTEL => "HOTEL"
    }
  }

  implicit val CatalogTypeEnumEncoder: EncodeJson[CatalogType] =
    EncodeJson[CatalogType](is => StringEncodeJson(CatalogType.fromCatalogType(is)))

  implicit val CatalogTypeEnumDecoder: DecodeJson[CatalogType] =
    DecodeJson.optionDecoder[CatalogType](n => n.string.flatMap(jStr => CatalogType.toCatalogType(jStr)), "CatalogType failed to de-serialize")

  implicit val CatalogsHotelReportParametersCodecJson: CodecJson[CatalogsHotelReportParameters] = CodecJson.derive[CatalogsHotelReportParameters]
  implicit val CatalogsHotelReportParametersDecoder: EntityDecoder[CatalogsHotelReportParameters] = jsonOf[CatalogsHotelReportParameters]
  implicit val CatalogsHotelReportParametersEncoder: EntityEncoder[CatalogsHotelReportParameters] = jsonEncoderOf[CatalogsHotelReportParameters]
}
