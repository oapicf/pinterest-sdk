package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import InviteFilterStatus._

case class InviteFilterStatus (
  
object InviteFilterStatus {
  import DateTimeCodecs._

  implicit val InviteFilterStatusCodecJson: CodecJson[InviteFilterStatus] = CodecJson.derive[InviteFilterStatus]
  implicit val InviteFilterStatusDecoder: EntityDecoder[InviteFilterStatus] = jsonOf[InviteFilterStatus]
  implicit val InviteFilterStatusEncoder: EntityEncoder[InviteFilterStatus] = jsonEncoderOf[InviteFilterStatus]
}
