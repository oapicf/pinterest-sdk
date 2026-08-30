package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import IneligibleProductTagErrorItem._

case class IneligibleProductTagErrorItem (
  /* Reason why the pin is ineligible for tagging. */
  errorMessage: IneligibleProductTagReason,
/* Pin ID that failed eligibility check. */
  pinId: String)

object IneligibleProductTagErrorItem {
  import DateTimeCodecs._

  implicit val IneligibleProductTagErrorItemCodecJson: CodecJson[IneligibleProductTagErrorItem] = CodecJson.derive[IneligibleProductTagErrorItem]
  implicit val IneligibleProductTagErrorItemDecoder: EntityDecoder[IneligibleProductTagErrorItem] = jsonOf[IneligibleProductTagErrorItem]
  implicit val IneligibleProductTagErrorItemEncoder: EntityEncoder[IneligibleProductTagErrorItem] = jsonEncoderOf[IneligibleProductTagErrorItem]
}
