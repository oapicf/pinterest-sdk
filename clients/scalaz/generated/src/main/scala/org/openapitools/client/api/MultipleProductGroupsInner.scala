package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import MultipleProductGroupsInner._

case class MultipleProductGroupsInner (
  name: String,
description: Option[String],
/* boolean indicator of whether the product group is being featured or not */
  isFeatured: Option[Boolean],
filters: CatalogsCreativeAssetsProductGroupFilters,
/* Catalog Feed id pertaining to the catalog product group. */
  feedId: String,
catalogType: CatalogType,
/* Catalog id pertaining to the creative assets product group. */
  catalogId: String,
country: Country,
locale: CatalogsLocale)

object MultipleProductGroupsInner {
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

  implicit val MultipleProductGroupsInnerCodecJson: CodecJson[MultipleProductGroupsInner] = CodecJson.derive[MultipleProductGroupsInner]
  implicit val MultipleProductGroupsInnerDecoder: EntityDecoder[MultipleProductGroupsInner] = jsonOf[MultipleProductGroupsInner]
  implicit val MultipleProductGroupsInnerEncoder: EntityEncoder[MultipleProductGroupsInner] = jsonEncoderOf[MultipleProductGroupsInner]
}
