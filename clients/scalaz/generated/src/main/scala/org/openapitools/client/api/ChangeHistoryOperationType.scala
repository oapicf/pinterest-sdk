package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ChangeHistoryOperationType._

case class ChangeHistoryOperationType (
  
object ChangeHistoryOperationType {
  import DateTimeCodecs._

  implicit val ChangeHistoryOperationTypeCodecJson: CodecJson[ChangeHistoryOperationType] = CodecJson.derive[ChangeHistoryOperationType]
  implicit val ChangeHistoryOperationTypeDecoder: EntityDecoder[ChangeHistoryOperationType] = jsonOf[ChangeHistoryOperationType]
  implicit val ChangeHistoryOperationTypeEncoder: EntityEncoder[ChangeHistoryOperationType] = jsonEncoderOf[ChangeHistoryOperationType]
}
