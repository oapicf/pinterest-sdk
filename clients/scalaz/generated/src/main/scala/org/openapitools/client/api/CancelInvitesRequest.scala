package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CancelInvitesRequest._

case class CancelInvitesRequest (
  /* A list of invite/request ids to cancel. */
  inviteIds: List[String])

object CancelInvitesRequest {
  import DateTimeCodecs._

  implicit val CancelInvitesRequestCodecJson: CodecJson[CancelInvitesRequest] = CodecJson.derive[CancelInvitesRequest]
  implicit val CancelInvitesRequestDecoder: EntityDecoder[CancelInvitesRequest] = jsonOf[CancelInvitesRequest]
  implicit val CancelInvitesRequestEncoder: EntityEncoder[CancelInvitesRequest] = jsonEncoderOf[CancelInvitesRequest]
}
