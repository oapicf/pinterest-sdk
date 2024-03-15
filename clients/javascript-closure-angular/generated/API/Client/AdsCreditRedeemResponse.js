goog.provide('API.Client.AdsCreditRedeemResponse');

/**
 * @record
 */
API.Client.AdsCreditRedeemResponse = function() {}

/**
 * Returns true if the offer code was successfully applied(validateOnly=false) or can be applied(validateOnly=true).
 * @type {!boolean}
 * @export
 */
API.Client.AdsCreditRedeemResponse.prototype.success;

/**
 * Error code type if error occurs
 * @type {!number}
 * @export
 */
API.Client.AdsCreditRedeemResponse.prototype.errorCode;

/**
 * Reason for failure
 * @type {!string}
 * @export
 */
API.Client.AdsCreditRedeemResponse.prototype.errorMessage;

