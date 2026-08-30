package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import IneligibleProductTagReason._

case class IneligibleProductTagReason (
  
object IneligibleProductTagReason {
  import DateTimeCodecs._

  implicit val IneligibleProductTagReasonCodecJson: CodecJson[IneligibleProductTagReason] = CodecJson.derive[IneligibleProductTagReason]
  implicit val IneligibleProductTagReasonDecoder: EntityDecoder[IneligibleProductTagReason] = jsonOf[IneligibleProductTagReason]
  implicit val IneligibleProductTagReasonEncoder: EntityEncoder[IneligibleProductTagReason] = jsonEncoderOf[IneligibleProductTagReason]
}
