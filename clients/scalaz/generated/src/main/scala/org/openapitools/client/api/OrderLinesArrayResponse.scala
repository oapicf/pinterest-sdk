package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import OrderLinesArrayResponse._

case class OrderLinesArrayResponse (
  items: Option[List[OrderLines]])

object OrderLinesArrayResponse {
  import DateTimeCodecs._

  implicit val OrderLinesArrayResponseCodecJson: CodecJson[OrderLinesArrayResponse] = CodecJson.derive[OrderLinesArrayResponse]
  implicit val OrderLinesArrayResponseDecoder: EntityDecoder[OrderLinesArrayResponse] = jsonOf[OrderLinesArrayResponse]
  implicit val OrderLinesArrayResponseEncoder: EntityEncoder[OrderLinesArrayResponse] = jsonEncoderOf[OrderLinesArrayResponse]
}
