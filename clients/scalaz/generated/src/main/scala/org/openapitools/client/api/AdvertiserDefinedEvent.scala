package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AdvertiserDefinedEvent._

case class AdvertiserDefinedEvent (
  /* Standard type mapped to ADE for optimization */
  mappedConversionType: Option[ConversionTagTypeOptimal],
/* Raw string name of the event, usually logged as raw_event_name in our dataset */
  name: Option[String])

object AdvertiserDefinedEvent {
  import DateTimeCodecs._

  implicit val AdvertiserDefinedEventCodecJson: CodecJson[AdvertiserDefinedEvent] = CodecJson.derive[AdvertiserDefinedEvent]
  implicit val AdvertiserDefinedEventDecoder: EntityDecoder[AdvertiserDefinedEvent] = jsonOf[AdvertiserDefinedEvent]
  implicit val AdvertiserDefinedEventEncoder: EntityEncoder[AdvertiserDefinedEvent] = jsonEncoderOf[AdvertiserDefinedEvent]
}
