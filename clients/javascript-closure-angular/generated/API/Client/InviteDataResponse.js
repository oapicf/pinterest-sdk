goog.provide('API.Client.InviteDataResponse');

/**
 * Metadata for the invite/request.
 * @record
 */
API.Client.InviteDataResponse = function() {}

/**
 * The date and time when the invite/request will expire. Returned in milliseconds.
 * @type {!number}
 * @export
 */
API.Client.InviteDataResponse.prototype.inviteExpiration;

/**
 * The current status of the invite. The invite can be in one of the following states PENDING, ACCEPTED, DECLINED, CANCELLED, EXPIRED.
 * @type {!string}
 * @export
 */
API.Client.InviteDataResponse.prototype.inviteStatus;

/**
 * The type of invite. - 'MEMBER_INVITE' is to invite a member to access your business assets. - 'PARTNER_INVITE' is to invite a partner to access your business assets. - 'PARTNER_REQUEST' is to request access a partner's business assets.
 * @type {!string}
 * @export
 */
API.Client.InviteDataResponse.prototype.inviteType;

/**
 * The date and time the invite/request was last updated. Returned in milliseconds.
 * @type {!number}
 * @export
 */
API.Client.InviteDataResponse.prototype.lastUpdatedTime;

/**
 * The date and time the invite/request was sent/created. Returned in milliseconds.
 * @type {!number}
 * @export
 */
API.Client.InviteDataResponse.prototype.sentAt;

