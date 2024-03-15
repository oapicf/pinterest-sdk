goog.provide('API.Client.UserWebsiteSummary');

/**
 * @record
 */
API.Client.UserWebsiteSummary = function() {}

/**
 * Website with path or domain only
 * @type {!string}
 * @export
 */
API.Client.UserWebsiteSummary.prototype.website;

/**
 * Status of the verification process
 * @type {!string}
 * @export
 */
API.Client.UserWebsiteSummary.prototype.status;

/**
 * UTC timestamp when the verification happened - sometimes missing
 * @type {!string}
 * @export
 */
API.Client.UserWebsiteSummary.prototype.verifiedAt;

