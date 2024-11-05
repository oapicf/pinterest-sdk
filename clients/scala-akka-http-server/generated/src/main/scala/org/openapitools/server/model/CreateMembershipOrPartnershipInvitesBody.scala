package org.openapitools.server.model


/**
 * Body to be used on path to send Members or Partners Invite or Request
 *
 * @param businessRole The business access level to grant member/partner. Note, values are case-sensitive. - EMPLOYEE: Can only view and access assets you assign them to. They cannot see details about other employees, partners, or other assets. - BIZ_ADMIN: Have full control of roles and can add employees and partners as well as grant asset access. - PARTNER: Can only view and access assets you assign them to/or they assign to you. for example: ''BIZ_ADMIN''
 * @param inviteType  for example: ''null''
 * @param members A list of usernames, emails, or a mix of them. Should be used if invite_type is MEMBER_INVITE for example: ''["business0101","user@business.com"]''
 * @param partners A list of partner_id. Should be used if invite_type is PARTNER_INVITE or PARTNER_REQUEST for example: ''["809944451643622187","766456567741825556"]''
*/
final case class CreateMembershipOrPartnershipInvitesBody (
  businessRole: String,
  inviteType: InviteType,
  members: Option[Seq[String]] = None,
  partners: Option[Seq[String]] = None
)

