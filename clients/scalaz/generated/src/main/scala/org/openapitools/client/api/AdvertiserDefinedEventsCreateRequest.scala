package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AdvertiserDefinedEventsCreateRequest._

case class AdvertiserDefinedEventsCreateRequest (
  /* List of advertiser defined events to create or update */
  items: List[AdvertiserDefinedEventInput])

object AdvertiserDefinedEventsCreateRequest {
  import DateTimeCodecs._

  implicit val AdvertiserDefinedEventsCreateRequestCodecJson: CodecJson[AdvertiserDefinedEventsCreateRequest] = CodecJson.derive[AdvertiserDefinedEventsCreateRequest]
  implicit val AdvertiserDefinedEventsCreateRequestDecoder: EntityDecoder[AdvertiserDefinedEventsCreateRequest] = jsonOf[AdvertiserDefinedEventsCreateRequest]
  implicit val AdvertiserDefinedEventsCreateRequestEncoder: EntityEncoder[AdvertiserDefinedEventsCreateRequest] = jsonEncoderOf[AdvertiserDefinedEventsCreateRequest]
}
