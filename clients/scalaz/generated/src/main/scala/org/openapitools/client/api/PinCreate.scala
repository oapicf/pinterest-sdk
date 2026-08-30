package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PinCreate._

case class PinCreate (
  /* AI disclosure declarations the creator has made about this Pin. */
  aiDisclosures: Option[AiDisclosures],
altText: Option[String],
/* The board to which this Pin belongs. */
  boardId: Option[String],
/* The board section to which this Pin belongs. */
  boardSectionId: Option[String],
description: Option[String],
/* Dominant pin color. Hex number, e.g. `#6E7874`. */
  dominantColor: Option[String],
link: Option[String],
mediaSource: Option[PinMediaSource],
/* The source pin id if this pin was saved from another pin. [Learn more](https://help.pinterest.com/article/save-pins-on-pinterest). */
  parentPinId: Option[String],
/* The sponsor account id to request paid partnership from.  Currently the field is only available to a list of users in a closed beta. */
  sponsorId: Option[String],
title: Option[String])

object PinCreate {
  import DateTimeCodecs._

  implicit val PinCreateCodecJson: CodecJson[PinCreate] = CodecJson.derive[PinCreate]
  implicit val PinCreateDecoder: EntityDecoder[PinCreate] = jsonOf[PinCreate]
  implicit val PinCreateEncoder: EntityEncoder[PinCreate] = jsonEncoderOf[PinCreate]
}
