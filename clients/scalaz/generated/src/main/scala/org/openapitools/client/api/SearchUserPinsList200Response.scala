package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import SearchUserPinsList200Response._

case class SearchUserPinsList200Response (
  bookmark: Option[String],
items: List[Pin])

object SearchUserPinsList200Response {
  import DateTimeCodecs._

  implicit val SearchUserPinsList200ResponseCodecJson: CodecJson[SearchUserPinsList200Response] = CodecJson.derive[SearchUserPinsList200Response]
  implicit val SearchUserPinsList200ResponseDecoder: EntityDecoder[SearchUserPinsList200Response] = jsonOf[SearchUserPinsList200Response]
  implicit val SearchUserPinsList200ResponseEncoder: EntityEncoder[SearchUserPinsList200Response] = jsonEncoderOf[SearchUserPinsList200Response]
}
