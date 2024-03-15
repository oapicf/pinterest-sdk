goog.provide('API.Client.AdAccountCreateRequest');

/**
 * @record
 */
API.Client.AdAccountCreateRequest = function() {}

/**
 * @type {!API.Client.Country}
 * @export
 */
API.Client.AdAccountCreateRequest.prototype.country;

/**
 * Ad Account name.
 * @type {!string}
 * @export
 */
API.Client.AdAccountCreateRequest.prototype.name;

/**
 * Advertiser's owning user ID.
 * @type {!string}
 * @export
 */
API.Client.AdAccountCreateRequest.prototype.ownerUserId;

