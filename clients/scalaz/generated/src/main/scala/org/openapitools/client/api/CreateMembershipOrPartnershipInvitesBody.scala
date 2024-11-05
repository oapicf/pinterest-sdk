package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CreateMembershipOrPartnershipInvitesBody._

case class CreateMembershipOrPartnershipInvitesBody (
  /* The business access level to grant member/partner. Note, values are case-sensitive. - EMPLOYEE: Can only view and access assets you assign them to. They cannot see details about other employees, partners, or other assets. - BIZ_ADMIN: Have full control of roles and can add employees and partners as well as grant asset access. - PARTNER: Can only view and access assets you assign them to/or they assign to you. */
  businessRole: BusinessRole,
inviteType: InviteType,
/* A list of usernames, emails, or a mix of them. Should be used if invite_type is MEMBER_INVITE */
  members: Option[List[String]],
/* A list of partner_id. Should be used if invite_type is PARTNER_INVITE or PARTNER_REQUEST */
  partners: Option[List[String]])

object CreateMembershipOrPartnershipInvitesBody {
  import DateTimeCodecs._
  sealed trait BusinessRole
  case object EMPLOYEE extends BusinessRole
  case object BIZADMIN extends BusinessRole
  case object PARTNER extends BusinessRole

  object BusinessRole {
    def toBusinessRole(s: String): Option[BusinessRole] = s match {
      case "EMPLOYEE" => Some(EMPLOYEE)
      case "BIZADMIN" => Some(BIZADMIN)
      case "PARTNER" => Some(PARTNER)
      case _ => None
    }

    def fromBusinessRole(x: BusinessRole): String = x match {
      case EMPLOYEE => "EMPLOYEE"
      case BIZADMIN => "BIZADMIN"
      case PARTNER => "PARTNER"
    }
  }

  implicit val BusinessRoleEnumEncoder: EncodeJson[BusinessRole] =
    EncodeJson[BusinessRole](is => StringEncodeJson(BusinessRole.fromBusinessRole(is)))

  implicit val BusinessRoleEnumDecoder: DecodeJson[BusinessRole] =
    DecodeJson.optionDecoder[BusinessRole](n => n.string.flatMap(jStr => BusinessRole.toBusinessRole(jStr)), "BusinessRole failed to de-serialize")

  implicit val CreateMembershipOrPartnershipInvitesBodyCodecJson: CodecJson[CreateMembershipOrPartnershipInvitesBody] = CodecJson.derive[CreateMembershipOrPartnershipInvitesBody]
  implicit val CreateMembershipOrPartnershipInvitesBodyDecoder: EntityDecoder[CreateMembershipOrPartnershipInvitesBody] = jsonOf[CreateMembershipOrPartnershipInvitesBody]
  implicit val CreateMembershipOrPartnershipInvitesBodyEncoder: EntityEncoder[CreateMembershipOrPartnershipInvitesBody] = jsonEncoderOf[CreateMembershipOrPartnershipInvitesBody]
}
