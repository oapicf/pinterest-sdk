package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ItemValidationEvent._

case class ItemValidationEvent (
  /* The attribute that the item validation event references */
  attribute: Option[String],
/* The event code that the item validation event references */
  code: Option[Integer],
/* Title message describing the item validation event */
  message: Option[String])

object ItemValidationEvent {
  import DateTimeCodecs._

  implicit val ItemValidationEventCodecJson: CodecJson[ItemValidationEvent] = CodecJson.derive[ItemValidationEvent]
  implicit val ItemValidationEventDecoder: EntityDecoder[ItemValidationEvent] = jsonOf[ItemValidationEvent]
  implicit val ItemValidationEventEncoder: EntityEncoder[ItemValidationEvent] = jsonEncoderOf[ItemValidationEvent]
}
