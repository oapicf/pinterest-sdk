package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AdvertiserDefinedEventsCreate200Response._

case class AdvertiserDefinedEventsCreate200Response (
  items: List[AdvertiserDefinedEventProcessingRecord])

object AdvertiserDefinedEventsCreate200Response {
  import DateTimeCodecs._

  implicit val AdvertiserDefinedEventsCreate200ResponseCodecJson: CodecJson[AdvertiserDefinedEventsCreate200Response] = CodecJson.derive[AdvertiserDefinedEventsCreate200Response]
  implicit val AdvertiserDefinedEventsCreate200ResponseDecoder: EntityDecoder[AdvertiserDefinedEventsCreate200Response] = jsonOf[AdvertiserDefinedEventsCreate200Response]
  implicit val AdvertiserDefinedEventsCreate200ResponseEncoder: EntityEncoder[AdvertiserDefinedEventsCreate200Response] = jsonEncoderOf[AdvertiserDefinedEventsCreate200Response]
}
