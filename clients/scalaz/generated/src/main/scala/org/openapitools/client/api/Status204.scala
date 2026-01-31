package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import Status204._

case class Status204 (
  statusCode: StatusCode)

object Status204 {
  import DateTimeCodecs._
  sealed trait StatusCode
  case object `204` extends StatusCode

  object StatusCode {
    def toStatusCode(s: String): Option[StatusCode] = s match {
      case "`204`" => Some(`204`)
      case _ => None
    }

    def fromStatusCode(x: StatusCode): String = x match {
      case `204` => "`204`"
    }
  }

  implicit val StatusCodeEnumEncoder: EncodeJson[StatusCode] =
    EncodeJson[StatusCode](is => StringEncodeJson(StatusCode.fromStatusCode(is)))

  implicit val StatusCodeEnumDecoder: DecodeJson[StatusCode] =
    DecodeJson.optionDecoder[StatusCode](n => n.string.flatMap(jStr => StatusCode.toStatusCode(jStr)), "StatusCode failed to de-serialize")

  implicit val Status204CodecJson: CodecJson[Status204] = CodecJson.derive[Status204]
  implicit val Status204Decoder: EntityDecoder[Status204] = jsonOf[Status204]
  implicit val Status204Encoder: EntityEncoder[Status204] = jsonEncoderOf[Status204]
}
