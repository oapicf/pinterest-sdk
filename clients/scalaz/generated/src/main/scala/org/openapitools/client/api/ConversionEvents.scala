package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ConversionEvents._

case class ConversionEvents (
  /* Specific messages for each event received. The order will match the order in which the events were received in the request. */
  events: List[ConversionApiResponseEventsItems],
/* Number of events that were successfully processed from the events. */
  numEventsProcessed: Integer,
/* Total number of events received in the request. */
  numEventsReceived: Integer)

object ConversionEvents {
  import DateTimeCodecs._

  implicit val ConversionEventsCodecJson: CodecJson[ConversionEvents] = CodecJson.derive[ConversionEvents]
  implicit val ConversionEventsDecoder: EntityDecoder[ConversionEvents] = jsonOf[ConversionEvents]
  implicit val ConversionEventsEncoder: EntityEncoder[ConversionEvents] = jsonEncoderOf[ConversionEvents]
}
