package model

import play.api.libs.json._

/**
  * Body to be used on path to send Members or Partners Invite or Request
  * @param businessRole The business access level to grant member/partner. Note, values are case-sensitive. - EMPLOYEE: Can only view and access assets you assign them to. They cannot see details about other employees, partners, or other assets. - BIZ_ADMIN: Have full control of roles and can add employees and partners as well as grant asset access. - PARTNER: Can only view and access assets you assign them to/or they assign to you.
  * @param members A list of usernames, emails, or a mix of them. Should be used if invite_type is MEMBER_INVITE
  * @param partners A list of partner_id. Should be used if invite_type is PARTNER_INVITE or PARTNER_REQUEST
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class CreateMembershipOrPartnershipInvitesBody(
  businessRole: CreateMembershipOrPartnershipInvitesBody.BusinessRole.Value,
  inviteType: InviteType,
  members: Option[List[String]],
  partners: Option[List[String]]
)

object CreateMembershipOrPartnershipInvitesBody {
  implicit lazy val createMembershipOrPartnershipInvitesBodyJsonFormat: Format[CreateMembershipOrPartnershipInvitesBody] = Json.format[CreateMembershipOrPartnershipInvitesBody]

  // noinspection TypeAnnotation
  object BusinessRole extends Enumeration {
    val EMPLOYEE = Value("EMPLOYEE")
    val BIZADMIN = Value("BIZ_ADMIN")
    val PARTNER = Value("PARTNER")

    type BusinessRole = Value
    implicit lazy val BusinessRoleJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

