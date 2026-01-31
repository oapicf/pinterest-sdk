goog.provide('API.Client.UserWebsiteVerifyRequest');

/**
 * User website verification request
 * @record
 */
API.Client.UserWebsiteVerifyRequest = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.UserWebsiteVerifyRequest.prototype.verificationMethod;

/**
 * @type {!string}
 * @export
 */
API.Client.UserWebsiteVerifyRequest.prototype.website;

/** @enum {string} */
API.Client.UserWebsiteVerifyRequest.VerificationMethodEnum = { 
  FILENAME: 'FILENAME',
  METATAG: 'METATAG',
  DNSTXT: 'DNSTXT',
}
