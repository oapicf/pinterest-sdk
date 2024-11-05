package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsHotelProductGroupProductCounts._

case class CatalogsHotelProductGroupProductCounts (
  catalogType: CatalogType,
total: BigDecimal)

object CatalogsHotelProductGroupProductCounts {
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

  implicit val CatalogsHotelProductGroupProductCountsCodecJson: CodecJson[CatalogsHotelProductGroupProductCounts] = CodecJson.derive[CatalogsHotelProductGroupProductCounts]
  implicit val CatalogsHotelProductGroupProductCountsDecoder: EntityDecoder[CatalogsHotelProductGroupProductCounts] = jsonOf[CatalogsHotelProductGroupProductCounts]
  implicit val CatalogsHotelProductGroupProductCountsEncoder: EntityEncoder[CatalogsHotelProductGroupProductCounts] = jsonEncoderOf[CatalogsHotelProductGroupProductCounts]
}
