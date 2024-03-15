goog.provide('API.Client.AdsCreditRedeemRequest');

/**
 * @record
 */
API.Client.AdsCreditRedeemRequest = function() {}

/**
 * Takes in a SHA256 hash of the offerCode.
 * @type {!string}
 * @export
 */
API.Client.AdsCreditRedeemRequest.prototype.offerCodeHash;

/**
 * If true, only validate if we can redeem offer code. Otherwise it will actually apply the offer code to the account
 * @type {!boolean}
 * @export
 */
API.Client.AdsCreditRedeemRequest.prototype.validateOnly;

