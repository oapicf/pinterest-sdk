package org.openapitools.server.model


/**
 * Body to be used on path to send Members or Partners Invite or Request
 *
 * @param businessRole  for example: ''BIZ_ADMIN''
 * @param inviteType  for example: ''null''
 * @param members A list of usernames, emails, or a mix of them. Should be used if invite_type is MEMBER_INVITE for example: ''["business0101","user@business.com"]''
 * @param partners A list of partner_id. Should be used if invite_type is PARTNER_INVITE or PARTNER_REQUEST for example: ''["809944451643622187","766456567741825556"]''
*/
final case class CreateMembershipOrPartnershipInvitesBody (
  businessRole: BusinessRoleForInvite,
  inviteType: InviteType,
  members: Option[Seq[String]] = None,
  partners: Option[Seq[String]] = None
)

