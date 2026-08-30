goog.provide('API.Client.UserWebsiteCreate');

/**
 * Resource create operation model.
 * @record
 */
API.Client.UserWebsiteCreate = function() {}

/**
 * Method used to verify website ownership.
 * @type {!API.Client.WebsiteVerificationMethod}
 * @export
 */
API.Client.UserWebsiteCreate.prototype.verificationMethod;

/**
 * Website with path or domain only
 * @type {!string}
 * @export
 */
API.Client.UserWebsiteCreate.prototype.website;

