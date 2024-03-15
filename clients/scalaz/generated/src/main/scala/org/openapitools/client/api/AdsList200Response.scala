package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AdsList200Response._

case class AdsList200Response (
  items: List[AdResponse],
bookmark: Option[String])

object AdsList200Response {
  import DateTimeCodecs._

  implicit val AdsList200ResponseCodecJson: CodecJson[AdsList200Response] = CodecJson.derive[AdsList200Response]
  implicit val AdsList200ResponseDecoder: EntityDecoder[AdsList200Response] = jsonOf[AdsList200Response]
  implicit val AdsList200ResponseEncoder: EntityEncoder[AdsList200Response] = jsonEncoderOf[AdsList200Response]
}
