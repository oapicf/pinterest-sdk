package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import SupplementalItemBatchOperationStatus._

case class SupplementalItemBatchOperationStatus (
  
object SupplementalItemBatchOperationStatus {
  import DateTimeCodecs._

  implicit val SupplementalItemBatchOperationStatusCodecJson: CodecJson[SupplementalItemBatchOperationStatus] = CodecJson.derive[SupplementalItemBatchOperationStatus]
  implicit val SupplementalItemBatchOperationStatusDecoder: EntityDecoder[SupplementalItemBatchOperationStatus] = jsonOf[SupplementalItemBatchOperationStatus]
  implicit val SupplementalItemBatchOperationStatusEncoder: EntityEncoder[SupplementalItemBatchOperationStatus] = jsonEncoderOf[SupplementalItemBatchOperationStatus]
}
