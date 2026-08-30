package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CancelInviteException._

case class CancelInviteException (
  inviteId: Option[String],
message: Option[String])

object CancelInviteException {
  import DateTimeCodecs._

  implicit val CancelInviteExceptionCodecJson: CodecJson[CancelInviteException] = CodecJson.derive[CancelInviteException]
  implicit val CancelInviteExceptionDecoder: EntityDecoder[CancelInviteException] = jsonOf[CancelInviteException]
  implicit val CancelInviteExceptionEncoder: EntityEncoder[CancelInviteException] = jsonEncoderOf[CancelInviteException]
}
