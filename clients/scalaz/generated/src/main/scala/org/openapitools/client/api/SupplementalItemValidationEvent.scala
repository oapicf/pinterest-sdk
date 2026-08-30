package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import SupplementalItemValidationEvent._

case class SupplementalItemValidationEvent (
  /* The item attribute referenced by the validation event eg. price, availability, ad_link */
  attribute: String,
/* The event code that the item validation event references */
  code: Integer,
/* Title message describing the item validation event */
  message: String)

object SupplementalItemValidationEvent {
  import DateTimeCodecs._

  implicit val SupplementalItemValidationEventCodecJson: CodecJson[SupplementalItemValidationEvent] = CodecJson.derive[SupplementalItemValidationEvent]
  implicit val SupplementalItemValidationEventDecoder: EntityDecoder[SupplementalItemValidationEvent] = jsonOf[SupplementalItemValidationEvent]
  implicit val SupplementalItemValidationEventEncoder: EntityEncoder[SupplementalItemValidationEvent] = jsonEncoderOf[SupplementalItemValidationEvent]
}
