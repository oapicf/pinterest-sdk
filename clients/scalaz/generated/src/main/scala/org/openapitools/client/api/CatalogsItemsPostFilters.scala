package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsItemsPostFilters._

case class CatalogsItemsPostFilters (
  /* Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog */
  catalogId: Option[String],
catalogType: CatalogType,
itemIds: List[String],
hotelIds: List[String],
creativeAssetsIds: List[String])

object CatalogsItemsPostFilters {
  import DateTimeCodecs._
  sealed trait CatalogType
  case object CREATIVEASSETS extends CatalogType

  object CatalogType {
    def toCatalogType(s: String): Option[CatalogType] = s match {
      case "CREATIVEASSETS" => Some(CREATIVEASSETS)
      case _ => None
    }

    def fromCatalogType(x: CatalogType): String = x match {
      case CREATIVEASSETS => "CREATIVEASSETS"
    }
  }

  implicit val CatalogTypeEnumEncoder: EncodeJson[CatalogType] =
    EncodeJson[CatalogType](is => StringEncodeJson(CatalogType.fromCatalogType(is)))

  implicit val CatalogTypeEnumDecoder: DecodeJson[CatalogType] =
    DecodeJson.optionDecoder[CatalogType](n => n.string.flatMap(jStr => CatalogType.toCatalogType(jStr)), "CatalogType failed to de-serialize")

  implicit val CatalogsItemsPostFiltersCodecJson: CodecJson[CatalogsItemsPostFilters] = CodecJson.derive[CatalogsItemsPostFilters]
  implicit val CatalogsItemsPostFiltersDecoder: EntityDecoder[CatalogsItemsPostFilters] = jsonOf[CatalogsItemsPostFilters]
  implicit val CatalogsItemsPostFiltersEncoder: EntityEncoder[CatalogsItemsPostFilters] = jsonEncoderOf[CatalogsItemsPostFilters]
}
