goog.provide('API.Client.AdAccount');

/**
 * @record
 */
API.Client.AdAccount = function() {}

/**
 * @type {!API.Client.Country}
 * @export
 */
API.Client.AdAccount.prototype.country;

/**
 *  Creation time. Unix timestamp in seconds.
 * @type {!number}
 * @export
 */
API.Client.AdAccount.prototype.createdTime;

/**
 * @type {!API.Client.Currency}
 * @export
 */
API.Client.AdAccount.prototype.currency;

/**
 * @type {!string}
 * @export
 */
API.Client.AdAccount.prototype.id;

/**
 * Ad account name.
 * @type {!string}
 * @export
 */
API.Client.AdAccount.prototype.name;

/**
 * Ad account owner
 * @type {!API.Client.AdAccountOwner}
 * @export
 */
API.Client.AdAccount.prototype.owner;

/**
 * @type {!Array<!API.Client.BusinessAccessRole>}
 * @export
 */
API.Client.AdAccount.prototype.permissions;

/**
 * @type {!number}
 * @export
 */
API.Client.AdAccount.prototype.updatedTime;

