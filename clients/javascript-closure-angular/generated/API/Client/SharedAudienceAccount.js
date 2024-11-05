goog.provide('API.Client.SharedAudienceAccount');

/**
 * @record
 */
API.Client.SharedAudienceAccount = function() {}

/**
 * Account ID (ad account or business ID).
 * @type {!string}
 * @export
 */
API.Client.SharedAudienceAccount.prototype.accountId;

/**
 * Account name.
 * @type {!string}
 * @export
 */
API.Client.SharedAudienceAccount.prototype.accountName;

/**
 * account type
 * @type {!string}
 * @export
 */
API.Client.SharedAudienceAccount.prototype.accountType;

/**
 * Epoch timestamp in seconds for the shared audience event
 * @type {!number}
 * @export
 */
API.Client.SharedAudienceAccount.prototype.sharedOnTimestamp;

/** @enum {string} */
API.Client.SharedAudienceAccount.AccountTypeEnum = { 
  AD_ACCOUNT: 'AD_ACCOUNT',
  BUSINESS_ACCOUNT: 'BUSINESS_ACCOUNT',
}
