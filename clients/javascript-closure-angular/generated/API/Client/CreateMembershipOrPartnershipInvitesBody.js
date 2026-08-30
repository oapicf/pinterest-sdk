goog.provide('API.Client.CreateMembershipOrPartnershipInvitesBody');

/**
 * Body to be used on path to send Members or Partners Invite or Request
 * @record
 */
API.Client.CreateMembershipOrPartnershipInvitesBody = function() {}

/**
 * @type {!API.Client.BusinessRoleForInvite}
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

