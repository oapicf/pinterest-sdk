package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsRetailItemResponse._

case class CatalogsRetailItemResponse (
  attributes: Option[ItemAttributes],
catalogType: CatalogType,
/* The catalog retail item id in the merchant namespace */
  itemId: Option[String],
/* Discriminator literal identifying this leaf inside an `ItemResponse` payload. */
  itemResponseKind: ItemResponseKind,
/* The pins mapped to the item */
  pins: Option[List[Pin]])

object CatalogsRetailItemResponse {
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
  case object RetailItem extends ItemResponseKind

  object ItemResponseKind {
    def toItemResponseKind(s: String): Option[ItemResponseKind] = s match {
      case "RetailItem" => Some(RetailItem)
      case _ => None
    }

    def fromItemResponseKind(x: ItemResponseKind): String = x match {
      case RetailItem => "RetailItem"
    }
  }

  implicit val ItemResponseKindEnumEncoder: EncodeJson[ItemResponseKind] =
    EncodeJson[ItemResponseKind](is => StringEncodeJson(ItemResponseKind.fromItemResponseKind(is)))

  implicit val ItemResponseKindEnumDecoder: DecodeJson[ItemResponseKind] =
    DecodeJson.optionDecoder[ItemResponseKind](n => n.string.flatMap(jStr => ItemResponseKind.toItemResponseKind(jStr)), "ItemResponseKind failed to de-serialize")

  implicit val CatalogsRetailItemResponseCodecJson: CodecJson[CatalogsRetailItemResponse] = CodecJson.derive[CatalogsRetailItemResponse]
  implicit val CatalogsRetailItemResponseDecoder: EntityDecoder[CatalogsRetailItemResponse] = jsonOf[CatalogsRetailItemResponse]
  implicit val CatalogsRetailItemResponseEncoder: EntityEncoder[CatalogsRetailItemResponse] = jsonEncoderOf[CatalogsRetailItemResponse]
}
