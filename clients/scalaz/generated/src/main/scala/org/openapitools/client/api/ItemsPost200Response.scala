package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ItemsPost200Response._

case class ItemsPost200Response (
  items: List[ItemResponse])

object ItemsPost200Response {
  import DateTimeCodecs._

  implicit val ItemsPost200ResponseCodecJson: CodecJson[ItemsPost200Response] = CodecJson.derive[ItemsPost200Response]
  implicit val ItemsPost200ResponseDecoder: EntityDecoder[ItemsPost200Response] = jsonOf[ItemsPost200Response]
  implicit val ItemsPost200ResponseEncoder: EntityEncoder[ItemsPost200Response] = jsonEncoderOf[ItemsPost200Response]
}
