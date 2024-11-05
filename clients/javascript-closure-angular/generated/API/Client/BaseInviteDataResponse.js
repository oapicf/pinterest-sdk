goog.provide('API.Client.BaseInviteDataResponse');

/**
 * @record
 */
API.Client.BaseInviteDataResponse = function() {}

/**
 * Unique identifier of the invite/request.
 * @type {!string}
 * @export
 */
API.Client.BaseInviteDataResponse.prototype.id;

/**
 * @type {!API.Client.BaseInviteDataResponse_invite_data}
 * @export
 */
API.Client.BaseInviteDataResponse.prototype.inviteData;

/**
 * Indicates whether the invite/request was received.
 * @type {!boolean}
 * @export
 */
API.Client.BaseInviteDataResponse.prototype.isReceivedInvite;

/**
 * Metadata for the member/partner that was sent the invite/request.
 * @type {!API.Client.BusinessAccessUserSummary}
 * @export
 */
API.Client.BaseInviteDataResponse.prototype.user;

