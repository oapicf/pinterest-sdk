package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import Exception._

case class Exception (
  /* Exception error code. */
  code: Option[Integer],
/* Exception message. */
  message: Option[String])

object Exception {
  import DateTimeCodecs._

  implicit val ExceptionCodecJson: CodecJson[Exception] = CodecJson.derive[Exception]
  implicit val ExceptionDecoder: EntityDecoder[Exception] = jsonOf[Exception]
  implicit val ExceptionEncoder: EntityEncoder[Exception] = jsonEncoderOf[Exception]
}
