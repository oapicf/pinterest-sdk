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
/* Date and time (UTC) of the batch creation: YYYY-MM-DD'T'hh:mm:ss */
  createdTime: Option[OffsetDateTime],
/* Date and time (UTC) of the batch completion: YYYY-MM-DD'T'hh:mm:ss */
  completedTime: Option[OffsetDateTime],
status: Option[BatchOperationStatus],
catalogType: CatalogsType,
/* Array with the catalogs items processing records part of the catalogs items batch */
  items: Option[List[CreativeAssetsProcessingRecord]])

object CatalogsCreativeAssetsItemsBatch {
  import DateTimeCodecs._

  implicit val CatalogsCreativeAssetsItemsBatchCodecJson: CodecJson[CatalogsCreativeAssetsItemsBatch] = CodecJson.derive[CatalogsCreativeAssetsItemsBatch]
  implicit val CatalogsCreativeAssetsItemsBatchDecoder: EntityDecoder[CatalogsCreativeAssetsItemsBatch] = jsonOf[CatalogsCreativeAssetsItemsBatch]
  implicit val CatalogsCreativeAssetsItemsBatchEncoder: EntityEncoder[CatalogsCreativeAssetsItemsBatch] = jsonEncoderOf[CatalogsCreativeAssetsItemsBatch]
}
