package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import TopPinsSortBy._

case class TopPinsSortBy (
  
object TopPinsSortBy {
  import DateTimeCodecs._

  implicit val TopPinsSortByCodecJson: CodecJson[TopPinsSortBy] = CodecJson.derive[TopPinsSortBy]
  implicit val TopPinsSortByDecoder: EntityDecoder[TopPinsSortBy] = jsonOf[TopPinsSortBy]
  implicit val TopPinsSortByEncoder: EntityEncoder[TopPinsSortBy] = jsonEncoderOf[TopPinsSortBy]
}
