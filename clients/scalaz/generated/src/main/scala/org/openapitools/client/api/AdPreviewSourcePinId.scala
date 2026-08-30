package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AdPreviewSourcePinId._

case class AdPreviewSourcePinId (
  /* Creative type of the ad preview. */
  creativeType: Option[AdPinPreviewCreativeType],
/* Pin ID. */
  pinId: String)

object AdPreviewSourcePinId {
  import DateTimeCodecs._

  implicit val AdPreviewSourcePinIdCodecJson: CodecJson[AdPreviewSourcePinId] = CodecJson.derive[AdPreviewSourcePinId]
  implicit val AdPreviewSourcePinIdDecoder: EntityDecoder[AdPreviewSourcePinId] = jsonOf[AdPreviewSourcePinId]
  implicit val AdPreviewSourcePinIdEncoder: EntityEncoder[AdPreviewSourcePinId] = jsonEncoderOf[AdPreviewSourcePinId]
}
