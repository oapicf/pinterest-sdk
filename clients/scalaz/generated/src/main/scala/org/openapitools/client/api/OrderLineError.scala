package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import OrderLineError._

case class OrderLineError (
  data: Option[OrderLine],
errorMessages: Option[List[String]])

object OrderLineError {
  import DateTimeCodecs._

  implicit val OrderLineErrorCodecJson: CodecJson[OrderLineError] = CodecJson.derive[OrderLineError]
  implicit val OrderLineErrorDecoder: EntityDecoder[OrderLineError] = jsonOf[OrderLineError]
  implicit val OrderLineErrorEncoder: EntityEncoder[OrderLineError] = jsonEncoderOf[OrderLineError]
}
