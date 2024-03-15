package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AdCommonQuizPinData._

case class AdCommonQuizPinData (
  questions: Option[List[QuizPinQuestion]],
results: Option[List[QuizPinResult]])

object AdCommonQuizPinData {
  import DateTimeCodecs._

  implicit val AdCommonQuizPinDataCodecJson: CodecJson[AdCommonQuizPinData] = CodecJson.derive[AdCommonQuizPinData]
  implicit val AdCommonQuizPinDataDecoder: EntityDecoder[AdCommonQuizPinData] = jsonOf[AdCommonQuizPinData]
  implicit val AdCommonQuizPinDataEncoder: EntityEncoder[AdCommonQuizPinData] = jsonEncoderOf[AdCommonQuizPinData]
}
