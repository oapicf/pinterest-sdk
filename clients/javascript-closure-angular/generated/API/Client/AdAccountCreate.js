goog.provide('API.Client.AdAccountCreate');

/**
 * Resource create operation model.
 * @record
 */
API.Client.AdAccountCreate = function() {}

/**
 * @type {!API.Client.Country}
 * @export
 */
API.Client.AdAccountCreate.prototype.country;

/**
 * @type {!API.Client.Currency}
 * @export
 */
API.Client.AdAccountCreate.prototype.currency;

/**
 * Ad account name.
 * @type {!string}
 * @export
 */
API.Client.AdAccountCreate.prototype.name;

/**
 * Advertiser's owning user ID.
 * @type {!string}
 * @export
 */
API.Client.AdAccountCreate.prototype.ownerUserId;

