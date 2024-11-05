package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsVerticalProductGroupCreateRequest._

case class CatalogsVerticalProductGroupCreateRequest (
  catalogType: CatalogType,
name: String,
description: Option[String],
filters: CatalogsCreativeAssetsProductGroupFilters,
/* Catalog id pertaining to the creative assets product group. */
  catalogId: String,
country: Country,
locale: CatalogsLocale)

object CatalogsVerticalProductGroupCreateRequest {
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

  implicit val CatalogsVerticalProductGroupCreateRequestCodecJson: CodecJson[CatalogsVerticalProductGroupCreateRequest] = CodecJson.derive[CatalogsVerticalProductGroupCreateRequest]
  implicit val CatalogsVerticalProductGroupCreateRequestDecoder: EntityDecoder[CatalogsVerticalProductGroupCreateRequest] = jsonOf[CatalogsVerticalProductGroupCreateRequest]
  implicit val CatalogsVerticalProductGroupCreateRequestEncoder: EntityEncoder[CatalogsVerticalProductGroupCreateRequest] = jsonEncoderOf[CatalogsVerticalProductGroupCreateRequest]
}
