package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PaginationOrder._

case class PaginationOrder (
  
object PaginationOrder {
  import DateTimeCodecs._

  implicit val PaginationOrderCodecJson: CodecJson[PaginationOrder] = CodecJson.derive[PaginationOrder]
  implicit val PaginationOrderDecoder: EntityDecoder[PaginationOrder] = jsonOf[PaginationOrder]
  implicit val PaginationOrderEncoder: EntityEncoder[PaginationOrder] = jsonEncoderOf[PaginationOrder]
}
