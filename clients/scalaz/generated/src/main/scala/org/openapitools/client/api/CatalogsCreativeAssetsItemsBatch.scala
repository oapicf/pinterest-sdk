package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.time.OffsetDateTime

import CatalogsCreativeAssetsItemsBatch._

case class CatalogsCreativeAssetsItemsBatch (
  /* Id of the catalogs items batch */
  batchId: Option[String],
catalogType: CatalogType,
/* Date and time (UTC) of the batch completion: YYYY-MM-DD'T'hh:mm:ss */
  completedTime: Option[OffsetDateTime],
/* Date and time (UTC) of the batch creation: YYYY-MM-DD'T'hh:mm:ss */
  createdTime: Option[OffsetDateTime],
/* Array with the catalogs items processing records part of the catalogs items batch */
  items: Option[List[CreativeAssetsProcessingRecord]],
status: Option[BatchOperationStatus])

object CatalogsCreativeAssetsItemsBatch {
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

  implicit val CatalogsCreativeAssetsItemsBatchCodecJson: CodecJson[CatalogsCreativeAssetsItemsBatch] = CodecJson.derive[CatalogsCreativeAssetsItemsBatch]
  implicit val CatalogsCreativeAssetsItemsBatchDecoder: EntityDecoder[CatalogsCreativeAssetsItemsBatch] = jsonOf[CatalogsCreativeAssetsItemsBatch]
  implicit val CatalogsCreativeAssetsItemsBatchEncoder: EntityEncoder[CatalogsCreativeAssetsItemsBatch] = jsonEncoderOf[CatalogsCreativeAssetsItemsBatch]
}
