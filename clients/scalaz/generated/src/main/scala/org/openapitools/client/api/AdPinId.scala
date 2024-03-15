package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AdPinId._

case class AdPinId (
  /* Pin ID. */
  pinId: Option[String])

object AdPinId {
  import DateTimeCodecs._

  implicit val AdPinIdCodecJson: CodecJson[AdPinId] = CodecJson.derive[AdPinId]
  implicit val AdPinIdDecoder: EntityDecoder[AdPinId] = jsonOf[AdPinId]
  implicit val AdPinIdEncoder: EntityEncoder[AdPinId] = jsonEncoderOf[AdPinId]
}
