package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AdvertiserDefinedEventsResponse._

case class AdvertiserDefinedEventsResponse (
  items: Option[List[AdvertiserDefinedEvent]])

object AdvertiserDefinedEventsResponse {
  import DateTimeCodecs._

  implicit val AdvertiserDefinedEventsResponseCodecJson: CodecJson[AdvertiserDefinedEventsResponse] = CodecJson.derive[AdvertiserDefinedEventsResponse]
  implicit val AdvertiserDefinedEventsResponseDecoder: EntityDecoder[AdvertiserDefinedEventsResponse] = jsonOf[AdvertiserDefinedEventsResponse]
  implicit val AdvertiserDefinedEventsResponseEncoder: EntityEncoder[AdvertiserDefinedEventsResponse] = jsonEncoderOf[AdvertiserDefinedEventsResponse]
}
