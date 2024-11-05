package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import OperationType._

case class OperationType (
  
object OperationType {
  import DateTimeCodecs._

  implicit val OperationTypeCodecJson: CodecJson[OperationType] = CodecJson.derive[OperationType]
  implicit val OperationTypeDecoder: EntityDecoder[OperationType] = jsonOf[OperationType]
  implicit val OperationTypeEncoder: EntityEncoder[OperationType] = jsonEncoderOf[OperationType]
}
