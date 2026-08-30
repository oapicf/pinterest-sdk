goog.provide('API.Client.CancelInviteResultUser');

/**
 * Metadata of the member/partner that has access to the asset.
 * @record
 */
API.Client.CancelInviteResultUser = function() {}

/**
 * Email of the business member/partner.
 * @type {!string}
 * @export
 */
API.Client.CancelInviteResultUser.prototype.email;

/**
 * Unique identifier of the business member/partner.
 * @type {!string}
 * @export
 */
API.Client.CancelInviteResultUser.prototype.id;

/**
 * Username of the business member/partner.
 * @type {!string}
 * @export
 */
API.Client.CancelInviteResultUser.prototype.username;

