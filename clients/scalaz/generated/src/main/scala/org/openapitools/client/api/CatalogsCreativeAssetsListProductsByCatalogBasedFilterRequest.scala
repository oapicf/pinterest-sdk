package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest._

case class CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest (
  catalogType: CatalogType,
/* Catalog id pertaining to the creative assets product group. */
  catalogId: String,
filters: CatalogsCreativeAssetsProductGroupFilters)

object CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest {
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

  implicit val CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequestCodecJson: CodecJson[CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest] = CodecJson.derive[CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest]
  implicit val CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequestDecoder: EntityDecoder[CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest] = jsonOf[CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest]
  implicit val CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequestEncoder: EntityEncoder[CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest] = jsonEncoderOf[CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest]
}
