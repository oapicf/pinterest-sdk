goog.provide('API.Client.LocalStoreBatchUpdate');

/**
 * @record
 */
API.Client.LocalStoreBatchUpdate = function() {}

/**
 * Primary address line of the store.
 * @type {!string}
 * @export
 */
API.Client.LocalStoreBatchUpdate.prototype.addressPrimary;

/**
 * Secondary address line of the store.
 * @type {!string}
 * @export
 */
API.Client.LocalStoreBatchUpdate.prototype.addressSecondary;

/**
 * City where the store is located.
 * @type {!string}
 * @export
 */
API.Client.LocalStoreBatchUpdate.prototype.city;

/**
 * Country code where the store is located.
 * @type {!API.Client.Country}
 * @export
 */
API.Client.LocalStoreBatchUpdate.prototype.country;

/**
 * The ID of the local store.
 * @type {!string}
 * @export
 */
API.Client.LocalStoreBatchUpdate.prototype.id;

/**
 * Geographic latitude coordinate of the store.
 * @type {!number}
 * @export
 */
API.Client.LocalStoreBatchUpdate.prototype.latitude;

/**
 * Geographic longitude coordinate of the store.
 * @type {!number}
 * @export
 */
API.Client.LocalStoreBatchUpdate.prototype.longitude;

/**
 * The name of the local store.
 * @type {!string}
 * @export
 */
API.Client.LocalStoreBatchUpdate.prototype.name;

/**
 * Postal or ZIP code of the store.
 * @type {!string}
 * @export
 */
API.Client.LocalStoreBatchUpdate.prototype.postalCode;

/**
 * State or region code where the store is located.
 * @type {!string}
 * @export
 */
API.Client.LocalStoreBatchUpdate.prototype.region;

/**
 * Merchant provided code for the local store. Unique within the merchant's catalog.
 * @type {!string}
 * @export
 */
API.Client.LocalStoreBatchUpdate.prototype.storeCode;

