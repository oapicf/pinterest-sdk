package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.time.OffsetDateTime

import PinRead._

case class PinRead (
  /* AI disclosure declarations the creator has made about this Pin. */
  aiDisclosures: Option[AiDisclosures],
/* The board to which this Pin belongs. */
  boardId: Option[String],
boardOwner: Option[BoardOwner],
/* The board section to which this Pin belongs. */
  boardSectionId: Option[String],
createdAt: Option[OffsetDateTime],
creativeType: Option[CreativeType],
/* Dominant pin color. Hex number, e.g. `#6E7874`. */
  dominantColor: Option[String],
/* Whether the Pin has been promoted or not. */
  hasBeenPromoted: Option[Boolean],
id: String,
/* Whether the \"operation user_account\" is the Pin owner. */
  isOwner: Option[Boolean],
/* Whether the Pin is a product Pin. */
  isProduct: Option[Boolean],
/* Whether the Pin is standard or not. See documentation on [Changes to Pin creation](/docs/api-features/content-overview/) for more information. */
  isStandard: Option[Boolean],
media: Option[PinMedia],
/* The source pin id if this pin was saved from another pin. [Learn more](https://help.pinterest.com/article/save-pins-on-pinterest). */
  parentPinId: Option[String],
/* Pin metrics with associated time intervals if any. */
  pinMetrics: Option[Any],
altText: Option[String],
description: Option[String],
link: Option[String],
title: Option[String])

object PinRead {
  import DateTimeCodecs._

  implicit val PinReadCodecJson: CodecJson[PinRead] = CodecJson.derive[PinRead]
  implicit val PinReadDecoder: EntityDecoder[PinRead] = jsonOf[PinRead]
  implicit val PinReadEncoder: EntityEncoder[PinRead] = jsonEncoderOf[PinRead]
}
