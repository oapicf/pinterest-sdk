package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AdArrayResponse._

case class AdArrayResponse (
  items: Option[List[AdArrayResponseElement]])

object AdArrayResponse {
  import DateTimeCodecs._

  implicit val AdArrayResponseCodecJson: CodecJson[AdArrayResponse] = CodecJson.derive[AdArrayResponse]
  implicit val AdArrayResponseDecoder: EntityDecoder[AdArrayResponse] = jsonOf[AdArrayResponse]
  implicit val AdArrayResponseEncoder: EntityEncoder[AdArrayResponse] = jsonEncoderOf[AdArrayResponse]
}
