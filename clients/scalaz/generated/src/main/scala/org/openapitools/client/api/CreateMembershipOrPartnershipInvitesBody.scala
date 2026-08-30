package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CreateMembershipOrPartnershipInvitesBody._

case class CreateMembershipOrPartnershipInvitesBody (
  businessRole: BusinessRoleForInvite,
inviteType: InviteType,
/* A list of usernames, emails, or a mix of them. Should be used if invite_type is MEMBER_INVITE */
  members: Option[List[String]],
/* A list of partner_id. Should be used if invite_type is PARTNER_INVITE or PARTNER_REQUEST */
  partners: Option[List[String]])

object CreateMembershipOrPartnershipInvitesBody {
  import DateTimeCodecs._

  implicit val CreateMembershipOrPartnershipInvitesBodyCodecJson: CodecJson[CreateMembershipOrPartnershipInvitesBody] = CodecJson.derive[CreateMembershipOrPartnershipInvitesBody]
  implicit val CreateMembershipOrPartnershipInvitesBodyDecoder: EntityDecoder[CreateMembershipOrPartnershipInvitesBody] = jsonOf[CreateMembershipOrPartnershipInvitesBody]
  implicit val CreateMembershipOrPartnershipInvitesBodyEncoder: EntityEncoder[CreateMembershipOrPartnershipInvitesBody] = jsonEncoderOf[CreateMembershipOrPartnershipInvitesBody]
}
