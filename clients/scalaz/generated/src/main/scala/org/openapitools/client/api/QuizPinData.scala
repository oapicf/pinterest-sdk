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
results: Option[List[QuizPinResult]],
/* Quiz ad tie breaker type, default is RANDOM */
  tieBreakerType: Option[TieBreakerType],
tieBreakerCustomResult: Option[QuizPinResult])

object QuizPinData {
  import DateTimeCodecs._
  sealed trait TieBreakerType
  case object RANDOM extends TieBreakerType
  case object CUSTOM extends TieBreakerType

  object TieBreakerType {
    def toTieBreakerType(s: String): Option[TieBreakerType] = s match {
      case "RANDOM" => Some(RANDOM)
      case "CUSTOM" => Some(CUSTOM)
      case _ => None
    }

    def fromTieBreakerType(x: TieBreakerType): String = x match {
      case RANDOM => "RANDOM"
      case CUSTOM => "CUSTOM"
    }
  }

  implicit val TieBreakerTypeEnumEncoder: EncodeJson[TieBreakerType] =
    EncodeJson[TieBreakerType](is => StringEncodeJson(TieBreakerType.fromTieBreakerType(is)))

  implicit val TieBreakerTypeEnumDecoder: DecodeJson[TieBreakerType] =
    DecodeJson.optionDecoder[TieBreakerType](n => n.string.flatMap(jStr => TieBreakerType.toTieBreakerType(jStr)), "TieBreakerType failed to de-serialize")

  implicit val QuizPinDataCodecJson: CodecJson[QuizPinData] = CodecJson.derive[QuizPinData]
  implicit val QuizPinDataDecoder: EntityDecoder[QuizPinData] = jsonOf[QuizPinData]
  implicit val QuizPinDataEncoder: EntityEncoder[QuizPinData] = jsonEncoderOf[QuizPinData]
}
