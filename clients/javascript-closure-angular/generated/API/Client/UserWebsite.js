goog.provide('API.Client.UserWebsite');

/**
 * @record
 */
API.Client.UserWebsite = function() {}

/**
 * Status of the verification process
 * @type {!string}
 * @export
 */
API.Client.UserWebsite.prototype.status;

/**
 * UTC timestamp when the verification happened - sometimes missing
 * @type {!string}
 * @export
 */
API.Client.UserWebsite.prototype.verifiedAt;

/**
 * Website with path or domain only
 * @type {!string}
 * @export
 */
API.Client.UserWebsite.prototype.website;

