package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import BatchOperationStatus._

case class BatchOperationStatus (
  
object BatchOperationStatus {
  import DateTimeCodecs._

  implicit val BatchOperationStatusCodecJson: CodecJson[BatchOperationStatus] = CodecJson.derive[BatchOperationStatus]
  implicit val BatchOperationStatusDecoder: EntityDecoder[BatchOperationStatus] = jsonOf[BatchOperationStatus]
  implicit val BatchOperationStatusEncoder: EntityEncoder[BatchOperationStatus] = jsonEncoderOf[BatchOperationStatus]
}
