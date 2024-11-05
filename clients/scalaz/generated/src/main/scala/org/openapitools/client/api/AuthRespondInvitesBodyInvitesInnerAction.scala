package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AuthRespondInvitesBodyInvitesInnerAction._

case class AuthRespondInvitesBodyInvitesInnerAction (
  /* Whether the invite/request is accepted. */
  acceptInvite: Boolean,
/* An object mapping asset ids to lists of business permissions. This can be used to setting/requesting permissions on various assets. If accepting an invite or request, this object would be used to grant asset permissions to the member or partner.  */
  assetIdToPermissions: Option[Map[String, List[Permissions]]])

object AuthRespondInvitesBodyInvitesInnerAction {
  import DateTimeCodecs._

  implicit val AuthRespondInvitesBodyInvitesInnerActionCodecJson: CodecJson[AuthRespondInvitesBodyInvitesInnerAction] = CodecJson.derive[AuthRespondInvitesBodyInvitesInnerAction]
  implicit val AuthRespondInvitesBodyInvitesInnerActionDecoder: EntityDecoder[AuthRespondInvitesBodyInvitesInnerAction] = jsonOf[AuthRespondInvitesBodyInvitesInnerAction]
  implicit val AuthRespondInvitesBodyInvitesInnerActionEncoder: EntityEncoder[AuthRespondInvitesBodyInvitesInnerAction] = jsonEncoderOf[AuthRespondInvitesBodyInvitesInnerAction]
}
