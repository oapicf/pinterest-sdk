package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsCreativeAssetsBatchRequest._

case class CatalogsCreativeAssetsBatchRequest (
  catalogType: CatalogType,
country: Country,
language: CatalogsItemsRequestLanguage,
/* Array with creative assets item operations */
  items: List[CatalogsCreativeAssetsBatchItem],
/* Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog */
  catalogId: Option[String])

object CatalogsCreativeAssetsBatchRequest {
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

  implicit val CatalogsCreativeAssetsBatchRequestCodecJson: CodecJson[CatalogsCreativeAssetsBatchRequest] = CodecJson.derive[CatalogsCreativeAssetsBatchRequest]
  implicit val CatalogsCreativeAssetsBatchRequestDecoder: EntityDecoder[CatalogsCreativeAssetsBatchRequest] = jsonOf[CatalogsCreativeAssetsBatchRequest]
  implicit val CatalogsCreativeAssetsBatchRequestEncoder: EntityEncoder[CatalogsCreativeAssetsBatchRequest] = jsonEncoderOf[CatalogsCreativeAssetsBatchRequest]
}
