package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.time.OffsetDateTime

import CatalogsHotelItemsBatch._

case class CatalogsHotelItemsBatch (
  /* Id of the catalogs items batch */
  batchId: Option[String],
catalogType: CatalogType,
/* Date and time (UTC) of the batch completion: YYYY-MM-DD'T'hh:mm:ss */
  completedTime: Option[OffsetDateTime],
/* Date and time (UTC) of the batch creation: YYYY-MM-DD'T'hh:mm:ss */
  createdTime: Option[OffsetDateTime],
/* Array with the catalogs items processing records part of the catalogs items batch */
  items: Option[List[HotelProcessingRecord]],
status: Option[BatchOperationStatus])

object CatalogsHotelItemsBatch {
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

  implicit val CatalogsHotelItemsBatchCodecJson: CodecJson[CatalogsHotelItemsBatch] = CodecJson.derive[CatalogsHotelItemsBatch]
  implicit val CatalogsHotelItemsBatchDecoder: EntityDecoder[CatalogsHotelItemsBatch] = jsonOf[CatalogsHotelItemsBatch]
  implicit val CatalogsHotelItemsBatchEncoder: EntityEncoder[CatalogsHotelItemsBatch] = jsonEncoderOf[CatalogsHotelItemsBatch]
}
