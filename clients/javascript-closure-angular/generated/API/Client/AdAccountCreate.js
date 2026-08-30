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

/**
 * The time zone of the ad account, in IANA format (e.g., \"America/Los_Angeles\"). Adding your local time zone lets you view your campaigns and ad reporting in your preferred time zone. Future reports will be available in both your local time zone and default UTC time zone. Historical data takes 1-2 months to backfill. Your billing and order lines will remain in UTC.
 * @type {!string}
 * @export
 */
API.Client.AdAccountCreate.prototype.timeZone;

