package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import BatchItemException._

case class BatchItemException (
  code: Option[Integer],
message: String)

object BatchItemException {
  import DateTimeCodecs._

  implicit val BatchItemExceptionCodecJson: CodecJson[BatchItemException] = CodecJson.derive[BatchItemException]
  implicit val BatchItemExceptionDecoder: EntityDecoder[BatchItemException] = jsonOf[BatchItemException]
  implicit val BatchItemExceptionEncoder: EntityEncoder[BatchItemException] = jsonEncoderOf[BatchItemException]
}
