package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PinsList200Response._

case class PinsList200Response (
  items: List[Pin],
bookmark: Option[String])

object PinsList200Response {
  import DateTimeCodecs._

  implicit val PinsList200ResponseCodecJson: CodecJson[PinsList200Response] = CodecJson.derive[PinsList200Response]
  implicit val PinsList200ResponseDecoder: EntityDecoder[PinsList200Response] = jsonOf[PinsList200Response]
  implicit val PinsList200ResponseEncoder: EntityEncoder[PinsList200Response] = jsonEncoderOf[PinsList200Response]
}
