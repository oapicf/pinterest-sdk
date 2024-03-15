package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import OrderLinesList200Response._

case class OrderLinesList200Response (
  items: List[OrderLine],
bookmark: Option[String])

object OrderLinesList200Response {
  import DateTimeCodecs._

  implicit val OrderLinesList200ResponseCodecJson: CodecJson[OrderLinesList200Response] = CodecJson.derive[OrderLinesList200Response]
  implicit val OrderLinesList200ResponseDecoder: EntityDecoder[OrderLinesList200Response] = jsonOf[OrderLinesList200Response]
  implicit val OrderLinesList200ResponseEncoder: EntityEncoder[OrderLinesList200Response] = jsonEncoderOf[OrderLinesList200Response]
}
