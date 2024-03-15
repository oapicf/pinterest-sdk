package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import BoardsListPins200Response._

case class BoardsListPins200Response (
  /* Pins */
  items: List[Pin],
bookmark: Option[String])

object BoardsListPins200Response {
  import DateTimeCodecs._

  implicit val BoardsListPins200ResponseCodecJson: CodecJson[BoardsListPins200Response] = CodecJson.derive[BoardsListPins200Response]
  implicit val BoardsListPins200ResponseDecoder: EntityDecoder[BoardsListPins200Response] = jsonOf[BoardsListPins200Response]
  implicit val BoardsListPins200ResponseEncoder: EntityEncoder[BoardsListPins200Response] = jsonEncoderOf[BoardsListPins200Response]
}
