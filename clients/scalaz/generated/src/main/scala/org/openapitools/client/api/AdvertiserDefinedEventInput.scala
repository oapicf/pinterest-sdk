package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AdvertiserDefinedEventInput._

case class AdvertiserDefinedEventInput (
  /* Pinterest standard event type to map this custom event to for campaign optimization and reporting */
  mappedConversionType: AdvertiserDefinedEventMappingType,
/* Raw string name of the event */
  name: String)

object AdvertiserDefinedEventInput {
  import DateTimeCodecs._

  implicit val AdvertiserDefinedEventInputCodecJson: CodecJson[AdvertiserDefinedEventInput] = CodecJson.derive[AdvertiserDefinedEventInput]
  implicit val AdvertiserDefinedEventInputDecoder: EntityDecoder[AdvertiserDefinedEventInput] = jsonOf[AdvertiserDefinedEventInput]
  implicit val AdvertiserDefinedEventInputEncoder: EntityEncoder[AdvertiserDefinedEventInput] = jsonEncoderOf[AdvertiserDefinedEventInput]
}
