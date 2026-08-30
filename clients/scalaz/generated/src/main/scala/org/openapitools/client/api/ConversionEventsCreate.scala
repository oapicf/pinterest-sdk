package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ConversionEventsCreate._

case class ConversionEventsCreate (
  /* A list of events (one or more) encapsulated by a data object. */
  data: List[ConversionEventsDataItems])

object ConversionEventsCreate {
  import DateTimeCodecs._

  implicit val ConversionEventsCreateCodecJson: CodecJson[ConversionEventsCreate] = CodecJson.derive[ConversionEventsCreate]
  implicit val ConversionEventsCreateDecoder: EntityDecoder[ConversionEventsCreate] = jsonOf[ConversionEventsCreate]
  implicit val ConversionEventsCreateEncoder: EntityEncoder[ConversionEventsCreate] = jsonEncoderOf[ConversionEventsCreate]
}
