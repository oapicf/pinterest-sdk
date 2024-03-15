package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import QuizPinOption._

case class QuizPinOption (
  id: Option[BigDecimal],
text: Option[String])

object QuizPinOption {
  import DateTimeCodecs._

  implicit val QuizPinOptionCodecJson: CodecJson[QuizPinOption] = CodecJson.derive[QuizPinOption]
  implicit val QuizPinOptionDecoder: EntityDecoder[QuizPinOption] = jsonOf[QuizPinOption]
  implicit val QuizPinOptionEncoder: EntityEncoder[QuizPinOption] = jsonEncoderOf[QuizPinOption]
}
