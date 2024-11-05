package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ItemsBatchPostRequest._

case class ItemsBatchPostRequest (
  catalogType: CatalogType,
country: Country,
language: CatalogsItemsRequestLanguage,
/* Array with catalogs items */
  items: List[ItemDeleteBatchRecord],
/* Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog */
  catalogId: Option[String],
operation: BatchOperation)

object ItemsBatchPostRequest {
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

  implicit val ItemsBatchPostRequestCodecJson: CodecJson[ItemsBatchPostRequest] = CodecJson.derive[ItemsBatchPostRequest]
  implicit val ItemsBatchPostRequestDecoder: EntityDecoder[ItemsBatchPostRequest] = jsonOf[ItemsBatchPostRequest]
  implicit val ItemsBatchPostRequestEncoder: EntityEncoder[ItemsBatchPostRequest] = jsonEncoderOf[ItemsBatchPostRequest]
}
