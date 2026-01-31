package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.time.OffsetDateTime

import CatalogsRetailItemsBatch._

case class CatalogsRetailItemsBatch (
  /* Id of the catalogs items batch */
  batchId: Option[String],
catalogType: CatalogsType,
/* Date and time (UTC) of the batch completion: YYYY-MM-DD'T'hh:mm:ss */
  completedTime: Option[OffsetDateTime],
/* Date and time (UTC) of the batch creation: YYYY-MM-DD'T'hh:mm:ss. If null, batch creation was skipped due to a recent duplicate ingestion. */
  createdTime: OffsetDateTime,
/* Array with the catalogs items processing records part of the catalogs items batch */
  items: Option[List[ItemProcessingRecord]],
status: Option[BatchOperationStatus])

object CatalogsRetailItemsBatch {
  import DateTimeCodecs._

  implicit val CatalogsRetailItemsBatchCodecJson: CodecJson[CatalogsRetailItemsBatch] = CodecJson.derive[CatalogsRetailItemsBatch]
  implicit val CatalogsRetailItemsBatchDecoder: EntityDecoder[CatalogsRetailItemsBatch] = jsonOf[CatalogsRetailItemsBatch]
  implicit val CatalogsRetailItemsBatchEncoder: EntityEncoder[CatalogsRetailItemsBatch] = jsonEncoderOf[CatalogsRetailItemsBatch]
}
