package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import SearchPartnerPins200Response._

case class SearchPartnerPins200Response (
  items: List[SummaryPin],
bookmark: Option[String])

object SearchPartnerPins200Response {
  import DateTimeCodecs._

  implicit val SearchPartnerPins200ResponseCodecJson: CodecJson[SearchPartnerPins200Response] = CodecJson.derive[SearchPartnerPins200Response]
  implicit val SearchPartnerPins200ResponseDecoder: EntityDecoder[SearchPartnerPins200Response] = jsonOf[SearchPartnerPins200Response]
  implicit val SearchPartnerPins200ResponseEncoder: EntityEncoder[SearchPartnerPins200Response] = jsonEncoderOf[SearchPartnerPins200Response]
}
