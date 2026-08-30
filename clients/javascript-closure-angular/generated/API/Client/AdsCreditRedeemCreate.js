goog.provide('API.Client.AdsCreditRedeemCreate');

/**
 * Resource create operation model.
 * @record
 */
API.Client.AdsCreditRedeemCreate = function() {}

/**
 * Takes in a SHA256 hash of the offerCode.
 * @type {!string}
 * @export
 */
API.Client.AdsCreditRedeemCreate.prototype.offerCodeHash;

/**
 * If true, only validate if we can redeem offer code. Otherwise it will actually apply the offer code to the account
 * @type {!boolean}
 * @export
 */
API.Client.AdsCreditRedeemCreate.prototype.validateOnly;

