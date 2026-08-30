package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ConversionApiResponseEventsItems._

case class ConversionApiResponseEventsItems (
  /* Error message containing more information about why the event failed to be processed. */
  errorMessage: Option[String],
/* Whether the event was processed successfully. */
  status: EventProcessingStatus,
/* Warning messages about any fields in the event which are not standard. These are not critical to event processing. */
  warningMessage: Option[String])

object ConversionApiResponseEventsItems {
  import DateTimeCodecs._

  implicit val ConversionApiResponseEventsItemsCodecJson: CodecJson[ConversionApiResponseEventsItems] = CodecJson.derive[ConversionApiResponseEventsItems]
  implicit val ConversionApiResponseEventsItemsDecoder: EntityDecoder[ConversionApiResponseEventsItems] = jsonOf[ConversionApiResponseEventsItems]
  implicit val ConversionApiResponseEventsItemsEncoder: EntityEncoder[ConversionApiResponseEventsItems] = jsonEncoderOf[ConversionApiResponseEventsItems]
}
