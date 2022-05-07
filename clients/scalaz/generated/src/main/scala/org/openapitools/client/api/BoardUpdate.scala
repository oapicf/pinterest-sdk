package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import BoardUpdate._

case class BoardUpdate (
  name: Option[String],
description: Option[String],
privacy: Option[Privacy])

object BoardUpdate {
  import DateTimeCodecs._
  sealed trait Privacy
  case object PUBLIC extends Privacy
  case object SECRET extends Privacy

  object Privacy {
    def toPrivacy(s: String): Option[Privacy] = s match {
      case "PUBLIC" => Some(PUBLIC)
      case "SECRET" => Some(SECRET)
      case _ => None
    }

    def fromPrivacy(x: Privacy): String = x match {
      case PUBLIC => "PUBLIC"
      case SECRET => "SECRET"
    }
  }

  implicit val PrivacyEnumEncoder: EncodeJson[Privacy] =
    EncodeJson[Privacy](is => StringEncodeJson(Privacy.fromPrivacy(is)))

  implicit val PrivacyEnumDecoder: DecodeJson[Privacy] =
    DecodeJson.optionDecoder[Privacy](n => n.string.flatMap(jStr => Privacy.toPrivacy(jStr)), "Privacy failed to de-serialize")

  implicit val BoardUpdateCodecJson: CodecJson[BoardUpdate] = CodecJson.derive[BoardUpdate]
  implicit val BoardUpdateDecoder: EntityDecoder[BoardUpdate] = jsonOf[BoardUpdate]
  implicit val BoardUpdateEncoder: EntityEncoder[BoardUpdate] = jsonEncoderOf[BoardUpdate]
}
