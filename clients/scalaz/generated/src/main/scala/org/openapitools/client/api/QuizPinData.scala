package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import QuizPinData._

case class QuizPinData (
  questions: Option[List[QuizPinQuestion]],
results: Option[List[QuizPinResult]])

object QuizPinData {
  import DateTimeCodecs._

  implicit val QuizPinDataCodecJson: CodecJson[QuizPinData] = CodecJson.derive[QuizPinData]
  implicit val QuizPinDataDecoder: EntityDecoder[QuizPinData] = jsonOf[QuizPinData]
  implicit val QuizPinDataEncoder: EntityEncoder[QuizPinData] = jsonEncoderOf[QuizPinData]
}
