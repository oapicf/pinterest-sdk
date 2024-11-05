goog.provide('API.Client.CreateMembershipOrPartnershipInvitesBody');

/**
 * Body to be used on path to send Members or Partners Invite or Request
 * @record
 */
API.Client.CreateMembershipOrPartnershipInvitesBody = function() {}

/**
 * The business access level to grant member/partner. Note, values are case-sensitive. - EMPLOYEE: Can only view and access assets you assign them to. They cannot see details about other employees, partners, or other assets. - BIZ_ADMIN: Have full control of roles and can add employees and partners as well as grant asset access. - PARTNER: Can only view and access assets you assign them to/or they assign to you.
 * @type {!string}
 * @export
 */
API.Client.CreateMembershipOrPartnershipInvitesBody.prototype.businessRole;

/**
 * @type {!API.Client.InviteType}
 * @export
 */
API.Client.CreateMembershipOrPartnershipInvitesBody.prototype.inviteType;

/**
 * A list of usernames, emails, or a mix of them. Should be used if invite_type is MEMBER_INVITE
 * @type {!Array<!string>}
 * @export
 */
API.Client.CreateMembershipOrPartnershipInvitesBody.prototype.members;

/**
 * A list of partner_id. Should be used if invite_type is PARTNER_INVITE or PARTNER_REQUEST
 * @type {!Array<!string>}
 * @export
 */
API.Client.CreateMembershipOrPartnershipInvitesBody.prototype.partners;

/** @enum {string} */
API.Client.CreateMembershipOrPartnershipInvitesBody.BusinessRoleEnum = { 
  EMPLOYEE: 'EMPLOYEE',
  BIZ_ADMIN: 'BIZ_ADMIN',
  PARTNER: 'PARTNER',
}
