goog.provide('API.Client.TermsOfService');

/**
 * The ID of the ad account.
 * @record
 */
API.Client.TermsOfService = function() {}

/**
 * The ID of the ad account.
 * @type {!string}
 * @export
 */
API.Client.TermsOfService.prototype.adAccountId;

/**
 * Whether the ad account has accepted terms of service.
 * @type {!boolean}
 * @export
 */
API.Client.TermsOfService.prototype.hasAccepted;

/**
 * The terms of service content
 * @type {!string}
 * @export
 */
API.Client.TermsOfService.prototype.html;

/**
 * The ID of the terms of service
 * @type {!string}
 * @export
 */
API.Client.TermsOfService.prototype.id;

