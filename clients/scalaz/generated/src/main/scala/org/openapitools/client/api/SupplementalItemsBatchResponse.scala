package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.time.OffsetDateTime

import SupplementalItemsBatchResponse._

case class SupplementalItemsBatchResponse (
  /* Id of the batch operation */
  batchId: String,
/* Date and time (UTC) of the batch completion: YYYY-MM-DD'T'hh:mm:ss */
  completedTime: Option[OffsetDateTime],
/* Date and time (UTC) of the batch creation: YYYY-MM-DD'T'hh:mm:ss */
  createdTime: OffsetDateTime,
/* Array of operation results */
  operationResults: List[SupplementalOperationResult],
/* Status of the batch: PROCESSING, COMPLETED, FAILED */
  status: SupplementalItemBatchOperationStatus)

object SupplementalItemsBatchResponse {
  import DateTimeCodecs._

  implicit val SupplementalItemsBatchResponseCodecJson: CodecJson[SupplementalItemsBatchResponse] = CodecJson.derive[SupplementalItemsBatchResponse]
  implicit val SupplementalItemsBatchResponseDecoder: EntityDecoder[SupplementalItemsBatchResponse] = jsonOf[SupplementalItemsBatchResponse]
  implicit val SupplementalItemsBatchResponseEncoder: EntityEncoder[SupplementalItemsBatchResponse] = jsonEncoderOf[SupplementalItemsBatchResponse]
}
