package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CarouselSlot._

case class CarouselSlot (
  /* Carousel Pin slot description. */
  description: Option[String],
/* Carousel Pin slot link. */
  link: Option[String],
/* Carousel Pin slot title. */
  title: Option[String])

object CarouselSlot {
  import DateTimeCodecs._

  implicit val CarouselSlotCodecJson: CodecJson[CarouselSlot] = CodecJson.derive[CarouselSlot]
  implicit val CarouselSlotDecoder: EntityDecoder[CarouselSlot] = jsonOf[CarouselSlot]
  implicit val CarouselSlotEncoder: EntityEncoder[CarouselSlot] = jsonEncoderOf[CarouselSlot]
}
