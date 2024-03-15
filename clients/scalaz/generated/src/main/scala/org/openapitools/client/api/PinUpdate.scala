package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PinUpdate._

case class PinUpdate (
  /* Pin's alternative text. */
  altText: Option[String],
/* The id of the board to move the Pin onto. */
  boardId: Option[String],
/* <a href=\"https://help.pinterest.com/en/article/create-a-board-section\">Board section</a> ID. */
  boardSectionId: Option[String],
/* Pin description - 800 characters maximum. */
  description: Option[String],
/* URL viewer is taken to when they click pin. */
  link: Option[String],
/* The native pin title that creators explicitly prefer to display. */
  title: Option[String],
/* Carousel Pin slots data. */
  carouselSlots: Option[List[PinUpdateCarouselSlotsInner]],
/* Private note for this Pin. <a href=\"https://help.pinterest.com/en/article/add-notes-to-your-pins\">Learn more</a>. */
  note: Option[String])

object PinUpdate {
  import DateTimeCodecs._

  implicit val PinUpdateCodecJson: CodecJson[PinUpdate] = CodecJson.derive[PinUpdate]
  implicit val PinUpdateDecoder: EntityDecoder[PinUpdate] = jsonOf[PinUpdate]
  implicit val PinUpdateEncoder: EntityEncoder[PinUpdate] = jsonEncoderOf[PinUpdate]
}
