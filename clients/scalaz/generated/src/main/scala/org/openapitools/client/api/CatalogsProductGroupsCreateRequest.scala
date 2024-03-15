package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsProductGroupsCreateRequest._

case class CatalogsProductGroupsCreateRequest (
  name: String,
description: Option[String],
/* boolean indicator of whether the product group is being featured or not */
  isFeatured: Option[Boolean],
filters: CatalogsHotelProductGroupFilters,
/* Catalog Feed id pertaining to the catalog product group. */
  feedId: String,
catalogType: CatalogType,
/* Catalog id pertaining to the hotel product group. */
  catalogId: String)

object CatalogsProductGroupsCreateRequest {
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

  implicit val CatalogsProductGroupsCreateRequestCodecJson: CodecJson[CatalogsProductGroupsCreateRequest] = CodecJson.derive[CatalogsProductGroupsCreateRequest]
  implicit val CatalogsProductGroupsCreateRequestDecoder: EntityDecoder[CatalogsProductGroupsCreateRequest] = jsonOf[CatalogsProductGroupsCreateRequest]
  implicit val CatalogsProductGroupsCreateRequestEncoder: EntityEncoder[CatalogsProductGroupsCreateRequest] = jsonEncoderOf[CatalogsProductGroupsCreateRequest]
}
