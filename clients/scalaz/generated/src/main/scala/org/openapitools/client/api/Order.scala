package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import Order._

case class Order (
  
object Order {
  import DateTimeCodecs._

  implicit val OrderCodecJson: CodecJson[Order] = CodecJson.derive[Order]
  implicit val OrderDecoder: EntityDecoder[Order] = jsonOf[Order]
  implicit val OrderEncoder: EntityEncoder[Order] = jsonEncoderOf[Order]
}
