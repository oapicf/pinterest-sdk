package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ConversionApiResponse._

case class ConversionApiResponse (
  /* Total number of events received in the request. */
  numEventsReceived: Integer,
/* Number of events that were successfully processed from the events. */
  numEventsProcessed: Integer,
/* Specific messages for each event received. The order will match the order in which the events were received in the request. */
  events: List[ConversionApiResponseEventsInner])

object ConversionApiResponse {
  import DateTimeCodecs._

  implicit val ConversionApiResponseCodecJson: CodecJson[ConversionApiResponse] = CodecJson.derive[ConversionApiResponse]
  implicit val ConversionApiResponseDecoder: EntityDecoder[ConversionApiResponse] = jsonOf[ConversionApiResponse]
  implicit val ConversionApiResponseEncoder: EntityEncoder[ConversionApiResponse] = jsonEncoderOf[ConversionApiResponse]
}
