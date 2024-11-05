goog.provide('API.Client.BusinessAccessUserSummary');

/**
 * Metadata of the member/partner that has access to the asset.
 * @record
 */
API.Client.BusinessAccessUserSummary = function() {}

/**
 * Email of the business member/partner.
 * @type {!string}
 * @export
 */
API.Client.BusinessAccessUserSummary.prototype.email;

/**
 * Unique identifier of the business member/partner.
 * @type {!string}
 * @export
 */
API.Client.BusinessAccessUserSummary.prototype.id;

/**
 * Username of the business member/partner.
 * @type {!string}
 * @export
 */
API.Client.BusinessAccessUserSummary.prototype.username;

