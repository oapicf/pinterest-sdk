package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsHotelProductGroup._

case class CatalogsHotelProductGroup (
  /* Catalog ID pertaining to the product group. */
  catalogId: String,
catalogType: CatalogType,
/* Unix timestamp in seconds of when catalog product group was created. */
  createdAt: Option[Integer],
description: Option[String],
filters: CatalogsHotelProductGroupFilters,
/* ID of the catalog product group. */
  id: String,
/* Name of catalog product group */
  name: Option[String],
`type`: CatalogsHotelProductGroupType,
/* Unix timestamp in seconds of last time catalog product group was updated. */
  updatedAt: Option[Integer])

object CatalogsHotelProductGroup {
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

  implicit val CatalogsHotelProductGroupCodecJson: CodecJson[CatalogsHotelProductGroup] = CodecJson.derive[CatalogsHotelProductGroup]
  implicit val CatalogsHotelProductGroupDecoder: EntityDecoder[CatalogsHotelProductGroup] = jsonOf[CatalogsHotelProductGroup]
  implicit val CatalogsHotelProductGroupEncoder: EntityEncoder[CatalogsHotelProductGroup] = jsonEncoderOf[CatalogsHotelProductGroup]
}
