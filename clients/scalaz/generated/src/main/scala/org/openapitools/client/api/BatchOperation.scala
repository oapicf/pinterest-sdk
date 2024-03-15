package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import BatchOperation._

case class BatchOperation (
  
object BatchOperation {
  import DateTimeCodecs._

  implicit val BatchOperationCodecJson: CodecJson[BatchOperation] = CodecJson.derive[BatchOperation]
  implicit val BatchOperationDecoder: EntityDecoder[BatchOperation] = jsonOf[BatchOperation]
  implicit val BatchOperationEncoder: EntityEncoder[BatchOperation] = jsonEncoderOf[BatchOperation]
}
