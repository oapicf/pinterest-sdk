package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PinUpdate._

case class PinUpdate (
  /* AI disclosure declarations the creator has made about this Pin. */
  aiDisclosures: Option[AiDisclosuresUpdate],
altText: Option[String],
/* The board to which this Pin belongs. */
  boardId: Option[String],
/* The board section to which this Pin belongs. */
  boardSectionId: Option[String],
/* Carousel Pin slots data. */
  carouselSlots: Option[List[CarouselSlot]],
description: Option[String],
link: Option[String],
title: Option[String])

object PinUpdate {
  import DateTimeCodecs._

  implicit val PinUpdateCodecJson: CodecJson[PinUpdate] = CodecJson.derive[PinUpdate]
  implicit val PinUpdateDecoder: EntityDecoder[PinUpdate] = jsonOf[PinUpdate]
  implicit val PinUpdateEncoder: EntityEncoder[PinUpdate] = jsonEncoderOf[PinUpdate]
}
