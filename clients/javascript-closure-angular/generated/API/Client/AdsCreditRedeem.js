goog.provide('API.Client.AdsCreditRedeem');

/**
 * Ads credit redemption
 * @record
 */
API.Client.AdsCreditRedeem = function() {}

/**
 * Error code type if error occurs
 * @type {!number}
 * @export
 */
API.Client.AdsCreditRedeem.prototype.errorCode;

/**
 * Reason for failure
 * @type {!string}
 * @export
 */
API.Client.AdsCreditRedeem.prototype.errorMessage;

/**
 * Returns true if the offer code was successfully applied(validateOnly=false) or can be applied(validateOnly=true).
 * @type {!boolean}
 * @export
 */
API.Client.AdsCreditRedeem.prototype.success;

