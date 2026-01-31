package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import QuizPinQuestion._

case class QuizPinQuestion (
  options: Option[List[QuizPinOption]],
questionId: Option[BigDecimal],
questionText: Option[String])

object QuizPinQuestion {
  import DateTimeCodecs._

  implicit val QuizPinQuestionCodecJson: CodecJson[QuizPinQuestion] = CodecJson.derive[QuizPinQuestion]
  implicit val QuizPinQuestionDecoder: EntityDecoder[QuizPinQuestion] = jsonOf[QuizPinQuestion]
  implicit val QuizPinQuestionEncoder: EntityEncoder[QuizPinQuestion] = jsonEncoderOf[QuizPinQuestion]
}
