goog.provide('API.Client.AdAccount');

/**
 * @record
 */
API.Client.AdAccount = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.AdAccount.prototype.id;

/**
 * @type {!string}
 * @export
 */
API.Client.AdAccount.prototype.name;

/**
 * @type {!API.Client.Ad_account_owner}
 * @export
 */
API.Client.AdAccount.prototype.owner;

/**
 * @type {!API.Client.Country}
 * @export
 */
API.Client.AdAccount.prototype.country;

/**
 * @type {!API.Client.Currency}
 * @export
 */
API.Client.AdAccount.prototype.currency;

/**
 * @type {!Array<!API.Client.BusinessAccessRole>}
 * @export
 */
API.Client.AdAccount.prototype.permissions;

/**
 * Creation time. Unix timestamp in seconds.
 * @type {!number}
 * @export
 */
API.Client.AdAccount.prototype.createdTime;

/**
 * Last update time. Unix timestamp in seconds.
 * @type {!number}
 * @export
 */
API.Client.AdAccount.prototype.updatedTime;

