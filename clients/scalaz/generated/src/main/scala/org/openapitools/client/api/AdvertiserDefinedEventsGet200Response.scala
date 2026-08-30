package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AdvertiserDefinedEventsGet200Response._

case class AdvertiserDefinedEventsGet200Response (
  items: List[AdvertiserDefinedEvent])

object AdvertiserDefinedEventsGet200Response {
  import DateTimeCodecs._

  implicit val AdvertiserDefinedEventsGet200ResponseCodecJson: CodecJson[AdvertiserDefinedEventsGet200Response] = CodecJson.derive[AdvertiserDefinedEventsGet200Response]
  implicit val AdvertiserDefinedEventsGet200ResponseDecoder: EntityDecoder[AdvertiserDefinedEventsGet200Response] = jsonOf[AdvertiserDefinedEventsGet200Response]
  implicit val AdvertiserDefinedEventsGet200ResponseEncoder: EntityEncoder[AdvertiserDefinedEventsGet200Response] = jsonEncoderOf[AdvertiserDefinedEventsGet200Response]
}
