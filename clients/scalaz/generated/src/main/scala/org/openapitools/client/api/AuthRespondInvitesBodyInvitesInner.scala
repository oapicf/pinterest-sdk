package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AuthRespondInvitesBodyInvitesInner._

case class AuthRespondInvitesBodyInvitesInner (
  action: AuthRespondInvitesBodyInvitesInnerAction,
/* Unique identifier of an invite. */
  inviteId: String)

object AuthRespondInvitesBodyInvitesInner {
  import DateTimeCodecs._

  implicit val AuthRespondInvitesBodyInvitesInnerCodecJson: CodecJson[AuthRespondInvitesBodyInvitesInner] = CodecJson.derive[AuthRespondInvitesBodyInvitesInner]
  implicit val AuthRespondInvitesBodyInvitesInnerDecoder: EntityDecoder[AuthRespondInvitesBodyInvitesInner] = jsonOf[AuthRespondInvitesBodyInvitesInner]
  implicit val AuthRespondInvitesBodyInvitesInnerEncoder: EntityEncoder[AuthRespondInvitesBodyInvitesInner] = jsonEncoderOf[AuthRespondInvitesBodyInvitesInner]
}
