goog.provide('API.Client.TermsOfService');

/**
 * @record
 */
API.Client.TermsOfService = function() {}

/**
 * The ID of the terms of service
 * @type {!string}
 * @export
 */
API.Client.TermsOfService.prototype.id;

/**
 * The terms of service content
 * @type {!string}
 * @export
 */
API.Client.TermsOfService.prototype.html;

/**
 * Whether the ad account has accepted terms of service.
 * @type {!boolean}
 * @export
 */
API.Client.TermsOfService.prototype.hasAccepted;

/**
 * The ID of the ad account.
 * @type {!string}
 * @export
 */
API.Client.TermsOfService.prototype.adAccountId;

