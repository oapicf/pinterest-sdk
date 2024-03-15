package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsHotelItemsFilter._

case class CatalogsHotelItemsFilter (
  catalogType: CatalogType,
hotelIds: List[String],
/* Catalog id pertaining to the hotel item. If not provided, default to oldest hotel catalog */
  catalogId: Option[String])

object CatalogsHotelItemsFilter {
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

  implicit val CatalogsHotelItemsFilterCodecJson: CodecJson[CatalogsHotelItemsFilter] = CodecJson.derive[CatalogsHotelItemsFilter]
  implicit val CatalogsHotelItemsFilterDecoder: EntityDecoder[CatalogsHotelItemsFilter] = jsonOf[CatalogsHotelItemsFilter]
  implicit val CatalogsHotelItemsFilterEncoder: EntityEncoder[CatalogsHotelItemsFilter] = jsonEncoderOf[CatalogsHotelItemsFilter]
}
