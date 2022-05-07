package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.time.OffsetDateTime

import Pin._

case class Pin (
  id: Option[String],
createdAt: Option[OffsetDateTime],
link: Option[String],
title: Option[String],
description: Option[String],
altText: Option[String],
/* The board to which this Pin belongs. */
  boardId: Option[String],
/* The board section to which this Pin belongs. */
  boardSectionId: Option[String],
boardOwner: Option[BoardOwner],
media: Option[PinMedia],
mediaSource: Option[PinMediaSource])

object Pin {
  import DateTimeCodecs._

  implicit val PinCodecJson: CodecJson[Pin] = CodecJson.derive[Pin]
  implicit val PinDecoder: EntityDecoder[Pin] = jsonOf[Pin]
  implicit val PinEncoder: EntityEncoder[Pin] = jsonEncoderOf[Pin]
}
