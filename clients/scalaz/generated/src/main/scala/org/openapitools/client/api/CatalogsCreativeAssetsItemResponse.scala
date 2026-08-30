package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsCreativeAssetsItemResponse._

case class CatalogsCreativeAssetsItemResponse (
  attributes: Option[CatalogsCreativeAssetsAttributes],
catalogType: CatalogType,
/* The catalog creative assets id in the merchant namespace */
  creativeAssetsId: Option[String],
/* Discriminator literal identifying this leaf inside an `ItemResponse` payload. */
  itemResponseKind: ItemResponseKind,
/* The pins mapped to the item */
  pins: Option[List[Pin]])

object CatalogsCreativeAssetsItemResponse {
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
  sealed trait ItemResponseKind
  case object CreativeAssetsItem extends ItemResponseKind

  object ItemResponseKind {
    def toItemResponseKind(s: String): Option[ItemResponseKind] = s match {
      case "CreativeAssetsItem" => Some(CreativeAssetsItem)
      case _ => None
    }

    def fromItemResponseKind(x: ItemResponseKind): String = x match {
      case CreativeAssetsItem => "CreativeAssetsItem"
    }
  }

  implicit val ItemResponseKindEnumEncoder: EncodeJson[ItemResponseKind] =
    EncodeJson[ItemResponseKind](is => StringEncodeJson(ItemResponseKind.fromItemResponseKind(is)))

  implicit val ItemResponseKindEnumDecoder: DecodeJson[ItemResponseKind] =
    DecodeJson.optionDecoder[ItemResponseKind](n => n.string.flatMap(jStr => ItemResponseKind.toItemResponseKind(jStr)), "ItemResponseKind failed to de-serialize")

  implicit val CatalogsCreativeAssetsItemResponseCodecJson: CodecJson[CatalogsCreativeAssetsItemResponse] = CodecJson.derive[CatalogsCreativeAssetsItemResponse]
  implicit val CatalogsCreativeAssetsItemResponseDecoder: EntityDecoder[CatalogsCreativeAssetsItemResponse] = jsonOf[CatalogsCreativeAssetsItemResponse]
  implicit val CatalogsCreativeAssetsItemResponseEncoder: EntityEncoder[CatalogsCreativeAssetsItemResponse] = jsonEncoderOf[CatalogsCreativeAssetsItemResponse]
}
