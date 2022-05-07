goog.provide('API.Client.Account');

/**
 * @record
 */
API.Client.Account = function() {}

/**
 * Type of account
 * @type {!string}
 * @export
 */
API.Client.Account.prototype.accountType;

/**
 * @type {!string}
 * @export
 */
API.Client.Account.prototype.profileImage;

/**
 * @type {!string}
 * @export
 */
API.Client.Account.prototype.websiteUrl;

/**
 * @type {!string}
 * @export
 */
API.Client.Account.prototype.username;

/** @enum {string} */
API.Client.Account.AccountTypeEnum = { 
  PINNER: 'PINNER',
  BUSINESS: 'BUSINESS',
}
