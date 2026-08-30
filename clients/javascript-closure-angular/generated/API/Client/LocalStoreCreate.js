goog.provide('API.Client.LocalStoreCreate');

/**
 * Resource create operation model.
 * @record
 */
API.Client.LocalStoreCreate = function() {}

/**
 * Primary address line of the store.
 * @type {!string}
 * @export
 */
API.Client.LocalStoreCreate.prototype.addressPrimary;

/**
 * Secondary address line of the store.
 * @type {!string}
 * @export
 */
API.Client.LocalStoreCreate.prototype.addressSecondary;

/**
 * City where the store is located.
 * @type {!string}
 * @export
 */
API.Client.LocalStoreCreate.prototype.city;

/**
 * Country code where the store is located.
 * @type {!API.Client.Country}
 * @export
 */
API.Client.LocalStoreCreate.prototype.country;

/**
 * Geographic latitude coordinate of the store.
 * @type {!number}
 * @export
 */
API.Client.LocalStoreCreate.prototype.latitude;

/**
 * Geographic longitude coordinate of the store.
 * @type {!number}
 * @export
 */
API.Client.LocalStoreCreate.prototype.longitude;

/**
 * The name of the local store.
 * @type {!string}
 * @export
 */
API.Client.LocalStoreCreate.prototype.name;

/**
 * Postal or ZIP code of the store.
 * @type {!string}
 * @export
 */
API.Client.LocalStoreCreate.prototype.postalCode;

/**
 * State or region code where the store is located.
 * @type {!string}
 * @export
 */
API.Client.LocalStoreCreate.prototype.region;

/**
 * Merchant provided code for the local store. Unique within the merchant's catalog.
 * @type {!string}
 * @export
 */
API.Client.LocalStoreCreate.prototype.storeCode;

