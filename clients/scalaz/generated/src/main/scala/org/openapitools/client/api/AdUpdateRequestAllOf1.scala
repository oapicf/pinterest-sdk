package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AdUpdateRequestAllOf1._

case class AdUpdateRequestAllOf1 (
  /* The ID of this ad. */
  id: String,
/* Pin ID. This field may only be updated for draft ads. */
  pinId: Option[String])

object AdUpdateRequestAllOf1 {
  import DateTimeCodecs._

  implicit val AdUpdateRequestAllOf1CodecJson: CodecJson[AdUpdateRequestAllOf1] = CodecJson.derive[AdUpdateRequestAllOf1]
  implicit val AdUpdateRequestAllOf1Decoder: EntityDecoder[AdUpdateRequestAllOf1] = jsonOf[AdUpdateRequestAllOf1]
  implicit val AdUpdateRequestAllOf1Encoder: EntityEncoder[AdUpdateRequestAllOf1] = jsonEncoderOf[AdUpdateRequestAllOf1]
}
