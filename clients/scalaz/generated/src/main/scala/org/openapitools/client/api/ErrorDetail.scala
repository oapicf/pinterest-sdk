package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ErrorDetail._

case class ErrorDetail (
  /* Number of records with this error */
  count: Integer,
/* Numeric error code */
  errorCode: Integer,
/* Error message description */
  message: String)

object ErrorDetail {
  import DateTimeCodecs._

  implicit val ErrorDetailCodecJson: CodecJson[ErrorDetail] = CodecJson.derive[ErrorDetail]
  implicit val ErrorDetailDecoder: EntityDecoder[ErrorDetail] = jsonOf[ErrorDetail]
  implicit val ErrorDetailEncoder: EntityEncoder[ErrorDetail] = jsonEncoderOf[ErrorDetail]
}
