package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsRetailReportParameters._

case class CatalogsRetailReportParameters (
  catalogType: CatalogType,
report: CatalogsHotelReportParametersReport)

object CatalogsRetailReportParameters {
  import DateTimeCodecs._
  sealed trait CatalogType
  case object RETAIL extends CatalogType

  object CatalogType {
    def toCatalogType(s: String): Option[CatalogType] = s match {
      case "RETAIL" => Some(RETAIL)
      case _ => None
    }

    def fromCatalogType(x: CatalogType): String = x match {
      case RETAIL => "RETAIL"
    }
  }

  implicit val CatalogTypeEnumEncoder: EncodeJson[CatalogType] =
    EncodeJson[CatalogType](is => StringEncodeJson(CatalogType.fromCatalogType(is)))

  implicit val CatalogTypeEnumDecoder: DecodeJson[CatalogType] =
    DecodeJson.optionDecoder[CatalogType](n => n.string.flatMap(jStr => CatalogType.toCatalogType(jStr)), "CatalogType failed to de-serialize")

  implicit val CatalogsRetailReportParametersCodecJson: CodecJson[CatalogsRetailReportParameters] = CodecJson.derive[CatalogsRetailReportParameters]
  implicit val CatalogsRetailReportParametersDecoder: EntityDecoder[CatalogsRetailReportParameters] = jsonOf[CatalogsRetailReportParameters]
  implicit val CatalogsRetailReportParametersEncoder: EntityEncoder[CatalogsRetailReportParameters] = jsonEncoderOf[CatalogsRetailReportParameters]
}
