package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AdAccountsList200Response._

case class AdAccountsList200Response (
  /* Ad accounts */
  items: List[AdAccount],
bookmark: Option[String])

object AdAccountsList200Response {
  import DateTimeCodecs._

  implicit val AdAccountsList200ResponseCodecJson: CodecJson[AdAccountsList200Response] = CodecJson.derive[AdAccountsList200Response]
  implicit val AdAccountsList200ResponseDecoder: EntityDecoder[AdAccountsList200Response] = jsonOf[AdAccountsList200Response]
  implicit val AdAccountsList200ResponseEncoder: EntityEncoder[AdAccountsList200Response] = jsonEncoderOf[AdAccountsList200Response]
}
