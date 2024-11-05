package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsVerticalProductGroupUpdateRequest._

case class CatalogsVerticalProductGroupUpdateRequest (
  catalogType: Option[CatalogType],
name: Option[String],
description: Option[String],
filters: Option[CatalogsCreativeAssetsProductGroupFilters],
country: Option[Country],
locale: Option[CatalogsLocale])

object CatalogsVerticalProductGroupUpdateRequest {
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

  implicit val CatalogsVerticalProductGroupUpdateRequestCodecJson: CodecJson[CatalogsVerticalProductGroupUpdateRequest] = CodecJson.derive[CatalogsVerticalProductGroupUpdateRequest]
  implicit val CatalogsVerticalProductGroupUpdateRequestDecoder: EntityDecoder[CatalogsVerticalProductGroupUpdateRequest] = jsonOf[CatalogsVerticalProductGroupUpdateRequest]
  implicit val CatalogsVerticalProductGroupUpdateRequestEncoder: EntityEncoder[CatalogsVerticalProductGroupUpdateRequest] = jsonEncoderOf[CatalogsVerticalProductGroupUpdateRequest]
}
