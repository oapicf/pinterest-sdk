package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsVerticalProductGroup._

case class CatalogsVerticalProductGroup (
  catalogType: CatalogType,
/* ID of the creative assets product group. */
  id: String,
/* Name of creative assets product group */
  name: Option[String],
description: Option[String],
filters: CatalogsCreativeAssetsProductGroupFilters,
/* boolean indicator of whether the product group is being featured or not */
  isFeatured: Option[Boolean],
`type`: Option[CatalogsProductGroupType],
status: Option[CatalogsProductGroupStatus],
/* Unix timestamp in seconds of when catalog product group was created. */
  createdAt: Option[Integer],
/* Unix timestamp in seconds of last time catalog product group was updated. */
  updatedAt: Option[Integer],
/* Catalog id pertaining to the creative assets product group. */
  catalogId: String,
/* id of the catalogs feed belonging to this catalog product group */
  feedId: String,
country: Option[String],
locale: Option[String])

object CatalogsVerticalProductGroup {
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

  implicit val CatalogsVerticalProductGroupCodecJson: CodecJson[CatalogsVerticalProductGroup] = CodecJson.derive[CatalogsVerticalProductGroup]
  implicit val CatalogsVerticalProductGroupDecoder: EntityDecoder[CatalogsVerticalProductGroup] = jsonOf[CatalogsVerticalProductGroup]
  implicit val CatalogsVerticalProductGroupEncoder: EntityEncoder[CatalogsVerticalProductGroup] = jsonEncoderOf[CatalogsVerticalProductGroup]
}
