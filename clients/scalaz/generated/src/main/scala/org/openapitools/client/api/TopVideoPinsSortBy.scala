package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import TopVideoPinsSortBy._

case class TopVideoPinsSortBy (
  
object TopVideoPinsSortBy {
  import DateTimeCodecs._

  implicit val TopVideoPinsSortByCodecJson: CodecJson[TopVideoPinsSortBy] = CodecJson.derive[TopVideoPinsSortBy]
  implicit val TopVideoPinsSortByDecoder: EntityDecoder[TopVideoPinsSortBy] = jsonOf[TopVideoPinsSortBy]
  implicit val TopVideoPinsSortByEncoder: EntityEncoder[TopVideoPinsSortBy] = jsonEncoderOf[TopVideoPinsSortBy]
}
