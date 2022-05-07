package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.time.OffsetDateTime

import CatalogsItemsBatch._

case class CatalogsItemsBatch (
  /* Array with the catalogs items processing records part of the catalogs items batch */
  items: Option[List[ItemProcessingRecord]],
/* Id of the catalogs items batch */
  batchId: Option[String],
/* Time of the batch creation: YYYY-MM-DD'T'hh:mm:ssTZD */
  createdTime: Option[OffsetDateTime],
/* Time of the batch completion: YYYY-MM-DD'T'hh:mm:ssTZD */
  completedTime: Option[OffsetDateTime],
status: Option[BatchOperationStatus])

object CatalogsItemsBatch {
  import DateTimeCodecs._

  implicit val CatalogsItemsBatchCodecJson: CodecJson[CatalogsItemsBatch] = CodecJson.derive[CatalogsItemsBatch]
  implicit val CatalogsItemsBatchDecoder: EntityDecoder[CatalogsItemsBatch] = jsonOf[CatalogsItemsBatch]
  implicit val CatalogsItemsBatchEncoder: EntityEncoder[CatalogsItemsBatch] = jsonEncoderOf[CatalogsItemsBatch]
}
