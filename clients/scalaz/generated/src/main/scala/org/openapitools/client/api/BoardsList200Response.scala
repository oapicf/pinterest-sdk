package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import BoardsList200Response._

case class BoardsList200Response (
  /* Boards */
  items: List[Board],
bookmark: Option[String])

object BoardsList200Response {
  import DateTimeCodecs._

  implicit val BoardsList200ResponseCodecJson: CodecJson[BoardsList200Response] = CodecJson.derive[BoardsList200Response]
  implicit val BoardsList200ResponseDecoder: EntityDecoder[BoardsList200Response] = jsonOf[BoardsList200Response]
  implicit val BoardsList200ResponseEncoder: EntityEncoder[BoardsList200Response] = jsonEncoderOf[BoardsList200Response]
}
