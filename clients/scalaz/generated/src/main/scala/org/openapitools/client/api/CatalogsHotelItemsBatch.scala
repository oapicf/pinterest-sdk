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
/* Date and time (UTC) of the batch creation: YYYY-MM-DD'T'hh:mm:ss */
  createdTime: Option[OffsetDateTime],
/* Date and time (UTC) of the batch completion: YYYY-MM-DD'T'hh:mm:ss */
  completedTime: Option[OffsetDateTime],
status: Option[BatchOperationStatus],
catalogType: CatalogsType,
/* Array with the catalogs items processing records part of the catalogs items batch */
  items: Option[List[HotelProcessingRecord]])

object CatalogsHotelItemsBatch {
  import DateTimeCodecs._

  implicit val CatalogsHotelItemsBatchCodecJson: CodecJson[CatalogsHotelItemsBatch] = CodecJson.derive[CatalogsHotelItemsBatch]
  implicit val CatalogsHotelItemsBatchDecoder: EntityDecoder[CatalogsHotelItemsBatch] = jsonOf[CatalogsHotelItemsBatch]
  implicit val CatalogsHotelItemsBatchEncoder: EntityEncoder[CatalogsHotelItemsBatch] = jsonEncoderOf[CatalogsHotelItemsBatch]
}
