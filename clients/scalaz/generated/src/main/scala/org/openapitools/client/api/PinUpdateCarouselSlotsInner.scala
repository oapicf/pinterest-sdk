package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PinUpdateCarouselSlotsInner._

case class PinUpdateCarouselSlotsInner (
  /* Carousel Pin slot title. */
  title: Option[String],
/* Carousel Pin slot description. */
  description: Option[String],
/* Carousel Pin slot link. */
  link: Option[String])

object PinUpdateCarouselSlotsInner {
  import DateTimeCodecs._

  implicit val PinUpdateCarouselSlotsInnerCodecJson: CodecJson[PinUpdateCarouselSlotsInner] = CodecJson.derive[PinUpdateCarouselSlotsInner]
  implicit val PinUpdateCarouselSlotsInnerDecoder: EntityDecoder[PinUpdateCarouselSlotsInner] = jsonOf[PinUpdateCarouselSlotsInner]
  implicit val PinUpdateCarouselSlotsInnerEncoder: EntityEncoder[PinUpdateCarouselSlotsInner] = jsonEncoderOf[PinUpdateCarouselSlotsInner]
}
