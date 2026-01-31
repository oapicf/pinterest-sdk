package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.time.OffsetDateTime

import Board._

case class Board (
  /* Date and time of last board pins modified. */
  boardPinsModifiedAt: Option[OffsetDateTime],
/* Count of collaborators on the board. */
  collaboratorCount: Option[Integer],
/* Date and time of board creation. */
  createdAt: Option[OffsetDateTime],
description: Option[String],
/* Board follower count. */
  followerCount: Option[Integer],
id: String,
/* If set to `true`, the board will be ad-only and can store ad-only Pins. */
  isAdsOnly: Option[Boolean],
/* Board media. */
  media: Option[BoardMedia],
/*      Name of the board.      **Note:** If you create an ad-only board by setting `is_ads_only`     to `true`, the board name automatically becomes \"Ad-only Pins\". */
  name: String,
owner: Option[BoardOwner],
/* Count of Pins on the board. */
  pinCount: Option[Integer],
/*     Privacy setting for a board. Learn more about [secret](https://help.pinterest.com/en/article/secret-boards)     boards and [protected](https://help.pinterest.com/en/business/article/protected-boards) boards.      **Note:** If you create an ad-only board by setting `is_ads_only`     to `true`, the `privacy` settng automatically becomes `PROTECTED`.  */
  privacy: Option[BoardPrivacy])

object Board {
  import DateTimeCodecs._

  implicit val BoardCodecJson: CodecJson[Board] = CodecJson.derive[Board]
  implicit val BoardDecoder: EntityDecoder[Board] = jsonOf[Board]
  implicit val BoardEncoder: EntityEncoder[Board] = jsonEncoderOf[Board]
}
