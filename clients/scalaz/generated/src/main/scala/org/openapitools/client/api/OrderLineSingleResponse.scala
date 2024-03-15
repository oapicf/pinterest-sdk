package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import OrderLineSingleResponse._

case class OrderLineSingleResponse (
  data: Option[OrderLineResponse])

object OrderLineSingleResponse {
  import DateTimeCodecs._

  implicit val OrderLineSingleResponseCodecJson: CodecJson[OrderLineSingleResponse] = CodecJson.derive[OrderLineSingleResponse]
  implicit val OrderLineSingleResponseDecoder: EntityDecoder[OrderLineSingleResponse] = jsonOf[OrderLineSingleResponse]
  implicit val OrderLineSingleResponseEncoder: EntityEncoder[OrderLineSingleResponse] = jsonEncoderOf[OrderLineSingleResponse]
}
