package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PinsSaveRequest._

case class PinsSaveRequest (
  /* Unique identifier of the board to which the pin will be saved. */
  boardId: Option[String],
/* Unique identifier of the board section to which the pin will be saved. */
  boardSectionId: Option[String])

object PinsSaveRequest {
  import DateTimeCodecs._

  implicit val PinsSaveRequestCodecJson: CodecJson[PinsSaveRequest] = CodecJson.derive[PinsSaveRequest]
  implicit val PinsSaveRequestDecoder: EntityDecoder[PinsSaveRequest] = jsonOf[PinsSaveRequest]
  implicit val PinsSaveRequestEncoder: EntityEncoder[PinsSaveRequest] = jsonEncoderOf[PinsSaveRequest]
}
