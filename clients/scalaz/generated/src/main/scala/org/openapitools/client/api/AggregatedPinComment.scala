package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.time.OffsetDateTime

import AggregatedPinComment._

case class AggregatedPinComment (
  /* AI disclosure declarations the creator has made about this Pin. */
  aiDisclosures: Option[AiDisclosures],
altText: Option[String],
/* The board to which this Pin belongs. */
  boardId: Option[String],
boardOwner: Option[BoardOwner],
/* The board section to which this Pin belongs. */
  boardSectionId: Option[String],
createdAt: Option[OffsetDateTime],
creativeType: Option[CreativeType],
description: Option[String],
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
link: Option[String],
media: Option[PinMedia],
/* The source pin id if this pin was saved from another pin. [Learn more](https://help.pinterest.com/article/save-pins-on-pinterest). */
  parentPinId: Option[String],
/* Pin metrics with associated time intervals if any. */
  pinMetrics: Option[Any],
title: Option[String])

object AggregatedPinComment {
  import DateTimeCodecs._

  implicit val AggregatedPinCommentCodecJson: CodecJson[AggregatedPinComment] = CodecJson.derive[AggregatedPinComment]
  implicit val AggregatedPinCommentDecoder: EntityDecoder[AggregatedPinComment] = jsonOf[AggregatedPinComment]
  implicit val AggregatedPinCommentEncoder: EntityEncoder[AggregatedPinComment] = jsonEncoderOf[AggregatedPinComment]
}
