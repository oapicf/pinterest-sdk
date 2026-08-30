package model

import play.api.libs.json._

/**
  * Body to be used on path to send Members or Partners Invite or Request
  * @param members A list of usernames, emails, or a mix of them. Should be used if invite_type is MEMBER_INVITE
  * @param partners A list of partner_id. Should be used if invite_type is PARTNER_INVITE or PARTNER_REQUEST
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class CreateMembershipOrPartnershipInvitesBody(
  businessRole: BusinessRoleForInvite,
  inviteType: InviteType,
  members: Option[List[String]],
  partners: Option[List[String]]
)

object CreateMembershipOrPartnershipInvitesBody {
  implicit lazy val createMembershipOrPartnershipInvitesBodyJsonFormat: Format[CreateMembershipOrPartnershipInvitesBody] = Json.format[CreateMembershipOrPartnershipInvitesBody]
}

