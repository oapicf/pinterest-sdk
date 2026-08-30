package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AuthRespondInvitesBodyItem._

case class AuthRespondInvitesBodyItem (
  action: AuthRespondInviteAction,
/* Unique identifier of an invite. */
  inviteId: String)

object AuthRespondInvitesBodyItem {
  import DateTimeCodecs._

  implicit val AuthRespondInvitesBodyItemCodecJson: CodecJson[AuthRespondInvitesBodyItem] = CodecJson.derive[AuthRespondInvitesBodyItem]
  implicit val AuthRespondInvitesBodyItemDecoder: EntityDecoder[AuthRespondInvitesBodyItem] = jsonOf[AuthRespondInvitesBodyItem]
  implicit val AuthRespondInvitesBodyItemEncoder: EntityEncoder[AuthRespondInvitesBodyItem] = jsonEncoderOf[AuthRespondInvitesBodyItem]
}
