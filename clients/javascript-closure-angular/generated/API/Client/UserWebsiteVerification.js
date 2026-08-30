goog.provide('API.Client.UserWebsiteVerification');

/**
 * @record
 */
API.Client.UserWebsiteVerification = function() {}

/**
 * DNS TXT record to check against for the website to be claimed
 * @type {!string}
 * @export
 */
API.Client.UserWebsiteVerification.prototype.dnsTxtRecord;

/**
 * A full html file to upload to the website in order for it to be claimed
 * @type {!string}
 * @export
 */
API.Client.UserWebsiteVerification.prototype.fileContent;

/**
 * File expected to find on the website being claimed
 * @type {!string}
 * @export
 */
API.Client.UserWebsiteVerification.prototype.filename;

/**
 * Metatag the verification process searchs for the website to be claimed
 * @type {!string}
 * @export
 */
API.Client.UserWebsiteVerification.prototype.metatag;

/**
 * Code to check against the user claiming the website
 * @type {!string}
 * @export
 */
API.Client.UserWebsiteVerification.prototype.verificationCode;

