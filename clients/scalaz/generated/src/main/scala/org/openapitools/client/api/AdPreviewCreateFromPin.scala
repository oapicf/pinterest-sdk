package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AdPreviewCreateFromPin._

case class AdPreviewCreateFromPin (
  /* Pin ID. */
  pinId: String)

object AdPreviewCreateFromPin {
  import DateTimeCodecs._

  implicit val AdPreviewCreateFromPinCodecJson: CodecJson[AdPreviewCreateFromPin] = CodecJson.derive[AdPreviewCreateFromPin]
  implicit val AdPreviewCreateFromPinDecoder: EntityDecoder[AdPreviewCreateFromPin] = jsonOf[AdPreviewCreateFromPin]
  implicit val AdPreviewCreateFromPinEncoder: EntityEncoder[AdPreviewCreateFromPin] = jsonEncoderOf[AdPreviewCreateFromPin]
}
