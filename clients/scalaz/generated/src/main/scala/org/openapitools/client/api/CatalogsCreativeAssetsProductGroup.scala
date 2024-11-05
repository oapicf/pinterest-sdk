package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsCreativeAssetsProductGroup._

case class CatalogsCreativeAssetsProductGroup (
  catalogType: CatalogType,
/* ID of the creative assets product group. */
  id: String,
/* Name of creative assets product group */
  name: Option[String],
description: Option[String],
filters: CatalogsCreativeAssetsProductGroupFilters,
/* Unix timestamp in seconds of when catalog product group was created. */
  createdAt: Option[Integer],
/* Unix timestamp in seconds of last time catalog product group was updated. */
  updatedAt: Option[Integer],
/* Catalog id pertaining to the creative assets product group. */
  catalogId: String)

object CatalogsCreativeAssetsProductGroup {
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

  implicit val CatalogsCreativeAssetsProductGroupCodecJson: CodecJson[CatalogsCreativeAssetsProductGroup] = CodecJson.derive[CatalogsCreativeAssetsProductGroup]
  implicit val CatalogsCreativeAssetsProductGroupDecoder: EntityDecoder[CatalogsCreativeAssetsProductGroup] = jsonOf[CatalogsCreativeAssetsProductGroup]
  implicit val CatalogsCreativeAssetsProductGroupEncoder: EntityEncoder[CatalogsCreativeAssetsProductGroup] = jsonEncoderOf[CatalogsCreativeAssetsProductGroup]
}
