package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import QuizPinResult._

case class QuizPinResult (
  organicPinId: Option[String],
androidDeepLink: Option[String],
iosDeepLink: Option[String],
destinationUrl: Option[String],
resultId: Option[BigDecimal])

object QuizPinResult {
  import DateTimeCodecs._

  implicit val QuizPinResultCodecJson: CodecJson[QuizPinResult] = CodecJson.derive[QuizPinResult]
  implicit val QuizPinResultDecoder: EntityDecoder[QuizPinResult] = jsonOf[QuizPinResult]
  implicit val QuizPinResultEncoder: EntityEncoder[QuizPinResult] = jsonEncoderOf[QuizPinResult]
}
