package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PinsSaveRequestCreate._

case class PinsSaveRequestCreate (
  /* Unique identifier of the board to which the pin will be saved. */
  boardId: Option[String],
/* Unique identifier of the board section to which the pin will be saved. */
  boardSectionId: Option[String])

object PinsSaveRequestCreate {
  import DateTimeCodecs._

  implicit val PinsSaveRequestCreateCodecJson: CodecJson[PinsSaveRequestCreate] = CodecJson.derive[PinsSaveRequestCreate]
  implicit val PinsSaveRequestCreateDecoder: EntityDecoder[PinsSaveRequestCreate] = jsonOf[PinsSaveRequestCreate]
  implicit val PinsSaveRequestCreateEncoder: EntityEncoder[PinsSaveRequestCreate] = jsonEncoderOf[PinsSaveRequestCreate]
}
