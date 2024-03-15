package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsProductGroup._

case class CatalogsProductGroup (
  /* ID of the catalog product group. */
  id: String,
/* Name of catalog product group */
  name: Option[String],
description: Option[String],
filters: CatalogsProductGroupFilters,
/* boolean indicator of whether the product group is being featured or not */
  isFeatured: Option[Boolean],
`type`: Option[CatalogsProductGroupType],
status: Option[CatalogsProductGroupStatus],
/* Unix timestamp in seconds of when catalog product group was created. */
  createdAt: Option[Integer],
/* Unix timestamp in seconds of last time catalog product group was updated. */
  updatedAt: Option[Integer],
/* id of the catalogs feed belonging to this catalog product group */
  feedId: String,
catalogType: Option[CatalogType])

object CatalogsProductGroup {
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

  implicit val CatalogsProductGroupCodecJson: CodecJson[CatalogsProductGroup] = CodecJson.derive[CatalogsProductGroup]
  implicit val CatalogsProductGroupDecoder: EntityDecoder[CatalogsProductGroup] = jsonOf[CatalogsProductGroup]
  implicit val CatalogsProductGroupEncoder: EntityEncoder[CatalogsProductGroup] = jsonEncoderOf[CatalogsProductGroup]
}
