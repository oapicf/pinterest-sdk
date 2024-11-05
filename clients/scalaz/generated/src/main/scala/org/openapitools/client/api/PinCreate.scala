package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.time.OffsetDateTime

import PinCreate._

case class PinCreate (
  id: Option[String],
createdAt: Option[OffsetDateTime],
link: Option[String],
title: Option[String],
description: Option[String],
/* Dominant pin color. Hex number, e.g. \\\"#6E7874\\\". */
  dominantColor: Option[String],
altText: Option[String],
/* The board to which this Pin belongs. */
  boardId: Option[String],
/* The board section to which this Pin belongs. */
  boardSectionId: Option[String],
boardOwner: Option[BoardOwner],
media: Option[PinMedia],
mediaSource: Option[PinMediaSource],
/* The source pin id if this pin was saved from another pin. <a href=\"https://help.pinterest.com/article/save-pins-on-pinterest\">Learn more</a>. */
  parentPinId: Option[String],
/* Private note for this Pin. <a href=\"https://help.pinterest.com/en/article/add-notes-to-your-pins\">Learn more</a>. */
  note: Option[String])

object PinCreate {
  import DateTimeCodecs._

  implicit val PinCreateCodecJson: CodecJson[PinCreate] = CodecJson.derive[PinCreate]
  implicit val PinCreateDecoder: EntityDecoder[PinCreate] = jsonOf[PinCreate]
  implicit val PinCreateEncoder: EntityEncoder[PinCreate] = jsonEncoderOf[PinCreate]
}
