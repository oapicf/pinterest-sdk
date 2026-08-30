package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsProductGroupsCreateManyRequestItems._

case class CatalogsProductGroupsCreateManyRequestItems (
  description: Option[String],
/* Catalog Feed id pertaining to the catalog product group. */
  feedId: String,
filters: CatalogsCreativeAssetsProductGroupFilters,
/* boolean indicator of whether the product group is being featured or not */
  isFeatured: Option[Boolean],
name: String,
/* Catalog ID pertaining to the product group. */
  catalogId: String,
catalogType: CatalogType,
country: Option[Country],
locale: Option[CatalogsLocale])

object CatalogsProductGroupsCreateManyRequestItems {
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

  implicit val CatalogsProductGroupsCreateManyRequestItemsCodecJson: CodecJson[CatalogsProductGroupsCreateManyRequestItems] = CodecJson.derive[CatalogsProductGroupsCreateManyRequestItems]
  implicit val CatalogsProductGroupsCreateManyRequestItemsDecoder: EntityDecoder[CatalogsProductGroupsCreateManyRequestItems] = jsonOf[CatalogsProductGroupsCreateManyRequestItems]
  implicit val CatalogsProductGroupsCreateManyRequestItemsEncoder: EntityEncoder[CatalogsProductGroupsCreateManyRequestItems] = jsonEncoderOf[CatalogsProductGroupsCreateManyRequestItems]
}
