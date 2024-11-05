package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import InviteStatus._

case class InviteStatus (
  
object InviteStatus {
  import DateTimeCodecs._

  implicit val InviteStatusCodecJson: CodecJson[InviteStatus] = CodecJson.derive[InviteStatus]
  implicit val InviteStatusDecoder: EntityDecoder[InviteStatus] = jsonOf[InviteStatus]
  implicit val InviteStatusEncoder: EntityEncoder[InviteStatus] = jsonEncoderOf[InviteStatus]
}
