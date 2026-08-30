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
 * The time zone of the ad account, in IANA format (e.g., \"America/Los_Angeles\"). Adding your local time zone lets you view your campaigns and ad reporting in your preferred time zone. Future reports will be available in both your local time zone and default UTC time zone. Historical data takes 1-2 months to backfill. Your billing and order lines will remain in UTC.
 * @type {!string}
 * @export
 */
API.Client.AdAccount.prototype.timeZone;

/**
 * @type {!number}
 * @export
 */
API.Client.AdAccount.prototype.updatedTime;

