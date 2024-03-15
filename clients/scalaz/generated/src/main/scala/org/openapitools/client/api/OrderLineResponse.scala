package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import OrderLineResponse._

case class OrderLineResponse (
  /* Error list if update(s) fail. */
  errors: Option[List[OrderLineError]],
/* Order Line object array. */
  orderLine: Option[List[OrderLine]])

object OrderLineResponse {
  import DateTimeCodecs._

  implicit val OrderLineResponseCodecJson: CodecJson[OrderLineResponse] = CodecJson.derive[OrderLineResponse]
  implicit val OrderLineResponseDecoder: EntityDecoder[OrderLineResponse] = jsonOf[OrderLineResponse]
  implicit val OrderLineResponseEncoder: EntityEncoder[OrderLineResponse] = jsonEncoderOf[OrderLineResponse]
}
