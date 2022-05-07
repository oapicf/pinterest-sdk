package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import Board._

case class Board (
  id: Option[String],
name: String,
description: Option[String],
owner: Option[BoardOwner],
/* Privacy setting for a board. Learn more about <a href=\"https://help.pinterest.com/en/article/secret-boards\">secret boards</a> and <a href=\"https://help.pinterest.com/en/business/article/protected-boards\">protected boards</a> */
  privacy: Option[Privacy])

object Board {
  import DateTimeCodecs._
  sealed trait Privacy
  case object PUBLIC extends Privacy
  case object `PROTECTED` extends Privacy
  case object SECRET extends Privacy

  object Privacy {
    def toPrivacy(s: String): Option[Privacy] = s match {
      case "PUBLIC" => Some(PUBLIC)
      case "`PROTECTED`" => Some(`PROTECTED`)
      case "SECRET" => Some(SECRET)
      case _ => None
    }

    def fromPrivacy(x: Privacy): String = x match {
      case PUBLIC => "PUBLIC"
      case `PROTECTED` => "`PROTECTED`"
      case SECRET => "SECRET"
    }
  }

  implicit val PrivacyEnumEncoder: EncodeJson[Privacy] =
    EncodeJson[Privacy](is => StringEncodeJson(Privacy.fromPrivacy(is)))

  implicit val PrivacyEnumDecoder: DecodeJson[Privacy] =
    DecodeJson.optionDecoder[Privacy](n => n.string.flatMap(jStr => Privacy.toPrivacy(jStr)), "Privacy failed to de-serialize")

  implicit val BoardCodecJson: CodecJson[Board] = CodecJson.derive[Board]
  implicit val BoardDecoder: EntityDecoder[Board] = jsonOf[Board]
  implicit val BoardEncoder: EntityEncoder[Board] = jsonEncoderOf[Board]
}
