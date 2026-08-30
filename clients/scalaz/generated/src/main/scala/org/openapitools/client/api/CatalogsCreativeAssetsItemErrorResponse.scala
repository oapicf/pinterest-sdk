package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsCreativeAssetsItemErrorResponse._

case class CatalogsCreativeAssetsItemErrorResponse (
  catalogType: CatalogType,
/* The catalog creative assets id in the merchant namespace */
  creativeAssetsId: Option[String],
/* Array with the errors for the item id requested */
  errors: List[ItemValidationEvent],
/* Discriminator literal identifying this leaf inside an `ItemResponse` payload. */
  itemResponseKind: ItemResponseKind)

object CatalogsCreativeAssetsItemErrorResponse {
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
  case object CreativeAssetsItemError extends ItemResponseKind

  object ItemResponseKind {
    def toItemResponseKind(s: String): Option[ItemResponseKind] = s match {
      case "CreativeAssetsItemError" => Some(CreativeAssetsItemError)
      case _ => None
    }

    def fromItemResponseKind(x: ItemResponseKind): String = x match {
      case CreativeAssetsItemError => "CreativeAssetsItemError"
    }
  }

  implicit val ItemResponseKindEnumEncoder: EncodeJson[ItemResponseKind] =
    EncodeJson[ItemResponseKind](is => StringEncodeJson(ItemResponseKind.fromItemResponseKind(is)))

  implicit val ItemResponseKindEnumDecoder: DecodeJson[ItemResponseKind] =
    DecodeJson.optionDecoder[ItemResponseKind](n => n.string.flatMap(jStr => ItemResponseKind.toItemResponseKind(jStr)), "ItemResponseKind failed to de-serialize")

  implicit val CatalogsCreativeAssetsItemErrorResponseCodecJson: CodecJson[CatalogsCreativeAssetsItemErrorResponse] = CodecJson.derive[CatalogsCreativeAssetsItemErrorResponse]
  implicit val CatalogsCreativeAssetsItemErrorResponseDecoder: EntityDecoder[CatalogsCreativeAssetsItemErrorResponse] = jsonOf[CatalogsCreativeAssetsItemErrorResponse]
  implicit val CatalogsCreativeAssetsItemErrorResponseEncoder: EntityEncoder[CatalogsCreativeAssetsItemErrorResponse] = jsonEncoderOf[CatalogsCreativeAssetsItemErrorResponse]
}
