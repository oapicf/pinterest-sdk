package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsHotelItemErrorResponse._

case class CatalogsHotelItemErrorResponse (
  catalogType: CatalogType,
/* Array with the errors for the item id requested */
  errors: List[ItemValidationEvent],
/* The catalog hotel id in the merchant namespace */
  hotelId: Option[String],
/* Discriminator literal identifying this leaf inside an `ItemResponse` payload. */
  itemResponseKind: ItemResponseKind)

object CatalogsHotelItemErrorResponse {
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
  sealed trait ItemResponseKind
  case object HotelItemError extends ItemResponseKind

  object ItemResponseKind {
    def toItemResponseKind(s: String): Option[ItemResponseKind] = s match {
      case "HotelItemError" => Some(HotelItemError)
      case _ => None
    }

    def fromItemResponseKind(x: ItemResponseKind): String = x match {
      case HotelItemError => "HotelItemError"
    }
  }

  implicit val ItemResponseKindEnumEncoder: EncodeJson[ItemResponseKind] =
    EncodeJson[ItemResponseKind](is => StringEncodeJson(ItemResponseKind.fromItemResponseKind(is)))

  implicit val ItemResponseKindEnumDecoder: DecodeJson[ItemResponseKind] =
    DecodeJson.optionDecoder[ItemResponseKind](n => n.string.flatMap(jStr => ItemResponseKind.toItemResponseKind(jStr)), "ItemResponseKind failed to de-serialize")

  implicit val CatalogsHotelItemErrorResponseCodecJson: CodecJson[CatalogsHotelItemErrorResponse] = CodecJson.derive[CatalogsHotelItemErrorResponse]
  implicit val CatalogsHotelItemErrorResponseDecoder: EntityDecoder[CatalogsHotelItemErrorResponse] = jsonOf[CatalogsHotelItemErrorResponse]
  implicit val CatalogsHotelItemErrorResponseEncoder: EntityEncoder[CatalogsHotelItemErrorResponse] = jsonEncoderOf[CatalogsHotelItemErrorResponse]
}
