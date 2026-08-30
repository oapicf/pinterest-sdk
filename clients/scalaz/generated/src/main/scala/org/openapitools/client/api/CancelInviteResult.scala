package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CancelInviteResult._

case class CancelInviteResult (
  id: Option[String],
inviteData: Option[InviteDataResponse],
isReceivedInvite: Option[Boolean],
user: Option[CancelInviteResultUser])

object CancelInviteResult {
  import DateTimeCodecs._

  implicit val CancelInviteResultCodecJson: CodecJson[CancelInviteResult] = CodecJson.derive[CancelInviteResult]
  implicit val CancelInviteResultDecoder: EntityDecoder[CancelInviteResult] = jsonOf[CancelInviteResult]
  implicit val CancelInviteResultEncoder: EntityEncoder[CancelInviteResult] = jsonEncoderOf[CancelInviteResult]
}
