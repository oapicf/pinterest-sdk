package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsRetailItemErrorResponse._

case class CatalogsRetailItemErrorResponse (
  catalogType: CatalogType,
/* Array with the errors for the item id requested */
  errors: List[ItemValidationEvent],
/* The catalog item id in the merchant namespace */
  itemId: Option[String],
/* Discriminator literal identifying this leaf inside an `ItemResponse` payload. */
  itemResponseKind: ItemResponseKind)

object CatalogsRetailItemErrorResponse {
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
  sealed trait ItemResponseKind
  case object RetailItemError extends ItemResponseKind

  object ItemResponseKind {
    def toItemResponseKind(s: String): Option[ItemResponseKind] = s match {
      case "RetailItemError" => Some(RetailItemError)
      case _ => None
    }

    def fromItemResponseKind(x: ItemResponseKind): String = x match {
      case RetailItemError => "RetailItemError"
    }
  }

  implicit val ItemResponseKindEnumEncoder: EncodeJson[ItemResponseKind] =
    EncodeJson[ItemResponseKind](is => StringEncodeJson(ItemResponseKind.fromItemResponseKind(is)))

  implicit val ItemResponseKindEnumDecoder: DecodeJson[ItemResponseKind] =
    DecodeJson.optionDecoder[ItemResponseKind](n => n.string.flatMap(jStr => ItemResponseKind.toItemResponseKind(jStr)), "ItemResponseKind failed to de-serialize")

  implicit val CatalogsRetailItemErrorResponseCodecJson: CodecJson[CatalogsRetailItemErrorResponse] = CodecJson.derive[CatalogsRetailItemErrorResponse]
  implicit val CatalogsRetailItemErrorResponseDecoder: EntityDecoder[CatalogsRetailItemErrorResponse] = jsonOf[CatalogsRetailItemErrorResponse]
  implicit val CatalogsRetailItemErrorResponseEncoder: EntityEncoder[CatalogsRetailItemErrorResponse] = jsonEncoderOf[CatalogsRetailItemErrorResponse]
}
